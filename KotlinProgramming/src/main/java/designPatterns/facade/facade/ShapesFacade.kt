package designPatterns.facade.facade

import designPatterns.facade.shapes.*
import designPatterns.facade.subsystems.CreateShapes
import designPatterns.facade.subsystems.ShapeDimensions

class ShapesFacade {
    // Create a map to validate shape dimensions
    private val numDims = mapOf<ShapeType, Int>(
        ShapeType.ELLIPSE to 2,
        ShapeType.CIRCLE to 1,
        ShapeType.RECTANGLE to 2,
        ShapeType.SQUARE to 1,
        ShapeType.LINE to 4,
        ShapeType.POINT to 2
    )

    fun generateShape(type: ShapeType, vararg dimensions: Double): Shape {
        // Check that we have the right number of parameters
        require(dimensions.size == numDims[type]) { "Number of dimensions are incorrect." }

        val createShapes = CreateShapes()
        return when (type) {
            ShapeType.ELLIPSE -> createShapes.generateEllipse(dimensions[0], dimensions[1])
            ShapeType.CIRCLE -> createShapes.generateCircle(dimensions[0])
            ShapeType.RECTANGLE -> createShapes.generateRectangle(dimensions[0], dimensions[1])
            ShapeType.SQUARE -> createShapes.generateSquare(dimensions[0])
            ShapeType.LINE -> createShapes.generateLine(dimensions[0], dimensions[1], dimensions[2], dimensions[3])
            ShapeType.POINT -> createShapes.generatePoint(dimensions[0], dimensions[1])
        }
    }

    fun getArea(shape: Shape): Double {
        val shapeDimensions = ShapeDimensions()

        return when (shape.type) {
            ShapeType.ELLIPSE -> shapeDimensions.ellipseArea(shape as Ellipse)
            ShapeType.CIRCLE -> shapeDimensions.ellipseArea(shape as Circle)
            ShapeType.RECTANGLE -> shapeDimensions.rectangleArea(shape as Rectangle)
            ShapeType.SQUARE -> shapeDimensions.rectangleArea(shape as Rectangle)
            ShapeType.LINE -> 0.0
            ShapeType.POINT -> 0.0
        }
    }
}