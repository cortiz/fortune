FROM adoptopenjdk/openjdk11-openj9:alpine
WORKDIR /app
COPY build/libs/fortune-0.0.1-SNAPSHOT.jar fortune.jar
EXPOSE 8080
CMD ["java", "-jar","fortune.jar"]
