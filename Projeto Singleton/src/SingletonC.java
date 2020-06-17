
public class SingletonC {
	
	private static SingletonC instance;
	
	private SingletonC() {
		
	}
	
	
	public static SingletonC getInstance() {
		
		if(instance == null) {
			instance = new SingletonC();
			
		}
		
		return instance;
	}

}
