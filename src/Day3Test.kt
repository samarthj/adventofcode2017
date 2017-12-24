import org.junit.Test
import kotlin.test.assertEquals

class Day3Test {
    @Test
    fun findManhattenDistance() {
        assertEquals(0, Day3().findManhattanDistance(1))
        assertEquals(3, Day3().findManhattanDistance(12))
        assertEquals(2, Day3().findManhattanDistance(23))
        assertEquals(31, Day3().findManhattanDistance(1024))
    }

    @Test
    fun findNearestSquare() {
        assertEquals(1, Day3().findNearestOddSquare(1))
        assertEquals(9, Day3().findNearestOddSquare(12))
        assertEquals(25, Day3().findNearestOddSquare(23))
        assertEquals(1089, Day3().findNearestOddSquare(1024))
    }

}