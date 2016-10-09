
FROM jenkinsci/jenkins:latest
RUN /usr/local/bin/install-plugins.sh workflow-aggregator job-dsl git build-flow-plugin
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
COPY admin.groovy /usr/share/jenkins/ref/init.groovy.d/

