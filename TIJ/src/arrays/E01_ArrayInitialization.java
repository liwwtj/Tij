package arrays;

public class E01_ArrayInitialization {
	static void hide(BerylliumSphere[] s){
		System.out.println("Hiding "+s.length+" sphere(s)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hide( new BerylliumSphere[]{ new BerylliumSphere(),
				new BerylliumSphere()});
		//hide({new BerylliumSphere()});编译错误：类型注释在这里是非法的
		//聚集初始化：
		BerylliumSphere[] d = {new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere()};
		hide(d);
		//动态的聚集初始化在以下例子中是多余的：
		BerylliumSphere[] a = new BerylliumSphere[]{
				new BerylliumSphere(),new BerylliumSphere()};
		hide(a);
		}
	}


