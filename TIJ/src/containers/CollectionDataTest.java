package containers;

import java.util.LinkedHashSet;
import java.util.Set;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

class Government implements Generator<String>{
	String[] foundation = ("strange women lying in ponds "+
			"distributing swords is no basis for a system of "+
			"government").split(" ");
	private int index;
	public String next(){return foundation[index++];}
}
public class CollectionDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<>(
				new CollectionData<String>(new Government(),15));
		set.addAll(CollectionData.list(new Government(), 15));
		/*
		 * 这里构造器添加了15个对象，list静态方法又添加了15个，这15个和上面15个是一样的，
		 * set只保留了一开始的15个。
		 */
		System.out.println(set);
	}

}
