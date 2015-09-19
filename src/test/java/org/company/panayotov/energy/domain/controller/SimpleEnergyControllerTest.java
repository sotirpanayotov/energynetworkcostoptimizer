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
    private final EnergyClient energyClient = new PublicBuilding();

    @Test
    public void returnsWindEnergySource(){
        TimeInterval timeInterval = mock(TimeInterval.class);

        when(timeInterval.startTime()).thenReturn(0);
        when(timeInterval.endTime()).thenReturn(8);

        EnergySource energySource = controller.mostEnvironmentallyFriendlyEnergySource(energyClient, timeInterval);

        assertThat(energySource, is(instanceOf(WindEnergySource.class)));
    }

    @Test
    public void returnsPhotovoltaicEnergySource(){
        TimeInterval timeInterval = mock(TimeInterval.class);

        when(timeInterval.startTime()).thenReturn(9);
        when(timeInterval.endTime()).thenReturn(17);

        EnergySource energySource = controller.mostEnvironmentallyFriendlyEnergySource(energyClient, timeInterval);

        assertThat(energySource, is(instanceOf(PhotovoltaicEnergySource.class)));
    }

    @Test
    public void returnsBioGasPlantEnergySource(){
        TimeInterval timeInterval = mock(TimeInterval.class);

        when(timeInterval.startTime()).thenReturn(18);
        when(timeInterval.endTime()).thenReturn(24);

        EnergySource energySource = controller.mostEnvironmentallyFriendlyEnergySource(energyClient, timeInterval);

        assertThat(energySource, is(instanceOf(BioEnergySource.class)));
    }
}
