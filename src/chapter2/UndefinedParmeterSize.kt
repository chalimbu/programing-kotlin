package chapter2


fun max(vararg n1: Int): Int{
    var max= Int.MIN_VALUE
    val asfda: IntArray =n1
    for ( n in n1 ){
        max=if(n>max) n else max
    }

    return  max
}

fun main(){
    val res=max(3,5)
    println(res)
    //adapt the function max so it keeps working with 2 parameter but also with n parameteres
    println(max(1,3,4,5,8,3))
}