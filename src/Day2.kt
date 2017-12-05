class Day2 {

    fun checkDataIntegrity (matrix: String) : Long {

        val rows = matrix
                .split("\n")
                .filterNot { it.isEmpty() }

        val difference = rows.map { row -> findDiff(row) }

        return difference.sum()
    }

    fun findDiff(row: String): Long {
        val numElements = row
                .split("\t")
                .filterNot { it.isEmpty() }
                .map { it.toLong() }

        val max = numElements.max()
        val min = numElements.min()

        if (max != null && min != null)
            return max - min
        else
            throw IllegalArgumentException()
    }
}