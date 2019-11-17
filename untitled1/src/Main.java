public class Main {
    public static void main(String[] args){
        R3Vector a = new R3Vector(2,3,1);
        R3Vector b = new R3Vector(2,1,3);
        R3Vector c = new R3Vector(1,3,1);
        int k = 2;
        a.plus(b);
        a.minus(b);
        a.mult(k);
        a.product(b);
        a.mixed(b,c);
        Matrix2 q = new Matrix2(4,6,2,8);
        Matrix2 l = new Matrix2(5,7,3,9);
        int p = 4;
        q.plus(l);
        q.minus(l);
        q.mult(p);
        q.product(l);
        q.det();
        q.reverse();
    }

}
