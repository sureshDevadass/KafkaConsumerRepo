From openjdk:17
COPY target/Consumer.jar Consumer.jar
CMD [ "java","-jar","Consumer.jar" ]