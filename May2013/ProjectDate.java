
public class ProjectDate {
	private int weekNo;
	private int dayNo;
	
	public ProjectDate(){
		this.weekNo = 0;
		this.dayNo = 1;
	}
	
	public int getWeekNo(){
		return weekNo;
	}
	
	public void setWeekNo(int n){
		weekNo = n;
	}
	
	public int getDayNo(){
		return dayNo;
	}
	
	public void setDayNo(int n){
		while(n>=1 && n<=5){
			dayNo = n;
		}
	}
	
	public void advance(int n){
		while(n>0){
			dayNo += n;
			if(dayNo > 5){
				weekNo++;
			}
		}
	}
}
