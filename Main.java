import com.sun.corba.se.impl.interceptors.CDREncapsCodec;

public class Main {


    public static void main(String[] args) {

    }
     //拿硬币
//    public int minCount(int[] coins) {
//        int num = 0;
//        int n = 2;
//        for(int i = 0; i < coins.length; i++){
//            if(coins[i] % n == 0){
//                num += coins[i] / n;
//            }else{
//                num += coins[i] / n + 1;
//            }
//        }
//        return num;
//    }

//    //猜数字
//    public int game(int[] guess, int[] answer) {
//        int count = 0;
//        for(int i = 0; i < guess.length; i++){
//            if(guess[i] == answer[i]){
//                count++;
//            }
//        }
//        return count;
//    }

//数组异或操作
//    public static int xorOperation(int n, int start) {
//        int[] nums = new int[n];
//        int num = 0;
//        for(int i = 0; i < n; i++){
//            nums[i] = start + 2*i;
//        }
//        for(int i = 0; i < n; i++){
//            num ^= nums[i];
//        }
//        return num;
//    }


//    重新排列数组
//    public static int[] shuffle(int[] nums, int n) {
//        int[] ret = new int[nums.length];
//        int i = 0, j = 0;
//        while(i < nums.length){
//            ret[i] = nums[j];
//            ret[i + 1] = nums[n];
//            j++;
//            n++;
//            i += 2;
//        }
//        return ret;
//    }




//        771.宝石与石头
//        public int numJewelsInStones(String jewels, String stones) {
//            char[] ch1 = jewels.toCharArray();
//            char[] ch2 = stones.toCharArray();
//            int count = 0;
//            for(int i = 0; i < ch1.length; i++){
//                for(int j = 0; j < ch2.length; j++){
//                    if(ch1[i] == ch2[j]){
//                        count++;
//                    }
//                }
//            }
//            return count;
//        }
//        异或
//        public static int[] decode(int[] encoded, int first) {
//            int[] ret = new int[encoded.length + 1];
//            ret[0] = first;
//            for(int i = 1; i < ret.length; i++){
//                ret[i] = encoded[i - 1]^ret[i - 1];
//            }
//            return ret;
//        }
//        String s = "abcdefg";
//        int k = 2;
//        String ret = reverseLeftWords(s,k);
//        for(int i = 0; i < s.length(); i++){
//            System.out.println(ret.charAt(i));
//        }



    //左旋字符串
//    public static String reverseLeftWords(String s, int n) {
//        int len = s.length();
//        char[] ch = s.toCharArray();
//        n %= len;
//        char[] c = new char[1];
//        while(n != 0){
//            c[0] = ch[0];
//            int i = 0;
//            for(i = 0; i < len - 1; i++){
//                ch[i] = ch[i + 1];
//            }
//            ch[i] = c[0];
//            n--;
//        }
//        s = new String(ch);
//        return s;
//    }

}
