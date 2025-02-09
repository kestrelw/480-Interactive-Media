/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import java.util.TreeMap


//a
data class Person(val name: String, var age: Int? = null)

//d
fun max(num1: Int, num2: Int): Int {
    return maxOf(num1, num2)
    
}

class Rectangle(var width: Int, var height: Int = 15){
    val isSquare: Boolean
    	get(){
            return height == width
        }
}

enum class Color{
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color): String {
    return when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }
}

fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

// i
fun lastChar(text: String): Char{
    return text[text.length - 1]
}

//j
fun printAllCaps(text: String?): String? {
    return text?.uppercase()
}

//k
fun strLenSafe(text: String?): Int {
    return text?.length ?: 0
}


//b
fun main() {
    //c
    val humanList = listOf(
        Person("Hu", ), 
        Person("man", 6)
    )
    
    val oldest = humanList.maxByOrNull {it.age?: 0}
    println("The oldest is:"+oldest.toString())
    
    //d
    println(max(1, 2))
    
    //e
    val rect = Rectangle(41,43)
    println(rect.width)
    println(rect.height)
    println(rect.isSquare)
    
    val square = Rectangle(15)
    println(square.isSquare)
    
    //f
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
    
    //g
    for (i in 100 downTo 1) {
        if(i%2 == 0){
            print(i)
        }
    }
    println("\nDone")
    
    //h
    val binaryReps = TreeMap<Char, String>()
         for (c in 'A'..'F') {
         val binary = Integer.toBinaryString(c.toInt())
         binaryReps[c] = binary
    }
    for ((index, entry) in binaryReps.entries.withIndex()) {
        println("${entry.key} = ${entry.value}")
    }
    
    //i
    println(lastChar("Mobile App Dev II"))
    
    //j
    println(printAllCaps("abc"))
    println(printAllCaps(null))
    
    //j
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}