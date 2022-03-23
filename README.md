# Tutorial: A Spring Boot Kafka producer to Aiven Kafka Service

This repo provides a simple guide of Spring Boot app that produces messages to Aiven Kafka Service.  The goal here is to help you accelerate appplication development on Aiven Cloud Service using Spring Boot and VS Code.

## What you will build

You will build a simple kafka producer application sending sample messages to a kafka topic on Aiven Kafak Service. 

## What you need

- About 20 mins
- VS Code
  - Extension Pack for Java
  - Spring Initializr Java Support
  - Test Runner for Java
  - Visual Studio IntelliCode
- Aiven Cloud free account

## How to complete this tutorial

### Setup Aiven Cloud Kafka Service
1. Register a free Aiven account

   Go to https://aiven.io and register a free account. You will have 300usd credits which is enough to deploy data services we need in this tutorial. Once you registered, you can login to Aivent dashboard. The dashboard looks like this.</br>
   ![Aiven Dashboard] (screenshots/Screen Shot 2022-03-22 at 9.13.33 AM.png)
2. Create a Kafka service

   Click on **+Create a new service** and you should see a list of services available.</br>
   ![Aiven Service List] (screenshots/Screen Shot 2022-03-22 at 9.13.52 AM.png)
   
   1. Choose Apache Kafka
   2. Select Service Cloud Provider (Google Cloud)
   3. Select Service Cloud Region (google-us-central1)
   4. Select Service Plan (for this tutorial, Startup-2 is good enough)
   5. Provide Service Name (optional)
   6. In Service Summary, click **+ Create Service** to get the Kafka cluster running.

3. Create a InfluxDB and Grafana services
   
   From the dashboard, you can create an InfluxDB service to store the kafka service metrics data and a grafana service to show kafka metrics. 
   
4. Service integration

   
### Spring Boot starter with kafka on VS Code

### Check topic content on Aiven web

### Next: consume (test) and json schema
