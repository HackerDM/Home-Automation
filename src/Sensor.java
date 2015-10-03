import com.pi4j.io.gpio;
import com.pi4j.io.gpio.event;
public class Sensor {
	private boolean signalState;
	
	// create gpio controller           
	final GpioController gpioSensor = GpioFactory.getInstance(); 
	final GpioPinDigitalInput sensor = gpioSensor.provisionDigitalInputPin(RaspiPin.GPIO_04, PinPullResistance.PULL_DOWN);          

	// create another gpio controller                           
	final GpioController gpioLED = GpioFactory.getInstance();           
	final GpioPinDigitalOutput led = gpioLED.provisionDigitalOutputPin(RaspiPin.GPIO_05, "LED", PinState.HIGH);         

	led.high();         


	// create and register gpio pin listener            
	sensor.addListener(new GpioPinListenerDigital() {           
	    @Override       
    	public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {        

	    if(event.getState().isHigh()){  
        	    System.out.println("Motion Detected!"); 
            		led.toggle();
            		setSignalState("TRUE");
            		
        	}   

            if(event.getState().isLow()){   
            	     System.out.println("All is quiet...");
            		led.toggle();
            		setSignalState("FALSE");
        	}   

    	}       

	});         

	try {           
    	// keep program running until user aborts       
    	for (;;) {      
        Thread.sleep(500);  
    		}       
	}           
	catch (final Exception e) {         
	    System.out.println(e.getMessage());     
	}
	
	public void shootVideos(){
		
	}
	
	public void takePictures(){
		
	}

	public boolean isSignalState() {
		return signalState;
	}

	public void setSignalState(boolean signalState) {
		this.signalState = signalState;
		
		

	}
	
}
