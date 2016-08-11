package com.shenxiuguo.QA.java.reflection;

public class GetClass {

	public static void main(String[] args) {
		getClassFromObject();
	}


	public static void getClassFromObject() {
		print_class_name_from_object("test");
		print_class_name_from_object(new String[10]);
		print_class_name_from_object(new String[10][]);
		print_class_name_from_object(new Integer[10]);
		print_class_name_from_object(new Integer[10][]);
		print_class_name_from_object(new int[10]);
		print_class_name_from_object(new int[10][]);
		print_class_name_from_object(new Long[10]);
		print_class_name_from_object(new long[10]);
	}
	
	@SuppressWarnings("rawtypes")
	public static void print_class_name_from_object(Object obj) {
		Class cls = obj.getClass();
		System.out.println(cls.getName());
	}
	
}
