package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double seconds = 1000000000;
double Earthseconds = 31557600;
double Mercuryseconds = 0.2408467;
double Venusseconds = 0.61519726;
double Marsseconds = 1.8808158;
double Jupiterseconds = 11.862615;
double Saturnseconds = 29.447498;
double Uranusseconds =84.016846;
double Neptuneseconds = 164.79132;

System.out.println("Age of person in seconds = " +seconds);
System.out.println("Age of person in Earthseconds =" + (seconds/Earthseconds ));
System.out.println("Age of person in Mercuryseconds = " + (seconds /Earthseconds / Mercuryseconds));
System.out.println("Age of person in Venusseconds =" + (seconds/Earthseconds /Venusseconds));
System.out.println("Age of person in Marsseconds =" + (seconds/Earthseconds /Marsseconds));
System.out.println("Age of person in Jupiterseconds =" + (seconds/Earthseconds /Jupiterseconds));
System.out.println("Age of person in Saturnseconds =" + (seconds/Earthseconds /Saturnseconds));
System.out.println("Age of person in Uranusseconds =" + (seconds/Earthseconds /Uranusseconds));
System.out.println("Age of person in Neptuneseconds =" + (seconds/Earthseconds /Neptuneseconds));

	}

}
