package de.fhg.fokus.streetlife.mmecp.dataaggregator;


import java.util.Properties;

public interface DataAggregatorClient {

    public void init();
    public void init(Properties props);
    public String getNotifications(String channelId);
}