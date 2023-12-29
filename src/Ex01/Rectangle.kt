package Ex01

class Rectangle(point :Array<Point>):Polygon(point) {
    override fun numberOfPoints(): Int {
        return  4
    }

    override fun type(): String {
        return "Rectangle"
    }

    override fun area(): Double {
       val longeur = points[0].distance(points[1])
       val largeur = points[1].distance(points[2])
        return longeur*largeur
    }
}