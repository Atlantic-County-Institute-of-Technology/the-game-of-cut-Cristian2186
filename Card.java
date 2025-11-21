import java.util.*;
import java.util.Random;




public class Card {
   public Card(int face, int suit) {
           this.face = face;
           this.suit = suit;
   }
           Random random = new Random();
           int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
           int[] suits = {0, 2, 3, 4};


        int x = random.nextInt(faces.length);
           int face = faces[x];
        int y = random.nextInt(suits.length);
           int suit = suits[y];
//        System.out.println(face + " of " + suit);
           public String toString () {
                   return face + " of " + suit;
           }
        }

