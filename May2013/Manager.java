import java.util.ArrayList;


public class Manager extends Engineer {
	private ArrayList<Engineer> team;
	
	
	public Manager(String name, int salary) {
		super(name, salary);
	}
	
	public ArrayList<Engineer> getTeam(){
		return team;
	}
	
	public void setTeam(ArrayList<Engineer> team){
		this.team = team;
	}
	
	@Override
	public String toString(){
		return getName() + "" + getSalary() + "\nManages:\n" + getTeam();
	}
	
	public static void main(String[] args){
		Manager m1 = new Manager("Sue Smith ", 30000);
		Engineer e1 = new Engineer("Joe Bloggs ", 15000);
		ArrayList<Engineer> workers = new ArrayList<Engineer>(); //create new ArrayList 
		workers.add(e1);
		m1.setTeam(workers); //use m1.setTeam() to make workers = team
		
		System.out.println(m1.toString());
	}
}
