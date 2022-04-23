package com.test.callbyreference;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Str1");
		
		System.out.println("====== Test Remote ======");
		
		Student std = new Student();
		std.name = "Hong";
		std.age = 20;
		
		User user = new User();
		user.id = "test";
		user.pass = "1234";
		
		String[] arr = new String[] {"arr1", "arr2"};
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("list1");
		list.add("list2");
		
		System.out.println("====== Call By Value ======");
		CallByValue(std);
		
		System.out.println("====== Call By Reference ======");
		CallByReference(str, std, arr, list);
		
		System.out.println("====== Multiple Call By Reference ======");
		MultipleCallByReference(std, user);
	}
	
	public static void CallByValue(Student std) {
		System.out.println("Name : " + std.name);
		System.out.println("age : " + std.age);

		ChangeValue(std.name, std.age);
		
		System.out.println("Changed Name : " + std.name);
		System.out.println("Changed age : " + std.age);
	}
	
	public static void CallByReference(StringBuilder str, Student std, String[] arr, ArrayList<String> list) {
		System.out.println("String : " + str.toString());
		System.out.println("Name : " + std.name);
		System.out.println("age : " + std.age);
		System.out.println("Arrays : " + Arrays.toString(arr));
		System.out.print("list : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("["+list.get(i)+"]");
		}
		System.out.println("");
		
		ChangeReference(str, std, arr, list);
		
		System.out.println("Changed String : " + str.toString());
		System.out.println("Changed Name : " + std.name);
		System.out.println("Changed age : " + std.age);
		System.out.println("Changed Arrays : " + Arrays.toString(arr));
		System.out.print("Changed list : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("["+list.get(i)+"]");
		}
		System.out.println("");
		
		ChangeReference2(std);
		
		System.out.println("Changed Name : " + std.name);
		System.out.println("Changed age : " + std.age);
	}
	
	public static void MultipleCallByReference(Student std, User user) {
		
		String grade = "80";
		
		System.out.println("Name : " + std.name);
		System.out.println("age : " + std.age);
		System.out.println("id : " + user.id);
		System.out.println("pass : " + user.pass);
		System.out.println("grade : " + grade);
		
		MultipleChangeReference(std, user, grade);
		
		System.out.println("Changed Name : " + std.name);
		System.out.println("Changed age : " + std.age);
		System.out.println("Changed id : " + user.id);
		System.out.println("Changed pass : " + user.pass);
		System.out.println("Changed grade : " + grade);
		
		MultipleChangeReference2(std, user.id, user.pass, grade);
		
		System.out.println("Changed Name : " + std.name);
		System.out.println("Changed age : " + std.age);
		System.out.println("Changed id : " + user.id);
		System.out.println("Changed pass : " + user.pass);
		System.out.println("Changed grade : " + grade);
	}
	
	private static void ChangeValue(String name, int age) {
		System.out.println("=== Change Value ===");
		
		name = "Kim";
		age = 10;
	}
	
	private static void ChangeReference(StringBuilder str, Student std, String[] arr, ArrayList<String> list) {
		System.out.println("=== Change Reference ===");
		
		str.delete(0, str.length());
		str.append("Str2");
		std.setName("Lee");
		std.setAge(30);
		arr[0] = "arr11";
		arr[1] = "arr22";
		list.add("list3");
	}
	
	private static void ChangeReference2(Student std) {
		System.out.println("=== Change Reference2 ===");
		
		std.name = "Park";
		std.age = 40;
	}
	
	private static void MultipleChangeReference(Student std, User user, String grade) {
		System.out.println("=== Change MultipleReference ===");
		std.name = "Yoon";
		std.age = 50;
		user.id = "test2";
		user.pass = "5678";
		grade = "90";
	}
	
	private static void MultipleChangeReference2(Student std, String id,  String pass, String grade) {
		System.out.println("=== Change MultipleReference2 ===");
		std.name = "Baek";
		std.age = 60;
		id = "test3";
		pass = "9101112";
		grade = "100";
	}
}
