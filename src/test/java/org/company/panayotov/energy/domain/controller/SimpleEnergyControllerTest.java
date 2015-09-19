package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.EnergyClient;
import org.company.panayotov.energy.domain.client.PublicBuilding;
import org.company.panayotov.energy.domain.source.BioEnergySource;
import org.company.panayotov.energy.domain.source.EnergySource;
import org.company.panayotov.energy.domain.source.PhotovoltaicEnergySource;
import org.company.panayotov.energy.domain.source.WindEnergySource;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SimpleEnergyControllerTest {

    private final EnergyController controller = new SimpleEnergyController();

    @Test
    public void returnsPhotovoltaicEnergySource(){
        EnergyClient energyClient = new PublicBuilding();
        TimeInterval timeInterval = mock(TimeInterval.class);

        when(timeInterval.startTime()).thenReturn(1);
        when(timeInterval.endTime()).thenReturn(7);

        EnergySource energySource = controller.mostEnvironmentallyFriendlyEnergySource(energyClient, timeInterval);

        assertThat(energySource, is(instanceOf(PhotovoltaicEnergySource.class)));
    }

    @Test
    public void returnsWindEnergySource(){
        EnergyClient energyClient = new PublicBuilding();
        TimeInterval timeInterval = mock(TimeInterval.class);

        when(timeInterval.startTime()).thenReturn(8);
        when(timeInterval.endTime()).thenReturn(16);

        EnergySource energySource = controller.mostEnvironmentallyFriendlyEnergySource(energyClient, timeInterval);

        assertThat(energySource, is(instanceOf(WindEnergySource.class)));
    }

    @Test
    public void returnsBioGasPlantEnergySource(){
        EnergyClient energyClient = new PublicBuilding();
        TimeInterval timeInterval = mock(TimeInterval.class);

        when(timeInterval.startTime()).thenReturn(17);
        when(timeInterval.endTime()).thenReturn(24);

        EnergySource energySource = controller.mostEnvironmentallyFriendlyEnergySource(energyClient, timeInterval);

        assertThat(energySource, is(instanceOf(BioEnergySource.class)));
    }
}
