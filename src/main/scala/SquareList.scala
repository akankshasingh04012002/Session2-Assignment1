class SquareList {

  // using pattern matching
  def squareList(list: List[Int]): List[Int] = try {
    list match {
      // empty list, return empty list
      case Nil => Nil
      // recursive case, non-empty list
      case head :: tail => head * head :: squareList(tail)
    }
  } catch {
    // catch exception and return an empty list
    case exception: NullPointerException => Nil
  }

  // using map with exception handling
  def squareListByMap(list: List[Int]): List[Int] = try {
    list.map(num => num * num)
  } catch {
    // catch exception and return an empty list
    case exception: NumberFormatException => Nil
  }

}