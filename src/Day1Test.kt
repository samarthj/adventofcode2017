import org.junit.Test
import kotlin.test.assertEquals

class Day1Test {

    @Test
    fun findSum_SingleDigit() {
        assertEquals(0, Day1().findSum("1"))
        assertEquals(0, Day1().findSum("5"))
    }

    @Test
    fun findSum_TwoDigits() {
        assertEquals(2, Day1().findSum("11"))
        assertEquals(0, Day1().findSum("51"))
    }

    @Test
    fun findSum_ThreeDigits() {
        assertEquals(3, Day1().findSum("111"))
        assertEquals(5, Day1().findSum("515"))
        assertEquals(0, Day1().findSum("513"))
    }

    @Test
    fun findSum_Input() {
        // Input from - http://adventofcode.com/2017/day/1/input
        val numString = InputReader().read("Day1Input")
        println(Day1().findSum(numString))
        // Answer - 1203
    }

    @Test
    fun findSumPart2() {
        assertEquals(6, Day1().findSum("1212", 2))
        assertEquals(0, Day1().findSum("1221", 2))
        assertEquals(4, Day1().findSum("123425", 2))
        assertEquals(12, Day1().findSum("123123", 2))
        assertEquals(4, Day1().findSum("12131415", 2))
    }

    @Test
    fun findSumPart2_Input() {
        // Input from - http://adventofcode.com/2017/day/1/input
        val numString = InputReader().read("Day1Input")
        println(Day1().findSum(numString, 2))
        // Answer - 1146
    }


}