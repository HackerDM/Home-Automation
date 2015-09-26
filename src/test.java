import java.time.LocalDateTime;


public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//calls a shell script to capture the image
		
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint.getHour());
		System.out.println("Hello World!");
		
	}

}
