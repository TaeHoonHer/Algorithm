// ��� ��ٸ� ���̸� �����ϵ��� �Ѵ�. �ֻ���(1..6)�� ����
// Random numbe�� �߻����� 1���濡�� ����Ͽ� 100����
// Ȥ�� �� �̻��� �湮�ϵ��� �Ѵ�. �̶� 100������ �湮�ϱ�
// ���� ��� �ֻ����� �������ϴ��� ����ϴ� �ڹ�
// ���α׷��� �ۼ��϶�. �̶� 30���� �����Ͽ�
// ����ֻ�������Ƚ���� ����϶�.
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

    		cnt = cnt + ran;	//���� ���ڸ� �˷��ִ� ��

    		a++;				//�ֻ��� ��� ���ȳ� Ȯ��
    	
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
	System.out.println("��� �ֻ��� ���� Ƚ�� : " + avg);
    }
}
