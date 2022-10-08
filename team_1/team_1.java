// 뱀과 사다리 놀이를 구현하도록 한다. 주사위(1..6)를 던져
// Random numbe를 발생시켜 1번방에서 출발하여 100번방
// 혹은 그 이상을 방문하도록 한다. 이때 100번방을 방문하기
// 위해 몇번 주사위를 굴려야하는지 계산하는 자바
// 프로그램을 작성하라. 이때 30번을 수행하여
// 평균주사위굴림횟수를 계산하라.
import java.util.*;

public class team_1 {

    public static void main(String[] args) {
    Random random = new Random();
    
    
    int a = 0;
    int cnt = 0;
    int ran;
	int avg = 0;
	int total = 0;
    	
    for(int i = 0; i <=30; i++) {

    	while(true) {
    		ran = random.nextInt(6)+1;

    		cnt = cnt + ran;	//최종 숫자를 알려주는 것

    		a++;				//주사위 몇번 굴렸나 확인
    	
    		if(cnt == 19) {
    			cnt = 76;

    		}else if(cnt == 8) {
    			cnt = 55;
    		}else if(cnt == 32) {
    			cnt = 92;
    		}else if(cnt == 97) {
    			cnt = 59;
    		}else if(cnt == 88) {
    			cnt = 33;
    		}else if(cnt == 56) {
    			cnt = 4;
    		}
    	
    	
    		if(cnt >= 100) {
    			total = total + a;
    			break;
    			}
    	}
    	
    	}
    avg = total / 30;
	System.out.println("평균 주사위 굴린 횟수 : " + avg);
    }
}
