package com.horel.solutions;

public class HS900
{
    private String productId = "";
    private String deviceName = "";
    private int firmwareVersion = 1;

    public HS900()
    {

    }

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }

    public int getFirmwareVersion()
    {
        return firmwareVersion;
    }

    public void setFirmwareVersion(int firmwareVersion)
    {
        this.firmwareVersion = firmwareVersion;
    }
}