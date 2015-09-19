package org.company.panayotov.energy.domain.source;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WindEnergySourceTest {

    @Test
    public void returnsName(){
        assertThat(new WindEnergySource().name(), is("Wind Energy"));
    }
}
