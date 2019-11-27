package designPatterns.flyweight;

import java.awt.*;
import java.util.Random;

public class Driver {
    private static Color[] houseColor = {Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray};

    public static void main(String[] args) {
        long totalMemoryUsedStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 1000000; i++) {
            // Original way: 7.4 to 8.4 MB
            // House house = new House(getRandomColor(), i);

            // Flyweight way: 4.8 to 6.3 MB
            House house = HouseFactory.getHouse(getRandomColor());
            house.setHouseNumber(i);
        }

        long totalMemoryUsedEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used: " + (totalMemoryUsedEnd - totalMemoryUsedStart) / 1000000.00 + " MB");
    }

    public static Color getRandomColor() {
        int randomNumer = new Random().nextInt(houseColor.length);
        return houseColor[randomNumer];
    }
}