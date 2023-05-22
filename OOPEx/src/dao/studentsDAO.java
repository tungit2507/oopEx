package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Students;

public class studentsDAO {
	static List<Students> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	
	public static  Students sign() {
		Students students = new Students();
		System.out.println("Students's Class : ");
		students.setClass(sc.nextLine());
		System.out.println("Students's ID : ");
		students.setId(sc.nextLine());
		System.out.println("Students's Name : ");
		students.setName(sc.nextLine());
		System.out.println("Students's GPA (Number) : ");
		students.setGPA(sc.nextDouble());
		return students;
	}
	
	public static List<Students> add() {
		Students students = sign();
		list.add(students);
		students.toString();
		return list;
	}
	
	
	public static void showList() {
		if(studentsDAO.list.isEmpty()) {
			System.out.println("Your List Is Empty");
		}else {
			System.out.println("Your List \n");
			for (Students students : list) {
				students.toString();
			}
		}
	}
}

