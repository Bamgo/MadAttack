import java.util.Scanner;



public class Game {

		Scanner s = new Scanner(System.in);

		Man m = new Man();

		int day;

		int month;

		

		void START(){ // ���� ����

		      System.out.println("\"��Ƴ��ƶ�, ���� !!\"");

		      System.out.println("������ �����Ͻðڽ��ϱ�?");

		      System.out.println("1. ���ο� ���� 2. ���� ����");

		      String so = s.nextLine();

		      if(so.equals("1")){

		        name();

		      }else{

		    	exit();

		      }



}

		void exit(){

			System.out.println("������ �����Ͽ����ϴ�.");

		}

		void name(){

			System.out.println("�̸��� �Է����ּ���.");

			m.name = s.nextLine();

			System.out.println( m.name +" �� �̸����� �����ϱ�? Y/N");

			System.out.println( "�ƴϿ��� �����ϸ� Ÿ��Ʋ�� ���ư��ϴ�.");

			String so = s.nextLine();

			if(so.equals("Y")){

				menu();

			}else{

				START();

			}

		}

		void menu(){

			System.out.println("1.�� 2.� 3.�����ൿ 4.���� ");

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