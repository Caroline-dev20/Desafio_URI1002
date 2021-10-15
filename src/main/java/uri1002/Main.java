package uri1002;

import java.util.Scanner;

public class Main {
		
		public static void main(String[] args) {
			
			Scanner key = new Scanner(System.in);
			
			Circle c = new Circle();
			
			c.setRadius(key.nextDouble());
			
			key.close();
			
			System.out.printf("A= %.4f%n",c.getArea());
			
		}
}
