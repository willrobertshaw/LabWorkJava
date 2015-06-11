import java.util.Calendar;

public class CreditCard {
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber){
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	
	public String formatExpiryDate(){
		String expiryYearShort = Integer.toString(expiryYear).substring(2, 4);
		return String.format("%s/%s", expiryMonth, expiryYearShort);
	}
	
	public String formatFullName(){
		return firstName + " " + lastName;
	}
	
	public String formatCCNumber(){
		String[] nums = new String[4];
		for(int i=0; i<nums.length; i++){
			int idx = i*4;
			nums[i] = ccNumber.substring(idx, idx+4);
		}
		return String.format("%s %s %s %s", nums[0], nums[1], nums[2], nums[3]);
	}
	
	public boolean isValid(){
		Calendar now = Calendar.getInstance();
		
		if(now.get(Calendar.YEAR) < expiryYear || now.get(Calendar.YEAR) == expiryYear && now.get(Calendar.MONTH) + 1 < expiryMonth){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		String str1 = "Number: " + formatCCNumber();
		String str2 = "Expiration date: " + formatExpiryDate();
		String str3 = "Account holder: " + formatFullName();
		String str4 = "Is valid: " + isValid();
		
		return str1 + "\n" + str2 + "\n" + str3 + "\n" + str4;
		
	}
	public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println("Current Year is: " + now.get(Calendar.YEAR));
        System.out.println("Current Month is: " + (now.get(Calendar.MONTH) + 1));
        System.out.println();

        CreditCard cc1 = new CreditCard(2, 2013, "Bill", "Gates", "1234567891234567");
        System.out.println(cc1);
        System.out.println();
        CreditCard cc2 = new CreditCard(2, 2012, "Melinda", "Gates", "1111222233334444");
        System.out.println(cc2);
	}
}
