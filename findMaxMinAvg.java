import java.util.Scanner;

public class findMaxMinAvg {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=0;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=1; i<=n;i++){
            System.out.print("Enter #"+i+": " );
            arr[i-1]= sc.nextInt();
        }

        int max=arr[0], min=arr[0];
        float avg=0;

        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max= arr[i];
            }
            if (min>arr[i]){
                min= arr[i];
            }
            avg= avg+arr[i];
        }
        avg=avg/n;

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        System.out.println("Average: "+ avg);
    }
}

