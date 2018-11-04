package zhengweixia;

public class zhengweixia01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算1^2+2^2+3^2+...+i^2...，结果大于5000时停止计算，输出结果和对应的i值
		int i;
		int sum=0;
		for(i=1;;i++){
			sum=sum+i^2;

			if(sum>5000){
				System.out.println("1^2+2^2+3^2+...+i^2="+(sum-i^2));
				System.out.println("对应的i值为："+(i-1));
				break;
			}
		}
	}
}
