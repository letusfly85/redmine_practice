import org.scalatest.FunSuite

/**
 * HelloWorldTest
 *
 */
class HelloWorldTest extends FunSuite {
    test("test") {
    assert(1 === 1)
    }

    test("multiply 5 and 3") {
        assert(HelloWorld.multiply(3,5) === 15)
    }

    test("divide 6 by 2") {
        assert(HelloWorld.divide(6,2) === 3.0F)
    }
}
