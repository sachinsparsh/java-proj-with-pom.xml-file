FROM tomcat:9.0.112-jdk21-corretto

# Copy your WAR file into Tomcat webapps directory
COPY target/calendar.war /usr/local/tomcat/webapps/calendar.war
