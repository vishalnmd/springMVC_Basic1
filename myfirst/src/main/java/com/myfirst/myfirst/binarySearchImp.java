package com.myfirst.myfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class binarySearchImp {
	
	@Autowired
	private SortInterface sortAlgo;
	
	public binarySearchImp(SortInterface obj) {	
		this.sortAlgo = obj;
	}
	
	public int ElementTobeFind(int[] ar, int x) {
		//local implemented
		return 3;
	}

}
