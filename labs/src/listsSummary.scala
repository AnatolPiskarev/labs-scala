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

    sum(list1, list4) //case 1 - lists with identical lenght
    println()
    sum(list2, list1) //case 2 - list with only one element;
    println()
    sum(list5, list5) //case 3 - empty lists
    println()
    sum(list1, list5) //case 4 - not empty and  empty lists
    println()
    sum(list5, list4) //case 5 - empty and not empty lists
    println()
    sum(list1, list3) //case 6 - different lenght
    println()
    sum(list3, list1) //case 7 - different lenght
    println()
    sum(list2, list5) //case 7 - list with one element and empty list

  }

  def sum(l1: List[Int], l2: List[Int]) {
   def sumAcc(l1: List[Int], l2: List[Int], i: Int, res: Int): Int = {
     (l1, l2, i) match {
       case (a,b,it) if a.length > i && b.length > i => sumAcc(a, b, it+1, res + a(i) + b(i));
       case (a,b,it) if a.length > i && b.length <= i => sumAcc(a, b, it+1,res + a(i));
       case (a,b,it) if a.length <= i && b.length > i => sumAcc(a, b, it+1, res+ b(i));
       case (a,b,it) if a.length <= i && b.length <= i => res
   }
    }
    println(sumAcc(l1,l2,0,0))
  }

}
