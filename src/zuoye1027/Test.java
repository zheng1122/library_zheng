package zuoye1027;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(20, 30, 5);
        Cylinder cy = new Cylinder(new Circle(10, 20, 10), 20);
        System.out.println("圆c1的半径是：" + c1.getRadius());
        System.out.println("圆c1的面积是：" + c1.getArea());
        System.out.println("圆c1的周长是：" + c1.getPerimeter());

        System.out.println("圆柱体cy的半径是：" + cy.getCenter().getRadius());
        System.out.println("圆柱体cy的体积是：" + cy.getVolume());
        System.out.println("圆柱体cy的面积是：" + cy.getArea());
    }
}
