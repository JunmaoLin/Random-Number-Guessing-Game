import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Greet the user and talk about game rules.
    System.out.println("Welcome to the magical number guessing game.");
    System.out.println("In this game, you will have 3 options for game difficulty: EASY, MEDIUM, and IMPOSSIBLE.");
    System.out.println("EASY MODE - The magic number will be in a range from 1-100. Hints will be given when you're approaching the magic number within the range of 10.");
    System.out.println("MEDIUM MODE - The magic number will be in a range from 1-1000. Hints will be given when you're approaching the magic number within the range of 100.");
    System.out.println("IMPOSSIBLE MODE - The magic number will be in a range from 1 to an unknown number. Hints will not be provided. :)");
    System.out.println("But before you begin. Here's a good news. You will be able to select the amount of chance you want according to your own choice. The limit amount of chance you may select is 100.");
    int easy=0, medium=0, impossible=0, chance=0, input=0;
    System.out.println();

    // User will select a difficulty.
    System.out.println("Please enter a difficulty: EASY, MEDIUM, IMPOSSIBLE.");
    String difficulty = scan.nextLine();
    System.out.println();

    // Easy mode
    if (difficulty.equalsIgnoreCase("EASY")){
      System.out.println("The magic number is between 1-100.");
      easy = (int)(Math.random()*100 +1);// Generate a random number between 1-100

      System.out.println("Enter the amount of chance you want to guess the number.");
      chance = scan.nextInt();// limit the amount of input the user can enter
      if(chance < 1 || chance > 100) {
        System.out.println("Smart move right there :) Please go back and enter a chance greater than 0 and less than 101.");
        System.exit(0);
      }// Program end when chance is invaild
      System.out.print("Enter your guess: ");
      input = scan.nextInt();// ask for user guess
      chance--;

      // Easy mode + hints
      while(input != easy && chance > 0){
        if((input <= easy+5 && input >= easy+1) || (input >= easy-5 && input <= easy-1)){
          System.out.println("***Really close!***");
        }
        else if ((input <= easy+10 && input >= easy+6) || (input >= easy-10 && input <= easy-6)){
          System.out.println("***Getting closer!***");
        }
        else{
          System.out.println("***Not even close.***");
        }
        System.out.println();
        System.out.println(chance + " more chance!");
        System.out.print("Enter your next guess: ");
        input = scan.nextInt();
        if(input < 1 ) {
        System.out.println("Smart move right there :) Please enter positive numbers only.");
        System.exit(0);
        }
        chance--;
      }
      if(input == easy){
        System.out.println("(👍≖‿‿≖)👍  !!!Congratulations you have guessed the magic number!!!  👍(≖‿‿≖👍)");//print when user guess the number
      }
      if((input != easy) && chance == 0){
        System.out.println("Sorry... It seems like you have used up all your chances. Better luck next time ∋━━o(｀∀ ´oメ）～→");// print when user fails to guess the number
      }
    }
    // Medium mode
    else if(difficulty.equalsIgnoreCase("MEDIUM")){
      System.out.println("The magic number is between 1-1000.");
      medium = (int)(Math.random()*1000 +1);// Generate a random number between 1-1000

      System.out.println("Enter the amount of chance you want to guess the number.");
      chance = scan.nextInt();// limit the amount of input the user can enter
      if(chance < 1 || chance > 100) {
        System.out.println("Smart move right there :) Please go back and enter a chance greater than 0 and less than 101.");
        System.exit(0);
      }// Program end when chance is invaild
      System.out.print("Enter your guess: ");
      input = scan.nextInt();// ask for user input
      chance--;

      // Medium mode + hints
      while(input != medium && chance > 0){
        if((input <= medium+10 && input >= medium+1) || (input >= medium-10 && input <= medium-1)){
          System.out.println("***You're in the range of 10!***");
        }
        else if((input <= medium+50 && input >= medium+11) || (input >= medium-50 && input <= medium-11)){
          System.out.println("***You're in the range of 50!***");
        }
        else if ((input <= medium+100 && input >= medium+51) || (input >= medium-100 && input <= medium-51)){
          System.out.println("***You're in the range of 100!***");
        }
        else{
          System.out.println("***Not even close.***");
        }
        System.out.println();
        System.out.println(chance + " more chance!");
        System.out.print("Enter your next guess: ");
        input = scan.nextInt();
        if(input < 1 ) {
        System.out.println("Smart move right there :) Please enter positive numbers only.");
        System.exit(0);
        }
        chance--;
      }
      if(input == medium){
        System.out.println("(☞ﾟヮﾟ)☞   !!!Congratulations you have guessed the magic number!!!   ☜(ﾟヮﾟ☜)");
      }
      if(input != medium && chance == 0){
        System.out.println("Sorry... It seems like you have used up all your chances. Better luck next time (ﾉಥДಥ)ﾉ ︵┻━┻･/");
      }
    }
    else if(difficulty.equalsIgnoreCase("IMPOSSIBLE")){
      System.out.println("The magic number is an unknown positive number.");
      int reallyRandom = (int)(Math.random()*9900 + 101);
      impossible = (int)(Math.random()*reallyRandom +1);// Generate a random number between 1-100

      System.out.println("Enter the amount of chance you want to guess the number.");
      chance = scan.nextInt();// limit the amount of input the user can enter
      if(chance < 1 || chance > 100) {
        System.out.println("Smart move right there :) Please go back and enter a chance greater than 0 and less than 101.");
        System.exit(0);
      }// Program end when chance is invaild
      System.out.print("Enter your guess: ");
      input = scan.nextInt();// ask for user input
      chance--;

      // Impossible mode + no hints
      while(input != impossible && chance > 0){
        System.out.println();
        System.out.println(chance + " more chance!");
        System.out.print("Enter your next guess: ");
        input = scan.nextInt();
        if(input < 1 ) {
        System.out.println("Smart move right there :) Please enter positive numbers only.");
        System.exit(0);
        }
        chance--;
      }
      if(input == impossible){
      System.out.println("(͠≖ ͜ʖ͠≖)👌  !!!Congratulations you have guessed the magic number!!!  (͠≖ ͜ʖ͠≖)👌");
      }
      if(input != impossible && chance == 0){
        System.out.println("Sorry... It seems like you have used up all your chances. Better luck next time ψ(｀∇´)ψ");
      }
    }
    else {
      System.out.println("(☞ﾟヮﾟ)☞  (╯°□°)╯︵ ┻━┻   Don't Do That  ┻━┻ ︵ ╯(°□° ╯)  ☜(ﾟヮﾟ☜)");
      System.exit(0);// print when user doesn't enter easy, medium, or impossible
    }
  }
}
