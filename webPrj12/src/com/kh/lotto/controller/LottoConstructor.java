package com.kh.lotto.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoConstructor {
	
	public ArrayList<Integer> getLotto(){
		ArrayList list =  new ArrayList();
		
		while(list.size()<6) {
			//랜덤숫자 1개 가져오기
			int num = getRandom();
			//리스트에 숫자 추가
			if(!list.contains(num)) {
				list.add(num);
			}
			
		}
		
		
		
		Collections.sort(list);
		
		return list;
	}

	private int getRandom() {
		Random random = new Random();
		int r = random.nextInt(45) + 1;
		return r;
	}
	
}
