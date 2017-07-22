package com.lionssharewebdev;

/**
 * Created by adrienne on 7/21/17.
 */
public class VehicleInfo {
    private String VIN;
    private double odometer;
    private double consumption;
    private double odometerLastOil;
    private double engineSize;

    public VehicleInfo() {
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getOdometerLastOil() {
        return odometerLastOil;
    }

    public void setOdometerLastOil(double odometerLastOil) {
        this.odometerLastOil = odometerLastOil;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}
