import java.io.BufferedReader
import java.io.File

class InputReader {
    fun read (file: String) : String {
        val bufferedReader: BufferedReader = File(file).bufferedReader()
        val inputString = bufferedReader.use { it.readText() }
        return inputString
    }
}