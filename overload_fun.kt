import kotlin.math.pow

fun main() {
    println(addition(2, 3));
    println(addition(2.5, 3.5));

    // If function is overloaded then decalare the variable like this
    var fn: (a:Int, b:Int) -> Int = :: addition;
    println(fn(4, 5));

    // for normal method
    var pow = ::power;
    println(pow(2.0, 3.0));

}

// Overloading
fun addition(a:Int, b:Int):Int = a+b;

fun addition(a:Double, b:Double):Double = a+b;

fun power(a:Double, b:Double):Double {
    return a.pow(b);
};




