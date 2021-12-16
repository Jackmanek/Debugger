
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(8));

	}
	public static int factorial(int num){
		
		if(num<0){
			System.out.println("Error no se puede, factorizar numeros menores a 0");
			
			return -1;
		}
		if(num==0 && num==1){
			
			return 1;
		}
		
		int resultado=num;
		
		for(int i=(num-1); i>1; i--){
			
			resultado=resultado*i;
		}
		
		return resultado;
		
	}

}
