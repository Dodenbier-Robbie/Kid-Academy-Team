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
 * @author Mann
 */
public class Building implements Serializable{
    
        // Class instance variables
        private String name;
        private String description;
        private String classroom1;
        private String classroom2;
        private String classroom3;
        private String classroom4;
        private String classroom5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassroom1() {
        return classroom1;
    }

    public void setClassroom1(String classroom1) {
        this.classroom1 = classroom1;
    }

    public String getClassroom2() {
        return classroom2;
    }

    public void setClassroom2(String classroom2) {
        this.classroom2 = classroom2;
    }

    public String getClassroom3() {
        return classroom3;
    }

    public void setClassroom3(String classroom3) {
        this.classroom3 = classroom3;
    }
    
    public String getClassroom4() {
        return classroom4;
    }

    public void setClassroom4(String classroom4) {
        this.classroom4 = classroom4;
    }

    public String getClassroom5() {
        return classroom5;
    }

    public void setClassroom5(String classroom5) {
        this.classroom5 = classroom5;
    }
    
    public Building() {
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.classroom1);
        hash = 97 * hash + Objects.hashCode(this.classroom2);
        hash = 97 * hash + Objects.hashCode(this.classroom3);
        hash = 97 * hash + Objects.hashCode(this.classroom4);
        hash = 97 * hash + Objects.hashCode(this.classroom5);
        return hash;
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
        final Building other = (Building) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.classroom1, other.classroom1)) {
            return false;
        }
        if (!Objects.equals(this.classroom2, other.classroom2)) {
            return false;
        }
        if (!Objects.equals(this.classroom3, other.classroom3)) {
            return false;
        }
        if (!Objects.equals(this.classroom4, other.classroom4)) {
            return false;
        }
        return Objects.equals(this.classroom5, other.classroom5);
    }
    
    @Override
    public String toString() {
        return "Building{" + "name=" + name + ", description=" + description + ", classroom1=" + classroom1 + ", classroom2=" + classroom2
                + ", classroom3=" + classroom3 + ", classroom4=" + classroom4 + ", classroom5=" + classroom5 + '}';
    }

    
}
