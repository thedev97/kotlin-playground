fun main() {
    println(add(5, 10));
    evenOrOdd(5);
    evenOrOdd(10);
    printMessage(5);
    multiplyTable(5)
}

// Inline functions
fun add(a:Int , b:Int) = a+b;

fun evenOrOdd(num:Int) {
    var result = if(num %2 == 0) "Even" else "Odd";
    println(result)
}

fun printMessage(count:Int){
    for (i in 1..count) {
        println("Hello " + i);
    }
}

fun multiplyTable(num :Int){
    for (i in 1..10) {
        println("$num * $i = ${num * i}");
    }
}