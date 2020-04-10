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

### Commands Executed during the course

```

gcloud container clusters get-credentials sb-cog-cluster --zone us-central1-c --project sb-ito-services-1000153237

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

