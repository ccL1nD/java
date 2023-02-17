class Door extends MapSite {
    Room room1 = null;
    Room room2 = null;
    boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void Enter() {
        System.out.println("Door");
    }

    public Room OtherSideFrom(Room room) {
        if (room == room1)
        return room2;
        else
        return room1;
    }
}
