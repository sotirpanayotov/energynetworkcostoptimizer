package org.company.panayotov.energy;

import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.PublicBuilding;
import org.company.panayotov.energy.domain.controller.EnergyController;
import org.company.panayotov.energy.domain.controller.SimpleEnergyController;
import org.company.panayotov.energy.domain.source.EnergySource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Please, enter the start time: ");
            Scanner scanner = new Scanner(System.in);
            int startTime = scanner.nextInt();

            System.out.println("Please, enter the end time");
            int endTime = scanner.nextInt();

            TimeInterval timeInterval = new TimeInterval(startTime, endTime);
            EnergyController controller = new SimpleEnergyController();
            EnergySource source = controller.mostEnvironmentallyFriendlyEnergySource(new PublicBuilding(), timeInterval);

            System.out.println("Your Energy will come from " + source.name());

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
