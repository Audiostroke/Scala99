package Scala99Problems

/**
  * Created by trmckean on 5/18/2017.
  * Find the Kth element of a list
  * The first element in the list is 0
  * Example Input: 2, List(1, 1, 2, 3, 5, 8)
  * Example Output: 2
  */
object P03_Kth_Element_In_List extends App {
  //Generate a randomly sized list of random integers from 0 to 100
  val random = scala.util.Random
  val length = random.nextInt(10)
  val list = List.fill(length)(100).map(scala.util.Random.nextInt)
  val k = random.nextInt(length)
  main(list, k)

  def main(args: List[Int], k: Int): Unit = {
    println("Finding element number: " + k + " in the list of length " + length)
    println("The list is: " + list)
    println(kElement(args, k))
  }

  //Product element finds the nth element, 0 based
  def kElement[A](l : List[A], index: Int): Any = {
    if (l.isEmpty || index < 0) throw new NoSuchElementException
    else l(index)
  }







}
