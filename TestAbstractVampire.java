package tr.org.linux.kamp.abstractVampir;

public class TestAbstractVampire {
	
	public static void main(String[] args) {
		
		Dragon dragon = new Dragon();
		dragon.breathFire();
		
		Vampire vampire = new Vampire();
		vampire.canBeScaresByGarlic();
		
		dragon.canMakeYouScarer();
		vampire.canMakeYouScarer();
		
		dragon.fly();
	}

}
