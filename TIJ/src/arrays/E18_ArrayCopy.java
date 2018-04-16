package arrays;
import static net.mindview.util.Print.*;
import java.lang.reflect.Field;
import java.util.Arrays;

public class E18_ArrayCopy {
	static void setID(BerylliumSphere bs,long value){
		try {
			Field fid  = BerylliumSphere.class.getDeclaredField("id");
			fid.setAccessible(true);
			fid.setLong(bs, value);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] a = new BerylliumSphere[4];
		Arrays.fill(a, new BerylliumSphere());
		BerylliumSphere[] b = new BerylliumSphere[4];
		print("a: "+Arrays.toString(a));
		System.arraycopy(a, 0, b, 0, a.length);
		print("b: "+Arrays.toString(b));
		
		a[1]=a[3]= new BerylliumSphere(); 
		print("a: "+Arrays.toString(a));
		print("b: "+Arrays.toString(b));
		
		setID(a[0], -1L);
		print("a: "+Arrays.toString(a));
		print("b: "+Arrays.toString(b));
	}

}
