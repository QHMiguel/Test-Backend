package com.test.backend.service;

import org.springframework.stereotype.Service;

import com.test.backend.entity.ArrayEntity;

@Service
public class ArrayServiceImpl implements ArrayService {

	public ArrayEntity rotateCounterclockwiseArray(ArrayEntity arrayBE) {

		ArrayEntity arrayResponse = new ArrayEntity();

		int[][] initialArray = arrayBE.getArrayOfAray();
		int length = initialArray.length;
		int[][] newArray = new int[length][length];

		for (int x = 0; x < length; x++) {
			for (int y = 0; y < length; y++) {
				newArray[length - 1 - y][x] = initialArray[x][y];
			}
		}

		arrayResponse.setArrayOfAray(newArray);

		return arrayResponse;
	}

}
