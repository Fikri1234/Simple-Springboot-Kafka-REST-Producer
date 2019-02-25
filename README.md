# Simple-Springboot-Kafka-REST-Producer

1. Open cmd
2. Run zkeeper
3. Go to your kafka directory to run kafka server, Shit + right click and then open new command line
4. Type in command line .\bin\windows\kafka-server-start.bat .\config\server.properties
5. Open cmd in kafka directory
6. Go to bin\windows to run kafka consumer
7. Type kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test1 --from-beginning
8. Create producer just in case to check your consumer
9. Type kafka-console-producer.bat --broker-list localhost:9092 --topic test1
