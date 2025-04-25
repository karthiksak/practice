package com.karthik;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Call each method that you have implemented
//        practice.filterAndPrintOddNumbers();
//        practice.printSortedStrings();
//        practice.printRandomUUID();
//        practice.printSortedSet();
//        practice.filterStringsStartingWithE();
//        practice.countNumbersGreaterThanThree();
        //practice.evennumaddition();
      //  practice.findMax();
        
        
        Map<String, Integer> intmap =new HashMap<String, Integer>();
        intmap.put("1", 1);
        intmap.put("2", 2);
        intmap.put("3", 3);
        intmap.put("4", 4);
        intmap.put("5", 5);
        		
        
       
        //intmap.values().stream().filter(n->n>-3).map(n->n*2).forEach(n->System.out.println(n));
        
//        intmap.entrySet().stream().filter(entry->entry.getKey()!="2").forEach(t->System.out.println(t));
        
        ArrayList<String> str =intmap.keySet().stream().filter(n->n.length()>0).collect(Collectors.toCollection(ArrayList::new));
        		//Map.of("1", 1, "2", 2);
        System.out.println(str);
        
        
    }

    // Method to filter and print odd numbers from the list
    public void filterAndPrintOddNumbers() {
        List<Integer> intlist = Arrays.asList(1, 2, 3, 4, 5, 5, 8);
        intlist.stream()
               .filter(t -> t % 2 == 1)  // Filter odd numbers
               .forEach(t -> System.out.println(t));  // Print odd numbers
    }

    // Method to sort and print strings in the list
    public void printSortedStrings() {
        List<String> tstString = Arrays.asList("test", "takathi");
        tstString.stream()
                 .sorted()  // Sort strings
                 .forEach(t -> System.out.println(t));  // Print sorted strings
    }

    // Method to generate and print a random UUID
    public void printRandomUUID() {
        String l = UUID.randomUUID().toString();  // Generate random UUID
        System.out.println("Random UUID: " + l);
    }

    // Method to sort a set and print it
    public void printSortedSet() {
        Set<String> testSet = Set.of("wws", "fffd", "yrryry");
        
        TreeSet<String> tt = testSet.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(TreeSet::new));
        		
        		
//        		TreeSet<String> trs = testSet.stream()
//                                     .sorted(Comparator.reverseOrder())  // Sort the elements
//                                     .collect(Collectors.toCollection(TreeSet::new));  // Collect into a TreeSet
        //System.out.println("Sorted Set: " + trs);  // Print the sorted set
    }

    // Method to filter strings starting with 'e' and print them
    public void filterStringsStartingWithE() {
        List<String> palindromi = List.of("eee", "malayalam", "malayalam", "rsfs", "fssfsfs");
        palindromi.stream().forEach(t->System.out.println(t.toUpperCase()));
        
       /// palindromi.stream().distinct().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
//        
//        palindromi.stream()
//                  .filter(t -> t.startsWith("e"))  // Filter strings starting with 'e'
//                  .forEach(t -> System.out.println(t));  // Print the filtered strings
    }

    // Method to count how many numbers are greater than 3
    public void countNumbersGreaterThanThree() {
        List<Integer> intlistt = Arrays.asList(1, 2, 3, 4, 5, 5, 8);
        long cont = intlistt.stream()
                            .filter(t -> t > 3)  // Filter numbers greater than 3
                            .count();  // Count the filtered numbers
        System.out.println("Count of numbers greater than 3: " + cont);
    }
    
    public void mapsTest() {
      Map<String, Integer> intmap = Map.of("1", 1, "2", 2);
      System.out.println(intmap);
    }
    
    
	public void evennumaddition() {
		List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 90);

		int sum = n.stream().filter(t -> (t % 2 != 1)).mapToInt(Integer::intValue).sum();

		System.out.println(sum);
	}
	
	
	
	public void findMax() {
		List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 90);
		
		Optional<Integer> t =  n.stream().min(Comparator.naturalOrder());
		
		
		 List<String> palindromi = List.of("eee", "malayalam", "malayalam", "rsfs", "fssfsfs");
	        
	        
	        palindromi.stream().distinct().sorted(Comparator.reverseOrder()).forEach(ttt->System.out.println(ttt));
		
		t.ifPresent(rr->System.out.println(rr));
	}
	
}