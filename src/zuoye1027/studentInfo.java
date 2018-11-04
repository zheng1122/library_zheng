package zuoye1027;


/*
 学生信息类
 定义学生姓名、专业、数据库成绩、算法分析成绩、网络基础成绩5个成员变量。
 定义方法：
 输出学生信息；
 添加学生信息；
 计算总分；
 计算平均分
 test调用4个方法
 */
public class studentInfo {
    // 定义成员变量
    private String name;
    private String major;
    private String number;
    private double score1;
    private double score2;
    private double score3;
    private static int count=0;

    // 添加学生信息
    public void setInfo(String name, String major, double score1, double score2, double score3) {
        count++;  //统计总人数
        if(count<10){
            this.number="20180"+count;
        }
        else {
            this.number="2018"+count;
        }
        this.name = name;
        this.major = major;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    //学生信息
    public void getInfo() {
        System.out.println("学生信息如下");
        System.out.println("学生姓名：" + this.name + "；所学专业：" + this.major + "；成绩1：" + this.score1 + "；成绩2：" + this.score2
                + "；成绩3：" + this.score3);
    }

    // 计算总分
    public void Sum() {
        System.out.println("总成绩为：" + (this.score1 + this.score2 + this.score3));
    }

    public void avg() {
        System.out.println("平均分为：" + ((this.score1 + this.score2 + this.score3) / 3));
    }

    //获取总人数
    public static void getCount(){
        System.out.println("学生总人数为：" +count);
    }
    public void  getNumber(){
        System.out.println("学生学号为：" +number);
    }
    //获取学生学号
/*	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo();
		stu.setInfo("王平", "计算机科学与技术", 98, 90, 100);
		stu.getInfo();
		stu.Sum();
		stu.avg();
	}*/
}

