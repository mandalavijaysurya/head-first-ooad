package org.headfirst.firstchapter.enumerations;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public enum Wood {
    INDIAN_ROSEWOOD,
    BRAZILLIAN_ROSEWOOD,
    MAHOGANY,
    MAPLE,
    COCOBOLO,
    CEDAR,
    ADIRONDACK,
    ALDER,
    SITKA;

    @Override
    public String toString() {
        return switch (this) {
            case ALDER -> "Alder";
            case CEDAR -> "Cedar";
            case MAPLE -> "Maple";
            case SITKA -> "Sitka";
            case COCOBOLO -> "Cocobolo";
            case MAHOGANY -> "Mahogany";
            case ADIRONDACK -> "Adirondack";
            case INDIAN_ROSEWOOD -> "Indian-rosewood";
            case BRAZILLIAN_ROSEWOOD -> "Brazillian-rosewood";
        };
    }
}
