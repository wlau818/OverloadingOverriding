
public class ChildPatient extends Patient {
	
	private String name;
	private int age;
	private String parentName;
	
	public ChildPatient(String name, int age, String parentName) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.parentName = parentName;
	}
	
	public String toString() {
		return "Patient " + name + " is " + age + " years old and has parent " + parentName + ".";
	}
	
	public double dosage() {
		return 300.0;
	}

}
