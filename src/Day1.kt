/**
 * http://adventofcode.com/2017/day/1
 */

class Day1 {
    fun findSum (input : String) : Long {
        val digits = input.toCharArray()
        val numDigits = digits.size

        if (numDigits <=1 )
            return 0

        var runningSum = 0L

        for ((index, value) in digits.withIndex()) {
            val nextIndex = if ((index + 1) == numDigits) 0 else (index + 1)
            if (value == digits[nextIndex])
                runningSum += value.toInt().minus('0'.toInt())
        }
        return runningSum
    }

    fun findSum (input : String, divisor : Int) : Long {
        val digits = input.toCharArray()
        val numDigits = digits.size

        if (numDigits <=1 )
            return 0

        var runningSum = 0L
        var offset = numDigits/divisor // guaranteed to be even

        for ((index, value) in digits.withIndex()) {
            val offsetIndex = index + offset
            val nextIndex = if (offsetIndex >= numDigits) (offsetIndex - numDigits) else offsetIndex
            if (value == digits[nextIndex])
                runningSum += value.toInt().minus('0'.toInt())
        }
        return runningSum
    }
}