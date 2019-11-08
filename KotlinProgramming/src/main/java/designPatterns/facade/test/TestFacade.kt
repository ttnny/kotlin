package designPatterns.facade.test

import designPatterns.facade.facade.ShapesFacade
import designPatterns.facade.shapes.Circle
import designPatterns.facade.shapes.Point
import designPatterns.facade.shapes.Rectangle
import designPatterns.facade.shapes.ShapeType

fun main() {
    val facade = ShapesFacade()

    val shape1: Circle = facade.generateShape(ShapeType.CIRCLE, 1.3) as Circle
    val shape2: Rectangle = facade.generateShape(
        ShapeType.RECTANGLE,
        2.9, 11.7
    ) as Rectangle
    val point: Point = facade.generateShape(ShapeType.POINT, 2.0, 3.1) as Point
}