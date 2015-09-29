public class projecteuler5 {
	public static void main(String[] args) {
		
		float m = 1 ;
		for(int x = 1; x <= 20; x++){
			m = m*x	;
		}

		for(int z = 20; z < 2147483647 ; z++){	
		if (z % 2 == 0)
			if (z % 3 == 0)
				if (z % 4 == 0)
					if (z % 5 == 0)
						if (z % 6 == 0)
							if (z % 7 == 0)
								if (z % 8 == 0)
									if (z % 9 == 0)
										if (z % 10 == 0)
											if (z % 11 == 0)
												if (z % 12 == 0)
													if (z % 13 == 0)
														if (z % 14 == 0)
															if (z % 15 == 0)
																if (z % 16 == 0)
																	if (z % 17 == 0)
																		if (z % 18 == 0)
																			if (z % 19 == 0)
																				if (z % 20 == 0)
																					System.out.println(z);
		}
	}
}