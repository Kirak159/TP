package SameAmount;
import java.util.*;
public class SameAmount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int size1 = 0, size2 = 0;

        HashSet<Double> set1 = new HashSet<Double>();
        HashSet<Double> set2 = new HashSet<Double>();

        System.out.println("Enter size of the first set of numbers:");
        size1 = scanner.nextInt();

        System.out.println("Enter the first set of elements:");
        for (int i = 0; i < size1; i++) {
                set1.add(scanner.nextDouble());
        }

       
        System.out.println("Enter size of the second set of numbers:");
            size2 = scanner.nextInt();

        System.out.println("Enter the second set of elements:");
        for (int i = 0; i < size2; i++) {
                set2.add(scanner.nextDouble());
        }

        System.out.println(isSame(set1, set2));
    }

    public static boolean isSame(HashSet<Double> set1, HashSet<Double> set2) {
        return set1.size() == set2.size();
    }
    

}
