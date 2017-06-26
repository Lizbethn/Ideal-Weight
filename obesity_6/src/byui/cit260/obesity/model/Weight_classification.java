/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Weight_classification implements Serializable{
    
    private double bmi_weight;
    private String classification_weight;

    public Weight_classification() {
        this.bmi_weight = 0;
        this.classification_weight = "What is your classification weight?";
    }

    public double getBmi_weight() {
        return bmi_weight;
    }

    public void setBmi_weight(double bmi_weight) {
        this.bmi_weight = bmi_weight;
    }

    public String getClassification_weight() {
        return classification_weight;
    }

    public void setClassification_weight(String classification_weight) {
        this.classification_weight = classification_weight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.bmi_weight) ^ (Double.doubleToLongBits(this.bmi_weight) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.classification_weight);
        return hash;
    }

    @Override
    public String toString() {
        return "Weight_classification{" + "bmi_weight=" + bmi_weight + ", classification_weight=" + classification_weight + '}';
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
        final Weight_classification other = (Weight_classification) obj;
        if (Double.doubleToLongBits(this.bmi_weight) != Double.doubleToLongBits(other.bmi_weight)) {
            return false;
        }
        if (!Objects.equals(this.classification_weight, other.classification_weight)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
