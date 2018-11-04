package zuoye1027;

public class studentInfoTest {

    public static void main(String[] args) {
        studentInfo stu = new studentInfo();
        stu.setInfo("王平", "计算机科学与技术", 98, 90, 100);
        stu.getInfo();
        stu.Sum();
        stu.avg();
        stu.getNumber();
        stu.getCount();
    }

}
