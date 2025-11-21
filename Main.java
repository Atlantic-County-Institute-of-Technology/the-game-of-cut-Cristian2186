import java.util.Scanner;


public class Main {
  public static void main(String[] args) {








   //   Card deck = new Card[52];
    //   boolean game = true;
    int game = 0;
      while(game<11){
       Deck deck = new Deck();
       deck.populateDeck();
       deck.shuffleDeck();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to the game of cut!!!");
       System.out.println("Please pick a card 1-51");
       int choice = scanner.nextInt();
       scanner.nextLine();
       int result = deck.selectCard(choice);
       if(result==0){
           System.out.println("You win");
       } else if (result==1){
           System.out.println("You lose");
       }
       game++;


      }
  }
}

