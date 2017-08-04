
package tr.org.linux.kamp.abstractVampir;

public class Dragon extends Monstar implements Scarer, Flayable {

	public String breathFire() {
		System.out.println("Dragon fireeeee");
		return "aarrgghhh";
	}
	
	
	
	@Override
	public void canMakeYouScarer() {
		// TODO Auto-generated method stub
		System.out.println("onMakeYouScared of Dragon class");
		
	}

	@Override
	String frighten() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly of Dragon class");

		
	}

}
