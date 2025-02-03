# Use the official Tomcat base image
FROM tomcat:9-jdk11

# Set the maintainer label
LABEL maintainer="youremail@example.com"

# Remove default web apps to ensure a clean deployment
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file into the webapps folder in Tomcat
COPY target/calcwebapp.war /usr/local/tomcat/webapps/ROOT.war

# Set proper permissions (useful if running as a non-root user)
RUN chmod -R 777 /usr/local/tomcat/webapps

# Expose port 8080 for Tomcat
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]
