package zad7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
		System.out.println(symmetricDifference(set1, set2));

	}
	
	public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
		Set<T> symDif = new HashSet();
		Set<T> set1Copy = new HashSet(set1);
		set1Copy.removeAll(set2);
		set2.removeAll(set1);
		symDif.addAll(set1Copy);
		symDif.addAll(set2);
		return symDif;
	}

}
