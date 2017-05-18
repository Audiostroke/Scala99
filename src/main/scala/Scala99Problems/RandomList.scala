package Scala99Problems

/**
  * Created by trmckean on 5/18/2017.
  */
class RandomList {
  val random = scala.util.Random
  val length: Int = random.nextInt(10)
  val list: List[Int] = List.fill(length)(100).map(scala.util.Random.nextInt)

}
