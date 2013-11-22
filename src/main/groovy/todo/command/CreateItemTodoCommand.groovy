package todo.command

import groovy.transform.Immutable
import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier

@Immutable
class CreateItemTodoCommand {

    @TargetAggregateIdentifier
    String todoId

    String description

}
