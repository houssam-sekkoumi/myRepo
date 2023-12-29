package Ex01

class Triangle(point :Array<Point>):Polygon(point) {
    override fun numberOfPoints(): Int {
       return 3
    }

    override fun type(): String {
        return "Triangle"
    }

    override fun area(): Double {
        val s = perimeter()/2
        val a = points[0].distance(points[1])
        val b = points[1].distance(points[2])
        val c = points[2].distance(points[0])

        return Math.sqrt(s*(s-a)* (s-b)*(s-c))

    }
}