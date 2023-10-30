fun main() {
    // implict array
    var arr1 = arrayOf("One", "Two", "Three");
    // explict array
    var arr2 = arrayOf<Int>(1,2,3);
    // print the array
    for (i in arr2) {
        println(i);
    }
    // print the array element with index
    for ((i,e) in arr1.withIndex()) {
        println("$i - $e");
    }
    // size of array
    println(arr1.size);
    println(arr2.size);
    // access the particual index
    println(arr1[0]);
    println(arr2[1]);
    // set & get the value of array
    println(arr1.set(0, "Hello"));
    println(arr1.get(0));
    // print the array
    for (i in arr1) {
        println(i);
    }
}