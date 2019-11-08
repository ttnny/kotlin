package designPatterns.adapter.points.adapter

import designPatterns.adapter.points.ICartesianPoint
import designPatterns.adapter.points.Point3D

// Pass in the incompatible object
// Make this class compatible with Plane2D (the target system)
class Point3DAdapter(point: Point3D) : ICartesianPoint {
    // Adaptee
    val point: Point3D = point

    // Required fields for the target system
    override val x: Double
        get() = point.x
    override val y: Double
        get() = point.y

    override fun toString(): String {
        return "(${point.x}, ${point.y})"
    }
}