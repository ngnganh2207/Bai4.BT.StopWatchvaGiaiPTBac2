import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a= scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b= scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c= scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.gettter());
        double delta= quadraticEquation.getDiscriminant();
        if(delta>0){
            System.out.println("x1= "+ quadraticEquation.getRoot1());
            System.out.println("x2= "+quadraticEquation.getRoot2());
        }else if( delta==0){
            System.out.println("x1=x2= "+quadraticEquation.getRoot2());
        }else {
            System.out.println("PT VÔ NGHIỆM");
        }
    }

}
