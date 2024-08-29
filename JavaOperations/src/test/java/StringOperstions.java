import org.testng.annotations.*;

import java.util.*;


public class StringOperstions {

    @Test
    public void reverseString() {
        String a = "Gowtham";
        char[] b = a.toCharArray();
        int n = b.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(b[i]);
        }

        for (int j=n-1;j>=0;j--){
            System.out.print(a.charAt(j));
        }
    }

    @Test
    public void sortArray() {

        int a[] = {1, 3, 5};
        int b[] = {2, 4, 6};
        int c[] = new int[
                a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[j + a.length] = b[j];
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for (int x = 0; x < c.length; x++)
            System.out.print(c[x]);

    }

    @Test
    public void findarray() {
        String arr[] = {"grace", "graceful",
                "disgraceful", "gracefully"};
        int n = arr.length;

        String s = arr[0];
        int len = s.length();

        String res = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {

                String stem = s.substring(i, j);
                int k = 1;
                for (k = 1; k < n; k++)

                    if (!arr[k].contains(stem))
                        break;

                if (k == n && res.length() < stem.length())
                    res = stem;
            }
        }

        System.out.println(res);
    }

    @Test
    public void testProgram() {
        String arr[] = {"grace", "graceful",
                "disgraceful", "gracefully"};
        int n = arr.length;
        String result = "";
        String s = arr[0];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                String stem = s.substring(i, j);
                int k = 1;
                for (k = 1; k < n; k++)
                    if (!arr[k].contains(stem))
                        break;
                if (k == n && result.length() < stem.length()) {
                    result = stem;
                }

            }
        }
        System.out.println(result);
    }



    @Test
    public void twosum() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {

            for(int x=0;x<n;x++){
                as[x]=prices[x];
            }
            for (int j = i + 1; j < n; j++) {
                if (as[i] > as[j]) {
                   int temp=as[i];
                    as[i]=as[j];
                    as[i]=temp;

                }
            }

        }
        for(int x:as)
        System.out.print(x);

    }

    @Test
    public void target(){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n =prices.length;
        for (int i =0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (prices[i]+prices[j]==9){
                    System.out.println(prices[i]+" "+prices[j]);
                }
            }
        }
    }


}



