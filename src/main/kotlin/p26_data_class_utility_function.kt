/*
in application we have some classes which are only used to store data

in java ,if we have to make those claases we have to write gettter and setters for them

but in kotlin we can make those classes just by writing :data in front of them


 */
fun main(){
  val p1=Person1(1,"john")   //same data diffrent objects
  val p2=Person1(1,"john")

//     val p3:Person=p1.copy(id = 3)
//    println(p3)

    println(p1) //toString  ,when we print refrence to an object ,complier call to string methd=od only

    println(p2)
    println(p1.hashCode())
    println(p1==p2)   //p1.equals(p2)  //give false , but when class person ka aga data used it will give true
}

data class Person1(val id:Int,val name:String){

}