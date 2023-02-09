package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StraemFilter {

	public static void main(String[] args) {

		List<Integer> L = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(L);

		for (int a : L) {
			if (a % 2 == 0) {
				System.out.print(" " + a);
			}

		}

		List<Integer> al = new ArrayList<>();

		al = L.stream().filter(v -> v % 2 == 0).collect(Collectors.toList());

		System.out.println("\nCollectors : ");
		System.out.println(al);

		System.out.println("With ForEach : ");

		L.stream().filter(v -> v % 2 == 0 && v > 2 && v < 9).forEach(System.out::println);
	}

}
