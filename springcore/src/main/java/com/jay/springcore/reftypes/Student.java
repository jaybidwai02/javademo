package com.jay.springcore.reftypes;

public class Student {
	private Scroe score;

	public Scroe getScore() {
		return score;
	}

	public void setScore(Scroe score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}
	
	
}
