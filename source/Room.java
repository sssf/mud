public class Room {
    final int MAX_ROOMS = 4;
    final int NORTH = 0;
    final int EAST  = 1; 
    final int SOUTH = 2;
    final int WEST  = 3; 
    
    Room[] rooms = {null, null, null, null};

    public Room(Room north, Room east, Room south, Room west)
    {
        rooms[NORTH] = north;
        rooms[EAST]  = east;
        //...
    } 


    public Room() {

    } 


    public void connect(Room room, int direction) {
        this.rooms[direction] = room;
    } 

    public Room getRoom(int direction) {
        return this.rooms[direction];
    } 

    public Room[] getConnected() {
        //TODO: Add room counter so we dont have to iterate twice
        
        int count = 0;
        for (int i = 0; i < MAX_ROOMS; ++i) {
            if (rooms[i] != null) {
                ++count;
            } 
        }
        Room[] rooms = new Room[count];
        int temp = 0;//Babak temp programming 101
        for (int i = 0; i < MAX_ROOMS; ++i)
        {
            if (this.rooms[i] != null) {
                rooms[temp] = this.rooms[i];
                temp++;
            } 
        }

        return rooms;
    } 


} 



