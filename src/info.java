
public class info {
	String name;
	String country;
	int age;
	
	public info(String in_name, String in_country, int in_age) {
		this.name=in_name;
		this.country=in_country;
		this.age=in_age;
	}
	
	public void play() {
		//play a beep sound
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
	
	public void show_details() {
		//to show all the information of the class
		System.out.println(this.name +"\n"+this.country+"\n"+this.age);
	}

}
