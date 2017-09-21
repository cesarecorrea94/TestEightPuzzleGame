package domain;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestaGenerateListOfTiles {
	
	private PuzzleGame game;

	@Before
	public void criaJogo() throws Exception {
		game = MyShuffle.criaJogo();
	}

	@Test
	public void generateListOfTiles_0tiles() throws Exception {
		int quantityOfTiles = 0;
		List<Tile> tiles = game.generateListOfTiles(quantityOfTiles);
		
		assertEquals(quantityOfTiles, tiles.size());
	}
	
	@Test
	public void generateListOfTiles_1tiles() throws Exception {
		int quantityOfTiles = 1;
		List<Tile> tiles = game.generateListOfTiles(quantityOfTiles);
		
		assertEquals(quantityOfTiles, tiles.size());
		assertEquals(1, tiles.get(0).getNumber());
	}

	@Test
	public void generateListOfTiles_2tiles() throws Exception {
		int quantityOfTiles = 2;
		List<Tile> tiles = game.generateListOfTiles(quantityOfTiles);
		
		assertEquals(quantityOfTiles, tiles.size());
		assertEquals(1, tiles.get(0).getNumber());
		assertEquals(2, tiles.get(1).getNumber());
	}
}
