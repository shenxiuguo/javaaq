package com.shenxiuguo.QA.system;

/**
 * 获取系统硬盘列表信息
 * @author shenxg
 *
 */
public class DiskInfo {

	public static void main(String[] args) {
		printDiskList();
	}
	
	/**
	 * 打印硬盘信息列表
	 */
	public static void printDiskList() {
		java.io.File[] roots = java.io.File.listRoots();
		for (java.io.File file : roots) {
			System.out.println(file.getPath());
		}
	}
}
