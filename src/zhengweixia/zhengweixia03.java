package zhengweixia;

import java.util.Scanner;

public class zhengweixia03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算a到b之间所有的奇数和和偶数和并输出（a、b取值自定，值差大于50）；
		int a,b,sum1=0,sum2=0;
		Scanner x1 = new Scanner(System.in);
		System.out.println("请输入数字x1：");
		a = x1.nextInt();
		System.out.println("请输入数字x2：");
		b = x1.nextInt();
		//判断x1与x2是否相差50
		if(Math.abs(a-b)<50){
			System.out.println("请重新输入数字x1，要求x1与x2相差50：");
			a = x1.nextInt();
			System.out.println("请重新输入数字x2，要求x1与x2相差50：");
			b = x1.nextInt();
		}
		//计算a到b之间所有的奇数和和偶数和
		//判断a.b大小
		if(a<b) {
			//判断a是奇数还是偶数
			if (a % 2 == 0) {
				for (int i = a; i <= b; i += 2) {
					sum1 = sum1 + i;
				}
				System.out.println("计算x1到x2之间所有的偶数和为：" + sum1);
				for (int i = a + 1; i <= b; i += 2) {
					sum2 = sum2 + i;
				}
				System.out.println("计算x1到x2之间所有的奇数和为:" + sum2);
			}
			if (a % 2 != 0) {
				for (int i = a; i <= b; i += 2) {
					sum1 = sum1 + i;
				}
				System.out.println("计算x1到x2之间所有的奇数和为：" + sum1);
				for (int i = a + 1; i <= b; i += 2) {
					sum2 = sum2 + i;
				}
				System.out.println("计算x1到x2之间所有的偶数和为：" + sum2);
			}
		}
		if(a>b){
			if (b % 2 == 0) {
				for (int i = b; i <= a; i += 2) {
					sum1 = sum1 + i;
				}
				System.out.println("计算x1到x2之间所有的偶数和为：" + sum1);
				for (int i = b + 1; i <= a; i += 2) {
					sum2 = sum2 + i;
				}
				System.out.println("计算x1到x2之间所有的奇数和为:" + sum2);
			}
			if (b % 2 != 0) {
				for (int i = b; i <= a; i += 2) {
					sum1 = sum1 + i;
				}
				System.out.println("计算x1到x2之间所有的奇数和为：" + sum1);
				for (int i = b + 1; i <= a; i += 2) {
					sum2 = sum2 + i;
				}
				System.out.println("计算x1到x2之间所有的偶数和为：" + sum2);
			}
		}
	}
}
