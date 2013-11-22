package todo

import org.axonframework.test.FixtureConfiguration
import org.axonframework.test.Fixtures
import org.junit.Before
import org.junit.Test
import todo.command.CreateItemTodoCommand
import todo.command.MarkCompletedCommand
import todo.event.ToDoItemCompletedEvent
import todo.event.ToDoItemCreatedEvent
import todo.model.TodoItem

class ToDoItemTest {

    FixtureConfiguration fixture;

    @Before
    void setUp() throws Exception {
        fixture = Fixtures.newGivenWhenThenFixture(TodoItem.class)
    }

    @Test
    void testCreateToDoItem() throws Exception {
        fixture
                .given(
                new ToDoItemCreatedEvent(
                        todoId:  "todo1",
                        description:  "need something here because given crash with empty parameter :S"))
                .when(new CreateItemTodoCommand(
                        todoId: "todo1",
                        description: "need to implement the aggregate"))
                .expectEvents(new ToDoItemCreatedEvent(
                        todoId: "todo1",
                        description: "need to implement the aggregate"))
    }

    @Test
    void testMarkToDoItemAsCompleted() throws Exception {
        fixture
                .given(new ToDoItemCreatedEvent(
                        todoId:  "todo1",
                        description:  "need to implement the aggregate"))
                .when(new MarkCompletedCommand(
                        todoId: "todo1"))
                .expectEvents(new ToDoItemCompletedEvent(
                        todoId: "todo1"))
    }
}
