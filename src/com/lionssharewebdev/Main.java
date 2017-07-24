package com.lionssharewebdev;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        VehicleInfo newVehicle = new VehicleInfo();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please enter VIN : ");
//        String vinInput = scanner.nextLine();
//        newVehicle.setVIN(vinInput);
//
//        System.out.print("Please enter the miles traveled from your odometer : ");
//        double odometerInput = scanner.nextDouble();
//        newVehicle.setOdometer(odometerInput);
//
//        System.out.print("Please enter the gas used : ");
//        double gasInput = scanner.nextDouble();
//        newVehicle.setConsumption(gasInput);
//
//        System.out.print("Please enter odometer reading for your last oil change : ");
//        double oilChangeInput = scanner.nextDouble();
//        newVehicle.setOdometerLastOil(oilChangeInput);
//
//        System.out.println("Please enter the engine size : ");
//        double engineSizeInput = scanner.nextDouble();
//        newVehicle.setEngineSize(engineSizeInput);
//
//        //write vehicle report to json file
//        try {
//            TelematicsService.report(newVehicle);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("-----------------------------------------------------------------------");
        try {
            TelematicsService.convertJSONFileToObj();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
