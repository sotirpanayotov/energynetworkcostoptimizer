package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.source.BioEnergySource;
import org.company.panayotov.energy.domain.source.EnergySource;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ResultTest {

    @Test
    public void returnsEnergySource() {
        EnergySource bioEnergySource = new BioEnergySource();

        Result result = new Result(bioEnergySource);

        assertThat(result.energySource(), is(bioEnergySource));
    }
}
