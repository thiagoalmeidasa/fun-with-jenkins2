import hudson.triggers.TimerTrigger;
import javaposse.jobdsl.plugin.*;
import jenkins.model.Jenkins;
import hudson.model.FreeStyleProject

jenkins = Jenkins.instance;

jobName = "hello-seed-job";
timerTrigger = new TimerTrigger("H/15 * * * *");
dslBuilder = new ExecuteDslScripts(scriptText: '''
job('hello-world-example') {
    steps {
        shell('echo Hello World!')
    }
    triggers {
        cron("H/15 * * * *")
    }
}
''');
dslProject = new FreeStyleProject(jenkins, jobName);
dslProject.addTrigger(timerTrigger);
dslProject.createTransientActions();
dslProject.getPublishersList().add(dslBuilder);
jenkins.add(dslProject, jobName);
timerTrigger.start(dslProject, true);
