package designPatterns.adapter.points

fun main() {
    val plane = Plane2D()

    // 2D points
    val point2Ds = listOf<Point2D>(
        Point2D(1.0, 2.2),
        Point2D(0.0, 0.0),
        Point2D(-3.7, 4.999)
    )

    // 3D points
    val point3Ds = listOf<Point3D>(
        Point3D(1.0, 0.0, -3.1),
        Point3D(-2.2, 5.1, 0.8)
    )
}