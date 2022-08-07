package com.test;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		// 학생 정보 추가
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
				// 학급 체크
				checkClass(students.get(i));
				// 나이 체크
				checkAge(students.get(i));
			}
		} catch (MyException e) {
			System.err.println(e.getMessage() +  " 에러코드 = " + e.getErrCode());
			e.printStackTrace();
			System.out.println("StudentName : " + e.getStudent().getName());
		}
	}
	
	/**
	 * 학급 체크 (3반일 경우에 예외 처리)
	 * @param std
	 * @throws MyException
	 */
	public static void checkClass(Student std) throws MyException {
		if("3".equals(std.getsClass())) {
			throw new MyException("해당 학급 클래스는 존재하지 않습니다.", 300, std);
		}
	}
	
	/**
	 * 나이 체크 (10세 이상일 경우 예외 처리)
	 * @param std
	 */
	public static void checkAge(Student std) {
		if(std.getAge() > 10) {
			throw new MyException("최저 나이 조건을 충족하지 않았습니다.", 200, std);
		}
	}

}