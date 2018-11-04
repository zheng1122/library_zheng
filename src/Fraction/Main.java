package Fraction;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Fraction a = new Fraction(in.nextInt(), in.nextInt());

        Fraction b = new Fraction(in.nextInt(),in.nextInt());

        a.print();

        b.print();

        a.plus(b).print();

        a.multiply(b).plus(new Fraction(5,6)).print();

        a.print();

        b.print();

        in.close();

    }


}

 class Fraction {
     private int fenzi;
     private int fenmu;

    //构造函数
    Fraction(int fenzi,int fenmu){
        this.fenzi=fenzi;
        this.fenmu=fenmu;
    }

    // 将分数转换为doubl
    double toDouble(){

        return (double)fenzi/fenmu;

    }
    //将自己的分数和r的分数相加，产生一个新的Fraction的对象
     Fraction plus(Fraction r){

         Fraction f = new Fraction(2,1);

         f.fenzi=fenzi*r.fenmu+r.fenzi*fenmu;

         f.fenmu=fenmu*r.fenmu;

         return f;

     }

     //将自己的分数和r的分数相乘，产生一个新的Fraction的对象
     Fraction multiply(Fraction r){

         Fraction m = new Fraction(2,1);

         m.fenzi=fenzi*r.fenzi;

         m.fenmu=fenmu*r.fenmu;

         return m;

     }
     void print(){

         int x,y,r;

         x=fenzi;

         y=fenmu;

         while(y!=0){

             r=x%y;

             x=y;

             y=r;

         }

         fenzi=fenzi/x;

         fenmu=fenmu/x;

         if(fenzi==fenmu){

             System.out.println(fenzi/fenmu);

         }

         else{

             System.out.println(fenzi+"/"+fenmu);

         }

     }

 }

