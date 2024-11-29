package com;

class CalculatoreImpl implements Calculator { //rule 2
	public void add(int a, int b) {
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
	}

	public void mul(int a,int b) {
		System.out.println("product of "+a+" and "+b+" is "+(a*b));
	}


}
