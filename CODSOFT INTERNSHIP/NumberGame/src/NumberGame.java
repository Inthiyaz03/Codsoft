import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chances=5;
        int finals=0;
        boolean playAgain=true;
        System.out.println("welcome to the game!");
        System.out.println("Hey prodigy you have about  "+chances+" chances to win this game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for (int i = 0; i < chances; i++) {
                System.out.println("chance-"+(i+1)+" Enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println(".(you got the game)");
                    break;
                }
                else if(user>rand){
                    System.out.println("Number exceeds");
                }
                else{
                    System.out.println("Number subceeds");
                } 
            }
            if(guess==false){
                System.out.println("Game got you! The number is"+rand);
            }
            System.out.println("Do you want to beat the game(y/n)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("y");
        }
        System.out.println("That's it dude, go and practise");
        System.out.println("here is your score"+finals);
    }
        public static int getrandN(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);

        }
}
