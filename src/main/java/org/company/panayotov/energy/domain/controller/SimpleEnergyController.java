package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.EnergyClient;
import org.company.panayotov.energy.domain.source.BioEnergySource;
import org.company.panayotov.energy.domain.source.EnergySource;
import org.company.panayotov.energy.domain.source.PhotovoltaicEnergySource;
import org.company.panayotov.energy.domain.source.WindEnergySource;

public class SimpleEnergyController implements EnergyController {

    @Override
    public EnergySource mostEnvironmentallyFriendlyEnergySource(EnergyClient energyClient, TimeInterval timeInterval) {

        if (timeInterval.endTime() < 9) {
            return new WindEnergySource();
        } else if (timeInterval.endTime() < 18) {
            return new PhotovoltaicEnergySource();
        } else {
            return new BioEnergySource();
        }
    }
}
