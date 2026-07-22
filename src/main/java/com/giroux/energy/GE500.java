package com.giroux.energy;

public class GE500 
{
    private String serialNumber;
    private double firmwareVersion;

    public GE500()
    {
        serialNumber = "";
        firmwareVersion = 1.0;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public double getFirmwareVersion()
    {
        return firmwareVersion;
    }

    public void setFirmwareVersion(double firmwareVersion)
    {
        this.firmwareVersion = firmwareVersion;
    }
    
}
