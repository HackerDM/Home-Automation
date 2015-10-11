import java.io.IOException;
//import java.time.LocalDateTime;


public class Pictures {
	private PicSet picSet;
	private static int noOfPicturesClicked;
	
	public Pictures() {
		noOfPicturesClicked++;
	}
	
	public void capture(){
		//calls a shell script to capture the image
//		LocalDateTime timePoint = LocalDateTime.now();
				
//		String date = timePoint.getYear()+"/"+timePoint.getMonthValue()+"/"+timePoint.getDayOfMonth();
//		String time = timePoint.getHour()+"-"+timePoint.getMinute()+"-"+timePoint.getSecond();
//		String dateTime = date + "_" + time;
		
		picSet = new PicSet("640x640", "webcam/image.jpg");
		try 
		{
//			Runtime.getRuntime().exec("sudo fswebcam -r " + picSet.getResolution() + " --no-banner " + picSet.getStorageLocation());
			Runtime.getRuntime().exec("sudo fswebcam -r 640x640 --no-banner webcam/image1.jpg");
			Runtime.getRuntime().exec("touch hi.txt");
		} 
		
		catch (IOException e) 
		{
			System.out.println("error in capturing the picture bro");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Pictures pictures = new Pictures();
		pictures.capture();
	}
		
}
