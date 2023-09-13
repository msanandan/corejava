// in below scenario catch block will not be executed bcz there is no exception in try block
package Catch;

public class Demo2 {
	// in below scenario catch block will not be executed bcz there is no exception in try block

	public class Demo {

		public static void main(String[] args) {
			
			System.out.println("main( ) method started...");
			try {
				System.out.println("try block start");
				String s = "hi";
				int i = s.length();
				System.out.println("try block end");
			} catch (Exception e) {
				System.out.println("in catch block");
				e.printStackTrace();
			}
			System.out.println("main( ) method ended...");
		}
	}

}
