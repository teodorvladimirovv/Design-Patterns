public class NeedBalls implements Command{
    Board newBoard;

    public void printBalls(Board board)
    {
        this.newBoard = board;
    }
    public void execute()
    {
        newBoard.printBalls();
    }
}
