package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.source.EnergySource;
import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.EnergyClient;
import org.company.panayotov.energy.domain.source.PhotovoltaicEnergySource;

public class SimpleEnergyController implements EnergyController {

    @Override
    public EnergySource mostEnvironmentallyFriendlyEnergySource(EnergyClient energyClient, TimeInterval timeInterval) {
        return new PhotovoltaicEnergySource();
    }
}
