package activities;

public class car {
String color;
String transmission;
int make;
int tyres;
int doors;

public car() {
	tyres = 4;
	doors = 4;
}
public void displayCharacteristics(){
	System.out.println("Make: " + make);
	System.out.println("Color: "+ color);
	System.out.println("transmission: " + transmission);
	System.out.println("tyres: " + tyres);
	System.out.println("doors: " + doors);
}
public void accelarate() {
	System.out.println("Car is moving forward.");
}
public void brake() {
	System.out.println("Car has stopped.");
}
}
