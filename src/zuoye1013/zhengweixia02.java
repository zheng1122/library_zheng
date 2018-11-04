package zuoye1013;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zhengweixia02 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int i;
        Scanner sc=new Scanner(System.in);
        //键盘依次录入对象
        for(i=0;i<10;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            a[i]=sc.nextInt();
        }

        List<Integer> arrlist = new ArrayList<>();
        for (int j : a) {
            if (!arrlist.contains(j)) {
                arrlist.add(j);
            }
        }
        System.out.println(arrlist);
    }
}
