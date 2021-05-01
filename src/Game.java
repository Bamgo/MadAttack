import java.util.Scanner;

public class Game {
	Scanner s = new Scanner(System.in);
	Man m = new Man();  // 주인공

	void START(){ // 게임 시작
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
		System.out.println("게임을 종료하였습니다.");
	}

	void name(){  // 이름 입력
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
	}
	
	void bed() {  // 침대. 자서 시간을 가게 함
		m.bed();
		home();
	}
	
	void room() {  // 방. 거울, 옷장, 선반 등
		
	}

	void outside(){  // 하루 일과 (아침에 일어나서 나오면 시작)
		System.out.println("1.일   2.운동   3.자유행동");
		System.out.println("");
		String sc = s.nextLine();

		if(sc.equals("1")){  // 선택에 따라 일과 시작
			work();
		}else if(sc.equals("2")){
			exercise();
		}else if(sc.equals("3")){
			Free_action();
		}
	}

	void work() {
			
	}
		
		
	void exercise() {
			
	}
		
	void Free_action(){
		m.Free_action();
		outside();
	}
	
	void info(){
		m.info();	
		home();
	}
}