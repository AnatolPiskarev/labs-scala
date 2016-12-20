import scala.annotation.tailrec

/**
  * Created by Anatol on 18.12.16.
  */
object triangle {
  def main(args: Array[String]): Unit = {
    println(pascal(2, 5)) // case 1 - correct work
    println(pascal(0, 0)) // case 2 - zero element
    print(pascal(5, 2)) // case 3 - element does not exist - throw exception
  }

  def pascal(c: Int, r: Int): Int = {
    @tailrec
    def pascalTail(c: Int, r: Int, acc: List[Int]): List[Int] = {
      if (r == 0) acc
      else pascalTail(c, r - 1,
        (0 +: acc :+ 0).take(c + 2)
          .sliding(2, 1).map { x => x.sum }.toList)
    }
    if (c == 0 || c == r) 1
    else if (c < 0 || r < 0 || c > r) throw new IllegalArgumentException("Column and row numbers must be 0 or greater. Column length must be lower than row length")
      else pascalTail(c, r, List(1))(c)
    }
}
