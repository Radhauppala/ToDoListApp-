package To_Do_List;

import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> toDoList = new ArrayList<>();
		boolean running = true;
		
		System.out.println("Welcome to TODOLIST...");
		
		while(running) {
			System.out.println("\nTODOLIST....Menu");
			System.out.println("1. Add Task");
			System.out.println("2. View Task");
			System.out.println("3. Remove Task");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter your task: ");
				String task = scanner.nextLine();
				
				toDoList.add(task);
				System.out.println("Your added task: " + task);
				System.out.println("Task added successfullly!");
				break;
			case 2:
				if(toDoList.isEmpty()) {
					System.out.println("ToDOList is empty. Nothing to remove.");
				}
				else {
					System.out.println("Your ToDoList: ");
					for(int i = 0; i < toDoList.size(); i ++) {
						System.out.println("Task " + (i + 1) + " : " + toDoList.get(i));
					}
				}
				break;
			case 3:
				System.out.println("Your ToDoList: ");
				for(int i = 0; i < toDoList.size(); i ++) {
					System.out.println((i + 1) + " : " + toDoList.get(i));
				}
				
				System.out.println("Enter the number to remove task: ");
				int taskNumber = scanner.nextInt();
				
				if(taskNumber > 0 && taskNumber <= toDoList.size()) {
					String removedTask = toDoList.remove(taskNumber-1);
					System.out.println("Removed task: " + removedTask);
				}
				else {
					System.out.println("Invalid task number. Please try again!");
				}
				break;
			case 4:
				System.out.println("Thank you for using ToDOList. Goodbye!");
				running = false;
				break;
			default:
				System.out.println("Invalid choice. Please try again!");
			}
		}

	}

}
