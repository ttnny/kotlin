package designPatterns.flyweight;

import java.awt.*;

public class House {
    private Color color;
    private int houseNumber;

    public House(Color color) {
        this.color = color;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}