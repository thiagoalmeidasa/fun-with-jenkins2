# Extra information

## What is that?

Some extra informatio about this project was a challenge made by flugel-it.

## Introduction

The goals of the challenge are:

* Complete this Dockerfile;
* Create a new job using groovy scripting;
* This new job must be a seed job that executes the "echo helloworld" command.

## What was done?

Following the example of this
[repository](https://github.com/linagora/james-jenkins/blob/master/create-dsl-job.groovy)
I have made some dsl jobs, one for the goal of this challenge and another to
build the project
[jenkins-with-fun2](https://github.com/flugel-it/fun-with-jenkins2) using the
`Jenkinsfile` within the repository to define the pipeline for this project.

## About this approach

* I have used the Jenkins API to write some groovy scripts. That are the
libraries used on at this time.
```
import hudson.model.FreeStyleProject
import hudson.triggers.TimerTrigger;
import javaposse.jobdsl.plugin.*;
import jenkins.model.Jenkins;
```
Their contain just the needed methods for this approach.


* My groovy scripts creates empty `FreeStyleProjects` with dsl scripts as Post
  Build Action and time based triggers for educational purpose. These empty
projects, using the dsl scripts, create our main jobs. If want more
information about dsl scripts, read their
[wiki](https://github.com/jenkinsci/job-dsl-plugin/wiki).
