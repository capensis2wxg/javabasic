package day04.java;

import java.util.Scanner;

/**
 * 如何从键盘获取不同类型的变量：需要使用Scanner类	<p>
 *
 * 具体实现步骤：<p>
 *
	 1.导包：import java.util.Scanner;	<p>
	 2.Scanner的实例化:Scanner scan = new Scanner(System.in);	<p>
	 3.调用Scanner类的相关方法（next() / nextXxx()），来获取指定类型的变量	<p>
 注意：<p>
 需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchException
 导致程序终止。
 * @author capensis
 */
@SuppressWarnings("AlibabaRemoveCommentedCode")
public class ScannerTest{

	public static void main(String[] args){
		//2.Scanner的实例化
		Scanner scan = new Scanner(System.in);
		
		//3.调用Scanner类的相关方法
		System.out.println("请输入你的姓名：");
		String name = scan.next();
		System.out.println(name);

		System.out.println("请输入你的芳龄：");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("请输入你的体重：");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("你是否相中我了呢？(true/false)");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);

		//对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
		System.out.println("请输入你的性别：(男/女)");
		//"男"
		String gender = scan.next();
		//获取索引为0位置上的字符
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
		

	}

}