/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Rudy_The_GEEK
 */
public class Map implements Serializable{
    private String description;
    private double dimension;

    public Map() {
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
