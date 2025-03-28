From openjdk:17
COPY target/Consumer Consumer.jar
CMD [ "java","-jar","Consumer.jar" ]