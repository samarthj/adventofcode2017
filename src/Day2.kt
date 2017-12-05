class Day2 {

    fun checkDataIntegrity(matrix: String): Long {

        val rows = matrix
                .split("\n")
                .filterNot { it.isEmpty() }

        val difference = rows.map { row -> findDiff(row) }
        return difference.sum()
    }

    fun findDiff(row: String): Long {
        val numElements = stringElementsToLong(row)

        val max = numElements.max()
        val min = numElements.min()

        if (max != null && min != null)
            return max - min
        else
            throw IllegalArgumentException()
    }

    fun checkDataIntegrityForDivisors(matrix: String): Long {

        val rows = matrix
                .split("\n")
                .filterNot { it.isEmpty() }

        val quotients = rows.map { row -> findQuotient(row) }
        return quotients.sum()
    }

    fun findQuotient(row: String): Long {

        val numElements = stringElementsToLong(row).sorted()
        return evalQuotient(numElements)
    }

    fun evalQuotient(nums: List<Long>): Long {
        if (nums.size <= 1) throw IllegalArgumentException()
        val max = nums[nums.size - 1]
        val subList = nums.subList(0, nums.size - 1)
        for (value in subList) {
            if (max % value == 0L) {
                return max / value
            }
        }
        return evalQuotient(subList)
    }

    private fun stringElementsToLong(row: String): List<Long> {
        return row
                .split("\t")
                .filterNot { it.isEmpty() }
                .map { it.toLong() }
    }
}