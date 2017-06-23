/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.model;
import java.io.Serializable;
import java.util.Objects;
import kidacademy.control.GameControl;

/**
 *
 * @author Rudy_The_GEEK
 */
public class Map implements Serializable{
    private String description;
    private double dimension;
    
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map() {
    }

    private Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);  
                location.setRow(row);
                location.setCompleted(false);
            }
            
        }
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }
        
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }  
    
    private static Map createMap() {
        
        Map map = new Map(10,10);
        
        GameControl.assignsScenesToLocations(map);
        
        return map;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.dimension) ^ (Double.doubleToLongBits(this.dimension) >>> 32));
        return hash;
        
           
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", dimension=" + dimension + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.dimension) != Double.doubleToLongBits(other.dimension)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }
    
    
    
}
