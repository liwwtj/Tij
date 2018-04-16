package arrays;
import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Collections;

import net.mindview.*;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;
public class E23_ArraySort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator<Integer> gen = 
				new RandomGenerator.Integer(1000);
		Integer[] a = Generated.array(new Integer[25], gen);
		print("Unsorted array: "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		print("Sorted array: "+ Arrays.toString(a));
 		
	}

}
