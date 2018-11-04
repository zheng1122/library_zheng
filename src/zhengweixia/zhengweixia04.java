package zhengweixia;

import java.util.Scanner;

public class zhengweixia04 {
    public static void main(String[] args) {
        //假设能够根据手机号的前三位判断运营商，如果输入的手机号前三位是136、137、138、139，则输出“移动”、
        // 如果是130、131、133，则输出“电信”、如果是186、188，则输出“联通”。
        // 如果输入的其他手机号，则输出“未知运营商”
        int num;
        Scanner x1 = new Scanner(System.in);
        System.out.println("请输入你的手机号前三位：");
        num = x1.nextInt();
        if(num==136||num==137||num==138||num==139){
            System.out.println("该手机号为移动手机号");
        }else if(num==130||num==131||num==133){
            System.out.println("该手机号为电信手机号");
        }else if(num==186||num==188){
            System.out.println("该手机号为联通手机号");
        }else{
            System.out.println("未知运营商！");
        }
    }
}
