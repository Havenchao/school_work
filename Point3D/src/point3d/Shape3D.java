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
public abstract class Shape3D implements Comparator{
    protected final double PI = Math.PI;
    Point3D point3d;
    
    Shape3D(double x, double y, double z){
        point3d = new Point3D(x,y,z);
    }

    public Point3D getPoint3d() {
        return point3d;
    }

    public void setPoint3d(Point3D point3d) {
        this.point3d = point3d;
    }
 
    public abstract double volume();
    public abstract double surfaceArea();    
        
        
     
    
}
