package utils.SampleAPI

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

class ContactTest extends AnyFunSuite {
    test("Contact name can be assigned") {
        val client = Contact.Person("John Pogi")
        assert(client.name == "John Pogi")
    }

    test("the name is set correctly in constructor") {
        val p = Contact.Person("Barney Rubble")
        assert(p.name == "Barney Rubble")
    }

    test("a Person's name can be changed") {
        val p = Contact.Person("Chad Johnson")
        p.name = "Ochocinco"
        assert(p.name == "Ochocinco")
    }

    test("a Person's name should be String type") {
        val p = Contact.Person("Elon Musk")
        assert(p.name.isInstanceOf[String] == true)
    }

}