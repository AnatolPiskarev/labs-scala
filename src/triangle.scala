/**
  * Created by a.piskaryov on 13.12.2016.
  */
object triangle {
  def main(args: Array[String]): Unit = {
        print(pascal(2, 5) + " ")
  }
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r) throw new IllegalArgumentException("Column and row numbers must be 0 or greater. Column length must be lower than row length") else{
      if (c == 0 || c == r) 1 else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  }
}

