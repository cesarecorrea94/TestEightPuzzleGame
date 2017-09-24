package domain;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import domain.Puzzle.Direction;

public class Test_MoveEmptyCell_AllCUses_SomePUses {

	private PuzzleGame game;

	@Before
	public void criaJogo() {
		game = MyShuffle.criaJogo();
	}

	/** Testes com nomes no estilo nomeDoMetodoOriginal_x_i_j, tal que x, i, e j, seguem a regra do critério de seleção All-c-use:
	 * Para cada variável 'x':
	 * 		Para cada nodo 'i', tal que 'x' tenha definição global em 'i':
	 * 			Para cada def-clear path a partir do nodo 'i' ao nodo 'j', tal que 'j' tenha um global c-use da variável 'x'. 
	 */

	// direction - Some-p-use

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaDOWNtrue() {
		Direction direction = Direction.DOWN;
		boolean move1 = game.moveEmptyCell(direction);
		assertTrue(move1);
	}

}
