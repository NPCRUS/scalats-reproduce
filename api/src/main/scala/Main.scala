import models.FruitType
import models.FruitType.FruitType

object Main extends App {

  val apple = Apple("Gala", FruitType.APPLE)
  println(apple)
}

case class Apple(name: String, kind: FruitType)
