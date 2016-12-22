/**
  * Created by Anatol on 18.12.16.
  */

object listsSummary {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8);
    val list2: List[Int] = List(0);
    val list3: List[Int] = List(8, 7, 6, 5);
    val list4: List[Int] = List(8, 7, 6, 5, 4, 3, 2, 1);
    val list5: List[Int] = List();
    sum(list1, list4, c) //case 1 - lists with identical lenght
    println()
    sum(list2, list1, c) //case 2 - list with only one element;
    println()
    sum(list5, list5, c) //case 3 - empty lists
    println()
    sum(list1, list5, c) //case 4 - not empty and  empty lists
    println()
    sum(list5, list4, c) //case 5 - empty and not empty lists
    println()
    sum(list1, list3, c) //case 6 - different lenght
    println()
    sum( list3, list1, c) //case 7 - different lenght
    println()
    sum(list2, list5, c) //case 7 - list with one element and empty list

  }
  def sum(a: List[Int], b: List[Int], c: (Int, Int) => Int): List[Int] = (a, b) match {
    case (x :: xs, y :: ys) => c(x, y) :: sum(xs, ys, c)
    case (_,  y :: ys) => sum(ys, List.empty,c );
    case (x :: xs,_) =>  sum(xs, List.empty, c);
    case _ => List();
  }

  def c(x: Int, y: Int): Int = {
    x + y
  }
}
