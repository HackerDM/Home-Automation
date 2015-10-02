//temporary class to record videos using opencv
//work in progress


import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.videoio.VideoCapture;
import org.opencv.imgcodecs.*;

public class Webvideos
{
	private DaemonThread myThread = null;
	int count =0;
	VideoCapture websource = null;
	Mat frame = new Mat();
	MatOfByte mem = new MatOfByte();
	
	void shootVideos()
	{
	
		websource = new VideoCapture(0);
		myThread = new DaemonThread();
		Thread t = new Thread(myThread);
		t.setDaemon(true);
		myThread.runnable = true;
		t.start();
	}
	
	void stopShoot()
	{
		myThread.runnable = false;
		websource.release();
	}
	
	public class DaemonThread implements Runnable {
		protected volatile boolean runnable = false;
		public void run()
		{
		synchronized(this)
			{
				while (runnable)
					{
						if (websource.grab())
						{
							try
							{
							websource.retrieve(frame);
							Imgcodecs.imencode(".bmp", frame, mem);
							Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));

							BufferedImage buff = (BufferedImage) im;
							Graphics g = jPanel1.getGraphics();
							if (g.drawImage(buff, 0, 0, getWidth(), getHeight() - 150, 0, 0, buff.getWidth(), buff.getHeight(), null))
								if (runnable == false)
								{
									System.out.println("Going to wait()");
									this.wait();

								}
							}
							catch(Exception ex)
							{
							System.out.println("Error");
							}
						}
					}
			}
		}
	}


}
