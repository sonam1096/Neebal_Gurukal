package com.gurukul.day12;

public class NQueen {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 0, 1, 2, 3 };
	nQueen(arr, 0);

    }

    public static boolean check(int arr[], int r) {
	for (int i = 0; i < r; i++) {
	    if (arr[i] == arr[r] || Math.abs(r - i) == Math.abs(arr[i] - arr[r])) {
		return false;
	    }
	}
	return true;
    }

    public static void nQueen(int arr[], int r) {
	for (int c = 0; c < arr.length; c++) {
	    arr[r] = c;
	    if (check(arr, r)) {
		if (r + 1 < arr.length) {
		    nQueen(arr, r + 1);
		} else {
		    for (int i = 0; i < arr.length; i++) {
			System.out.print("(" + i + ", " + arr[i] + ")" + ", ");
		    }
		    System.out.println();
		}
	    }
	}
    }
}
