package hello.java;

public class Arraycopy {

	public static void main(StringBuffer[] args) {
		int array[] = {1,5,8,9,2,3,4,6,7};
		int array1[] = new int [array.length];
		for(int i=0;i<array.length;i++) {
			array1[i] = array[i];
		}
		System.out.println("Original Element:");
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		}
		System.out.println("Element of new array:");
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
			
		}
	}

}
