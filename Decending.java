import java.util.*;
import java.util.stream.Stream;

public class Decendingorder {

	public static void main(String[] args) {
		
Stream<Integer> numStream = Stream.of(1,4,5,3,9);
numStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
