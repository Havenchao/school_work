/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point3d;

/**
 *
 * @author rmart106
 */
public class Cone extends Shape3D{
    private double height, radius;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cone(double x, double y, double z, double height, double radius) {
        super(x, y, z);
        this.height = height;
        this.radius = radius;
        
    }
    

    @Override
    public double volume() {
       double volume = (this.PI* Math.pow(radius, 2)*height)/3;
       return volume;
    }

    @Override
    public double surfaceArea() {
       double s= Math.sqrt(Math.pow(radius,2)+ Math.pow(height,2));
       double area = this.PI * radius * (radius + s);
       return area;
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
