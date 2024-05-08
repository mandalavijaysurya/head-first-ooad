package org.headfirst.firstchapter.dto;

import org.headfirst.firstchapter.enumerations.Builder;
import org.headfirst.firstchapter.enumerations.Type;
import org.headfirst.firstchapter.enumerations.Wood;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numString;
    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumString(){
        return numString;
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }
    public boolean validateGuitarSpec(GuitarSpec guitarSpec){
        if(guitarSpec.getBuilder() != this.getBuilder())
            return false;
        String model = guitarSpec.getModel().toLowerCase();
        if((model != null) && (model.isEmpty()) && (!model.equals(this.getModel().toLowerCase())))
            return false;
        if(guitarSpec.getType() != this.getType())
            return false;
        if(guitarSpec.getBackWood() != this.getBackWood())
            return false;
        return guitarSpec.getTopWood() == this.getTopWood();
    }
}
