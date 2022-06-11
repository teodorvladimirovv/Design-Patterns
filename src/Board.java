public class Board {

    public void printMotorcycles(){
        String userInput = "Motorcycles";
        Factory.getToys(userInput);
        System.out.println("Motorcycles");
    }

    public void printBalls(){
        String userInput = "Balls";
        Factory.getToys(userInput);
        System.out.println("Balls");
    }
}
