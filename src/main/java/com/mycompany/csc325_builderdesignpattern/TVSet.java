
package com.mycompany.csc325_builderdesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class TVSet {
    
    private int screenSize;
    private int numberOfProcessors;
    private String brand;
    private boolean enabledIoT;

    public TVSet(int screenSize, int numberOfProcessors, String brand,
            boolean enabledIoT) {
        super();
        this.screenSize = screenSize;
        this.numberOfProcessors = numberOfProcessors;
        this.brand = brand;
        this.enabledIoT = enabledIoT;
    }

    @Override
    public String toString() {
        return "TVSet{" + "screenSize=" + screenSize + ", numberOfProcessors=" 
                + numberOfProcessors + ", brand=" + brand + ", enabledIoT=" 
                + enabledIoT + '}';
    }
    
    
}
