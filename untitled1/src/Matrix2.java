/*Реализуйте класс Matrix2, позволяющий выполнять над
квадратными матрицами порядка два следующие операции: сложение,
вычитание, умножение на число, перемножение, вычисление определи-
теля и обратной матрицы.*/

import org.w3c.dom.ls.LSOutput;

public class Matrix2 {
    private int x, y, z, t;
    public Matrix2(int x, int y, int z, int t){
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }
    public void plus(Matrix2 b){
        Matrix2 d = new Matrix2(x+b.x, y+b.y, z+b.z, t+b.t);
        System.out.println("Сложение матриц:");
        System.out.println(d.x+" "+d.y);
        System.out.println(d.z+" "+d.t);
    }
    public void minus(Matrix2 b){
        Matrix2 u = new Matrix2(x-b.x,y-b.y,z-b.z,t-b.t);
        System.out.println("Вычитание матриц:");
        System.out.println(u.x+" "+u.y);
        System.out.println(u.z+" "+u.t);
    }
    public void mult(int p){
        Matrix2 h = new Matrix2(p*x,p*y,p*z,p*t);
        System.out.println("Увеличение матрицы на число:");
        System.out.println(h.x+" "+h.y);
        System.out.println(h.z+" "+h.t);
    }
    public void product(Matrix2 b){
        Matrix2 v = new Matrix2(x*b.x,y*b.y,z*b.z, t*b.t);
        System.out.println("Перемножение двух матриц");
        System.out.println(v.x+" "+v.y);
        System.out.println(v.z+" "+v.t);
    }
    public void det(){
    int j = x*t-y*z;
        System.out.println("Определитель матрицы");
    System.out.println(j);
    }
    public void reverse(){
        int j1 = x*t-y*z;
        if (j1 != 0) {
            Matrix2 rev = new Matrix2(Math.abs(x),- Math.abs(z), - Math.abs(y), Math.abs(t));
            System.out.println("Обратная матрица:");
            System.out.println(rev.x+" "+rev.y);
            System.out.println(rev.z+" "+rev.t);
        } else {
            System.out.println("Обратной  матрицы не существует");}
    }
}
