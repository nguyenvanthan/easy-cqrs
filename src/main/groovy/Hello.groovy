import groovy.transform.CompileStatic
import org.joda.time.DateTime

@CompileStatic
class Hello {

    // properties
    Integer id
    String name
    DateTime dob

    // sample code
    static void main(args) {
        println("hello world")
    }
}
