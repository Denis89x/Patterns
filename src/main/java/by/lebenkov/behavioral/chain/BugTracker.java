package by.lebenkov.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.getValue(Priority.ROUTINE));
        Notifier emailNotifier = new EmailNotifier(Priority.getValue(Priority.IMPORTANT));
        Notifier smsNotifier = new SMSNotifier(Priority.getValue(Priority.ASAP));

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.getValue(Priority.ROUTINE));
        reportNotifier.notifyManager("Something went wrong!", Priority.getValue(Priority.IMPORTANT));
        reportNotifier.notifyManager("Houston, we`ve had a problem!", Priority.getValue(Priority.ASAP));
    }
}
