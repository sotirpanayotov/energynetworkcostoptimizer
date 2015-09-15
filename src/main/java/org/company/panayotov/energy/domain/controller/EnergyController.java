package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.source.EnergySource;
import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.EnergyClient;

public interface EnergyController {

    EnergySource mostEnvironmentallyFriendlyEnergySource(EnergyClient energyClient, TimeInterval timeInterval);


}


