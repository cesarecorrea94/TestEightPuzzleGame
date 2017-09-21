package domain;

import domain.Puzzle.Direction;;

public class MyShuffle implements StrategyShufflePuzzle {

	Direction moves[] = new Direction[]{
			Direction.UP,		Direction.LEFT,		Direction.LEFT,		Direction.DOWN,
			Direction.RIGHT,	Direction.UP,		Direction.UP,		Direction.LEFT,
			Direction.DOWN,		Direction.RIGHT,	Direction.RIGHT,	Direction.UP,
			Direction.LEFT,		Direction.DOWN,
	};// buraco no centro
	
	public void shuffle(Puzzle game) {
		for(Direction d : moves){
			boolean changed = game.moveEmptyCell(d);
		}
	}

	public static PuzzleGame criaJogo() {
		int dimension = 3;// 3 x 3
		StrategyShufflePuzzle shuffler = new MyShuffle();
		return new PuzzleGame(dimension, shuffler);
	}
}
