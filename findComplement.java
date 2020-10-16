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
