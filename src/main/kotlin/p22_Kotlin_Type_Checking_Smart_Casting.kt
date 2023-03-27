/*

for type checking we have a operator called "is"

ek smart casting b hoti ha jisma kotlin aap aap type identity kar ka , suggestion deta ha when . operator is used

 */

fun main(){

    val x=10
    println(x is Int)  //it will print true bcoz x is integer
    //println(x is Double) //it will give error before running the progam ie at the complie time red underline below doble this is was done to print run time error which is big problem in java

}