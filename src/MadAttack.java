import java.util.Random;
import java.util.Scanner;


public class MadAttack {
	// 살아남아라, 광공!!
}

class Man{

	Scanner s = new Scanner(System.in);
	
	String name;

	int strength = 10; // 근력
	int intellect = 10; // 지력
	int grace = 10; // 기품
	int charm = 10; // 매력
	int ethicality = 5; // 도덕성
	int appraisal;  //평가
	int madness = 10; // 광공력
	int health = 10; // 체력
	
	int time = 360; 
	int day = 1;

	void info(){   // 정보란
		
		appraisal  = ( strength + intellect + grace + charm + ethicality + madness);

		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println( "날짜 : " + day + "일" );
		int hour = time / 60;
		int min = time % 60 ;
		System.out.println( "시간 : " + hour + "시" + min + "분" );
		System.out.println("");
		System.out.println( "이름 : " + name );
		System.out.println("근력 : " + strength);
		System.out.println("지력  : " + intellect);
		System.out.println("기품  : " + grace);
		System.out.println("매력  : " + charm);
		System.out.println("도덕성  : " + ethicality);
		System.out.println("광공력  : " + madness);
		System.out.println("총 평가  : " + appraisal);
		System.out.println("");
		System.out.println("현금 : " + money);
		System.out.println("체력  : " + health);
		System.out.println("-------------------------------");
		System.out.println("");
	}

	int money = 1000000;
	
	void bed() {  // 잠
		System.out.println("얼마나 자겠습니까?");
		System.out.println("1.1시간   2.2시간   3.4시간   4.6시간   5.10시간");
		String sc = s.nextLine();
		System.out.println("");
		
		if(sc.equals("1")) {
			System.out.println("1시간 동안 취침하였습니다.");
			time += 60;
			System.out.println("");
		}else if(sc.equals("2")) {
			System.out.println("2시간 동안 취침하였습니다.");
			time += 120;
			System.out.println("");
		}else if(sc.equals("3")) {
			System.out.println("4시간 동안 취침하였습니다.");
			time += 240;
			System.out.println("");
		}else if(sc.equals("4")) {
			System.out.println("6시간 동안 취침하였습니다.");
			time += 360;
			System.out.println("");
		}else if(sc.equals("5")) {
			System.out.println("광공은 늦잠 자지 않습니다 !!");
			System.out.println("");
			System.out.println("- 광공력이 떨어졌습니다.");
			madness --;
			System.out.println("-- 잠을 설쳐 체력이 떨어졌습니다.");
			health--; health--;
			System.out.println("+ 다크써클이 생겨 퇴폐미가 올랐습니다.");
			System.out.println("");
			time += 600;
			
		}
		
		if(time > 1440){  // 만약 1440분이 지나면 하루 지나감
			System.out.println("하루가 지났습니다.");
			day++;
			System.out.println("오늘은 "+day+"일입니다.");
			time = time - 1440;
			System.out.println("");
		}
	}

	void Free_action(){  // 자유행동

	}
	
	
	void ending(){  // 엔딩 분기

	}
}