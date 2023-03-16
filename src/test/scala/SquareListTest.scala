import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class SquareListTest extends AnyFlatSpec {

  val list = new SquareList()

  "listFirst" should "list all squares" in {
    list.squareList(List(1, 2, 3, 4, 5)) shouldEqual List(1, 4, 9, 16, 25)
  }
  "ListSecond" should "list all squares using map" in {
    list.squareListByMap(List(1, 2, 3)) shouldEqual List(1, 4, 9)
  }
  "ListThird" should "list all squares using map" in {
    list.squareListByMap(List(1, 4, 5)) shouldEqual List(1, 16, 25)
  }


}
