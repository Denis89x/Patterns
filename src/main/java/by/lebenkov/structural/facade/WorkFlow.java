package by.lebenkov.structural.facade;

public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    ButTracker butTracker = new ButTracker();

    public void solveProblems() {
        job.doJob();
        butTracker.startSprint();
        developer.doJobBeforeDeadline(butTracker);
    }
}
