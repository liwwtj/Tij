package arrays;

public class E01_ArrayInitialization {
	static void hide(BerylliumSphere[] s){
		System.out.println("Hiding "+s.length+" sphere(s)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hide( new BerylliumSphere[]{ new BerylliumSphere(),
				new BerylliumSphere()});
		//hide({new BerylliumSphere()});�����������ע���������ǷǷ���
		//�ۼ���ʼ����
		BerylliumSphere[] d = {new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere()};
		hide(d);
		//��̬�ľۼ���ʼ���������������Ƕ���ģ�
		BerylliumSphere[] a = new BerylliumSphere[]{
				new BerylliumSphere(),new BerylliumSphere()};
		hide(a);
		}
	}


