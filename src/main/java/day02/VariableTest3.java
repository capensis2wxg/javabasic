package day02;

/**
	强制类型转换：自动类型提升运算的逆运算。<p>
	1.需要使用强转符：()	<p>
	2.注意点：强制类型转换，可能导致精度损失。
*/
class VariableTest3 {
	public static void main(String[] args) {
		
		double d1 = 12.9;
		//精度损失举例1
		// 截断操作
		int i1 = (int)d1;
		System.out.println(i1);
		
		//没有精度损失
		long l1 = 123;
		short s2 = (short)l1;
		
		//精度损失举例2
		// 0000 0000 0000 0000 0000 0000 1000 0000, java在强转时 如果是长位转短位保留与短位数相同的长位末尾的二进制值，
		//在byte类型中 二进制1000 0000 代表的10进制值为 -128

		/*
		 * 在计算机中数字二进制 最高位为符号位，1代表负值，0代表正值。
		 *        你可能又会问那1000 0000 不应该是 -0么？因为首位为1代表当前的值为负值
		 *         如果1000 0000是-0，然后0000 0000 是0，那就会出现两个0，会浪费一个bit空间。
		 *         所以呢 符号位仅为1还不行, 又为了便于二进制的加减操作，还要对负值的二进制的原码进行反码和补码，
		 *         计算机中负值的表示为：二进制除符号位以外，对原码进行取反，然后再进行补码（就是反码后再加1）
		 *         例如 byte中的-1就应该这样表示：
		 *         -1的原码 1000 0001
		 *         -1的反码 1111 1110（符号位不变）
		 *         -1的补码 1111 1111（反码加1）
		 *          所以byte中的-1 在计算机中的表现形式就为 1111 1111
		 *
		 *          至于byte中的1000 0000 为-128是怎么算出来的，查了很多资料我也没搞清楚
		 *          虽然不知道怎么算的，但是这个结果也是可以推断出来
		 *          -125是  1000 0011
		 *          -126 是 1000 0010
		 *          -127是  1000 0001
		 *          -128是  1000 0000
		 *
		 *       结论：
		 *
		 *  负值首位肯定是1
		 *  补码形式下二进制符号位后面的值越小，十进制值就越小，跟原码相反
		 *           如：1000 0001 原码为-1   补码为-127
		 *                   1111 1111 原码为-127   补码为 -1
		 *      这个结论第二条是什么意思呢？
		 *
		 *      你看啊，1000 0001 这个去掉首位符号位1，后面的值为000 0001，
		 *     然后 1111 1111 去掉首位符号位1，后面的值为 111 1111，
		 *    那 000 0001 跟 111 1111 比是不是特别小啊，所以它对应的十进制也特别小 为-127， 那111 1111是不是特别大啊，那它对应的
		 *   十进制值为-1，-1跟-127比是不是 -1大。所以补码形式下二进制符号位后面的值越小，十进制值越小。
		 */
		int i2 = 128;
		byte b = (byte)i2;
		//-128
		System.out.println("b: " + b);

	}
}
