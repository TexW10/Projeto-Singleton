
public class Main_Principal {
	public static void main(String[] args) {
		
		Singleton s;
		
		for(int i = 0; i < 10; i++) {
			
			s = Singleton.getInstance();
			System.out.println(i + ":" +s);
			
		}
	}

}
