import java.util.*;
class Guesser{
    int guessNum;
   int  guessingnumber(){
        System.out.println("Guesser! kindly guess the number");
        System.out.println();
        Scanner scan = new Scanner(System.in);
       guessNum =scan.nextInt();
       return guessNum;
    }
}
class Player{
    int guessNum;
    int guessingnumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("player! kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromguesser(){
      Guesser g = new Guesser();
      numFromGuesser=g.guessingnumber();
    }
    void collectNumFromPlayers(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingnumber();
        numFromPlayer2 = p2.guessingnumber();
        numFromPlayer3 = p3.guessingnumber();
        
    }
    void compare(){
        if(numFromGuesser==numFromPlayer1){
            System.out.println("Player1 won the game");
        }
        else if(numFromGuesser==numFromPlayer2){
            System.out.println("Player2 won the game");
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player3 won the game");
        }
        else{
            System.out.println("sab ka Sab ghalat hain. App game hargaye!..");
        }
    }
}
class Guess_game{
    public static void main(String[] args){
       System.out.println("....Game Started..."); 
       Umpire u = new Umpire();
       u.collectNumFromguesser();
       u.collectNumFromPlayers();
       u.compare();

    }
}