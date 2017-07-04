package com.bell.batch6.day18;

public class MobilePhone implements Comparable<MobilePhone>{

	private String name;
	private double cost;
	private String os;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobilePhone other = (MobilePhone) obj;
		if (Double.doubleToLongBits(cost) != Double
				.doubleToLongBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MobilePhone [name=" + name + ", cost=" + cost + ", os=" + os
				+ "]";
	}

	@Override
	public int compareTo(MobilePhone o) {
		int result = this.os.compareTo(o.getOs());
		if(result ==0){
			result =this.name.compareTo(o.getName());
		}
		return result;
	}
	
	
	
	
	
	
}
