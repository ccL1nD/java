class BombedMazeGame extends MazeGame {
 
	 public BombedMazeGame() {
 	}
 
 	public Wall MakeWall() {
 		return new BombedWall();
 	}

 	public  Room MakeRoom(int number) {
 		return new RoomWithBomb(number);
 	}
 }