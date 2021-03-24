package chapter2


fun max(n1: Int, n2: Int): Int{
    return if(n1>n2) n1 else n2
}

fun main(){
    val res=max(3,5)
    println(res)
    //adapt the function max so it keeps working with 2 parameter but also with n parameteres
}