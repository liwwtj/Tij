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
		 * ���ﹹ���������15������list��̬�����������15������15��������15����һ���ģ�
		 * setֻ������һ��ʼ��15����
		 */
		System.out.println(set);
	}

}
