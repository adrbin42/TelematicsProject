package com.lionssharewebdev;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonParseException;





/**
 * Created by adrienne on 7/21/17.
 */

public class TelematicsService {
    public static void report(VehicleInfo newVehicle) throws JsonGenerationException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        String vinNumber = newVehicle.getVIN();
        mapper.writeValue(new File(vinNumber + ".json"), newVehicle);
        String jsonString = mapper.writeValueAsString(newVehicle);
        System.out.print("Your vehicle information is as follows: "+ jsonString);
    }

    public static void convertJSONFileToObj() throws IOException {
        int incrementVIObject = 0;
        File file = new File(".");
        for (File f : file.listFiles()) {
            if (f.getName().endsWith(".json")) {
                incrementVIObject++;
                Scanner scannerFile = new Scanner(f.getName());
                ObjectMapper mapper = new ObjectMapper();
                String jsonString = scannerFile.toString();
                VehicleInfo vehicleInfoObject = mapper.readValue(jsonString, VehicleInfo.class);
                System.out.println("The java object name is: " + vehicleInfoObject + incrementVIObject );
                System.out.println("The object information read from file is : " + vehicleInfoObject);
            }
        }



    }
}
