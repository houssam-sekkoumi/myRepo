package Ex01

data class Point(
    var abscisse: Double = 0.0,
    var ordonné: Double = 0.0
) {
    constructor(p: Point) : this(p.abscisse, p.ordonné)

    fun distance(point: Point): Double {
        return Math.sqrt(Math.pow(this.abscisse - point.abscisse, 2.0) + Math.pow(this.ordonné - point.ordonné, 2.0))
    }

    fun norm(p: Point): Double {
        val origin = Point(0.0, 0.0)
        return this.distance(origin)
    }

}

