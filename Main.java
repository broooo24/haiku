import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String poem = scanner.nextLine();
        //System.out.println(poem);
        System.out.println(getHaiku(poem));



    }

    public static String getHaiku(String poem){
        int length = poem.length();
        int repeat = length/19;
        System.out.println(length);
        if(length==0)return "";
        if (length<6)return poem;
        if (length<13)return poem.substring(0,5)+ "\n" + poem.substring(5,length);
        if (length<18)return poem.substring(0,5)+"\n" + poem.substring(5,12)+"\n"+poem.substring(12,length);
        return "";
    }
}
