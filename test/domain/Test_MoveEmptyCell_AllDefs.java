package domain;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import domain.Puzzle.Direction;

public class Test_MoveEmptyCell_AllDefs {

	private PuzzleGame game;

	@Before
	public void criaJogo() {
		game = MyShuffle.criaJogo();
	}

	/** Testes com nomes no estilo nomeDoMetodoOriginal_x_i_j, tal que x, i, e j, seguem a regra do critério de seleção All-defs:
	 * Para cada variável 'x':
	 * 		Para cada nodo 'i', tal que 'x' tenha definição global:
	 * 			Para um def-clear path a partir do nodo 'i' ao nodo 'j', tal que (j-1,j) tenha um p-use da variável 'x'. 
	 */

	// direction - Some-p-uses

	@Test
	public void moveEmptyCell_direction_nodoInitialize_arestaLEFTfalse() {
		Direction direction = null;
		boolean moved = game.moveEmptyCell(direction);
		assertFalse(moved);
	}

}
