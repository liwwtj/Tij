package arrays;

import java.util.ArrayList;

class Banana{
	private final int id;
	Banana(int id){this.id = id;}
	public String toString(){
		return getClass().getSimpleName()+" "+id;
	}
}
class Peel<T>{
	T fruit;
	Peel(T fruit){this.fruit = fruit;}
	void peel(){System.out.println("Peeling "+fruit);}
}
public class E09_PeelBanana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Peel<Banana>[] a = new Peel<Banana>[10];不能实例化一个泛型数组
		ArrayList<Peel<Banana>> a =
				new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a.add(new Peel<Banana>(new Banana(i)));
		}
		for (Peel<Banana> p : a) {
			p.peel();
		}
	}

}
