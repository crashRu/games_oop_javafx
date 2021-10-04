package ru.job4j.chess;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {
    @Test(expected = Exception.class)
    public void whenMoveIsOkThenFail() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        BishopBlack bb = new BishopBlack(Cell.B1);
        logic.add(bb);
        logic.move(Cell.B1, Cell.D3);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFoundException() throws
            OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.move(Cell.B1, Cell.D3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMoveException() throws
            OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        BishopBlack bb = new BishopBlack(Cell.B1);
        logic.add(bb);
        logic.move(Cell.B1, Cell.D2);
    }
}
