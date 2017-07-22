package com.lionssharewebdev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by adrienne on 7/21/17.
 */
public class TelematicsService {
    public static void report(VehicleInfo vehicleInfo){
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(vehicleInfo);
    }
}
