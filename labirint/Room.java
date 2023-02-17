import java.util.HashMap;
import java.util.Map;

class Room extends MapSite {
    public int RoomNumber = 0;
    Map<Direction, MapSite> sides;

    public Room(int roomNo) {
        this.RoomNumber = roomNo;
        sides = new HashMap<Direction, MapSite>(4);
    }

    public void Enter() {
        System.out.println("Room");
    }

    public MapSite GetSide(Direction direction) {
        return sides.get(direction);
    }

    public void SetSide(Direction direction, MapSite mapSide) {
        this.sides.put(direction, mapSide);
    }
}