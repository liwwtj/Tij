package arrays;

class ClassParameter<T>{//参数化类
	public T[] f(T[] arg){return arg;}
}
class MethodParameter{//参数化方法
	public static <T> T[] f(T[] arg){return arg;}
}
public class ParameterizedArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ints = {1,2,3,4,5};
		Double[] doubles = {1.1,2.2,3.3,4.4,5.5};
		Integer[] ints2 = new ClassParameter<Integer>().f(ints);
		Double[] doubles2 = new ClassParameter<Double>().f(doubles);
		ints2 = MethodParameter.f(ints);
		doubles2 = MethodParameter.f(doubles);
	}

}
