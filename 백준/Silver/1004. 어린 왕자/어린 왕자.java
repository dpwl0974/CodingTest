import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int count  = 0;
            
            int n = sc.nextInt();
            for(int j=0; j<n; j++){
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();

                int d1 = (int)(Math.pow(cx-x1, 2) + (int)Math.pow(cy-y1, 2));
                int d2 = (int)(Math.pow(cx-x2, 2) + (int)Math.pow(cy-y2, 2));

                if ((d1 < r*r || d2 < r*r) && (!(d1 < r*r && d2 < r*r))) {
                    count++;
                }
            }
        System.out.println(count);  
        }      
    }
}