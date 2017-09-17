
public class Patient {
	
	private String name;
	private int age;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Patient " +  name + " is " + age + " years old.";
	}
	
	public double dosage() {
		return 600.0;
	}
	
	public double bmi(double heightInMeters, double weightInKilograms) {
		double bmi;
		bmi =  weightInKilograms / (heightInMeters * heightInMeters);
		return bmi;
	}
	
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {
		double bmi = 0;
		if (weightUnits.equals("lbs") && heightUnits.equals("in")) {
			bmi = weight / (height * height) * 703 ;
		}
		if (weightUnits.equals("stone") && heightUnits.equals("cm")) {
			weight = weight * 14;
			height = height * 0.393701;
			bmi = weight / (height * height) * 703;
		}
		return bmi;
	}

}
