package test;

import javax.swing.JOptionPane;

public class excersise1 {

	public static void main(String[] args) {
		excersise1 exr = new excersise1();
		exr.practice06();
	}

	public int[] inputNumbers(int length) {
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("입력"));
		}
		return arr;
	}
	public void practice06(){
		int k = Integer.parseInt(JOptionPane.showInputDialog("입력"));
		int[] scoreArray = inputNumbers(k);

		int n = Integer.parseInt(JOptionPane.showInputDialog("입력"));
		int[] scoreArray1 = inputNumbers(n);
		
		for(int i=0; i<n; i++) {
			boolean hasSame = false;
			for(int v=0; v<k; v++) {
				if (scoreArray1[i]==scoreArray[v]) {
					System.out.println("1");
					hasSame = true;
					break;
				}
			}
			if(hasSame == false) {
				System.out.println("0");
			}
		}
	}
}