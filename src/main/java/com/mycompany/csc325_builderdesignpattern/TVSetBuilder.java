package com.mycompany.csc325_builderdesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class TVSetBuilder {

    private int screenSize;
    private int numberOfProcessors;
    private String brand;
    private boolean enabledIoT;

    public TVSetBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    } // End setScreenSize.

    public TVSetBuilder setNumberOfProcessors(int numberOfProcessors) {
        this.numberOfProcessors = numberOfProcessors;
        return this;
    } // End setNumberOfProcessors.

    public TVSetBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    } // End setBrand.

    public TVSetBuilder setEnabledIoT(boolean enabledIoT) {
        this.enabledIoT = enabledIoT;
        return this;
    } // End setEnabledIoT.

    public TVSet getTV() {
        return new TVSet(screenSize, numberOfProcessors, brand, enabledIoT);
    } // End getTV.

} // End TVSetBuilder.
