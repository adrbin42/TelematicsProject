package com.lionssharewebdev;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;



/**
 * Created by adrienne on 7/21/17.
 */

public class TelematicsService {
    //method to convert JAVA object new vehicle object to report file in json format
    //the vehicle object takes user input from command line
    public static void report(VehicleInfo newVehicle) throws JsonGenerationException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        String vinNumber = newVehicle.getVIN();
        mapper.writeValue(new File(vinNumber + ".json"), newVehicle);
        String jsonString = mapper.writeValueAsString(newVehicle);
        System.out.print("Your vehicle information is as follows: "+ jsonString);
    }

    //takes information from json file and converts it to a JAVA object
    public static void convertJSONFileToObj() throws IOException {
        int incrementVIObject = 0;
        File file = new File(".");
        for (File f : file.listFiles()) {
            if (f.getName().endsWith(".json")) {
                ObjectMapper mapper = new ObjectMapper();
                f = new File(f.getName());
                VehicleInfo viFromRepToObj = mapper.readValue(f, VehicleInfo.class);
                System.out.println("------------------------------------------------------");
                System.out.println("Printing Java Object Information");
                System.out.println("Object Reference: " + viFromRepToObj);
                System.out.println("Vehicle VIN : "+ viFromRepToObj.getVIN());
                System.out.println("Vehicle Odometer: "+ viFromRepToObj.getOdometer());
                System.out.println("Vehicle gas consumed: "+ viFromRepToObj.getConsumption());
                System.out.println("Vehicle odometer reading for last oil change: "+ viFromRepToObj.getOdometerLastOil());
                System.out.println("Vehicle VIN engine size: "+ viFromRepToObj.getEngineSize());
            }
        }
    }
    //Updates html page with new vehicle information upon refreshing page
    public static void updateDashboard(VehicleInfo newVehicle) throws IOException {
        List<String> lines = new ArrayList<>();
        final String FILE_NAME = "dashboard.html";
        File file = new File(FILE_NAME);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            lines.add(scanner.nextLine());
        }
        System.out.println(lines);
        String odometer = String.format("%f",newVehicle.getOdometer());
        System.out.println(odometer);

//        Path path = Paths.get(filename);
//        Path toPath = Paths.get(filename);
//        Charset charset = Charset.forName("UTF-8");
//        BufferedWriter writer = Files.newBufferedWriter(toPath, charset);
//        Scanner scanner = new Scanner(path, charset.name());
//        String line;
//        while(scanner.hasNextLine()){
//            line = scanner.nextLine();
//            line = line.replaceAll(target, replacement);
//            writer.write(line);
//            writer.newLine();
//        }
//        scanner.close();
//        writer.close();
    }
}
