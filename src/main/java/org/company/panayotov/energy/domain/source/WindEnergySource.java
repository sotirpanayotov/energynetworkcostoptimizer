package org.company.panayotov.energy.domain.source;


public class WindEnergySource implements EnergySource {

    @Override
    public String name() {
        return "Wind Energy";
    }
}
