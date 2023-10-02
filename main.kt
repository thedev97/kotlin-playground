fun main() {
    println("Hello World");

    println("-----");

    // Oprators, Variables & DataTypes
    var  a = 3;
    var b = !(a!=3)
    println(b) // true

    println("-----");

    // Post & Pre Increament
    var i  = 10;
    println(i++); // 10
    println(i); // 11

    println(++i); // 12
    println(i); // 12

    println(i++ + ++i); // 12 + 14 = 26

    println("-----");

    // Short Circuting Operator
    var x = 19;
    var result = i == 26 || x++ == 19;
    println(i);
    println(x);
    println(result);
}