package odd_even_game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameRoom {
	List<GameUser> userList;
	String roomName;
	
	public GameRoom() {	
		userList = new ArrayList<GameUser>();
	}
	
	public GameRoom(GameUser user1, GameUser user2) {
		userList = new ArrayList<GameUser>();	//input user to <GameUser>
		userList.add(user1);
		userList.add(user2);
		
		try {
			user1.out.writeUTF("Welcome");
			user2.out.writeUTF("Welcome");
		} catch (IOException e) {}
	}
	
	public void ExitGame(GameUser user) {	//Exit game
		WaitingRoomServer.RoomManager.RemoveRoom(this);
	}
}
