import java.util.HashMap;
import java.util.Map;

class Maze {
    Map<Integer, Room> rooms = null;

    public Maze(){
        this.rooms = new HashMap<Integer, Room>();
    }
    public void AddRoom(Room room){
        rooms.put(room.RoomNumber, room);
    }
    public Room RoomNo(int number){
        return rooms.get(number);
    }
}