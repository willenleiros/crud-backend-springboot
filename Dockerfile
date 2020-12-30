FROM maven:3.6.3-jdk-8-slim
COPY ./crud-backend-springboot /root/backend
WORKDIR /root/backend
RUN mvn clean package
RUN mv target/*.jar target/app.jar
ENTRYPOINT ["java","-jar","target/app.jar"]