fun main() {
    val num = 10;
    // .. is supported upperbound 10 is included here
    val result1 = num in 1..10; // 1 2 3 4 5 6 7 8 9 10
    println(result1);
    // until isn't supported upperbound 10 isn't included here, 1 to 9 numbers are included
    val result2 = num in 1 until 10; // 1 2 3 4 5 6 7 8 9 
    println(result2);
}