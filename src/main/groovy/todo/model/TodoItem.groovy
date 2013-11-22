package todo.model

import org.axonframework.commandhandling.annotation.CommandHandler
import org.axonframework.eventhandling.annotation.EventHandler
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot
import org.axonframework.eventsourcing.annotation.AggregateIdentifier
import todo.command.CreateItemTodoCommand
import todo.command.MarkCompletedCommand
import todo.event.ToDoItemCompletedEvent
import todo.event.ToDoItemCreatedEvent

class TodoItem extends AbstractAnnotatedAggregateRoot {

    @AggregateIdentifier
    String id


    //____________________________________________________________________________________

    @CommandHandler
    ToDoItem(CreateItemTodoCommand command) {
        apply(
            new ToDoItemCreatedEvent(
                 todoId: command.todoId,
                 description: command.description)
        )
    }

    @EventHandler
    public void on(ToDoItemCreatedEvent event) {
        this.id = event.todoId
    }



    @CommandHandler
    void markCompleted(MarkCompletedCommand command) {
        apply(
            new ToDoItemCompletedEvent(
                todoId: command.todoId)
        )
    }

    @EventHandler
    public void on(MarkCompletedCommand event) {
        this.id = event.todoId
    }
}
