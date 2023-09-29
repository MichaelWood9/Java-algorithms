package Question3;

import java.util.Scanner;

public class Question3 extends Thread{

    public static int numberEntered;
    public static boolean isPrime;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");//this outputs and asks the user to enter
        numberEntered = myObj.nextInt();//this takes the input
        System.out.println("---------------------------------------------------------------------------------------------");
        Question3 thread = new Question3();//creates a new thread
        thread.start();//starts the thread

    }
    public void run() {//the thread runs this
        for (int x = 2; x < numberEntered;numberEntered--) {//checks if the number is greater tha 2 and decreases it by 1 and loops until the number is not greater than 2
            for (int i = 2; i < numberEntered; i++) {//checks if the number is less than i and increments i.
                if (numberEntered % i == 0) {//checks if the modulo i equals 0
                    isPrime = false;//sets prime to false
                    break;//breaks the loop
                }
                else {
                    isPrime = true;//sets prime to true
                }
            }
            if(isPrime){//check if the number is prime
                System.out.println(numberEntered);//outputs the prime numbers

            }
        }
        if(1<numberEntered){//checks if number entered is greater than 1
            System.out.println(2);//outputs 2 the final prime number
        }

    }
}
