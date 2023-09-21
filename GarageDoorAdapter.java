package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener {
    private BasicGarageDoor bDoor;

    // Constructor
    public GarageDoorAdapter(BasicGarageDoor bDoor) {
        this.bDoor = bDoor;
    }

    // Ignores speedLevel, performs opening of a basic garage door
    public void openDoor(int speedLevel) {
        bDoor.openDoor();
    }

    // Ignores speedLevel, performs closing of a basic garage door
    public void closeDoor(int speedLevel) {
        bDoor.closeDoor();
    }

    // Implement PremiumGarageDoor interface method for locking the door
    public void lockDoor() {
        // Implement the logic to lock the garage door here
    }

    // Implement PremiumGarageDoor interface method for unlocking the door
    public void unlockDoor() {
        // Implement the logic to unlock the garage door here
    }

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		
	}
}