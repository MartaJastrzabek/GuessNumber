import java.util.Scanner;

public class GuessNumber {

    private int userNumber;
    private boolean condition;
    private Scanner in;

    public GuessNumber(Scanner in){
        this.in = in;
    }

    private void getUserInput(){
        System.out.println("Podaj liczbę: ");
        userNumber = in.nextInt();
    }

    public void checkAndPrint(){
        condition = false;
        while (!condition){
            getUserInput();
            if(userNumber<100){
                System.out.println("Twoja liczba jest za mała.");
            } else if(userNumber>200){
                System.out.println("Twoja liczba jest za duża.");
            } else if (userNumber%3==0){
                condition = true;
                System.out.println("Twoja liczba jest ok");
                break;
            } else{
                System.out.println("Twoja liczba nie jest podzielna przez 3.");
            }
        }
    }

//    public void checkAndPrint(){
//        condition = false;
//        while (!condition){
//            getUserInput();
//            if(userNumber>=100 && userNumber<=200){
//                if(userNumber%3==0){
//                    condition = true;
//                    System.out.println("Twoja liczba jest ok.");
//                }else {
//                    System.out.println("Liczba nie jest podzielna przez 3.");
//                }
//            }else if(userNumber<100){
//                System.out.println("Podana liczba jest za mała");
//            }else{
//                System.out.println("Podana Liczba jest za duża");
//            }
//        }
//
//    }

}
