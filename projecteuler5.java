public class projecteuler5 {
	public static void main(String[] args) {
		
		for(int z = 1; z < 2147483647; z++) {
			boolean valid = true;
			for (int i = 2; i <= 20; i++) {
				if (valid == true)
					if (z % i != 0)
						valid = false;
			}
			if (valid == true)
				System.out.println(z);
		}
	}
}