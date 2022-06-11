import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Santa newSanta = Santa.getInstance();                             
        newSanta.chooseToy();                                             
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();                                   
        Board newBoard = new Board();                      
        switch (choice) {                                                
            case 1 -> newBoard.printBalls();
            case 2 -> newBoard.printMotorcycles();
            default -> System.out.println("Invalid input, please try again");
        }

    }
}
