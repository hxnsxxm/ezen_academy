
/*
 *  < while���� ���� >
 *  �ʱⰪ;
 *  
 *  while(������) {
 *      ���๮;
 *      ...
 *      ������;
 *  }
 * 
 * 
 * ����1) 1���� 10���� 1�� �����ϸ鼭 ���
 * ����2) 10���� 1���� 1�� �����ϸ鼭 ���
 * ����3) 1���� 10���� 2�� �����ϸ鼭 ���
 */
public class While01 {
    public static void main(String[] args) {
        
        // 1��
        /*
        int i = 1;  // �ʱⰪ
        
        while(i <= 10) {  // ���ǽ�
            System.out.println(i + " Little Indian.");
            
            i++;  // ������, ���� ������
        }
        */
        
        // 2��
        /*
        int i = 10;
        
        while(i>0) {
            System.out.println(i + " Little Indian.");
            i--;
        }
        */
        
        // 3��
        int i = 1;
        while(i<=10) {
            System.out.println(i + "Little Indian.");
            
            i += 2;
        }
    }
}
