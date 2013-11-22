import groovy.transform.CompileStatic
import groovy.transform.Immutable

@Immutable(copyWith = true)
@CompileStatic
class ImmutableHello {

    int id
    String name
    int age

}
