import java.security.Principal
import java.util.*

/*

interface
1.group objects based on what they can do rather than what they are
2.to use polymorphism in unrealted set of classes (ie classes which do not belong to same inheritance hierarchy)

behaviour same ha but , hierarchy class different ha , unko club karna ha


3.commom terminology =interafce is a contract which states that whoever implements that interface has to provide the implementation for the methods


4.interfaces are meant for behaviours .class which exhibits that behaviour implements that interface

5.interface can have both abstract and concrete methods

6.interface can implement other interfaces and one class can implements many interfaces but classes can have only one superclass


//a useer  want to drag all shapes and its own shape also

step 1
reference is of parent class ,objects are of specify type
polymorphism ma yahi tha

parents can hold reference to its child and can call methods of it child class which are common


interrface ma if you make function and you dont define it body , it will be abstract by defaultt


keep it simple

there are some classes which are unrealted ie unka bich ma koi inheritance hierarchy nahi ha ,
but here behvaiour is common like we had differnt shape ki class ha ,and player ki class ha ,both can be dragged (common bheaviour0

so what we did was , humna us drag behaviour ko as an interface implement kar dia
a class can inherit many interface that means multiple behvaiour
 so we make different interfaces for different behaviour

 and a class can implemtn it
 */

fun main(){
dragObjects((arrayOf(Circle(4.0),Square(4.0),Triangle(2.0,3.0),Player("smiley"))))  //dragObjects((arrayOf(Circle(4.0),Square(4.0),Triangle(2.0,3.0))))
}

fun dragObjects(objects:Array<Draggable>){ //fun which accept an array of objects which are of type shape  now we cna replace shape with draggable here fun dragObjects(objects:Array<Shape>)
  for(obj in objects){  //here common method is drag .referecen is of shape type but it called drag method
      obj.drag()    //removing this to implement interface
  }
}

interface Draggable{
    fun drag()
}

//interface Cloneable{   just an expample that we can implemebt nultiple interface to class
//   fun clone()
//}

abstract  class Shape:Draggable{     //abstract  class Shape:Draggable,Cloneable{
    abstract fun area() :Double

}

class Circle(val radius :Double ):Shape(){
    override fun area():Double =Math.PI*radius *radius
    override fun drag()= println("Circle is dragging")
}

class Square(val side :Double ):Shape(){
    override fun area():Double =side * side
    override fun drag()= println("Square is dragging")
}

class Triangle (val base :Double,val height: Double ):Shape(){
    override fun area():Double =0.5 * base * height
    override fun drag()= println("Triangle is dragging")
}

class Player(val name:String):Draggable{
   override fun drag() =println("$name is dragging")


 class JustForVisibilityModifier(){
     var x=
      println("just for visibility modifier")
 }
}


