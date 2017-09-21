package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.Puzzle.Direction;

public class TestaMoveEmptyCell {
	
	private PuzzleGame game;

	@Before
	public void criaJogo() throws Exception {
		game = MyShuffle.criaJogo();
	}
	
	@Test
	public void moveEmptyCell_2UP() throws Exception {
		Direction direction = Direction.UP;
		
		boolean move1 = game.moveEmptyCell(direction);
		boolean move2 = game.moveEmptyCell(direction);
		
		assertTrue(move1);
		assertFalse(move2);
	}

	@Test
	public void moveEmptyCell_2DOWN() throws Exception {
		Direction direction = Direction.DOWN;
		
		boolean move1 = game.moveEmptyCell(direction);
		boolean move2 = game.moveEmptyCell(direction);
		
		assertTrue(move1);
		assertFalse(move2);
	}

	@Test
	public void moveEmptyCell_2RIGHT() throws Exception {
		Direction direction = Direction.RIGHT;
		
		boolean move1 = game.moveEmptyCell(direction);
		boolean move2 = game.moveEmptyCell(direction);
		
		assertTrue(move1);
		assertFalse(move2);
	}

	@Test
	public void moveEmptyCell_2LEFT() throws Exception {
		Direction direction = Direction.LEFT;
		
		boolean move1 = game.moveEmptyCell(direction);
		boolean move2 = game.moveEmptyCell(direction);
		
		assertTrue(move1);
		assertFalse(move2);
	}

	@Test
	public void moveEmptyCell_null() throws Exception {
		Direction direction = null;
		
		boolean move = game.moveEmptyCell(direction);
		
		assertFalse(move);
	}
}
