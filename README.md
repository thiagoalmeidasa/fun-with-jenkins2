# Fun with jenkins - Challenge

## What is that?

This project was a challenge made by flugel-it.

## Introduction

The goals of the challenge are:

* Complete this Dockerfile;
* Create a new job using groovy scripting;
* This new job must be a seed job that executes the "echo helloworld" command.

## Starting point

There are good examples of creating different type of jobs using groovy scripts.

https://github.com/linagora/james-jenkins/blob/master/create-dsl-job.groovy


## Quick start

Some small instructions about how to run this projects. For more informations,
read [NOTES.md](NOTES.md)

1. Install Docker:
> Follow the instructions at [Docker official documentation](https://docs.docker.com/engine/installation/#get-started).

2. Clone this repository and enter in the directory:
```
git clone git@github.com:thiagoalmeidasa/fun-with-jenkins2.git
cd fun-with-jenkins2
```

3. Build the image with:
```
docker build -t jenkins-groovy .
```

4. Run the container with:
```
docker run -d -p 8080:8080 --name myjenkins jenkins-groovy
```

5. Now you can do login on [localhost:8080](http://localhost:8080), with
   `admin:admin` as user and password.

6. You will see two seed projects created:
    * `hello-seed-job` - The master goal of this challenge;
    * `fun-seed-job` - Another seed project I have built to handle the
       `fun-with-jenkins2` repository from flugel.it, that use the
`Jenkinsfile` from `SCM` to get the steps.

    Both projects have timer trigger configured with this rule:
`"H/15 * * * *"`, which means both projects will run every 10 minutes from
when they were created.  These projects will create another jobs using `dsl
scripts`.
