package arrays;
import static net.mindview.util.Print.print;

import java.util.Arrays;



public class ArrayOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] a;
		BerylliumSphere[] b = new BerylliumSphere[5];
		
		
		print("b: " + Arrays.toString(b));
		BerylliumSphere[] c = new BerylliumSphere[4];
		for (int i = 0; i < c.length; i++) {
			if (c[i] == null) {
				c[i] = new BerylliumSphere();
			} 
		}
		BerylliumSphere[] d = {new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere()};
		//动态聚合初始化：
		a = new BerylliumSphere[]{
				new BerylliumSphere(),new BerylliumSphere()
		};
		print("a.length = "+a.length);
		print("b.length = "+b.length);
		print("c.length = "+c.length);
		print("d.length = "+d.length);
		a = d;
		print("a.length = "+a.length);
		
	}
}
