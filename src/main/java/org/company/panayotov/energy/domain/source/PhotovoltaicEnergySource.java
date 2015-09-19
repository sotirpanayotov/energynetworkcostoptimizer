package org.company.panayotov.energy.domain.source;

public class PhotovoltaicEnergySource implements EnergySource {

    @Override
    public String name() {
        return "Photovoltaic Energy";
    }
}
