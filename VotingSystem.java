import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] agrs){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scn.nextInt();

        // Method -1 : If - else condition

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("Sorry, You can not vote");
        }

        // Method - 2 Ternary Operator (Won't Work)
        
        // int temp = age >=18 ? System.out.println("You are eligible to vote") : System.out.println("Sorry, You can not vote");

        // why this is wrong ? Return type should be int || but we are not returning anything thus void
        // unlike C++ / C we can't simply use ternary as
        //  age >=18 ? System.out.println("Vote") : System.out.println("Can not Vote");

        // Method - 2 Ternary Operator
        
        String result = age >=18 ? "You are eligible to vote":"Sorry, You can not vote";
        System.out.println(result);
    }
}
