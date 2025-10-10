import java.util.Scanner;

public class alphabetCount {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the word: ");
        str = sc.next();
        System.out.print("Enter the character you want to check: ");
        char ch;
        ch = sc.next().charAt(0);

        int count =0;
        for (int i =0;i<str.length();i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
