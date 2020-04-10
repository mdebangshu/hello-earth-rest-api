# Hello Earth Rest API

### Running the Application

Run com.mylab.rest.HelloEarthRestApplication as a Java Application.

- http://localhost:8080/hello-earth

```txt
Hello Earth V1 <hostname>
```

- http://localhost:8080/hello-earth-structure

```json
{"message":"Hello Earth"}
```

- http://localhost:8080/hello-earth/{gogreen}

```json
{"message":"Hello Earth, gogreen"}
```

# Commands Executed during the course

### Pull images from docker hub
```
docker pull mdebangshu/hello-earth-rest-api:0.0.1-SNAPSHOT

docker pull mdebangshu/hello-earth-rest-api:0.0.2-SNAPSHOT
```
### Tag images as per convention of gcr.io
```
docker tag mdebangshu/hello-earth-rest-api:0.0.1-SNAPSHOT gcr.io/sb-ito-services-1000153237/hello-earth-rest-api:0.0.1-SNAPSHOT

docker tag mdebangshu/hello-earth-rest-api:0.0.2-SNAPSHOT gcr.io/sb-ito-services-1000153237/hello-earth-rest-api:0.0.2-SNAPSHOT

docker images
```
### Push images to GCR
```
docker push gcr.io/sb-ito-services-1000153237/hello-earth-rest-api:0.0.1-SNAPSHOT

docker push gcr.io/sb-ito-services-1000153237/hello-earth-rest-api:0.0.2-SNAPSHOT
```
### Connect to Gcloud Cluster
```
gcloud container clusters get-credentials sb-cog-cluster --zone us-central1-c --project sb-ito-services-1000153237
```
### Play with K8S
```
kubectl get nodes -o wide

kubectl get pods

kubectl create deployment hello-earth-rest-api --image=gcr.io/sb-ito-services-1000153237/hello-earth-rest-api:0.0.1-SNAPSHOT

kubectl rollout status deployment hello-earth-rest-api

kubectl rollout history deployment hello-earth-rest-api

kubectl get pods -o wide

kubectl get replicaset

kubectl get deployment

kubectl get service

kubectl get events

kubectl get events --sort-by=.metadata.creationTimestamp

kubectl expose deployment hello-earth-rest-api --type=LoadBalancer --port=8080

kubectl get services

kubectl get pods -o wide

kubectl describe pod <pog_id>

kubectl scale deployment hello-earth-rest-api --replicas=3

kubectl get events --sort-by=.metadata.creationTimestamp

kubectl get pods -o wide

watch -n 0.1 curl http://35.193.70.17:8080/hello-earth                                                           

kubectl logs -f <pod_id>

kubectl get deployments -o yaml

kubectl get services -o yaml

kubectl set image deployment hello-earth-rest-api hello-earth-rest-api=gcr.io/sb-ito-services-1000153237/hello-earth-rest-api:0.0.1-SNAPSHOT --record

kubectl rollout history deployment hello-earth-rest-api

kubectl get pods -o wide

kubectl get events --sort-by=.metadata.creationTimestamp

kubectl delete all -l app=hello-earth-rest-api

gcloud container clusters resize sb-cog-cluster --zone us-central1-c --num-nodes=0
```