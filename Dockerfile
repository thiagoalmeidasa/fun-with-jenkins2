
FROM jenkinsci/jenkins:latest
RUN /usr/local/bin/install-plugins.sh workflow-aggregator job-dsl
