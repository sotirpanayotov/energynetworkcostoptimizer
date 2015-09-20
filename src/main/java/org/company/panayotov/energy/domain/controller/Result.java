package org.company.panayotov.energy.domain.controller;

import org.company.panayotov.energy.domain.source.EnergySource;

public class Result {

    private final EnergySource energySource;

    public Result(EnergySource energySource) {
        this.energySource = energySource;
    }

    public EnergySource energySource() {
        return energySource;
    }
}
