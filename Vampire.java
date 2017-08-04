package tr.org.linux.kamp.abstractVampir;

public class Vampire extends Monstar implements Scarer {

	public void bite() {
		
		System.out.println("Vampire class and bite function");
		
	}
	
	public void canBeScaresByGarlic() {
		
		System.out.println("Garlic for vampires");
		
	}
	
	
	
	@Override
	public void canMakeYouScarer() {
		// TODO Auto-generated method stub
		
		System.out.println("onMakeYouScared of Vampire class");

		
	}

	@Override
	String frighten() {
		// TODO Auto-generated method stub
		return null;
	}

}
