import java.util.Random;
import java.util.Scanner;


public class MadAttack {
	// ��Ƴ��ƶ�, ����!!
}

class Man{

	Scanner s = new Scanner(System.in);
	
	String name;

	int strength = 10; // �ٷ�
	int intellect = 10; // ����
	int grace = 10; // ��ǰ
	int charm = 10; // �ŷ�
	int ethicality = 5; // ������
	int appraisal;  //��
	int madness = 10; // ������
	int health = 10; // ü��
	
	String attitude = "mad";  // �µ�
	
	int time = 360; 
	int day = 1;

	void info(){   // ������
		
		appraisal  = ( strength + intellect + grace + charm + ethicality + madness);

		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println( "��¥ : " + day + "��" );
		int hour = time / 60;
		int min = time % 60 ;
		System.out.println( "�ð� : " + hour + "��" + min + "��" );
		System.out.println("");
		System.out.println( "�̸� : " + name );
		System.out.println("�ٷ� : " + strength);
		System.out.println("����  : " + intellect);
		System.out.println("��ǰ  : " + grace);
		System.out.println("�ŷ�  : " + charm);
		System.out.println("������  : " + ethicality);
		System.out.println("������  : " + madness);
		System.out.println("�� ��  : " + appraisal);
		System.out.println("");
		System.out.println("���� : " + money);
		System.out.println("ü��  : " + health);
		System.out.println("-------------------------------");
		System.out.println("");
	}

	int money = 1000000;
	
	void bed() {  // ��
		System.out.println("");
		System.out.println("�󸶳� �ڰڽ��ϱ�?");
		System.out.println("1.1�ð�   2.2�ð�   3.4�ð�   4.6�ð�   5.10�ð�");
		String sc = s.nextLine();
		System.out.println("");
		
		if(sc.equals("1")) {
			System.out.println("");
			System.out.println("1�ð� ���� ��ħ�Ͽ����ϴ�.");
			time += 60;
			System.out.println("");
		}else if(sc.equals("2")) {
			System.out.println("");
			System.out.println("2�ð� ���� ��ħ�Ͽ����ϴ�.");
			time += 120;
			System.out.println("");
		}else if(sc.equals("3")) {
			System.out.println("");
			System.out.println("4�ð� ���� ��ħ�Ͽ����ϴ�.");
			time += 240;
			System.out.println("");
		}else if(sc.equals("4")) {
			System.out.println("");
			System.out.println("6�ð� ���� ��ħ�Ͽ����ϴ�.");
			time += 360;
			System.out.println("");
		}else if(sc.equals("5")) {
			System.out.println("");
			System.out.println("������ ���� ���� �ʽ��ϴ� !!");
			System.out.println("");
			System.out.println("- �������� ���������ϴ�.");
			madness --;
			System.out.println("-- ���� ���� ü���� ���������ϴ�.");
			health--; health--;
			System.out.println("+ ��ũ��Ŭ�� ���� ����̰� �ö����ϴ�.");
			System.out.println("");
			time += 600;
		}
		
		time();
	}
	
	void mirror() {  // �ڱ� ���� Ȯ��. ���� ��� ���� ��� �ൿ���� ����
		System.out.println("");
		System.out.println("���� ������ �Ӹ����� �� ������ ���� ������ Ŀ�ٶ� ���� �ſ��Դϴ�.");
		System.out.println("�����ϰ� �ۿ���, ������ ����� �״�� ���߰� �ֽ��ϴ�.");
		System.out.println("");
		System.out.println("1.��� ���̴��� Ȯ���ϱ�   2.�µ� ���ϱ�   3.���ư���");
		System.out.println("");
		String sc = s.nextLine();
		
		if(sc.equals("1")){  
			System.out.println("");
			System.out.println("������ Ű�� �뷫 180cm �̻�(����. �ƹ�ư ����)�̸� �Ӹ���� �ʰ����� �� �����Ǿ� �ֽ��ϴ�.");
			System.out.println("������ ��Ʈ�� ���� ���� ������ �뺯�ϴ� �� �մϴ�.");
			System.out.println("");
		}else if(sc.equals("2")){
			System.out.println("");
			System.out.println("������ �⺻������ ��ο��� �δ��ϸ� ������ �µ��� ���մϴ�. �װ��� �����Դϴ�.");
			System.out.println("�׷��� ��쿡 ���� �ٸ� �µ��� �����ϴ� �͵� ������ �� ���� �ֽ��ϴ�.");
			System.out.println("�⺻������ � �µ��� ���ұ��?");
			System.out.println("");
			System.out.println("1.����������  2.�跫��������  3.��ȸ��������  4.ģ����������");
			System.out.println("");
			String c = s.nextLine();
			if(c.equals("1")) {
				System.out.println("");
				System.out.println("������ �翬�����Ե� ���������� �µ��� ���ϱ�� �����Ͽ����ϴ�.");
				System.out.println("������ ��� ����鿡�� '����������' �� ���Դϴ�.");
				System.out.println("");
				System.out.println("+ �������� �ö󰬽��ϴ�.");
				System.out.println("");
				madness++;
				System.out.println("");
				attitude = "mad";
			}else if(c.equals("2")) {
				System.out.println("");
				System.out.println("������ �跫�������� �µ��� ���ϱ�� �����Ͽ����ϴ�.");
				System.out.println("������ ��� ����鿡�� �ڱ� �ڽ��� �����, ������ ��� ����� ���̷� �� ���Դϴ�.");
				System.out.println("");
				System.out.println("- �������� ���������ϴ�.");
				System.out.println("");
				madness--;
				intellect++;
				attitude = "plan";
			}else if(c.equals("3")) {
				System.out.println("");
				System.out.println("������ ��ȸ�������� �µ��� ���ϱ�� �����Ͽ����ϴ�.");
				System.out.println("������ ������ ����� �ֺ� ����鿡�� ��ȸ�ϰ� �ǵ������� �־����� 'ô'�� ���Դϴ�.");
				System.out.println("");
				System.out.println("- �������� ���������ϴ�.");
				System.out.println("");
				madness--;
				grace++;
				attitude = "regret";
			}else if(c.equals("4")) {
				System.out.println("");
				System.out.println("������ ģ���������� �µ��� ���ϱ�� �����Ͽ����ϴ�.");
				System.out.println("������ ��� ����鿡�� ģ���ϰ� ���ϰ� �ں� ��Ǯ ���Դϴ�.");
				System.out.println("������ �ڽ��� ��ü���� �ǽ��ϰ� �ֽ��ϴ�.");
				System.out.println("");
				System.out.println("--- �������� ���������ϴ�.");
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
	
	void closet() {  // ���� ���� ����(������Ʈ ����)
		
	}
	
	void drawer() {  // �����ϴ� �� �ʼ�ǰ �������
		
	}
	
	void work() {
		
	}
	
	void exercise() {
		
	}

	void Free_action(){  // �����ൿ

	}
	
	void time() {  // �ð� �帧
		if(time > 1440){  // ���� 1440���� ������ �Ϸ� ������
			System.out.println("");
			System.out.println("�Ϸ簡 �������ϴ�.");
			day++;
			System.out.println("������ "+day+"���Դϴ�.");
			time = time - 1440;
			System.out.println("");
		}
	}
	
	void ending(){  // ���� �б�

	}
}