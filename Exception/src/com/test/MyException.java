package com.test;

public class MyException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// �����ڵ�
	private Integer errCode;
	// �л� Ŭ����
	private Student student;
	
	public MyException() {
		// Default�����ڵ�
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
		// Default�����ڵ�
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
	
	// �����ڵ� ���
	public Integer getErrCode() {
		return this.errCode;
	}
	
	// �л� Ŭ���� ���
	public Student getStudent() {
		return this.student;
	}
}
