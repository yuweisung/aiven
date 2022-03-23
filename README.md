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
   ![Aiven Dashboard] (screenshots/aiven_kafka_service1.png)
2. Create a Kafka service

   Click on **+Create a new service** and you should see a list of services available.</br>
   1. Choose Apache Kafka
      ![Aiven Service List] (screenshots/aiven_kafka_service2.png)
   2. Select Service Cloud Provider (Google Cloud)
      ![Aiven Service Cloud Provider] (screenshots/aiven_kafka_service3.png)
   3. Select Service Cloud Region (google-us-central1)
      ![Aiven Service Cloud Region] (screenshots/aiven_kafka_service4.png)
   4. Select Service Plan (for this tutorial, Startup-2 is good enough)
      ![Aiven Service Cloud Plan] (screenshots/aiven_kafka_service5.png)
   5. Provide Service Name (optional)
      ![Aiven Service Plan] (screenshots/aiven_kafka_service6.png)
   6. In Service Summary, click **+ Create Service** to get the Kafka cluster running.
      ![Aiven Service Summary] (screenshots/aiven_kafka_service7.png)
   7. You can see the Kafka service progress back in the Aiven Dashboard.
      ![Aiven Service Dashboard] (screenshots/aiven_kafka_service8.png)
3. Create a InfluxDB and Grafana services
   
   From the dashboard, you can create an InfluxDB service to store the kafka service metrics data and a grafana service to show kafka metrics.
   
4. Service integration
   In the Kafka Service page, Metrics tab, click on **Enable Metrics Integration** and pick *Existing service*, then choose the influxDB service from the list, then click **Enable**.  Aiven Cloud will start ingesting Kafka metrics to influxDB. </br>
   In the InfluxDB service page, you can **Enable Dashboard integration**, and pick the Grafana Service as target. </br>
   Go to Grafana service page, you can use the username and credential to login Grafana WebUI and check the Kafka metrics. </br>

5. Kafka service access credential (cert authentication)
   
### Spring Boot starter with kafka on VS Code

1. Create a Spring Boot project using initiator
   
   In VSCode, press Ctrl-Shift-P to get the command pallete, then type spring boot create gradle project, then press enter to go next step to pick spring boot starter modules. </br>
2. Fill in application properties
   

3. Define model class

4. Use kafka template in Spring Boot application runner

5. Troubleshootings

### Check topic content on Aiven web

1. Go to Aiven dashboard -> Kafka service -> Topics -> Topic => **Fetch Message** (Format: binary)
2. You should see the base64 encoded keys and messages. Click on base64 decode to check the content.
3. You can also check (format: json) and **Fetch Message**. It triggered an internal error from the WebUI. I checked the log and found that the **Fetch Message** is using python kafka consumer to get the json content. I guess python consumer cannot deserialize the json message I use in Spring Boot.
### Next: consume (test) and json schema

1. Create a kafka consume in spring boot app and make sure spring boot app can ser/de the json message.
2. Use schema server to help json schema.
