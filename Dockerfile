
# Use the official Tomcat base image
FROM tomcat:9-jdk11-openjdk-slim

# Set the maintainer label
LABEL maintainer="youremail@example.com"

# Remove the default web apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file into the webapps folder in Tomcat
COPY target/calcwebapp.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080 (default for Tomcat)
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]
