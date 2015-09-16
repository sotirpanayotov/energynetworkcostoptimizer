package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.source.EnergySource;
import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.EnergyClient;
import org.company.panayotov.energy.domain.client.PublicBuilding;
import org.company.panayotov.energy.domain.source.PhotovoltaicEnergySource;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleEnergyControllerTest {

    @Test
    public void returnsPhotovoltaicEnergySource(){
        EnergyClient energyClient = new PublicBuilding();
        TimeInterval timeInterval = new TimeInterval(1, 2);

        EnergyController controller = new SimpleEnergyController();

        EnergySource energySource = controller.mostEnvironmentallyFriendlyEnergySource(energyClient, timeInterval);

        assertThat(energySource, is(instanceOf(PhotovoltaicEnergySource.class)));
    }
}
