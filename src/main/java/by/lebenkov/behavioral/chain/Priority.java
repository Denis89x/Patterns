package by.lebenkov.behavioral.chain;

public enum Priority {
    ROUTINE(1),
    IMPORTANT(2),
    ASAP(3);

    private final int value;

    private Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int getValue(Priority priority) {
        return priority.getValue();
    }
}
