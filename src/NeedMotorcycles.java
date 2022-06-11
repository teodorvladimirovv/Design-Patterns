public class NeedMotorcycles implements Command{
    Board newBoard;

    public void printMotorcycles(Board board)
    {
        this.newBoard = board;
    }
    public void execute()
    {
        newBoard.printMotorcycles();
    }
}
