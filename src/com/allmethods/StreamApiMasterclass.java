package com.allmethods;

import java.util.*;
import java.util.stream.*;

public class StreamApiMasterclass {
    public static void main(String[] args) {
        
        // Setup a list of sample data
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Bob", "David", "Edward");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== INTERMEDIATE OPERATIONS ===");

        // 1. filter(Predicate) - Keeps elements that match a condition
        System.out.print("filter (names starting with B): ");
        names.stream()
             .filter(name -> name.startsWith("B"))
             .forEach(name -> System.out.print(name + " ")); // Prints: Bob Bob
        System.out.println();

        // 2. map(Function) - Transforms each element into something else
        System.out.print("map (convert to uppercase): ");
        names.stream()
             .map(name -> name.toUpperCase())
             .forEach(name -> System.out.print(name + " ")); // Prints: ALICE BOB CHARLIE...
        System.out.println();

        // 3. distinct() - Removes all duplicate elements
        System.out.print("distinct (remove duplicate Bobs): ");
        names.stream()
             .distinct()
             .forEach(name -> System.out.print(name + " ")); // Prints: Alice Bob Charlie David Edward
        System.out.println();

        // 4. sorted() - Sorts elements in natural order (or custom comparator)
        System.out.print("sorted (alphabetical): ");
        names.stream()
             .sorted()
             .forEach(name -> System.out.print(name + " ")); 
        System.out.println();

        // 5. limit(long) - Truncates the stream to not exceed a given size
        System.out.print("limit (first 2 items): ");
        names.stream()
             .limit(2)
             .forEach(name -> System.out.print(name + " ")); // Prints: Alice Bob
        System.out.println();

        // 6. skip(long) - Discards the first N elements of the stream
        System.out.print("skip (skip first 3 items): ");
        names.stream()
             .skip(3)
             .forEach(name -> System.out.print(name + " ")); // Prints: Bob David Edward
        System.out.println();

        // 7. peek(Consumer) - Performs an action on each element without changing the stream (Great for debugging!)
        System.out.print("peek (spy on elements): ");
        names.stream()
             .filter(name -> name.length() > 4)
             .peek(name -> System.out.print("[" + name + "]")) // Spies on filtered items
             .collect(Collectors.toList());
        System.out.println();

        // 8. flatMap(Function) - Flattens multiple streams/lists into a single stream
        System.out.print("flatMap (flattening nested lists): ");
        List<List<String>> nestedList = Arrays.asList(Arrays.asList("X", "Y"), Arrays.asList("Z"));
        nestedList.stream()
                  .flatMap(list -> list.stream())
                  .forEach(item -> System.out.print(item + " ")); // Prints: X Y Z
        System.out.println();


        System.out.println("\n=== TERMINAL OPERATIONS ===");

        // 9. collect(Collector) - Gathers stream results into a collection (like a List)
        List<String> collectedList = names.stream()
                                          .filter(name -> name.length() == 3)
                                          .collect(Collectors.toList());
        System.out.println("collect (names with 3 letters): " + collectedList);

        // 10. count() - Returns the total number of elements in the stream
        long totalCount = names.stream().count();
        System.out.println("count (total items): " + totalCount);

        // 11. reduce(BinaryOperator) - Combines stream elements into a single summary value
        Optional<Integer> sum = numbers.stream()
                                       .reduce((a, b) -> a + b);
        sum.ifPresent(val -> System.out.println("reduce (sum of numbers): " + val));

        // 12. forEach(Consumer) - Iterates over every element (Used in intermediate section above)
        
        // 13. min(Comparator) & max(Comparator) - Finds the smallest or largest item
        Optional<Integer> maxNum = numbers.stream().max((a, b) -> a.compareTo(b));
        maxNum.ifPresent(val -> System.out.println("max (largest number): " + val));

        // 14. findFirst() & findAny() - Retrieves an element from the stream
        Optional<String> firstElement = names.stream().findFirst();
        firstElement.ifPresent(val -> System.out.println("findFirst (first element): " + val));

        // 15. Matchers: anyMatch, allMatch, noneMatch - Boolean check across elements
        boolean matchesAny = names.stream().anyMatch(name -> name.equals("Alice"));
        boolean matchesAll = numbers.stream().allMatch(n -> n > 0);
        boolean matchesNone = names.stream().noneMatch(name -> name.equals("Zelda"));
        System.out.println("anyMatch (Is Alice there?): " + matchesAny);
        System.out.println("allMatch (Are all numbers > 0?): " + matchesAll);
        System.out.println("noneMatch (Is Zelda absent?): " + matchesNone);


        System.out.println("\n=== SPECIAL METRIC METHODS (Primitive Streams) ===");

        // 16. mapToInt / mapToDouble / mapToLong - Specialized stream conversions for pure math
        int primitiveSum = names.stream()
                                .mapToInt(name -> name.length()) // Converts Stream<String> to IntStream
                                .sum(); // sum(), average(), summaryStatistics() become available here
        System.out.println("mapToInt + sum (total length of all names): " + primitiveSum);
    }
}
