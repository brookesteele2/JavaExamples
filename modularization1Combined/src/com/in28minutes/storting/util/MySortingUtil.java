package com.in28minutes.storting.util;

import java.util.List;

import com.in28minutes.storting.algorithm.BubbleSort;

public class MySortingUtil {

	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);

	}
}
