
public class User {
	private String userName;
	private String password; //has to be encrypted later
	private boolean sensorState;	//true->on //tells us if the user has turned on the automatic monitoring mode.
	
	
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		sensorState = false;
		//authenticate
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSensorState() {
		return sensorState;
	}
	public void setSensorState(boolean sensorState) {
		this.sensorState = sensorState;
	}
	
	public boolean sysInit(){ // //boolean to confirm if the sys has actually started or not
		Sensor sensor = new Sensor();
		
		//as soon as an obj of type sensor is created, a thread detecting the motion(sensor o/p) is initiated.
		
		return true; 
	}
	
	public static void main(String[] args) {
		User user = new User(args[0], args[1]);
		//auto-monitoring:
		if (user.isSensorState()==true){
			Sensor sensor = new Sensor();
			
		}
		

	}

	
	
}
