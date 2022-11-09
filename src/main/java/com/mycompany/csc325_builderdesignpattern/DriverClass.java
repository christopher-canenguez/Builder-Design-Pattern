package com.mycompany.csc325_builderdesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {

    public static void main(String[] args) {

        TVSet tv = new TVSetBuilder().setScreenSize(55).setBrand("LG")
                .setEnabledIoT(true).getTV();

        System.out.println("" + tv.toString());

    } // End main.

} // End DriverClass.
