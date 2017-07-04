package com.bell.batch6.day21st;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {
	
	private String name;
	private String lang;
	private int rating;
	private double cost;
	
	Movie(String name, String lang, int rating, double cost){
		this.name = name;
		this.lang = lang;
		this.rating = rating;
		this.cost = cost;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rating;
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
		Movie other = (Movie) obj;
		if (Double.doubleToLongBits(cost) != Double
				.doubleToLongBits(other.cost))
			return false;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Movie [name=" + name + ", lang=" + lang + ", rating=" + rating
				+ ", cost=" + cost + "]";
	}


	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}



	
	
	
	
	

}
