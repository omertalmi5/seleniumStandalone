FROM openjdk
FROM maven

COPY ./ ./

CMD mvn test
