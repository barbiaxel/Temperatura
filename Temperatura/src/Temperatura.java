
public class Temperatura {

	
	public static double celsiusToFahrenheit(double celsius) {
		return (1.8) * celsius + 32;
		
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32)/1.8;
		
	}
	public static void main(String[] args) {
		System.out.println("0 grados Celsius son: "+celsiusToFahrenheit(0));
		System.out.println("15 grados Celsius son: "+celsiusToFahrenheit(15));
		System.out.println("20 grados Celsius son: "+celsiusToFahrenheit(20));
		System.out.println("0 grados Fahrenheit son: "+fahrenheitToCelsius(0));
		System.out.println("40 grados Fahrenheit son: "+fahrenheitToCelsius(40));
		System.out.println("70 grados Fahrenheit son: "+fahrenheitToCelsius(70));
	}

}
