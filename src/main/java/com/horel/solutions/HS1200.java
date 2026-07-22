package com.horel.solutions;


public class HS1200 
{
    private String productID;
    private String deviceName;
    private int firmwareVersion;
    private int supportTier;

    private HS1200()
    {
        
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public String getProductID()
    {
        return productID;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public String getSupportInfo()
    {
        String supportInfo = "HS1200 Device Name: " + deviceName + "\nHS1200 Support Tier: " + supportTier + "\n";

        return supportInfo;
    }

    public int getFirmwareVersion()
    {
        return firmwareVersion;
    }

    public int getSupportTier()
    {
        return supportTier;
    }

    public void setSupportTier(int supportTier)
    {
        this.supportTier = supportTier;
    }

    public static class Builder
    {
        private String productID;
        private String deviceName;
        private int firmwareVersion;
        private int supportTier;

        public Builder productID(String productID)
        {
            this.productID = productID;
            return this;
        }

        public Builder deviceName(String deviceName)
        {
            this.deviceName = deviceName;
            return this;
        }

        public Builder firmwareVersion(int firmwareVersion)
        {
            this.firmwareVersion = firmwareVersion;
            return this;
        }

        public Builder supportTier(int supportTier)
        {
            this.supportTier = supportTier;
            return this;
        }

        public HS1200 build()
        {
            HS1200 hs1200 = new HS1200();
            hs1200.productID = productID;
            hs1200.deviceName = deviceName;
            hs1200.firmwareVersion = firmwareVersion;
            hs1200.supportTier = supportTier;
            return hs1200;
        }
    }
}
