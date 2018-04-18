package containers;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import net.mindview.util.Countries;

public class Lists {
	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;
	public static void iterManipulation(List<String> a){
		ListIterator<String> it = a.listIterator();
		it.add("47");
		it.next();
		it.remove();
		it.next();
		it.set("47");
	}
	public static void testVisual(List<String> a){
		print(a);
		List<String> b = Countries.names(25);
		print("b= "+b);
		a.addAll(b);
		a.addAll(b);
		print(a);
		
		ListIterator<String> x = a.listIterator(a.size()/2);
		x.add("one");
		print(a);
		print(x.next());
		x.remove();
		print(x.next());
		x.remove();
		print(x.next());
		x.set("47");
		print(a);
		
		x = a.listIterator(a.size());
		while(x.hasNext())
			printnb(x.previous()+" ");
		print();
		print("testVisual finished");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterManipulation(new LinkedList<String>(Countries.names(25)));
		iterManipulation(new ArrayList<String>(Countries.names(25)));
		testVisual(new LinkedList<String>(Countries.names(25)));
	}

}
