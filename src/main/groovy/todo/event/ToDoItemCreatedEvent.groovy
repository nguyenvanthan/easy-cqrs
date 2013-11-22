package todo.event

import groovy.transform.Immutable

@Immutable
class ToDoItemCreatedEvent {

    String todoId
    String description

}
