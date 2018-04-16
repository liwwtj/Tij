package arrays;
import static net.mindview.util.Print.*;
import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 50);
		print("i: "+Arrays.toString(i));
		print("j: "+Arrays.toString(j));
		System.arraycopy(i, 0, j, 0, i.length);
		print("j: "+Arrays.toString(j));
		
		Integer[] u = new Integer[10];
		Integer[] v = new Integer[5];
		Arrays.fill(u, 47);
		Arrays.fill(v, 50);
		print("u: "+Arrays.toString(u));
		print("v: "+Arrays.toString(v));
		System.arraycopy(v,0,u,0,v.length);
		print("u: "+Arrays.toString(u));
	}

}
