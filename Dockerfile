#This is the base.
FROM java:8

#This is the port.
EXPOSE 8013:8013

#No idea
ADD /target/SavingAccountJar.jar SavingAccountJar.jar

#No idea
ENTRYPOINT ["java", "-jar", "SavingAccountJar.jar"]