/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.model;

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
        private String kitchen1;
        private String kitchen2;
        private String kitchen3;

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

    public String getKitchen1() {
        return kitchen1;
    }

    public void setKitchen1(String kitchen1) {
        this.kitchen1 = kitchen1;
    }

    public String getKitchen2() {
        return kitchen2;
    }

    public void setKitchen2(String kitchen2) {
        this.kitchen2 = kitchen2;
    }

    public String getKitchen3() {
        return kitchen3;
    }

    public void setKitchen3(String kitchen3) {
        this.kitchen3 = kitchen3;
    }
    
    
    public Building() {
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.kitchen1);
        hash = 97 * hash + Objects.hashCode(this.kitchen2);
        hash = 97 * hash + Objects.hashCode(this.kitchen3);
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
        if (!Objects.equals(this.kitchen1, other.kitchen1)) {
            return false;
        }
        if (!Objects.equals(this.kitchen2, other.kitchen2)) {
            return false;
        }
        return Objects.equals(this.kitchen3, other.kitchen3);
    }
    
    @Override
    public String toString() {
        return "Building{" + "name=" + name + ", description=" + description + ", kitchen1=" + kitchen1 + ", kitchen2=" + kitchen2
                + ", kitchen3=" + kitchen3 + '}';
    }

    
}
