package todo.event

import groovy.transform.Immutable

@Immutable
class ToDoItemCompletedEvent {

    String todoId

}
