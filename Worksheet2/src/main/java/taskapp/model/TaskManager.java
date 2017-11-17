package taskapp.model;

public class TaskManager{
	private int numberOfTasks = 0;
	
	public int getNumberOfTasks() {
		return numberOfTasks;
	}
	public void addTask (Task t){
		numberOfTasks++;
	}
}