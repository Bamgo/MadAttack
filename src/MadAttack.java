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
	
	String attitude = "mad";  // 태도
	
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
		System.out.println("");
		System.out.println("얼마나 자겠습니까?");
		System.out.println("1.1시간   2.2시간   3.4시간   4.6시간   5.10시간");
		String sc = s.nextLine();
		System.out.println("");
		
		if(sc.equals("1")) {
			System.out.println("");
			System.out.println("1시간 동안 취침하였습니다.");
			time += 60;
			System.out.println("");
		}else if(sc.equals("2")) {
			System.out.println("");
			System.out.println("2시간 동안 취침하였습니다.");
			time += 120;
			System.out.println("");
		}else if(sc.equals("3")) {
			System.out.println("");
			System.out.println("4시간 동안 취침하였습니다.");
			time += 240;
			System.out.println("");
		}else if(sc.equals("4")) {
			System.out.println("");
			System.out.println("6시간 동안 취침하였습니다.");
			time += 360;
			System.out.println("");
		}else if(sc.equals("5")) {
			System.out.println("");
			System.out.println("광공은 늦잠 자지 않습니다 !!");
			System.out.println("");
			System.out.println("- 광공력이 내려갔습니다.");
			madness --;
			System.out.println("-- 잠을 설쳐 체력이 떨어졌습니다.");
			health--; health--;
			System.out.println("+ 다크써클이 생겨 퇴폐미가 올랐습니다.");
			System.out.println("");
			time += 600;
		}
		
		time();
	}
	
	void mirror() {  // 자기 외형 확인. 공략 대상에 따라 어떻게 행동할지 선택
		System.out.println("");
		System.out.println("성인 남성이 머리부터 발 끝까지 보일 정도의 커다란 전신 거울입니다.");
		System.out.println("깨끗하게 닦여서, 광공의 모습을 그대로 비추고 있습니다.");
		System.out.println("");
		System.out.println("1.어떻게 보이는지 확인하기   2.태도 정하기   3.돌아간다");
		System.out.println("");
		String sc = s.nextLine();
		
		if(sc.equals("1")){  
			System.out.println("");
			System.out.println("광공의 키는 대략 180cm 이상(넘음. 아무튼 넘음)이며 머릿결과 옷가지는 잘 정리되어 있습니다.");
			System.out.println("빳빳한 수트의 각이 그의 성격을 대변하는 듯 합니다.");
			System.out.println("");
		}else if(sc.equals("2")){
			System.out.println("");
			System.out.println("광공은 기본적으로 모두에게 싸늘하며 강경한 태도를 취합니다. 그것이 광공입니다.");
			System.out.println("그러나 경우에 따라 다른 태도를 연기하는 것도 도움이 될 때가 있습니다.");
			System.out.println("기본적으로 어떤 태도를 취할까요?");
			System.out.println("");
			System.out.println("1.광공스러운  2.계략공스러운  3.후회공스러운  4.친절공스러운");
			System.out.println("");
			String c = s.nextLine();
			if(c.equals("1")) {
				System.out.println("");
				System.out.println("광공은 당연스럽게도 광공스러운 태도를 취하기로 결정하였습니다.");
				System.out.println("광공은 모든 사람들에게 '광공스럽게' 굴 것입니다.");
				System.out.println("");
				System.out.println("+ 광공력이 올라갔습니다.");
				System.out.println("");
				madness++;
				System.out.println("");
				attitude = "mad";
			}else if(c.equals("2")) {
				System.out.println("");
				System.out.println("광공은 계략공스러운 태도를 취하기로 결정하였습니다.");
				System.out.println("광공은 모든 사람들에게 자기 자신을 숨기고, 마음에 드는 사람을 속이려 들 것입니다.");
				System.out.println("");
				System.out.println("- 광공력이 내려갔습니다.");
				System.out.println("");
				madness--;
				intellect++;
				attitude = "plan";
			}else if(c.equals("3")) {
				System.out.println("");
				System.out.println("광공은 후회공스러운 태도를 취하기로 결정하였습니다.");
				System.out.println("광공은 모질게 굴어온 주변 사람들에게 참회하고 의도적으로 멀어지는 '척'할 것입니다.");
				System.out.println("");
				System.out.println("- 광공력이 내려갔습니다.");
				System.out.println("");
				madness--;
				grace++;
				attitude = "regret";
			}else if(c.equals("4")) {
				System.out.println("");
				System.out.println("광공은 친절공스러운 태도를 취하기로 결정하였습니다.");
				System.out.println("광공은 모든 사람들에게 친절하게 대하고 자비를 베풀 것입니다.");
				System.out.println("광공은 자신의 정체성을 의심하고 있습니다.");
				System.out.println("");
				System.out.println("--- 광공력이 내려갔습니다.");
				System.out.println("");
				madness--;
				madness--;
				madness--;
				ethicality++;
				charm++;
				attitude = "kind";
			}
		}else if(sc.equals("3")){
			
		}
	}
	
	void closet() {  // 복장 변경 가능(업데이트 예정)
		
	}
	
	void drawer() {  // 공략하는 데 필수품 담겨있음
		
	}
	
	void work() {
		
	}
	
	void exercise() {
		
	}

	void Free_action(){  // 자유행동

	}
	
	void time() {  // 시간 흐름
		if(time > 1440){  // 만약 1440분이 지나면 하루 지나감
			System.out.println("");
			System.out.println("하루가 지났습니다.");
			day++;
			System.out.println("오늘은 "+day+"일입니다.");
			time = time - 1440;
			System.out.println("");
		}
	}
	
	void ending(){  // 엔딩 분기

	}
}