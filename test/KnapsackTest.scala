import org.scalatest.FlatSpec

class KnapsackTest extends FlatSpec {

  behavior of "Knapsack"

  it should "maximize the amount of gold for a case" in {
    assert(Knapsack.optimalWeight(10,Array(1,4,8)) === 9)
  }

}
