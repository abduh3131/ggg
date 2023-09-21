package SGDO;
import java.util.logging.Logger;
public class PremiumGarageDoorApp1 {
	
private Logger log = Logger.getLogger(
		 PremiumGarageDoorApp1.class.getSimpleName());
private PremiumGarageDoorOpener garageDoorOpener;
public PremiumGarageDoorApp1(StdGarageDoorOpener doorAdapter) {
	this.garageDoorOpener = (PremiumGarageDoorOpener) doorAdapter;
}
public void PremiumGarageDoorApp(StdGarageDoorOpener pDoor) {
	// TODO Auto-generated constructor stub
}
public void openDoor(int speed) {
	this.garageDoorOpener.openDoor(speed);
	log.info("Garage Door is Open");
}
public void closeDoor(int speed) {
	this.garageDoorOpener.closeDoor(speed);
	log.info("Garage Door is Closed");
}
}
