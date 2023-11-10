import java.util.Scanner;
public class Tri {
    private double a,b,c;
    public Tri(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean is_tri(){
        boolean tf = (a+b>c && a+c>b && b+c>a);
        if (!tf){
            System.out.println("NO");
        }
        return tf;
    }
    public void which_tri(){
        if (is_tri()){//先判断是否能组成三角形
            if ((a==b|| a==c|| b==c)){//等腰三角形
                if (a==b && b==c){//等边三角形
                    System.out.println("DB");
                }
                else
                    System.out.println("DY");
            }
            if ((a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a)){//直角三角形
                System.out.println("ZJ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        //获取键盘输入
        System.out.print("请输入边长a：");a = scanner.nextDouble();
        System.out.print("请输入边长b：");b = scanner.nextDouble();
        System.out.print("请输入边长c：");c = scanner.nextDouble();

        Tri tri = new Tri(a, b, c);
        tri.which_tri();//判断三角形类型
    }
}