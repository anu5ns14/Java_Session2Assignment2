
public class PrimeNumbers {
	public static void main(String[] args) {
		
		
		for (int i=1; i<=100;i++){
			
			if(i == 1){
				
				continue;
			}
			
			else{
				
				int j = 2;
				boolean flag = false;
				while (j<i){
					if (i%j == 0){
						flag = true;
						break;
					}
					else{
						j++;
					}
				}
				
				if (!flag){
					System.out.println(i+ " is prime no");
				}
			}
		}
	}
}
