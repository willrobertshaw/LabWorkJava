
public class Engineer {
	private String name;
	private int salary;
	
	public Engineer(String name, int salary){
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return getName() + "(" + getSalary() + ")";
	}
	
	public static void main(String[] args){
		Engineer e1 = new Engineer("Joe Bloggs ", 10000);
		System.out.println(e1.toString());
	}
}
