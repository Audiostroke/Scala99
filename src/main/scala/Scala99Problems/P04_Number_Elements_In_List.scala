package Scala99Problems

/**
  * Created by trmckean on 5/18/2017.
  */
object P04_Number_Elements_In_List extends App {
  val randomList = new RandomList
  val list = randomList.list
  println(list)
  println("Number of elements in the list is: " + numElements(list))


  def numElements(list: List[Int]): Int = {
    if (list.isEmpty) 0
    else list.length
  }


}
