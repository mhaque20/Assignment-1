
import java.util.Scanner;

public class windChill {

	public static void main(String[] args) {
		System.out.println("Wind Chill Calculator");
		
		double temp, windSpeed;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40):");
		 temp = in.nextDouble();
		
		System.out.print("Enter the wind speed (must be >= 5 and <= 60):");
		 windSpeed = in.nextDouble();
		
		double windChill = 35.74 + 0.6215 * temp - Math.pow(windSpeed,0.16)*(35.75 - 0.4275 * temp); 
		
		System.out.println("Wind Chill temperature: " + windChill + " degrees Fahrenheit");
        System.out.println("Programmer: Mahdia Haque");
	}

}
