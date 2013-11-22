package todo.command

import groovy.transform.Immutable
import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier

@Immutable
class MarkCompletedCommand {

    @TargetAggregateIdentifier
    String todoId
}
