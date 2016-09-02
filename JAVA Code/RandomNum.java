import java.util.Random;


public class RandomNum {

	public static void main(String[] args) {
		Random r=new Random();
		int n[]=new int[15];
		
		for(int i=0;i<n.length;i++)
		{
			n[i]=r.nextInt(50);
		}
		for(int a:n)
		System.out.println(a);
			

	}

}
