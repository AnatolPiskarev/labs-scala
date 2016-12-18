/**
  * Created by Anatol on 18.12.16.
  */
object ListMerge {
  def main(args:Array[String]): Unit = {
    val list1:  List[Int] = List(1,2,3,4,5,6,7,8);
    val list2:  List[Int] = List(0);
    val list3:  List[Int] = List(8,7,6,5,4,3,2,1);
    val list4:  List[Int] = List();
    merge(list1, list3) //case 1 - expected work;
    println()
    merge(list2, list1) //case 2 - list with only one element;
    println()
    merge(list1, list4) //case 3 - work with empty list
  }
    def merge( list1: List[Int], list2: List[Int]) {
       list1.zipAll(list2,0,0).map { case (a, b) => a + b }.foreach(print)
  }

}
