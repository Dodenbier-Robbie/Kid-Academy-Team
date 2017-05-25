/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

/**
 *
 * @author Mann
 */
public class MathControl {
    public double calcVolumeTrianglePrism(double base, double length, double height){
      //Check for invalid values
        if(base <= 0){
            return -1;
        }
      
        if(length <= 0){
            return -1;
        }
        
        if(height <= 0){
            return -1;
        }

       //Body statements
        double area = .5 * base * height;
        double volume = area * length;

       //Return outputs
         return volume;
    }
    public double calcAreaTrapezoid(double base1, double base2, double height){
        //Check for invalid values
        if(base1 <= 0){
            return -1;
        }
      
        if(base2 <= 0){
            return -1;
        }
        
        if(height <= 0){
            return -1;
        }

        //Body statements
        double area = (base1 + base2) * (height/2);

       //Return outputs
         return area;
    }
    public double calcDistanceTwoPoints(double x1, double x2, double y1, double y2){
        //Check for invalid values
            if(x1 == y1 && x1 == x2 && x1 == y2){
                return -1;
            }

            if(y1 == x1 && y1 == x2 && y1 == y2){
                return -1;
            }

            if(x2 == y1 && x2 == x1 && x2 == y2){
                return -1;
            }            

            if(y2 == y1 && y2 == x2 && y2 == y1){
                return -1;
            }            

            //Body statements
            double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

            //Return outputs
            return distance;

        
    }
}
