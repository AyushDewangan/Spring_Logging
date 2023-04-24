package com.example.demo.entity;

public class Test {

	private int testMarks;
	private String subject;

	public int getTestMarks() {
		return testMarks;
	}

	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Test [testMarks=" + testMarks + ", subject=" + subject + "]";
	}
}
