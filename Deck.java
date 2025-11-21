import java.util.*;


public class Deck {


   int p = 0;
   private Card[] deck;


   public Deck() {
       this.deck = new Card[52];
   }




   public void populateDeck() {
       // for all thirteen cards
       // and for all four suits
       // generate the corresponding face and suit at position i


       for (int i = 0; i < 4; i++) {
           if (p < 52) {
               for (int l = 0; l < 13; l++) {
                   deck[p] = new Card(l, i);
                   p++;
               }
           } else if (p == 52) {
               break;
           }
       }

   }




   public void shuffleDeck() {
       for (int k = 0; k < 52; k++) {
           Random random = new Random();
           int r = random.nextInt(51);
           Card s = deck[k];
           deck[k] = deck[r];
           deck[r] = s;
       }
        System.out.println("Deck fully shuffled");
   }

    public int selectCard(int c){
        String[] rsuits = {"Diamonds", "clubs", "Hearts", "Spades"};
      Card score = deck[c];
        System.out.println("You chose "+score.face+" of "+ rsuits[score.suit]);
      int result = 0;
        Random random = new Random();
        int rc = random.nextInt((c+1), 51);
      Card RobScore = deck[rc];
        System.out.println("Robo chose "+RobScore.face+" of "+ rsuits[RobScore.suit]);
      if (score.face>RobScore.face){
          result = 1;
      }
      else if (RobScore.face>score.face){
           result = 0;
      } else {
        if (score.suit>RobScore.suit){
          result = 1;
      }
      else if (RobScore.suit>score.suit){
           result = 0;
      }
      }
      return result;
    }
}
//
//    public String toString() {
//        return deck[];
//    }



