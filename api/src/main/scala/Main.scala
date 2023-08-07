import models.{ADT, FruitType, CaseClassWithTypeParam, SimpleCaseClass}

case class EnumTest(a: String, b: FruitType.FruitType)

case class SimpleCaseClassTest(a: String, b: SimpleCaseClass)

case class CaseClassWithTypeParamTest1(a: String, b: CaseClassWithTypeParam[String])

case class CaseClassWithTypeParamTest2[T](a: String, b: CaseClassWithTypeParam[T])

case class ADTTest(a: String, b: ADT)
