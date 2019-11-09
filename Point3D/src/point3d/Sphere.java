/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point3d;

import java.util.Comparator;

/**
 *
 * @author rmart106
 */
public class Sphere extends Shape3D{
    
    double radius;

    public Sphere(int x, int y, int z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }
    
    
    @Override
    public double volume() {
        
        double volume = (4/3)*(this.PI*Math.pow(radius, 3));
        return volume;
        
    }

    @Override
    public double surfaceArea() {
        
        double area = 4*this.PI*Math.pow(radius, 2);
        return area;
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator reversed() {
        return super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
