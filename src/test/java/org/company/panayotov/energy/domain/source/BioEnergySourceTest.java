package org.company.panayotov.energy.domain.source;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BioEnergySourceTest {

    @Test
    public void returnsName(){
        assertThat(new BioEnergySource().name(), is("Bio Plant Energy"));
    }
}
