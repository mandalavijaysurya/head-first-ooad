package org.headfirst.firstchapter;

import org.headfirst.firstchapter.dto.Guitar;
import org.headfirst.firstchapter.dto.GuitarSpec;
import org.headfirst.firstchapter.enumerations.Builder;
import org.headfirst.firstchapter.enumerations.Type;
import org.headfirst.firstchapter.enumerations.Wood;

import java.util.List;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initilaizeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,6);
        List<Guitar> guitars = inventory.search(whatErinLikes);
        if(!guitars.isEmpty()){
            System.out.println("Erin, you might like this ");
            for (Guitar guitar : guitars) {
                GuitarSpec spec = guitar.getSpec();
                System.out.println(spec.getBuilder() + " " + spec.getModel() + " " + spec.getNumString() + "-string " + spec.getType() + " guitar:\n   " +
                        spec.getBackWood() + " back and sides, \n" +
                        spec.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
            }
        }else{
            System.out.println("Sorry, Erin, we have nothing for you.");
        }

    }
    public static void initilaizeInventory(Inventory inventory) {
        inventory.addGuitar("11277", Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA, 3999.95, 6);
        inventory.addGuitar("V95693", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1499.95, 6);
        inventory.addGuitar("V9512", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1549.95, 6);
        inventory.addGuitar("122784", Builder.MARTIN, "D-18", Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK, 5495.95, 6);
        inventory.addGuitar("76531", Builder.MARTIN, "OM-28", Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.ADIRONDACK, 6295.95, 6);
        inventory.addGuitar("70108276", Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 2295.95, 6);
        inventory.addGuitar("82765501", Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 1890.95, 6);
        inventory.addGuitar("77023", Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.BRAZILLIAN_ROSEWOOD, Wood.ADIRONDACK, 6275.95, 6);
        inventory.addGuitar("1092", Builder.OLSON, "SJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR, 12995.95, 12);
        inventory.addGuitar("566-62", Builder.RYAN, "Cathedral", Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR, 8999.95, 12);
        inventory.addGuitar("6 29584", Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 2100.95, 6);
    }
}
