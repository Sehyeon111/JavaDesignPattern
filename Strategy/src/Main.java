
public class Main {

	public static void main(String[] args) {
		Ainterface ainterface = new AinterfaceImpl();
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Ax());
		character.attack();
		
		
	}
}
