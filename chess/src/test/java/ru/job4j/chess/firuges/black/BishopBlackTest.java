package ru.job4j.chess.firuges.black;


import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BishopBlackTest {

    @Test
    public void whenPositionD2Then() {
        BishopBlack bb = new BishopBlack(Cell.D2);
        assertEquals(Cell.D2, bb.position());
    }

    @Test
    public void whenCopyF3() {
        BishopBlack bb = new BishopBlack(Cell.F4);
        assertEquals(Cell.F1, bb.copy(Cell.F1).position());
    }

    @Test
    public void whenPositionD4DestA1Then() {
        BishopBlack start = new BishopBlack(Cell.D4);
        Cell dest = Cell.A1;
        Cell[] expected = {Cell.C3, Cell.B2, Cell.A1};
        Assert.assertArrayEquals(expected, start.way(dest));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenPositionAndDestNotDiagonal() {
        Cell position = Cell.D4;
        Cell dest = Cell.G3;
        BishopBlack bb = new BishopBlack(position);
        bb.way(dest);
    }
}