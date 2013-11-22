import org.joda.time.DateTime
import org.junit.Test

class HelloTest {

    @Test
    void test_properties() {
        def hello = new Hello(id: 1, name: 'toto', dob: new DateTime(1982,1,4,8,0))
        println "hello properties : ${hello.properties}"
        assert hello.id == 1
        assert hello.name == 'toto'
    }
}
