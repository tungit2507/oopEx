package app;

import java.util.Scanner;

import dao.studentsDAO;

public class StudentsApp {
	public static void main(String[] args) {
		String selection = "";
		do {
			selection = showMenu();
			HandleSelection(selection);
		} while (selection.equals("1") || selection.equals("2"));
		System.out.println("exited!!!");
	}

	private static String showMenu() {
		System.out.println("Your menu Have :");
		System.out.println("Press 1 : to add a students to list");
		System.out.println("Press 2: to show Capacity your Students");
		System.out.println("press other to exit :");
		Scanner sc =  new Scanner(System.in);
		return sc.nextLine();
	}
	
	private static void HandleSelection(String Selection) {
		switch(Selection) {
			case "1" : studentsDAO.add();
				break;
			case "2" : studentsDAO.showList();
				break;
		}
	}
	
	
	
	
	
	
}

