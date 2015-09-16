package org.company.panayotov.energy.domain;

public class TimeInterval {

    private final int startTime;
    private final int endTime;

    public TimeInterval(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int startTime() {
        return startTime;
    }

    public int endTime() {
        return endTime;
    }
}
