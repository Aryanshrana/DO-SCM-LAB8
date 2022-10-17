package MyCalcPkg;

public class Calculator {
	void addition(int a, int b) {
		int res = a + b;
		System.out.println(res);
		
	}
	void subtraction(int a,int b) {
		int r = b - a;
		System.out.println(r);
	}
	void multiplication(int a,int b) {
		int result = a*b;
		System.out.println(result);
	}
	void power(int a,int b) {
		int ans=1;
		for(int i=0;i<b;i++) {
			ans = ans*a;
		}
		System.out.println(ans);
	}
}
