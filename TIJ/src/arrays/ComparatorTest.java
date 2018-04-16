package arrays;

import static net.mindview.util.Print.print;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import net.mindview.util.Generated;

class ComptypeComparator implements Comparator<CompType>{
	public int compare(CompType o1,CompType o2){
		return (o1.j<o2.j?-1:(o1.j==o2.j?0:1));
	}
}
public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompType[] a = Generated.array(new CompType[12], CompType.generator());
		print("before sorting");
		print(Arrays.toString(a));
		Arrays.sort(a,new ComptypeComparator());
		print("after sorting");
		print(Arrays.toString(a));
	}

}
