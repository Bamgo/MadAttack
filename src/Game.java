import java.util.Scanner;



public class Game {

		Scanner s = new Scanner(System.in);

		Man m = new Man();

		int day;

		int month;

		

		void START(){ // 게임 시작

		      System.out.println("\"살아남아라, 광공 !!\"");

		      System.out.println("게임을 시작하시겠습니까?");

		      System.out.println("1. 새로운 시작 2. 게임 종료");

		      String so = s.nextLine();

		      if(so.equals("1")){

		        name();

		      }else{

		    	exit();

		      }



}

		void exit(){

			System.out.println("게임을 종료하였습니다.");

		}

		void name(){

			System.out.println("이름을 입력해주세요.");

			m.name = s.nextLine();

			System.out.println( m.name +" 이 이름으로 좋습니까? Y/N");

			System.out.println( "아니오를 선택하면 타이틀로 돌아갑니다.");

			String so = s.nextLine();

			if(so.equals("Y")){

				menu();

			}else{

				START();

			}

		}

		void menu(){

			System.out.println("1.일 2.운동 3.자유행동 4.상태 ");

			String so = s.nextLine();

			if(so.equals("1")){

				work();

			}else if(so.equals("2")){

				 exercise();

			}else if(so.equals("3")){

				Free_action();

			}else if(so.equals("4")){

				info();

			}if(day>30){

				month++;  

		    	  }

		}




		void info(){

			m.info();

			menu();

		}

		

		void Free_action(){

			m.Free_action();

			day++;

			menu();

		}

		void work() {

			
		}
		
		
		void exercise() {
	
			
		}

		

}