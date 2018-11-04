package zuoye1027;

public class Circle {
    private int x;
    private int y;
    private double radius;
    private double pi=3.14;//d

    public Circle(int x,int y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y=y;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return pi*radius*radius;
    }

    public double getPerimeter(){
        return pi*radius*2;
    }
}
