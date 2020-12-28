import org.scalatest.flatspec.AnyFlatSpec

// class SimplestPossibleSpec extends FlatSpec {
class SimplestPossibleSpec extends AnyFlatSpec {
    // see scalatest release notes for deprecation of traits and classes
    // https://www.scalatest.org/release_notes/3.1.0
    // older tutorials still points to these old style referencing

    "An empty Set" should "have size 0" in {
        assert(Set.empty.size == 0)
    }
}

// class HelloTests extends FunSuite {
//     test("the name is set correctlyl in constructor") {
//         val p = Person("Barney Rubble")
//         assert(p.name == "Barney Rubble")
//     }
//     test("a Person's name can be changed") {
//         val p = Person("Chad Johnson")
//         p.name = "Ochocinco"
//         assert(p.name == "Ochocinco")
//     }
// }