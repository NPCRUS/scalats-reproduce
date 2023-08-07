package models

case class CaseClassWithTypeParam[T](id: String, body: T)
