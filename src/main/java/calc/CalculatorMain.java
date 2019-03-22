package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		if(b==0) {
			return 0;
		}
		return a/b;
	}
	public int abs(int a) {
		int b=0;
		if (a>=0) {
			b=a;
		}
		else {
			b=-a;
		}
		return b;
	}
<<<<<<< HEAD
=======
	
	public int ars(int a) {
		return a*a;
	}
	
	public double sqrt(int x, int y){
		double[] arr = new double[y];
		if(y >0){
			arr = sc(y);
		}
		int s = sq(x);
		
		return sb(x, s, arr);

	}
	/**
	 * ��������λ
	 */
	public static int sq(int x){
		if( x == 1){
			return 1;
		}
		int tmp = 0;
		for(int i=1;i<=x/2+1;i++){
			if(i*i == x){
				tmp = i;
				break;
			}
			if(i*i > x){
				tmp = i-1;
				break;
			}
		}
		return tmp;
	}
	
	/**
	 * ����Ҫ������λС��
	 */
	public static double[] sc(int y){
		double[] arr = new double[y];
		int num = 0;
		while(num != y){
			double f = 1;
			for(int i=0;i<=num;i++){
				f = f*10;
			}
			arr[num] = 1/f;
			num++;
		}
		return arr;
	}
	
	/**
	 * ������
	 */
	public static double sb(int x, double t, double[] arr){
		double tmp = t;
		for(int p=0;p<arr.length;p++){
			if(p>0){
				t = tmp;
			}
			for(int i=1;i<=9;i++){
				tmp = i*arr[p]+t;
				if(tmp*tmp == x){
					return tmp;
				}
				if(tmp*tmp >x){
					BigDecimal c1 = new BigDecimal(Double.toString(tmp));
					BigDecimal c2 = new BigDecimal(Double.toString(arr[p]));
					tmp = c1.subtract(c2).doubleValue();
					break;
				}
			}
		}
		return tmp;
	}
>>>>>>> 63806d44b1d968fea20c286f66c435428f48fa17
}
