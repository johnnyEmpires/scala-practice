import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite
import utils.SampleAPI.Contact.Person

class SimplestPossibleSpec extends AnyFlatSpec {
    "An empty Set" should "have size 0" in {
        assert(Set.empty.size == 0)
    }

    "Contact name" should "be string type" in {
        val customer = Person("Customer")
        assert(customer.name.isInstanceOf[String] == true)
    }

}