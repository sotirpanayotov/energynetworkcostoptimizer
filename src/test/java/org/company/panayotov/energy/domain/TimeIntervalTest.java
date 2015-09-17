package org.company.panayotov.energy.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TimeIntervalTest {

    @Test
    public void reportsStartAndEndTime(){
        TimeInterval timeInterval = new TimeInterval(1, 9);

        assertThat(timeInterval.startTime(), is(1));
        assertThat(timeInterval.endTime(), is(9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void blowsUpIfStartTimeIsLessThanZero(){
        new TimeInterval(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void blowsUpIfStartTimeIsGreaterThan24(){
        new TimeInterval(25, 21);
    }

    @Test(expected = IllegalArgumentException.class)
    public void blowsUpIfStartTimeIsGreaterThanEndTime(){
        new TimeInterval(10, 9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void blowsUpIfEndTimeIsGreaterThan24(){
        new TimeInterval(7,25);
    }
}
