package com.jay.springcore.reftypes;

public class Scroe {
	private Double math;
	private Double physics;
	private Double chemistry;

	public Double getMath() {
		return math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "Scroe [math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	
	
}
