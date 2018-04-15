package arrays;

import static net.mindview.util.Print.print;

import java.util.Locale;

public class E04_threeDDoubleArray {
	public static double[][][] threeDDoubleArray(
			int xLen,int yLen,int zLen,double valStart,double valEnd){
	double[][][] array = new double[xLen][yLen][zLen];
	double increment = (valEnd-valStart)/(xLen*yLen*zLen);
	double val = valStart;
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			for (int j2 = 0; j2 < array.length; j2++) {
				array[i][j][j2] = val;
				val+= increment;
			}
		}
	}
	return array;
}
	public static void printArray(double[][][] array){
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			for (int j2 = 0; j2 < array.length; j2++) {
				System.out.printf(Locale.US,"%.2f ",array[i][j][j2]);
			}
		}
		print();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][][] threeD = threeDDoubleArray(4, 6, 8, 46.0, 99.0);
		printArray(threeD);
	}

}
