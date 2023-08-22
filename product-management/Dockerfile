FROM openjdk:11
EXPOSE 8081
ADD target/product-image.jar product-image.jar
ENTRYPOINT ["java","-jar","/product-image.jar"]