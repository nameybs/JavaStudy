package com.test;

public class MyException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 에러코드
	private Integer errCode;
	// 학생 클래스
	private Student student;
	
	public MyException() {
		// Default에러코드
		this.errCode = 100;
	}
	
	public MyException(Integer errCode) {
		this.errCode = errCode;
	}
	
	public MyException(Integer errCode, Student student) {
		this.errCode = errCode;
		this.student = student;
	}
	
	public MyException(String msg) {
		super(msg);
		// Default에러코드
		this.errCode = 100;
	}
	
	public MyException(String msg, Integer errCode) {
		super(msg);
		this.errCode = errCode;
	}

	public MyException(String msg, Integer errCode, Student student) {
		this(msg, errCode);
		this.student = student;
	}
	
	// 에러코드 취득
	public Integer getErrCode() {
		return this.errCode;
	}
	
	// 학생 클래스 취득
	public Student getStudent() {
		return this.student;
	}
}
