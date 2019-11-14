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
public class Parallelepiped extends Shape3D{
    private double length, width, height;

    public Parallelepiped(double x, double y, double z, double length, double width, double height) {
        super(x, y, z);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double height) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return height;
    }

    public void setHeigh(double heigh) {
        this.height = heigh;
    }

    @Override
    public double volume() {
        double volume =length * width * height;
        return volume; 
    }

    @Override
    public double surfaceArea() {
         double area =  2*((length * width) + (length* height) + (width*height)) ;
        return area;
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
