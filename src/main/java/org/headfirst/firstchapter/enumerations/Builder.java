package org.headfirst.firstchapter.enumerations;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public enum Builder {
    FENDER,
    MARTIN,
    GIBSON,
    COLLINGS,
    OLSON,
    RYAN,
    PRS,
    ANY;

    public String toString(){
        return switch (this){
            case COLLINGS -> "Collings";
            case ANY -> "Any";
            case PRS -> "Prs";
            case RYAN -> "Ryan";
            case GIBSON -> "Gibson";
            case MARTIN -> "Martin";
            case FENDER -> "Fender";
            case OLSON -> "Olson";
        };
    }
}
