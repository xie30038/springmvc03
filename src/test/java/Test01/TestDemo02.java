package Test01;

public class TestDemo02 {
	
	/**
	 *    *
	 *   **
	 *  ***
	 * ****  
	 * @param args
	 */
	
	public static void main(String[] args) {
		//printSan(10);
		//printLin(10);
		getSevenOnlyNum();
		
	}
	public static void printSan(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	/**
	 *    *
	 *   ***
	 *  *****
	 * *******
	 **********
	 * *******
	 *  *****
	 *   ***
	 *    *
	 */
	public static void printLin(int n) {
		for(int i=0;i<2*n-1;i++) {
			if(i<n) {
				for(int j=0;j<n-i-1;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<2*i+1;j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0;j<i-n+1;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<4*n-2*i-3;j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	/**
	 * 生成不重复的7位随机数
	 */
	public static void getSevenOnlyNum() {
		int[] arry = new int[7];
		for(int i=0;i<arry.length;i++) {
			boolean flg = true;
			while(flg) {
				arry[i] = (int) (Math.random()*36);
				for(int j=0;j<arry.length;j++) {
					if(arry[i]==arry[j]&&i!=j) {
						flg=true;
						break;
					}else {
						flg=false;
					}
				}
			}
		}
		for(int i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
