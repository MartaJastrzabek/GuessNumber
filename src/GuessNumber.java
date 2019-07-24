import java.util.Scanner;

public class GuessNumber {

    private int userNumber;
    private boolean condition;


    private void getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        userNumber = in.nextInt();
        //in.close();
    }

    public void checkAndPrint(){
        condition = false;
        while (!condition){
            getUserInput();
            if(userNumber>=100 && userNumber<=200){
                if(userNumber%3==0){
                    condition = true;
                    System.out.println("Twoja liczba jest ok.");
                }else {
                    System.out.println("Liczba nie jest podzielna przez 3.");
                }
            }else if(userNumber<100){
                System.out.println("Podana liczba jest za mała");
            }else{
                System.out.println("Podana Liczba jest za duża");
            }
        }

    }


}
