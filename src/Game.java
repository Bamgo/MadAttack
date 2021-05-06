import java.util.Scanner;

public class Game {
	Scanner s = new Scanner(System.in);
	Man m = new Man();  // 주인공

	void START(){ // 게임 시작
		System.out.println("");
		System.out.println("\"살아남아라, 광공 !!\"");
		System.out.println("");
		System.out.println("");
		System.out.println("게임을 시작하시겠습니까?");
		System.out.println("1. 새로운 시작   2. 게임 종료");
		System.out.println("");
		String sc = s.nextLine();

		if(sc.equals("1")){  // 1 입력하면 이름 입력하고 게임 시작
			name();
		}else{
			exit();
		}
	}

	void exit(){  // 종료
		System.out.println("");
		System.out.println("게임을 종료하였습니다.");
	}

	void name(){  // 이름 입력
		System.out.println("");
		System.out.println("이름을 입력해주세요.");
		m.name = s.nextLine();
		System.out.println( m.name +" 이 이름으로 좋습니까? ㅇㅇ / ㄴㄴ");
		System.out.println( "ㄴㄴ를 선택하면 타이틀로 돌아갑니다.");
		System.out.println("");
		String sc = s.nextLine();

		if(sc.equals("ㅇㅇ")){
			home();
		}else{
			START();
		}
	}
	
	void home() {  // 맨 처음 시작 자리이자 일어났을 때 첫 행동
		System.out.println("");
		System.out.println("1.침대   2.방   3.나간다  4.상태");
		System.out.println("");
		String sc = s.nextLine();
		
		if(sc.equals("1")){  // 선택에 따라 일과 시작
			bed();
		}else if(sc.equals("2")){
			room();
		}else if(sc.equals("3")){
			outside();
		}else if(sc.equals("4")){
			info();	
		}
		
		home();
	}
	
	void bed() {  // 침대. 자서 시간을 가게 함
		m.bed();
	}
	
	void room() {  // 방. 거울, 옷장, 선반 등
		System.out.println("");
		System.out.println("흑백의 단조로운 색상의 넓은 방입니다. 혼자 살기엔 넓지만 광공은 혼자 삽니다.");
		System.out.println("어디를 확인할까요?");
		System.out.println("");
		System.out.println("1.거울   2.옷장   3.서랍  4.돌아간다");
		System.out.println("");
		String sc = s.nextLine();
		
		if(sc.equals("1")){  
			m.mirror();
		}else if(sc.equals("2")){
			m.closet();
		}else if(sc.equals("3")){
			m.drawer();
		}else if(sc.equals("4")) {
			home();
		}
		
		room();
	}

	void outside(){  // 하루 일과 (아침에 일어나서 나오면 시작)
		System.out.println("");
		System.out.println("길거리에는 바쁘게 걸어가는 사람들이 가득합니다. 그러나 광공은 서두르지 않습니다. 길거리에서 시간을 지체하지도 않습니다.");
		System.out.println("무엇을 하러 갈까요?");
		System.out.println("");
		System.out.println("1.일   2.운동   3.자유행동  4.집");
		System.out.println("");
		String sc = s.nextLine();

		if(sc.equals("1")){  // 선택에 따라 일과 시작
			work();
		}else if(sc.equals("2")){
			exercise();
		}else if(sc.equals("3")){
			Free_action();
		}else if(sc.equals("4")){
			home();
		}
		
		outside();
	}

	void work() {
		m.work();
	}
		
		
	void exercise() {
		m.exercise();
	}
		
	void Free_action(){
		m.Free_action();
	}
	
	void info(){
		m.info();	
	}
}