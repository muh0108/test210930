import java.util.Calendar;

public class Salutation {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int Hour = cal.get(Calendar.HOUR_OF_DAY);
		int Minute = cal.get(Calendar.MINUTE);
		System.out.println("현재 시간은 " + Hour + "시 " + Minute + "분입니다.");

		if (4 <= Hour && Hour < 12) {   
		    System.out.println("Good Morning");
		    //4:00 = Hour(4), 11:59 ≠ Hour(12)
		} else if (12 <= Hour && Hour < 18) { 
		    System.out.println("Good Afternoon");
		    // 12:00 = Hour(12) , 17:59 ≠ Hour(18)
		} else if (18 <= Hour && Hour < 22) {
		    System.out.println("Good Evening");
		    // 18:00 = Hour(18) , 21:59 ≠ Hour(22)
		}else {
			System.out.println("Good Night");
		}
	}
}
