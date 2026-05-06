/**

        * File: Lesson 5.4 - Array, split, swapping

        * Author: Nithin.A

        * Date Created: mahy 5th, 2026

        * Date Last Modified: Mmay6th, 2026

        */


public class PracticeProblem {

	public static void main(String args[]) {
	
	

	}
	public static void stringSwap(String[] arr, int num, int num2){
	String temp = arr[num];
	arr[num] = arr[num2];
	arr[num2] = temp;
	}

	public static void reverse(int[] arr){
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++){
			temp[i] = arr[(arr.length - 1) - i];
		}
		for (int i = 0; i < arr.length; i++){
			arr[i] = temp[i];
		}
	}

	// public static String[] toWordArray(String var){
	// 	// int count = 0;
	// 	// for (int i = 0; i < var.length(); i++){
	// 	// 	if (var.substring(i, i + 1).equals(" ")){
	// 	// 		count++;
	// 	// 	}
	// 	// }
	// 	// String[] arr = new String[count + 1];
	// 	// int start = 0;
	// 	// int numOfWords = 0;
	// 	// for (int i = 0; i < var.length(); i++){
	// 	// 	if (var.substring(i, i + 1).equals(" ")){
	// 	// 		arr[numOfWords] = var.substring(start, i);
	// 	// 		numOfWords++;
	// 	// 		start = i + 1;
	// 	// 	}
			
	// 	// }
	// 	// arr[numOfWords] = var.substring(start);
	// 	// return arr;

	// String[] arr = var.split(" +");
    // return arr;
	
	// }
	public static void toWordArray(String words){
		String[] arr = words.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i].equals("")){
				count++;
			}
		}
		String[] output = new String[arr.length - count];
		int idx = 0;
		for (int i = 0; i < output.length; i++){
			if (!arr[i].equals("")){
				output[i] = arr[idx];
				idx++;
			}
			idx++;
		}
	}
	



}
