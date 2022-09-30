package touro.peg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleBoardTest {
    @Test
    public void constructor() {
        //Given
        //When
        TriangleBoard board = new TriangleBoard(0);
        //Then
        boolean[] expected = new boolean[]{false, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        assertArrayEquals(expected, board.getPegs());
    }

    @Test
    public void testToString() {
        //Given
        //When
        TriangleBoard board = new TriangleBoard(0);
        //Then
        String expected = """
                    0
                   1 1
                  1 1 1
                 1 1 1 1
                1 1 1 1 1""";
        assertEquals(expected, board.toString());
    }

    @Test
    public void isWin(){
        //Given
        //When
        TriangleBoard board = new TriangleBoard(0);
        for (int i = 2; i < 15; i++)
        {
            board.setPeg(i, false);
        }
        //Then

        assertTrue(board.isWin());
    }

    @Test
    public void isBestWin(){
        //Given
        //When
        TriangleBoard board = new TriangleBoard(0);
        board.setPeg(0, true);
        for (int i = 1; i < 15; i++)
        {
            board.setPeg(i, false);
        }
        //Then
        assertTrue(board.isBestWin());
    }

}