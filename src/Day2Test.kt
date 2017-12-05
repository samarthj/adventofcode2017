import org.junit.Test
import kotlin.test.assertEquals

class Day2Test {
    @Test
    fun checkDataIntegrity() {
        assertEquals(18L, Day2().checkDataIntegrity("5\t1\t9\t5\n7\t5\t3\n2\t4\t6\t8"))
    }

    @Test
    fun findDiff() {
        assertEquals(5L, Day2().findDiff("7\t8\t9\t10\t11\t12"))
        assertEquals(8L, Day2().findDiff("5\t1\t9\t5"))
        assertEquals(4L, Day2().findDiff("7\t5\t3"))
        assertEquals(6L, Day2().findDiff("2\t4\t6\t8"))
    }

    @Test
    fun checkDataIntegrity_Input() {

        val matrix = InputReader().read("Day2Input")
        println(Day2().checkDataIntegrity(matrix))

    }

    @Test
    fun findQuotient() {
        assertEquals(4L, Day2().findQuotient("5\t9\t2\t8"))
        assertEquals(3L, Day2().findQuotient("9\t4\t7\t3"))
        assertEquals(2L, Day2().findQuotient("3\t8\t6\t5"))
    }

    @Test
    fun checkDataIntegrityForDivisors_Input() {

        val matrix = InputReader().read("Day2Input")
        println(Day2().checkDataIntegrityForDivisors(matrix))

    }

}