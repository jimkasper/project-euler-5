public class projecteuler5 {
	public static void main(String[] args) {
		
		int answer = 0;
		/* 
			optimization: initialize x to 20 and increment by 20
						this has the effect of only iteratiing multiples of 20
		*/
		
		for(int x = 20; answer == 0; x = x+20) {
			boolean isDivisibleByAll = true;
			/* 
				optimization: initialize i to 10
							this can be done because any number that is a multiple of 11-20
				will also be a multiple of 1-10
			*/
			for (int i = 11; i <= 20; i++) {
					if (x % i != 0){
						isDivisibleByAll = false;
				}
			}
			if (isDivisibleByAll){
				answer = x;
				
				
			}
		}
		System.out.println(answer);
	}
}
