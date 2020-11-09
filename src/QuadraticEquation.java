public class QuadraticEquation {
    double a,b,c;
    QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double getDiscriminant(){
        return (Math.pow(b,2) - (4*a*c));
    }
    public boolean isRoot(){
        boolean isRoot = true;
        if(getDiscriminant() < 0){
            isRoot = false;
        }
        return isRoot;
    }
    public double getRoot1(){
        return (-this.b + Math.sqrt(getDiscriminant())) / 2*a;
    }

    public double getRoot2(){
        return (-this.b - Math.sqrt(getDiscriminant())) / 2*a;
    }
}
