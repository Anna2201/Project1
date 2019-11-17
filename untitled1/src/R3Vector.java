import java.util.Scanner;

import java.util.Scanner;
class R3Vector {
    private double x, y,z;

    public R3Vector(double x, double y, double z){
        Scanner in = new Scanner(System.in);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void plus(R3Vector b){
        R3Vector d = new R3Vector(x+b.x, y+b.y,z+b.z);
        System.out.println("Сумма векторов:");
        System.out.println(d.x+" "+d.y+" "+d.z);
    }
    public void minus( R3Vector b){
        R3Vector w = new R3Vector(x-b.x, y-b.y,z-b.z);
        System.out.println("Разница векторов:");
        System.out.println(w.x+" "+w.y+" "+w.z);
    }
    public void mult(double k){
        R3Vector e = new R3Vector(k*x, k*y,k*z);
        System.out.println("Умножение вектора на число:");
        System.out.println(e.x+" "+e.y+" "+e.z);
    }
    public void product(R3Vector b){
         double r = x*b.x+y*b.y+z*b.z;
        System.out.println("Скалярное проиведение векторов:");
        System.out.println(z);
    }
    public void mixed(R3Vector b, R3Vector c){
        double m = x*b.y*c.z+y*b.z*c.x+z*b.x*c.y-z*b.y*c.x-y*b.x*c.z-x*b.z*c.y;
        System.out.println("Смешанное произведение векторов:");
        System.out.println(m);
    }
}