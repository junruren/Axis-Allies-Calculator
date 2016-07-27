package com.android.axisallies;

/**
 * Created by User on 7/26/2016.
 * A Global static class for holding data across Activities
 */
public class DataHolder {
    static int convoyResultIPC = 0;
    static String convoyResultDetail = "";

    /**
     * To reset all the values related to Convoy Disruption
     */
    static void clearConvoy() {
        convoyResultDetail = "";
        convoyResultIPC = 0;
    }

    /**
     * To reset ALL values in the DataHolder by calling each individual clear method
     */
    static void clearAll() {
        clearConvoy();
    }
}
