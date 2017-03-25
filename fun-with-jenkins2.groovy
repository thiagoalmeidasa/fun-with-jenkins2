import hudson.triggers.TimerTrigger;
import javaposse.jobdsl.plugin.*;
import jenkins.model.Jenkins;
import hudson.model.FreeStyleProject

jenkins = Jenkins.instance;
jobName = "fun-seed-job";
timerTrigger = new TimerTrigger("H/15 * * * *");
dslBuilder = new ExecuteDslScripts(scriptText: '''
pipelineJob('fun-with-jenkins2') {
    definition {
        cpsScm {
                scm {
                    git {
                        remote {url('https://github.com/flugel-it/fun-with-jenkins2.git')}
                        branch('*/master')
                    }
                }
                scriptPath('Jenkinsfile')
            }
        triggers {
            scm("H/15 * * * *")
            cron("H/15 * * * *")
        }
    }
}
''');
dslProject = new FreeStyleProject(jenkins, jobName);
dslProject.addTrigger(timerTrigger);
dslProject.createTransientActions();
dslProject.getPublishersList().add(dslBuilder);
jenkins.add(dslProject, jobName);
timerTrigger.start(dslProject, true);
