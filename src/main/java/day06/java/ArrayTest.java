package day06.java;

import java.util.Arrays;

/**
 * @author capensis <p>
一、数组的概述  <p>
 * 1.数组的理解：<p>
    * 数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。<p>
 * 2.数组相关的概念：<p>
     * >数组名、元素、角标、下标、索引、数组的长度：元素的个数     <p>
 * 3.数组的特点：<p>
     * 1）数组是有序排列的   <p>
     * 2）数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型  <p>
     * 3）创建数组对象会在内存中开辟一整块连续的空间      <p>
     * 4）数组的长度一旦确定，就不能修改。   <p>
 * 4. 数组的分类：<p>
     * ① 按照维数：一维数组、二维数组、。。。 <p>
     * ② 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组  <p>
 * 5. 一维数组的使用   <p>
     * ① 一维数组的声明和初始化    <p>
     * ② 如何调用数组的指定位置的元素     <p>
     * ③ 如何获取数组的长度  <p>
     * ④ 如何遍历数组     <p>
     * ⑤ 数组元素的默认初始化值 ：见ArrayTest1.java  <p>
     * ⑥ 数组的内存解析 ：见ArrayTest1.java  <p>
 */
@SuppressWarnings("MismatchedReadAndWriteOfArray")
public class ArrayTest {

    public static void main(String[] args) {

        //1. 一维数组的声明和初始化
        int num;//声明
        //初始化
        num = 10;
        //声明 + 初始化
        int id = 1001;

        int[] ids;//声明
        //1.1 静态初始化: 数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        //1.2 动态初始化: 数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        //错误的写法：
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3]{1,2,3};

        //也是正确的写法：类型推断
        int[] arr4 = {1, 2, 3, 4, 5};

        //总结：数组一旦初始化完成，其长度就确定了。

        //2.如何调用数组的指定位置的元素:通过角标的方式调用。
        //数组的角标（或索引）从0开始的，到数组的长度-1结束。
        names[0] = "王铭";
        names[1] = "王赫";
        names[2] = "张学良";
        names[3] = "孙居龙";
        //charAt(0)
        names[4] = "王宏志";
		//names[5] = "周扬";

        //3.如何获取数组的长度。
        //属性:length
        System.out.println(names.length);
        System.out.println(ids.length);

        //4.如何遍历数组
        Arrays.stream(names).forEach(System.out::println);
    }

}
