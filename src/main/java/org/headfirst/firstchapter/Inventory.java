package org.headfirst.firstchapter;

import org.headfirst.firstchapter.dto.Guitar;
import org.headfirst.firstchapter.dto.GuitarSpec;
import org.headfirst.firstchapter.enumerations.Builder;
import org.headfirst.firstchapter.enumerations.Type;
import org.headfirst.firstchapter.enumerations.Wood;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class Inventory {
    private List<Guitar> guitars;

    public Inventory(){
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price, int numString){
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood,numString);
        Guitar guitar = new Guitar(serialNumber,price,guitarSpec);
        guitars.add(guitar);
    }
    public Guitar getGuitar(String serialNumber){
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {
            GuitarSpec spec = guitar.getSpec();
            if (!spec.validateGuitarSpec(searchGuitar)) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
