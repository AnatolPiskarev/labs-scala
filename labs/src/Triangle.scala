/**
  * Created by Anatol on 18.12.16.
  */
object triangle {
  def main(args: Array[String]): Unit = {
    println(pascal(2, 5)) // case 1 - correct work
    print(pascal(0,0))  // case 3 - zero element
    println(pascal(5,2))  // case 2 - element does not exist - throw exception
  }
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r) throw new IllegalArgumentException("Column and row numbers must be 0 or greater. Column length must be lower than row length") else{
      if (c == 0 || c == r) 1 else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  }
}
