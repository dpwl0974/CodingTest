import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, x1, y1, r1, x2, y2, r2, res, d;
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();
            
            d = (int)(Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2)));

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                res = -1;
            }
            else if ( d < Math.pow(r2-r1, 2) || d > Math.pow(r2+r1, 2)) {
                res = 0; 
            }
            else if (d == Math.pow(r2-r1, 2) || d == Math.pow(r2+r1, 2)) {
                res = 1;
            } 
            else {
                res = 2;
            }
            System.out.println(res);
        }
    }
}