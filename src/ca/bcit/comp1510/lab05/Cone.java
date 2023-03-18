package ca.bcit.comp1510.lab05;

/**
 * Describe Cone class.
 * @author Sohee Hwang
 * @version 2023
 *
 */
public class Cone {
    /** Holds the radius of the cone. */
    private double radius;
    
    /** Holds the height of the cone. */
    private double height;
    
    /**
     * Constructs a cone with a given radius and height.
     * 
     * @param radius the radius of the cone
     * @param height the height of the cone
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Gets the radius of the cone.
     * 
     * @return the radius of the cone
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Sets the radius of the cone.
     * 
     * @param radius the new radius of the cone
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Gets the height of the cone.
     * 
     * @return the height of the cone
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Sets the height of the cone.
     * 
     * @param height the new height of the cone
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Calculates the volume of the cone.
     * 
     * @return the volume of the cone
     */
    // h = 1/3 𝜋𝑟2ℎ
    public double volume() {
        final double oneAandThree = 1 / 3;
        double h = oneAandThree * Math.PI * Math.pow(radius, 2) * height;
        return h;
    }
    
    /**
     * Calculates the slantHeight of the cone.
     * 
     * @return the slantHeight of the cone
     */
    // h = √𝑟2 + ℎ2.ℎ
    public double slantHeight() {
        final double radiusRoot = Math.sqrt(radius);
        final double heightRoot = Math.sqrt(height);
        double h = Math.pow(radiusRoot, 2) + Math.pow(heightRoot, 2);
        return h;
    }
    
    /**
     * Calculates the surfaceArea of the cone.
     * 
     * @return the surfaceArea of the cone
     */
    // h = 𝜋𝑟2 + 𝜋𝑟(√𝑟2 + ℎ2)
    public double surfaceArea() {
        final double radiusRoot = Math.sqrt(radius);
        final double heightRoot = Math.sqrt(height);
        double h = (Math.PI * Math.pow(radius, 2)) 
                + (Math.PI * radius 
                        * (Math.pow(radiusRoot, 2) + Math.pow(heightRoot, 2)));
        return h;
    }
    
    /**
     * Returns a String representation of this Sphere.
     * @return toString description containing 3 coordinates and radius.
     */
    public String toString() {
        return "radius: " + radius + "\n"
            + "height: " + height + "\n";
    }
}
