package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {
    @Test
    public void whenTestPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertThat(bishopBlack.position(), is(Cell.A2));
    }

    @Test
    public void whenTestCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        BishopBlack rls = (BishopBlack) bishopBlack.copy(Cell.A5);
        assertThat(rls.position(), is(Cell.A5));
    }

    @Test
    public void whenTestWay() {
        BishopBlack black = new BishopBlack(Cell.C1);
        Cell[] arrays = black.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(arrays, is(expected));
    }
}