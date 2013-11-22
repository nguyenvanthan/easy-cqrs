import org.junit.Test

class ImmutableHelloTest {

    @Test
    void test_immutability() {

        ImmutableHello immutableHello = new ImmutableHello(id: 1, name: "toto", age: 22)
        ImmutableHello immutableHelloCopy = immutableHello.copyWith(name: "tata")

        println immutableHello.properties
        println immutableHelloCopy.properties

        assert immutableHello.name != immutableHelloCopy.name

    }
}
