package Scala99Problems


/**
  * Created by trmckean on 5/18/2017.
  * Find the last but one element of a list
  * Example Input: List(1, 1, 2, 3, 5, 8)
  * Example Output: 5
  */
object P02_Second_Last_Element_In_List extends App {

  val list = List(1, 1, 2, 3, 5, 8)
  main(list)

  def main(args: List[Int]) {
    println("Finding the second to last element of " + args)
    println(secondLast(args))
  }

  def secondLast[A](l: List[A]): A = {
    if(l.isEmpty) throw new NoSuchElementException
    else l.init.last
  }


}
