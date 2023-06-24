import java.util.Scanner;

public class FirstNNaturalNo{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        //For Loop

        for(int i = 1; i<= number; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //While Loop

        int i = 1;
        while(i<= number){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();

        // Do while Loop
        // int i = 1;
        i = 1;
        do{
            System.out.print(i +" ");
            i++;
        }while(i<=number);
        System.out.println();

        scn.close();

    }
}