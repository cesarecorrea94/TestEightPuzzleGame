package domain;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import domain.Puzzle.Direction;

public class Test_MoveEmptyCell_AllPUses_SomeCUses {

	private PuzzleGame game;

	@Before
	public void criaJogo() {
		game = MyShuffle.criaJogo();
	}

	/** Testes com nomes no estilo nomeDoMetodoOriginal_x_i_j, tal que x, i, e j, seguem a regra do critério de seleção All-p-use:
	 * Para cada variável 'x':
	 * 		Para cada nodo 'i', tal que 'x' tenha definição global em 'i':
	 * 			Para cada def-clear path a partir do nodo 'i' ao nodo 'j', tal que (j-1,j) tenha um p-use da variável 'x'. 
	 */

	// direction - All-p-use

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaDOWNtrue() {
		Direction direction = Direction.DOWN;
		boolean moved = game.moveEmptyCell(direction);
		assertTrue(moved);
	}

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaDOWNfalse() {
		Direction direction = null;
		boolean moved = game.moveEmptyCell(direction);
		assertFalse(moved);
	}

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaUPtrue() {
		Direction direction = Direction.UP;
		boolean moved = game.moveEmptyCell(direction);
		assertTrue(moved);
	}

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaUPfalse() {
		Direction direction = null;
		boolean moved = game.moveEmptyCell(direction);
		assertFalse(moved);
	}

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaRIGHTtrue() {
		Direction direction = Direction.RIGHT;
		boolean moved = game.moveEmptyCell(direction);
		assertTrue(moved);
	}

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaRIGHTfalse() {
		Direction direction = null;
		boolean moved = game.moveEmptyCell(direction);
		assertFalse(moved);
	}

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaLEFTtrue() {
		Direction direction = Direction.LEFT;
		boolean moved = game.moveEmptyCell(direction);
		assertTrue(moved);
	}

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaLEFTfalse() {
		Direction direction = null;
		boolean moved = game.moveEmptyCell(direction);
		assertFalse(moved);
	}

}
