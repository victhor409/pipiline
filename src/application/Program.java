package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List <Integer>list = Arrays.asList(3,4,5,10,7);
		
		//o Stream recebe todos os valores da lista acima e multiplica por 10, esses valores sao guardados na variave "x"
		Stream<Integer>st1 = list.stream().map(x->x*10);
		System.out.println(Arrays.asList(st1.toArray()));
		
		List<Integer> newList = list.stream()
				.filter(x-> x%2 == 0)
				.map(x-> x*10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
		
	}

}
