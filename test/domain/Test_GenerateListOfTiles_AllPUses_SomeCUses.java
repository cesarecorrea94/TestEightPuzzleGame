package domain;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Test_GenerateListOfTiles_AllPUses_SomeCUses {

	private PuzzleGame game;

	@Before
	public void criaJogo() {
		game = MyShuffle.criaJogo();
	}

	private void delegatedTest(int quantityOfTiles) {
		Tile allTiles[] = new Tile[quantityOfTiles];
		for(int tileNumber = 1; tileNumber <= quantityOfTiles; tileNumber++)
			allTiles[tileNumber-1] = new Tile(tileNumber);
		List<Tile> allTilesAsList = Arrays.asList(allTiles);
		
		List<Tile> tiles = game.generateListOfTiles(quantityOfTiles);
		
		assertEquals(quantityOfTiles, tiles.size());
		assertEquals(allTilesAsList, tiles);
	}

	/** Testes com nomes no estilo nomeDoMetodoOriginal_x_i_j, tal que x, i, e j, seguem a regra do critério de seleção All-p-use:
	 * Para cada variável 'x':
	 * 		Para cada nodo 'i', tal que 'x' tenha definição global em 'i':
	 * 			Para cada def-clear path a partir do nodo 'i' ao nodo 'j', tal que (j-1,j) tenha um p-use da variável 'x'. 
	 */

	// quantityOfTiles - All-p-uses

	@Test
	public void generateListOfTiles_quantityOfTiles_nodoInitialize_arestaLoopFalse() {
		this.delegatedTest(0);
	}

	@Test
	public void generateListOfTiles_quantityOfTiles_nodoInitialize_arestaLoopTrue() {
		this.delegatedTest(1);
	}

	// listOfTiles - Some-c-uses

	@Test
	public void generateListOfTiles_listOfTiles_nodoPosInitialize_nodoInLoop() {
		this.delegatedTest(1);
	}

	// i - All-p-uses

	@Test
	public void generateListOfTiles_i_nodoPosInitialize_ArestaLoopFalse() {
		this.delegatedTest(0);
	}

	@Test
	public void generateListOfTiles_i_nodoPosInitialize_ArestaLoopTrue() {
		this.delegatedTest(1);
	}

	@Test
	public void generateListOfTiles_i_nodoInLoop_arestaLoopFalse() {
		this.delegatedTest(1);
	}

	@Test
	public void generateListOfTiles_i_nodoInLoop_arestaLoopTrue() {
		this.delegatedTest(2);
	}

}
