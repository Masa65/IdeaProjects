//import java.io.BufferedReader
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

object Clear {
    @JvmStatic
    fun doClear() {
        try {
            val process = ProcessBuilder("clear").start()
            val isr = InputStreamReader(process.inputStream, "UTF-8")
            val reader = BufferedReader(isr)
            val builder = StringBuilder()
            var c: Int
            while (reader.read().also { c = it } != -1) {
                builder.append(c.toChar())
            }
            println("result:\n$builder")
            process.waitFor()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}