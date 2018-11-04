package zuoye1027;

public class Cylinder {
    private Circle center;
    //private
    private int gao;
    //创建构造函数
    public Cylinder(Circle center,int gao){
        this.center=center;
        this.gao=gao;
    }
    public Circle getCenter(){
        return center;
    }
    public int getGao(){
        return gao;
    }
    public void setCenter(Circle center){
        this.center=center;
    }

    public void setGao(int gao){
        this.gao=gao;
    }
    public double getArea(){
        return 2*center.getArea()+center.getPerimeter()*gao;
    }
    public double getVolume(){
        return center.getArea()*gao;
    }
}
