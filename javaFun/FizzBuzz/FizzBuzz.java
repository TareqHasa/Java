public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (number%3==0 && number%5==0){
            return ("FizzBuzz");
        } else if(number%3==0) {
            return ("Fizz");
        } else if(number%5==0){
            return ("buzz");
        } else {
            return String.format("%d",number);
        }
    }

    public static void main(String[] args){
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(2));
    }
}