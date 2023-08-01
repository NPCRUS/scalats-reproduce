package models

trait ADT {
  def param: String
}

object ADT {
  case class Variant1(param: String, param2: Int) extends ADT
  case object Variant2 extends ADT {
    override def param: String = "param"
  }
}
