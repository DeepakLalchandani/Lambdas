package com.scaleupindia.service.impl;

import com.scaleupindia.service.Operation;

/**
 * @author abhishekvermaa10
 *
 */
public class OperationImpl implements Operation {
	@Override
	public boolean isGreater(int num1, int num2) {
		return num1 > num2;
	}
}