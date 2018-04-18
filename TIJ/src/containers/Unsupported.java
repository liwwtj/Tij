package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Unsupported {
	static void test(String msg,List<String> list){
			System.out.println("--- "+msg+" ---");
			Collection<String> c  = list;
			Collection<String> subList = list.subList(1, 8);
			
			Collection<String> c2  = new ArrayList<>(subList);
			try {
				c.removeAll(c2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("removeAll(): "+ e);
			}
			try {
				c.retainAll(c2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("retainAll(): "+ e);
			}
			try {
				c.clear();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("clear(): "+ e);
			}
			try {
				c.add("X");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("add(): "+ e);
			}
			try {
				c.addAll(c2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("addAll(): "+ e);
			}
			try {
				c.remove("C");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("remove(): "+ e);
			}
			try {
				list.set(0, "X");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("List.set(): "+ e);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		//这里是一个新的利用list元素填充的ArrayList
		test("Modifiable Copy",new ArrayList<String>(list));
		test("Arrays.asList()",list);
		//通过不可修改的方法创建会抛出异常的容器
		test("unmodifiableList()",Collections.unmodifiableList(new ArrayList<String>(list)));
	}
	
	}


