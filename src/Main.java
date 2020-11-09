import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.isRoot()){
            System.out.println("Root 1: "+quadraticEquation.getRoot1());
            System.out.println("Root 2: "+quadraticEquation.getRoot2());
        }else{
            System.out.println("Quadratic equation have no real root");
        }
    }
}
