package org.company.panayotov.energy.domain;

public class TimeInterval {

    private final int startTime;
    private final int endTime;

    public TimeInterval(int startTime, int endTime) {
        validate(startTime, endTime);

        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int startTime() {
        return startTime;
    }

    public int endTime() {
        return endTime;
    }

    private void validate(int startTime, int endTime) {
        if (startTime < 0 || startTime > 24) {
            throw new IllegalArgumentException("start time: " + startTime + " needs to be between 0 and 24");
        }

        if (startTime > endTime) {
            throw new IllegalArgumentException("start time: " + startTime + " needs to be less than end time: " + endTime);
        }

        if (endTime > 24) {
            throw new IllegalArgumentException("end time: " + endTime + " needs to be between 0 and 24");
        }
    }
}
