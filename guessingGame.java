import java.util.Random;
import java.util.Scanner;

class Game {
    public int Computer_input;
    public int User_input;

    public Game() {
        Random rand=new Random();
        Computer_input = rand.nextInt(100);
    }
    
    public void takeUserInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number That you want to guess it :");
        User_input=input.nextInt();
    }
    
    boolean isCorrectNumber(){
        if(User_input==Computer_input){
            System.out.println("Congrats!!!You guess the Correct number..");
            return true;
        }
        else if(User_input<Computer_input){
            System.out.println("Your number is less than the computer number...");
        }
        else if (User_input>Computer_input){
            System.out.println("Your number is greater than the computer number ...");
        }
        return false;
    }
}

public class guessingGame{
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        int attempts=0;
        int maxAttempts=5;
        
        while(!b && attempts < maxAttempts){
            attempts++;
            System.out.println("Attempt " + attempts + " of " + maxAttempts);
            g.takeUserInput();
            b= g.isCorrectNumber();
        }
        
        if(!b){
            System.out.println("Game Over! You've used all " + maxAttempts + " attempts.");
            System.out.println("The correct number was: " + g.Computer_input);
        }
    }
}