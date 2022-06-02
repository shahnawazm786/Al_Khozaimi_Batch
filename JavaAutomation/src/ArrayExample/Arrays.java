package ArrayExample;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {900,200,700,500}; // fast in work
		int[] c=new int[4];
		System.out.println(a.length);
		System.out.println(a[0]); // show the value of 0th index
		System.out.println("Before changing value on 1st index -> "+a[1]); // show the value of 0th index
		a[1]=250;
		System.out.println("After changing valud on 1st index -> "+a[1]);
		
		int[] b=new int[5];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=70;
		b[4]=100;
		for(int i=0;i<b.length;i++) {
			System.out.println("Value of b["+i+"] => "+b[i]);
		}
		// size is 5
		// but the last index of size 5 array is 4 (size-1)
		try {
			System.out.println(b[5]);
		}
		catch(Exception ex) {
			//return;
		}
		System.out.println("A");
		 int[] a1= {900,200,700,500};
		// sorting the value array a
		int temp;
		for(int j=0;j<a1.length;j++) {
			temp=0;
			for(int k=j+1;k<a1.length;k++) {
				if(a1[k]<a1[j]) {
					temp=a1[k];
					a1[k]=a1[j];
					a1[j]=temp;
				}
			}
			}
		// 
		System.out.println("Sorting of array A");
		for(int l=0;l<a1.length;l++) {
			System.out.println(a1[l]);
		}

	}

}
