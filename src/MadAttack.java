import java.util.Random;



public class MadAttack {
	// 살아남아라, 광공!!

}



class Man{

	String name;

	int strength = 1; // 근력
	int intellect = 1; // 지력
	int grace = 1; // 기품
	int charm = 1; // 매력
	int ethicality = 1; // 도덕성
	int appraisal;  //평가
	int madness = 1; // 광공력

	void info(){   // 정보란
		appraisal  = ( strength + intellect + grace + charm + ethicality+madness);

		System.out.println("-------------------------------");
		System.out.println( "이름 : " + name );
		System.out.println("근력 : " + strength);
		System.out.println("지력  : " + intellect);
		System.out.println("기품  : " + grace);
		System.out.println("매력  : " + charm);
		System.out.println("도덕성  : " + ethicality);
		System.out.println("광공력  : " + madness);
		System.out.println(" 현금 : " + money);
		System.out.println("총 평가  : " + appraisal);
		System.out.println("-------------------------------");
	}

	int money = 100000;

	
	

	void Free_action(){  // 자유행동
		
	}
	
	
	void ending(){  // 엔딩 분기

	}
}