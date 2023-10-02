fun main() {
    // while Loop
    /*var count = 5;
    while(count>=1){
        println("Hello World");
        count--;
    }*/

    /*var num = 2;
    var index = 1;
    while(index <= 10){
        println(num * index);
        index++;
    }*/

    // do-while loop
    /*do{
        println("Hello");
        index++;
    }while(index <= 3)*/

    /*do{
        println(num * index);
        index++;
    }while(index<=10)*/

    // For loop
    // Increament
    /*for (i in 1..5) {
        println(i);
    }
    // Increament  + 2
    for (i in 1..10 step 2) {
        println(i);
    }*/
    // Decreament
    /*for (i in 10 downTo 1) {
        println(i); 
    }
    // Decreament  - 2
    for (i in 10 downTo 1 step 2) {
        println(i); 
    }*/

    var num = 2;
    for (i in 1..10) {
        println("$num * $i = ${num * i}")
    }
}