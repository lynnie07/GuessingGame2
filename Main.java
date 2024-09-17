import java.util.Scanner;
import java.util.Random;
    
    public class Main{ 
    public static void main(String[]args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(bound:100);
        int guess;
        System.out.println(x:"Enter your first guess:");
        guess = scan.nextInt();
        int count=0; //count the number of times user guesses

        while(guess!=x){
            //if x less than, greater than or equal
            if (count <=7);
                if (guess < x){
                System.out.print("Too Low!");
                }
                count+=1;

                if (guess == x ){
                System.out.print("You got an impossibly good score!");
                }

                else{
                System.out.print("Too High!");
            }
                count+=1;

             if (count<=10){
                    if (guess < x){
                        System.out.print("Too Low!");
                        }
                        count+=1;
        
                    if (guess == x ){
                        System.out.print("You did a good job!");
                    }

             else{
            
                    System.out.print("Try the divide and conquer strategy next time!");
                    }
    
            }
            
                    
            }
        

        }
        
    }