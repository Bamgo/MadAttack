import java.util.Random;



public class MadAttack {
	// ��Ƴ��ƶ�, ����!!

}



class Man{

	String name;

	int strength = 1; // �ٷ�
	int intellect = 1; // ����
	int grace = 1; // ��ǰ
	int charm = 1; // �ŷ�
	int ethicality = 1; // ������
	int appraisal;  //��
	int madness = 1; // ������

	void info(){   // ������
		appraisal  = ( strength + intellect + grace + charm + ethicality+madness);

		System.out.println("-------------------------------");
		System.out.println( "�̸� : " + name );
		System.out.println("�ٷ� : " + strength);
		System.out.println("����  : " + intellect);
		System.out.println("��ǰ  : " + grace);
		System.out.println("�ŷ�  : " + charm);
		System.out.println("������  : " + ethicality);
		System.out.println("������  : " + madness);
		System.out.println(" ���� : " + money);
		System.out.println("�� ��  : " + appraisal);
		System.out.println("-------------------------------");
	}

	int money = 100000;

	
	

	void Free_action(){  // �����ൿ
		
	}
	
	
	void ending(){  // ���� �б�

	}
}