https://hack.codingblocks.com/app/contests/3567/161/problem

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long mult = 1;
		long ans = 0;
		while (num > 0) {
			long digit = num % 10;
			if (digit == 0) {
        
				digit = 5;
			}
			// System.out.println(digit + " - " + mult);
			ans = ans + digit * mult;
			mult = mult * 10;
			num = num / 10;
		}

		if (ans == 0) {
			ans = 5;
		}
		System.out.println(ans);

	}
}
    
