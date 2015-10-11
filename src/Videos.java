import java.io.IOException;

public class Videos extends Media
{
	private VidSet vidset;
	
	public Videos()
	{
		vidset = new VidSet();
	}
	
	public void shootVideos()
	{
		
		try 
		{
			Runtime.getRuntime().exec("sudo service motion start");
			Runtime.getRuntime().exec("sudo motion start");
		} 
		
		catch (IOException e) 
		{
			System.out.println("error in capturing the picture bro");
			e.printStackTrace();
		}
		
	}
	
	public void stopShoot()
	{
		try 
		{
			Runtime.getRuntime().exec("/etc/init.d/motion stop");
//			Runtime.getRuntime().exec("sudo service motion stop");
		} 
		
		catch (IOException e) 
		{
			System.out.println("error in capturing the picture bro");
			e.printStackTrace();
		}
		
	}

	public static void main(String [] args)
	{
		Videos v = new Videos();
		v.shootVideos();
	}
}
