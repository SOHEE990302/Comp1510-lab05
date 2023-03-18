package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * GeometryDriver calculates the surface area, 
 * volume and diagonals of spheres, cubes
 * and cones.
 * 
 * @author Your Name
 * @version 1.0
 */
public class GeometryDriver {
    /**
     * Drives the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Enter the radius of the sphere: ");
        double radius = scan.nextDouble();
        System.out.println("Enter the x coordinate of the sphere: ");
        double x = scan.nextDouble();
        System.out.println("Enter the y coordinate of the sphere: ");
        double y = scan.nextDouble();
        System.out.println("Enter the z coordinate of the sphere: ");
        double z = scan.nextDouble();
        Sphere sphere = new Sphere(radius, x, y, z);
        System.out.println("Surface area of sphere: " 
            + df.format(sphere.surfaceArea()));
        System.out.println("Volume of sphere: " + df.format(sphere.volume()));

        System.out.println("Enter the edge length of the cube: ");
        double edge = scan.nextDouble();
        System.out.println("Enter the x coordinate of the cube: ");
        x = scan.nextDouble();
        System.out.println("Enter the y coordinate of the cube: ");
        y = scan.nextDouble();
        System.out.println("Enter the z coordinate of the cube: ");
        z = scan.nextDouble();
        Cube cube = new Cube(edge, x, y, z);
        System.out.println("Surface area of cube: " 
            + df.format(cube.surfaceArea())
            + "\nVolume of cube: " 
            + df.format(cube.volume())
            + "\nLength of diagonal 1 of cube: " 
            + df.format(cube.faceDiagonal())
            + "\nLength of diagonal 2 of cube: " 
            + df.format(cube.spaceDiagonal())); 
            
        System.out.print("\nEnter the radius of the cone: ");
        radius = scan.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double height = scan.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Volume of cone: " 
                + df.format(cone.volume())
                + "\nSlant height of cone: " 
                + df.format(cone.slantHeight())
                + "\nSurface area of cone: " 
                + df.format(cone.surfaceArea()));

        scan.close();
    }
}
