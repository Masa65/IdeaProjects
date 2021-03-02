import java.io.File.separator
import java.lang.Math.abs

fun main() {
    readLine()
    val scores = readLine()!!.split(" ").map(String::toInt)
    var average = 0;

    scores.forEach {
        average += it
    }

    average /= scores.size

    println(
        (1..scores.size).joinToString(separator = "\n") {
            kotlin.math.abs((it - 1) - average).toString()
        }
    )
}