
/*
 * < 2���� �ݺ��� >
 * - ��ø �ݺ���, 2�� �ݺ���
 * - �ݺ��� �ȿ�  �ݺ����� �� �ִ� ������ �ݺ���
 * - 2���� ������ �����͸� �ٷ� �� �ְ� ��
 * 
 */

public class For2D01 {
    public static void main(String[] args) {
        
        // 1�� - 2���� for��
        /*
        for(int i = 2;i<=9;i++) {
            for(int j = 1; j<=9; j++) {
                System.out.printf("%d * %d = %2d\n", i, j, i*j);
            }
            System.out.println();
        }
        */
        
        // 2�� - 2���� while��
        /*
        int i=2, j=1;
        while(i<=9) {
            j=1;
            while(j<=9) {
                System.out.printf("%d * %d = %2d\n", i, j, i*j);
                j++;
            }
            System.out.println();
            i++;
        }
        */
        
        // 3�� - 2���� do~while��
        /*
        int i=2, j=1;
        do {
            j=1;
            do {
                System.out.printf("%d * %d = %2d\n", i, j, i*j);
                j++;
            } while(j<=9);
            System.out.println();
            i++;
        } while(i<=9);
        */
        
    }
}