import spock.lang.Specification
import taskapp.application.*
import taskapp.model.*

// Need to import any other classes we want to test...

class TaskTests extends Specification {

	def "New task list has no tasks"(){
		given:
		TaskManager t = new TaskManager()
		when:
		int numTasks = t.getNumberOfTasks()
		then:
		numTasks == 0
	}
	def "Task manager with one task added shows one task"(){
		given:
		TaskManager t = new TaskManager()
		t.addTasks (new Task ("Do the dishes"))
		when:
		int numTask = t.getNumberOfTasks()
		then: numTasks == 1
	}
}