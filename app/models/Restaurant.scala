package models

case class Restaurant(id: Long, name: String, email: String, phone: String)

object Restaurant {
       def all(): List[Restaurant] = Nil
       def create(name: String, email: String, phone: String) {}
       def delete(id: Long) {}
}