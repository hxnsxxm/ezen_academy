
/*
 * < while���� Ư¡ >
 * - �ݺ�Ƚ���� �ľ��ϱ� ��ư�, ������ �߽��� �ɶ� ����ϸ� ȿ������
 */

/*
 * ����) 1���� 1�� �����Ͽ� ���ؼ� �� ���� 100�� �Ǳ� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class While03 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        while(sum+i<100) { // �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� �߿�, if(sum<100) break;
            sum += i;   // sum = sum + i;
            
            System.out.println("1���� " + i + "���� ���� ��: " + sum);
            i++;
        }
        System.out.println("sum: " + sum);
    }
}
