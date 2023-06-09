package ca.bcit.comp1510.lab05;

/**
 * Describe Sphere class.
 * 
 * @author Sohee Hwang
 * @version 2023
 *
 */
public class Sphere {
    /** Holds the X coordinate of the sphere. */
    private double coordinateX;
    
    /** Holds the Y coordinate of the sphere. */ 
    private double coordinateY;
    
    /** Holds the Z coordinate of the sphere. */
    private double coordinateZ;
    
    /** Holds the radius of the sphere. */
    private double radius;
    
    //constructor
    /** Constructor inputs 3 coordinates and radius of the sphere.
    *  @param coordinateX 
    *          a double for x coordinate
    *  @param coordinateY
    *          a double for y coordinate
    *  @param coordinateZ
    *          a double for z coordinate
    *  @param radius
    *          a double for radius
    */  
        
    public Sphere(double coordinateX, double coordinateY, 
        double coordinateZ, double radius) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.radius = radius;
    }

    /**
     * getter and shetter.
     * @return coordinateX as a double
     */
    public double getCoordinateX() {
        return coordinateX;
    }

    /**
     * Sets the x coordinate of sphere to the specified value.
     * @param coordinateX a double
     */
    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    /**
    * Returns the y coordinate of sphere as a double.
    * @return coordinateY as a double
    */
    public double getCoordinateY() {
        return coordinateY;
    }

    /**
    * Sets the y coordinate of sphere to the specified value.
    * @param coordinateY a double
    */
    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    /**
    * Returns the z coordinate of sphere as a double.
    * @return coordinateZ as a double
    */
    public double getCoordinateZ() {
        return coordinateZ;
    }
 
    /**
    * Sets the z coordinate of sphere to the specified value.
    * @param coordinateZ a double
    */
    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    /**
    * Returns the radius of sphere as a double.
    * @return radius as a double
    */
    public double getRadius() {
        return radius;
    }

    /**
    * Sets the radius of sphere to the specified value.
    * @param radius a double
    */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the surface area of sphere as a double.
     * @return the value of surface area as a double
     */   
    public double surfaceArea() {
        final double four = 4.0;
        double a = four * Math.PI * Math.pow(radius, 2);
        return a;
    
    }

    /**
     * Returns the volume of sphere as a double.
     * @return the value of volume as a double
     */   
    public double volume() {
        final double fourAndThree = 4 / 3;
        double v = (fourAndThree) * Math.PI * Math.pow(radius, 2);
        return v;
    }

    /**
     * Returns a String representation of this Sphere.
     * @return toString description containing 3 coordinates and radius.
     */
    public String toString() {
        return "X-coordinate: " + coordinateX + "\n"
            + "Y-coordinate: " + coordinateY + "\n"
            + "Z-coordinate: " + coordinateZ + "\n"
            + "Radius: " + radius;
    }
}
