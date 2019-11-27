package designPatterns.flyweight;

import java.awt.*;
import java.util.HashMap;

public class HouseFactory {
    private static HashMap<Color, House> savedHouses = new HashMap<Color, House>();

    public static House getHouse(Color color) {
        House house = savedHouses.get(color);

        if (house == null) {
            house = new House(color);

            savedHouses.put(color, house);
        }

        return house;
    }
}