package com.test;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		// �л� ���� �߰�
		List<Student> students = new ArrayList<Student>();
		Student std = new Student();
		std.setName("Tom");
		std.setsClass("1");
		std.setAge(10);
		students.add(std);
		
		std = new Student();
		std.setName("Jack");
		std.setsClass("2");
		std.setAge(10);
		students.add(std);
		
		std = new Student();
		std.setName("Peter");
		std.setsClass("3");
		std.setAge(12);
		students.add(std);
		
		try {
			for (int i = 0; i < students.size(); i++) {
				// �б� üũ
				checkClass(students.get(i));
				// ���� üũ
				checkAge(students.get(i));
			}
		} catch (MyException e) {
			System.err.println(e.getMessage() +  " �����ڵ� = " + e.getErrCode());
			e.printStackTrace();
			System.out.println("StudentName : " + e.getStudent().getName());
		}
	}
	
	/**
	 * �б� üũ (3���� ��쿡 ���� ó��)
	 * @param std
	 * @throws MyException
	 */
	public static void checkClass(Student std) throws MyException {
		if("3".equals(std.getsClass())) {
			throw new MyException("�ش� �б� Ŭ������ �������� �ʽ��ϴ�.", 300, std);
		}
	}
	
	/**
	 * ���� üũ (10�� �̻��� ��� ���� ó��)
	 * @param std
	 */
	public static void checkAge(Student std) {
		if(std.getAge() > 10) {
			throw new MyException("���� ���� ������ �������� �ʾҽ��ϴ�.", 200, std);
		}
	}

}