package SGDO;
public class TestGarageDoors {
	public static void main(String[] args) {
		
		//Standard use of GarageDoorApp
		BasicGarageDoor bDoor = new BasicGarageDoor();
		GarageDoorApp bApp = new GarageDoorApp(bDoor);
		bApp.openDoor();
		bApp.closeDoor();
		
		//Standard use of PremiumGarageDoorApp
		PremiumGarageDoorOpener pDoor = new PremiumGarageDoorOpener();
		GarageDoorApp pApp = new GarageDoorApp((StdGarageDoorOpener) pDoor);
		pApp.openDoor();
		pApp.closeDoor();
		
		// BasicGarageDoor is able to use PremiumGarageDoorApp through adapter, door opens like a basic door regardless of speedLevel
		StdGarageDoorOpener doorAdapter = new GarageDoorAdapter(bDoor);
		PremiumGarageDoorApp1 adapterApp = new PremiumGarageDoorApp1(doorAdapter);
		adapterApp.openDoor(0);
		adapterApp.closeDoor(0);
		
	}
	
}