package org.company.panayotov.energy.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TimeIntervalTest {

    @Test
    public void reportsStartAndEndTime(){
        TimeInterval timeInterval = new TimeInterval(1, 9);

        assertThat(timeInterval.startTime(), is(1));
        assertThat(timeInterval.endTime(), is(9));

    }
}
