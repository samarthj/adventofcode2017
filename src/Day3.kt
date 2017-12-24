class Day3 {

    fun findManhattanDistance(num: Long): Long {

        if (num == 1L) return 0

        // This is the bottom right corner
        val nearestSquare = findNearestOddSquare(num)
        // Note manhattan distance of a square corner is sqrt - 1
        val nearestSquareRoot = squareRoot(nearestSquare).toLong()

        // This is the distance to the corner (note it is the manhattan distance)
        val distanceToCorner = Math.abs(num - nearestSquare)

        // For any mid point on the side, manhattan distance is equal to (sideLength + 1) / 2
        val sideLength = nearestSquareRoot
        val sideMidPointDistance = (sideLength + 1) / 2

        // For any point on the side, manhattan distance is, between nearestSquareRoot -1 and sideMidPointDistance

        if (distanceToCorner > sideLength) {
            return (distanceToCorner - sideLength) + sideMidPointDistance
        } else {
            return (distanceToCorner - sideLength) - ((sideLength + 1) / 2) + sideMidPointDistance
        }
    }

    fun findNearestOddSquare(num: Long): Long {
        val sqRoot = squareRoot(num)
        val lBoundRoot = sqRoot.toLong()
        val uBoundRoot = lBoundRoot + 1
        if (lBoundRoot % 2 != 0L)
            return lBoundRoot * lBoundRoot
        else
            return uBoundRoot * uBoundRoot
    }

    private fun squareRoot(nearestSquare: Long) = Math.pow(nearestSquare.toDouble(), 0.5)
}