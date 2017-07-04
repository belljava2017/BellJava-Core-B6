package com.bell.batch6.day21st;

import java.util.Comparator;

public class RatingBasedCriteria implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o2.getRating()-o1.getRating();
	}

}
