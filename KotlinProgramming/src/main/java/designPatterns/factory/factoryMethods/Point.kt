package designPatterns.factory.factoryMethods

import kotlin.random.Random

class Point(val x: Double, val y: Double) {
    override fun toString(): String {
        return "(${x}, ${y})"
    }

    companion object {
        // Static fields and functions go in here
        fun origin(): Point {
            return Point(0.0, 0.0);
        }

        fun random(): Point {
            return Point(Random.nextDouble(), Random.nextDouble())
        }

        fun atCoords(x: Double, y: Double): Point {
            return Point(x, y)
        }
    }
}