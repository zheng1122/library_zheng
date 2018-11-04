package zhengweixia;

import java.util.Arrays;
import java.util.Scanner;

public class zhengweixia05 {
    public static void main(String[] args){
        //编写程序实现对给定的4个整数从大到小的顺序排序
        int x;
        int a1[]=new int[4];
        Scanner x1 = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        a1[0] = x1.nextInt();
        System.out.println("请输入第二个数：");
        a1[1] = x1.nextInt();
        System.out.println("请输入第三个数：");
        a1[2] = x1.nextInt();
        System.out.println("请输入第四个数：");
        a1[3] = x1.nextInt();
        String output = Arrays.toString(a1);
        System.out.println("你输入的四个数分别为："+output);
        for(int i=0;i<a1.length;i++){
            //内循环第一次排出最大值，以此类推
            for (int j=i;j<a1.length;j++){
                if(a1[i]<a1[j]) {
                    x=a1[i];
                    a1[i]=a1[j];
                    a1[j]=x;
                }
            }

        }
        String output1 = Arrays.toString(a1);
        System.out.println("你输入的四个数分别为："+output1);
    }
}
