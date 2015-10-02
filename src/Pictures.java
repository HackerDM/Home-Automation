import java.io.IOException;
import java.time.LocalDateTime;


public class Pictures {
	private PicSet picSet;
	private static int noOfPicturesClicked;
	
	public Pictures() {
		// TODO Auto-generated constructor stub
		noOfPicturesClicked++;
	}
	
	public void capture(){
		//calls a shell script to capture the image
		LocalDateTime timePoint = LocalDateTime.now();
				
		String date = timePoint.getYear()+"/"+timePoint.getMonthValue()+"/"+timePoint.getDayOfMonth();
		String time = timePoint.getHour()+"-"+timePoint.getMinute()+"-"+timePoint.getSecond();
		String dateTime = date + "_" + time;
		
		picSet = new PicSet("640x640", "webcam/"+dateTime+".jpg");
		try {
			Runtime.getRuntime().exec("fswebcam -r " + picSet.getResolution() + " --no-banner " + picSet.getStorageLocation());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error in capturing the picture bro");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Pictures pictures = new Pictures();
		pictures.capture();
	}
		
}
