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

    sum(zip(_, _),list1, list4) //case 1 - lists with identical lenght
    println()
    sum(zip(_, _),list2, list1) //case 2 - list with only one element;
    println()
    sum(zip(_, _),list5, list5) //case 3 - empty lists
    println()
    sum(zip(_, _),list1, list5) //case 4 - not empty and  empty lists
    println()
    sum(zip(_, _),list5, list4) //case 5 - empty and not empty lists
    println()
    sum(zip(_, _),list1, list3) //case 6 - different lenght
    println()
    sum(zip(_, _), list3, list1) //case 7 - different lenght
    println()
    sum(zip(_, _), list2, list5) //case 7 - list with one element and empty list

  }
  def sum(f:(List[Int], List[Int]) => List[Int], l1: List[Int], l2: List[Int] ) = {
    f(l1, l2).foreach(e => print(e))
  }

  def zip(a: List[Int], b: List[Int]): List[Int] =
    (a, b) match {
      case (x :: xs, y :: ys) => x + y :: zip(xs, ys);
      case (x :: xs, _) => x :: zip(xs, List.empty);
      case (_,  y :: ys) => y :: zip(ys, List.empty);
      case _ => List();
      }
}
