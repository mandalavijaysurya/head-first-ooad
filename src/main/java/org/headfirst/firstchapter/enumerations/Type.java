package org.headfirst.firstchapter.enumerations;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString(){
        return switch (this){
            case ACOUSTIC -> "acoustic";
            case ELECTRIC -> "electric";
        };
    }
}
