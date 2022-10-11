import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
       double a = sc.nextDouble();
        System.out.println("Enter the number b:");
        double b = sc.nextDouble();
        System.out.println("Enter the number c:");
       double c = sc.nextDouble();
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            double delta = quadraticEquation.getDiscriminant();
            if(quadraticEquation.getDiscriminant() > 0 ){
                System.out.printf(" The equation has two roots: %.2f, %.2f " , quadraticEquation.getRoot1() ,  quadraticEquation.getRoot2());
            }else if (quadraticEquation.getDiscriminant() == 0){
                System.out.printf("The equation has roots: %.2f" , quadraticEquation.getRoot2());
            } else {
                System.out.println("The equation has not");
            }
    }
}