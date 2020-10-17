public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int num=8;
		int count=0;
		int result=0;
		while (num/2>0) {
		    result+=((num%2+1)%2)*(int)Math.pow(2,count);
		    System.out.println(result);
		    double d=num/2;
		    num=(int) Math.floor(d);
		    count++;
		}
		System.out.println(result);
	}
}
// this is slower
class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char c;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='1') {
                c='0';
            } else {
                c='1';
            }
            s=s.substring(0,i)+c+s.substring(i+1);
        }
        return Integer.parseInt(s, 2);
    }
}
