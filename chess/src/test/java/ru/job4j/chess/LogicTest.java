package ru.job4j.chess;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void whenFromC1ToH6()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void whenFromD4ToA1()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D4));
        logic.move(Cell.D4, Cell.A1);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenFromD2ToF2()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.D2, Cell.F2);
    }

    @Test (expected = OccupiedCellException.class)
    public void whenFromA1ToD4ThroughC3()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.C3));
        logic.move(Cell.A1, Cell.D4);
    }

    @Test (expected = FigureNotFoundException.class)
    public void whenFromA1ToD4()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.A1, Cell.D4);
    }
}