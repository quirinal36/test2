package test;

public class ToBinary {

	public int[] toBinary(int input) {
		int[] result = new int[31];
		int i=0;
		while(input > 0) {
			result[i++] = input % 2;
			input /= 2;
		}
		return result;
	}
	
}
