package taskapp.application;

import org.beryx.textio.*;
import taskapp.model.*;

public class Main {
  public static void main(String[] args) {
    
    TextIO textIO = TextIoFactory.getTextIO();
    TextTerminal terminal = textIO.getTextTerminal();

    boolean quit = false;

    while (!quit) {

      terminal.println(); // blank line for better formatting

      TodoCommand command = textIO.newEnumInputReader(TodoCommand.class)
              .withAllValuesInline()
              .read("Choose Command?");

      switch (command) {
        case EXIT:
            terminal.println("Bye!");
            quit = true;
            break;
        case COUNT:
        	terminal.println("Task: " + taskManager.getNumberOfTasks());
        	break;
      }
    }
  }

  public enum TodoCommand {
    EXIT, COUNT
  }
}