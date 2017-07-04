package com.bell.batch6.day21st;

import java.util.Comparator;

public class NamedBasedCriteria implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
