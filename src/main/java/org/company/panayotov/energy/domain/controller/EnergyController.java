package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.EnergyClient;

public interface EnergyController {

    Result mostEnvironmentallyFriendlyEnergySource(EnergyClient energyClient, TimeInterval timeInterval);
}


