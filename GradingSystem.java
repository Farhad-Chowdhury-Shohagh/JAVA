import java.util.Scanner;

class GradingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] subs = new int[3];

        int avg=0;

        for(int i =1; i<=3;i++){
            System.out.print("Mark #"+i+": ");
            subs[i-1] = sc.nextInt();
            avg+=subs[i-1];
        }
        avg=avg/3;

        if(avg<60){
            System.out.println("Grade: F");
        }
        else if(avg<75){
            System.out.println("Grade: C");
        }
        else if(avg<90){
            System.out.println("Grade: B");
        }
        else {
            System.out.println("Grade: A");
        }
    }
}
