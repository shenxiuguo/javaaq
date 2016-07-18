package com.shenxiuguo.QA.java.language.basic;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String args[]) {
		arrayCopy();
	}
	
	/**
	 * 声明
	 * 数组的两种声明方式：
	 * 	1. int[] int_array_1;
	 * 	2. int int_array_2[];
	 */
	public static void arrayDeclaring() {
		int[] int_array_1;
		int int_array_2[];
	}
	
	/**
	 * 赋值
	 */
	public static void arrayCreating(int size) {
		int[] int_array_1 = new int[size];
		int_array_1 = new int[10];
		
		//error 该种赋值方法只能在声明的时使用
		//int_array_1 = { 1, 2 };
		
		//correct 该种赋值方法只能在声明的时使用
		int[] int_array_2 = {1, 2};
		
		int[][] int2_array_1;
		int2_array_1 = new int[10][10];
		int2_array_1[0] = int_array_1;
		
		int[][] int2_array_2;
		int2_array_2 = new int[10][];
		int2_array_2[0] = int_array_1;
		
		int[][][] int3_array_1;
		int3_array_1 = new int[10][][];
	}
	
	/**
	 * 数组拷贝
	 * 1.System.arraycopy 
	 * 2.Arrays.copyOf
	 * 3.Arrays.copyOfRange
	 */
	public static void arrayCopy() {
		int int_array_from[] = {0,1,2,3,4,5,6,7,8,9};
		int int_array_to[] = {0,0,0,0,0,0,0,0,0,0};
		
		System.arraycopy(int_array_from, 3, int_array_to, 1, 5);
		
		arrayPrint(int_array_from);
		arrayPrint(int_array_to);
		
		arrayPrint(Arrays.copyOf(int_array_from, 6));
		arrayPrint(Arrays.copyOfRange(int_array_from, 2, 4));
		
	}

	private static void arrayPrint(int[] int_array_to) {
		for (int i = 0; i < int_array_to.length; i++) {
			System.out.print(int_array_to[i] + "  ");
		}
		System.out.println();
	}
}
