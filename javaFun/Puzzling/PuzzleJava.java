import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
public class PuzzleJava {
    public static ArrayList <Integer> numberGreaterThan10(){
        ArrayList<Integer> newArr=new ArrayList <Integer>() ;
        int sum=0;
        int[] arr={3,5,1,2,7,9,8,13,25,32};
        
        for (int value:arr){
            sum+=value;
            if(value>10){
                newArr.add(value);
            }
        }
        System.out.println("Sum: "+sum);
        return newArr;

    } 

    public static ArrayList<String> shuffleName(){
        ArrayList<String> newArr=new ArrayList<String>();
        ArrayList<String> newArr2=new ArrayList<String>();
        String [] arr={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        for(String value:arr){
            newArr.add(value);
            if(value.length()>5){
                newArr2.add(value);
            }
        }
        Collections.shuffle(newArr);
        System.out.println("Shuffled Name : "+newArr);
        return newArr2;
    }
    public void shuffleChar(){
        String [] chracterz = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> charArry = new ArrayList<String>();
        List<String> shuffleArr = Arrays.asList(chracterz);
        Collections.shuffle(shuffleArr);
        System.out.println(chracterz[0]);
        if (chracterz[0] == "a" || chracterz[0] == "e" || chracterz[0] == "i" || chracterz[0] == "o" || chracterz[0] == "u"){
            System.out.println("this is a vowel");
        }
    }

    public static ArrayList<Integer> randomNum(){
        Random rand = new Random();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0; i<10;i++){
            int n = rand.nextInt(45);
            n+=55;
            arr.add(n);
        }
        return arr;
    }

        public static ArrayList<Integer> randomNumMinMax(){
        Random rand = new Random();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0; i<10;i++){
            int n = rand.nextInt(45);
            n+=55;
            arr.add(n);
        }
        return Arrays.sort(arr);
    }




    public static void main(String [] args) {
        PuzzleJava tariq= new PuzzleJava();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr=numberGreaterThan10();
        
        System.out.println("Number greater than 10: "+arr);
        System.out.println("Name greater than 5 char:"+shuffleName());
        tariq.shuffleChar();
        arr=randomNum();
        System.out.println(arr);
        System.out.println(randomNumMinMax());
        Collections.sort(arr);
    }
}
