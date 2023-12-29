package Ex01

abstract class Polygon(points: Array<Point>) : IMeasurement {
    abstract fun numberOfPoints(): Int
    abstract fun type(): String
    var points = points
        set(value) {
            if (numberOfPoints() != points.size)
                throw Exception("${type()} must have ${numberOfPoints()} points !!!")
            for (i in 0 until points.size)
                if (points[i] == points[i + 1])
                    throw Exception("${type()} can't be created using the given points !!!")
            field = value
        }

    override fun perimeter(): Double {
        var p = 0.0
        for (i in 0 until points.size - 1) {
            p += points[i].distance(points[i + 1])
        }
        return p

    }

    override fun toString(): String {
        return "${type()}\n" +
                "- Points: ${points}\n" +
                "- Perimeter: ${perimeter()}\n" +
                "- Area: ${area()}"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Polygon)
            if (this.type() == other.type())
            if (this.points.contentEquals(other.points))
                return true
        return false
    }



}