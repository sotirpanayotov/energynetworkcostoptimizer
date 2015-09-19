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
        if (timeInterval.endTime() <= 8) {
            return new PhotovoltaicEnergySource();
        } else if (timeInterval.endTime() <= 16){
            return new WindEnergySource();
        } else {
            return new BioEnergySource();
        }
    }
}
