/*
when we dont know which value to be assigned to a variable
we assign it to null

null means absense of value

example = gender field in form

whenever we want to make

in other languages  like java when we make refrence of an object and we dont assign the value
it is by default null
so when use that refrence and that refrence do not point to any objects
it will give null pointer expection

exception is by default an error
kotlin is safe  ,take


whenever we put ? in front of data type is becomes nullable
nullbale tye means it would accept values as well as null

it will give error if fuction called on nnull

 //to avoid using if we have safe pointer
 gender2?.toUpperCase()
 ? will work only if not null

if we have to use multiple statements  by making sure ki object is not null
 we use "let" with safe call

 let can be used with both null and not null
 let is also called lamda


elvis operator  or null collising operator
gender ? : "NA"


 var value:String =gender2!!.toUpperCase()
called not null asserted operation
it will assert ki call kardo ,hum matlab nhi ha objects null ha ya nhi

we have asserted ki call kardo no matter what

use this only when we are sure ki ya not null ha ya we want to raise and exception

 */


fun main(){
     var gender:String ="Male"  //"femal","others
//     var gender2:String=null  //this will give error

     var gender2:String?=null   //now no error
     var isAdult:Boolean?=true  //can be true , false or null

    // gender2.toUpperCase()  will give error as gender2 is null
     if (gender2 != null) {
          println(gender2.toUpperCase())
     }


     //to avoid using if we have safe pointer
     println(gender2?.toUpperCase())


//let
     gender2?.let {
          println("line 1")
          println("line 2 $gender2" )
          println("line 3 $it")  //here it  points to gender two

     }
     gender.let {

     }

     var selectedValue=gender2 ?:"NA"
     var value:String =gender2!!.toUpperCase()t













}