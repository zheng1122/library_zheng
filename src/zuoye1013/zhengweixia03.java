package zuoye1013;

import java.util.Scanner;

public class zhengweixia03 {
    public static void main(String[] args){
        int arrlength;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        arrlength = sc.nextInt();
        String str[] = new String[arrlength];
        //输入元素并判断元素长度
        for(int i=0;i<arrlength;i++){
            System.out.println("请输入---第" + (i+1) + "个字符串：");
            str[i] = sc.next();
            if (str[i].length()>100||str[i].length()<2){
                System.out.println("请重新输入---第" + (i+1) + "个字符串，要求字符串长度2~100：");
                str[i] = sc.next();
            }
        }
        //判断前一个元素的最后一个字符与后一个元素的第一个字符是否相等；
        int m=0;
        for (int i = 0; i < arrlength - 1; i++) {
            char last = str[i].charAt(str[i].length() - 1);// 前一个元素的最后一个字符
            char first = str[i + 1].charAt(0);// 后一个元素的第一个字符
            if (last!=first){
                m=1;
                break;
            }
        }
        //输出数组
        for(int i=0;i<arrlength;i++) {
            System.out.println("数组元素"+(i+1)+"为："+str[i]);
        }
        if(m==0) {
            System.out.println("该数组符合规则");
        }
        else{
            System.out.println("该数组不符合规则");
        }
    }
}
