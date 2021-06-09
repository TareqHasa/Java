import java.lang.Math;
public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        int num1=legA*legA;
        int num2=legB*legB;
        double sum=num1+num2;
        return Math.sqrt(sum);
    }

    public static void main(String[] args){
        int a=4;
        int b=10;
        System.out.println(calculateHypotenuse(a,b));
    }
}