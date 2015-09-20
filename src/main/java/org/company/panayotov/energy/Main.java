package org.company.panayotov.energy;

import org.company.panayotov.energy.domain.TimeInterval;
import org.company.panayotov.energy.domain.client.PublicBuilding;
import org.company.panayotov.energy.domain.controller.EnergyController;
import org.company.panayotov.energy.domain.controller.Result;
import org.company.panayotov.energy.domain.controller.SimpleEnergyController;

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
            Result result = controller.mostEnvironmentallyFriendlyEnergySource(new PublicBuilding(), timeInterval);

            System.out.println("Your Energy will come from " + result.energySource().name());

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
