import models.{ADT, FruitType, GenericCaseClass, SimpleCaseClass}

case class EnumTest(a: String, b: FruitType.FruitType)

case class SimpleCaseClassTest(a: String, b: SimpleCaseClass)

case class GenericCaseClassTest1(a: String, b: GenericCaseClass[String])

case class GenericCaseClassTest2[T](a: String, b: GenericCaseClass[T])

case class ADTTest(a: String, b: ADT)
