package zuoye1013;

import java.util.Scanner;

public class zhengweixia01 {
    public static void main(String[] args) {
        //作业1
        int i,j;
        int [][] arr = new int[3][3];
        Scanner sc=new Scanner(System.in);
        //键盘依次录入对象
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("请输入第"+(i+1)+"行的第"+(j+1)+"个数：");
                arr[i][j]=sc.nextInt();

            }
        }
        //输入二维数组元素
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }

        //计算对角元素和
        int sum1,sum2;
        sum1 = arr[0][0]+arr[2][2];
        sum2 = arr[0][2]+arr[2][0];
        System.out.println("对角元素和分别为："+sum1+"、"+sum2);
    }
}
