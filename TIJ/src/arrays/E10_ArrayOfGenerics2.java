package arrays;

import java.util.ArrayList;
import java.util.List;

public class E10_ArrayOfGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<List<String>> ls =
				new ArrayList<>();
		ls.add(new ArrayList<String>());
		ls.get(0).add("Array of Generics");
		System.out.println(ls.toString());
	}

}
