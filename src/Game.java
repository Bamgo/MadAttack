import java.util.Scanner;

public class Game {
	Scanner s = new Scanner(System.in);
	Man m = new Man();  // ���ΰ�

	void START(){ // ���� ����
		System.out.println("");
		System.out.println("\"��Ƴ��ƶ�, ���� !!\"");
		System.out.println("");
		System.out.println("");
		System.out.println("������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ���ο� ����   2. ���� ����");
		System.out.println("");
		String sc = s.nextLine();

		if(sc.equals("1")){  // 1 �Է��ϸ� �̸� �Է��ϰ� ���� ����
			name();
		}else{
			exit();
		}
	}

	void exit(){  // ����
		System.out.println("");
		System.out.println("������ �����Ͽ����ϴ�.");
	}

	void name(){  // �̸� �Է�
		System.out.println("");
		System.out.println("�̸��� �Է����ּ���.");
		m.name = s.nextLine();
		System.out.println( m.name +" �� �̸����� �����ϱ�? ���� / ����");
		System.out.println( "������ �����ϸ� Ÿ��Ʋ�� ���ư��ϴ�.");
		System.out.println("");
		String sc = s.nextLine();

		if(sc.equals("����")){
			home();
		}else{
			START();
		}
	}
	
	void home() {  // �� ó�� ���� �ڸ����� �Ͼ�� �� ù �ൿ
		System.out.println("");
		System.out.println("1.ħ��   2.��   3.������  4.����");
		System.out.println("");
		String sc = s.nextLine();
		
		if(sc.equals("1")){  // ���ÿ� ���� �ϰ� ����
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
	
	void bed() {  // ħ��. �ڼ� �ð��� ���� ��
		m.bed();
	}
	
	void room() {  // ��. �ſ�, ����, ���� ��
		System.out.println("");
		System.out.println("����� �����ο� ������ ���� ���Դϴ�. ȥ�� ��⿣ ������ ������ ȥ�� ��ϴ�.");
		System.out.println("��� Ȯ���ұ��?");
		System.out.println("");
		System.out.println("1.�ſ�   2.����   3.����  4.���ư���");
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

	void outside(){  // �Ϸ� �ϰ� (��ħ�� �Ͼ�� ������ ����)
		System.out.println("");
		System.out.println("��Ÿ����� �ٻڰ� �ɾ�� ������� �����մϴ�. �׷��� ������ ���θ��� �ʽ��ϴ�. ��Ÿ����� �ð��� ��ü������ �ʽ��ϴ�.");
		System.out.println("������ �Ϸ� �����?");
		System.out.println("");
		System.out.println("1.��   2.�   3.�����ൿ  4.��");
		System.out.println("");
		String sc = s.nextLine();

		if(sc.equals("1")){  // ���ÿ� ���� �ϰ� ����
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