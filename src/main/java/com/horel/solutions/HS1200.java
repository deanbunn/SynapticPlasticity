package com.horel.solutions;

//import java.lang.module.ModuleDescriptor.Builder;

public class HS1200 
{
    private String product_id;
    private String device_name;
    private int firmware_version;
    private int support_tier;

    private HS1200()
    {
        
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public String getProductID()
    {
        return product_id;
    }

    public String getDeviceName()
    {
        return device_name;
    }

    public String getSupportInfo()
    {
        String supportInfo = "HS1200 Device Name: " + device_name + "\nHS1200 Support Tier: " + support_tier + "\n";

        return supportInfo;
    }

    public int getFirmwareVersion()
    {
        return firmware_version;
    }

    public int getSupportTier()
    {
        return support_tier;
    }

    public void setSupportTier(int support_tier)
    {
        this.support_tier = support_tier;
    }

    public static class Builder
    {
        private String product_id;
        private String device_name;
        private int firmware_version;
        private int support_tier;

        public Builder product_id(String product_id)
        {
            this.product_id = product_id;
            return this;
        }

        public Builder device_name(String device_name)
        {
            this.device_name = device_name;
            return this;
        }

        public Builder firmware_version(int firmware_version)
        {
            this.firmware_version = firmware_version;
            return this;
        }

        public Builder support_tier(int support_tier)
        {
            this.support_tier = support_tier;
            return this;
        }

        public HS1200 build()
        {
            HS1200 hs1200 = new HS1200();
            hs1200.product_id = product_id;
            hs1200.device_name = device_name;
            hs1200.firmware_version = firmware_version;
            hs1200.support_tier = support_tier;

            if(product_id == null)
            {
                throw new IllegalStateException("Product ID is required");
            }

            if(device_name == null)
            {
                throw new IllegalStateException("Device Name is required");
            }

            return hs1200;
        }
    }
}
