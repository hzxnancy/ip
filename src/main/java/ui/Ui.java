package ui;

import commands.Task;
import constants.Statements;
import constants.Utils;

import java.util.ArrayList;

/** Represents all Ui methods. */
public class Ui {

    /**
     * Welcomes user to the application through the welcome message.
     */
    public void printWelcomeMessage() {
        printLine();
        System.out.println("Welcome to Cy Mart! I'm Cy the owner of this convenience store!");
        System.out.println("What can I do for you?");
        System.out.println("But first, let me load your previous tasks!");
        printLine();
    }

    /**
     * Prints a horizontal line to separate between the user inputs and Cy's output.
     */
    public void printLine() {
        System.out.println(Utils.HORIZONTAL_LINE);
    }

    /**
     * Prints mark or unmark statement based on the task's isDone() parameter.
     *
     * @param task passed to mark as done or incomplete.
     */
    public void printMarkOutput(Task task) {
        printLine();

        if (task.isDone()) {
            System.out.println(Statements.CONFIRM_MARK);
        } else {
            System.out.println(Statements.CONFIRM_UNMARK);
        }

        System.out.println(task.getStatusIcon() + " " + task.getDescription());
        printLine();
    }

    /**
     * Prints todo message with the added todo task.
     *
     * @param task todo added to the tasks ArrayList.
     * @param items ArrayList that stores the new task.
     */
    public void printTodoMessage(String task, ArrayList<Task> items) {
        printLine();
        System.out.println(Statements.CONFIRM_ADD);
        printListUpdate(task,items);
        printLine();
    }

    /**
     * Prints the new task item and the count of task within the list (after adding or deleting an item).
     *
     * @param task string that contains the newly added/deleted tasks.
     * @param items Arraylist that contains the list of items.
     */
    public void printListUpdate(String task, ArrayList<Task> items) {
        System.out.println(task);
        System.out.println("Now you have " + (items.size()) + " tasks in the list");
    }

    /**
     * Prints deadline message with the added todo task.
     *
     * @param deadline deadline added to the tasks ArrayList.
     * @param items ArrayList that stores the new task.
     */
    public void printDeadlineMessage(String deadline,ArrayList<Task> items) {
        printLine();
        System.out.println(Statements.CONFIRM_DEADLINE);
        printListUpdate(deadline,items);
        printLine();
    }

    /**
     * Prints event message with the added the event task.
     *
     * @param event event added to tasks ArrayList.
     * @param items ArrayList to store the items.
     */
    public void printEventMessage(String event, ArrayList<Task> items) {
        printLine();
        System.out.println(Statements.CONFIRM_EVENT);
        printListUpdate(event,items);
        printLine();
    }

    /**
     * Prints delete message with the deleted task.
     *
     * @param deleteItem task to be deleted.
     */
    public void printDeleteMessage(Task deleteItem) {
        printLine();
        System.out.println(Statements.CONFIRM_DELETE);
        System.out.println(deleteItem.getStatusIcon() + " " + deleteItem.getDescription());
        printLine();
    }

    /**
     * Ends the application through a goodbye message.
     */
    public void printEndingMessage() {
        printLine();
        System.out.println("Thanks for visiting Cy Mart! Have a nice day :)");
        printLine();
    }
}
