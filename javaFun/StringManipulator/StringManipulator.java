import java.util.Random;
public class StringManipulator{
    public  String  trimAndConcat(String str1, String str2) {
        String str3=str1.trim()+str2.trim();
        return str3;
    }
    public  Integer getIndexOrNull(String str, char c){
        return str.indexOf(c);
    }
    public  Integer getIndexOrNull(String str1, String str2){
        return str1.indexOf(str2);
    }
    public  String concatSubstring(String str1, int num1, int num2, String str2){
        String c=str1.substring(num1,num2);
        return c+str2;

    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 


        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null


        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer e = manipulator.getIndexOrNull(word, subString);
        Integer f = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(e); // 2
        System.out.println(f); // null

        String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1); // eworld
    }
}