class App {
	
	private static App app;
	
	private App() {
		
	}
	
	public static App getInstance() {
		if(app == null)
			app = new App();
		
		return app;
	}
	
}




public class SingletonClass {

	public static void main(String[] args) {
		
		App app1 = App.getInstance();
		App app2 = App.getInstance();
		
		//System.out.println(app1+ " "+ app2);

	}

}


