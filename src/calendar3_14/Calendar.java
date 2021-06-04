package calendar3_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Calendar {
//	ArrayList<String> arrList = new ArrayList<>();
	HashMap<String, String> map = new HashMap<String, String>();
	
	public void setSchedule(){
		System.out.println("[일정 등록] 날짜를 입력하세요."); 
		
		Scanner scanner = new Scanner(System.in);
		
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("년월일을 숫자로 입력해주세요.");
		} 
		
		String sYMD = scanner.nextLine();
//		if ( map.get(sYMD) != null ) {
//			System.out.println("일정이 등록되어 있습니다.");
//			setSchedule();
//			return;
//		}
		System.out.println(map.get(sYMD));
		
		System.out.println("일정을 입력하세요.");
		
		Scanner scanner2 = new Scanner(System.in);
		String Sschedule = scanner2.nextLine();

		if (!Sschedule.equals("")) {
			map.put(sYMD, Sschedule);
			System.out.println("일정이 등록되었습니다.");

			Beginning begin = new Beginning();
			begin.prompt();
		}
		
	}
}
