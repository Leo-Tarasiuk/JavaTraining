package by.epam.javatraining.tarasiuk.lesson5.task2.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SymbolLogicTest {

    @Test
    public void checkSymbol() {
        char a = 'a';

        boolean expected = true;

        assertTrue(expected == SymbolLogic.checkSymbol(a));
    }

    @Test
    public void checkSymbolOne() {
        char u = 'U';

        boolean expected = true;

        assertTrue(expected == SymbolLogic.checkSymbolOne(u));
    }

    @Test
    public void checkSymbolTwo() {
        char e = 'e';

        boolean expected = true;

        assertTrue(expected == SymbolLogic.checkSymbolTwo(e));
    }
}
