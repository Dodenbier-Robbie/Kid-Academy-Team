/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mann
 */

public class Location implements Serializable {
    
    //class instance variables
    private Boolean completed;
    private String coordinates;
    
    private int row;
    private int column;
    private ArrayList<Actor> actors;

    public Location() {
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.completed);
        hash = 89 * hash + Objects.hashCode(this.coordinates);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "completed=" + completed + ", coordinates=" + coordinates + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.completed, other.completed)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

    void setColumn(int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRow(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisited(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}