package Scala99Problems

/**
  * Created by trmckean on 5/18/2017.
  * P01 Find the last element of a list.
  * Example Input: List(1, 1, 2, 3, 5, 8)
  * Example Output: Int = 8
  */
object P01_Last_Element_In_List extends App {
    def main(args: List[Int]) {
      println("Hello, world")
      println(last(list))
    }
    val list = List(1, 1, 2, 3, 5, 8)
    main(list)



  def last[A](l: List[A]): A = l.last

}
