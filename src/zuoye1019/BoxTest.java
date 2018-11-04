package zuoye1019;

public class BoxTest {
    public static void main(String[] args){
        Box b1 = new Box(10,20,5);
        System.out.println("立方体长为："+b1.getChang());
        System.out.println("立方体宽为："+b1.getKuan());
        System.out.println("立方体高为："+b1.getGao());
        System.out.println("立方体体积为："+b1.getVolume());
    }
}
