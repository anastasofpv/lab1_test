package upatras;

public class MyLab {
	
	public static void main(String args[]) {
//		System.out.println();
		
		
		Person p = new Person();
		p.setFirstName("TestA");
		System.out.println("Hello "+ p.getFirstName());
		
		for (int i=0; i<3 ; i++) {
			String myname = "Test" + i;
			Person myp = new Person();
			myp.setFirstName(myname);
			System.out.println("Hello "+ myp.getFirstName());
			
		}

	}

}
