package net.konic.corejava.collections;

import java.util.*;

public class AllArrayOperation {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// ---------------- ADD OPERATION ----------------
		long addStartTime = System.nanoTime();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		long addEndTime = System.nanoTime();

		System.out.println("After adding elements: " + list);
		System.out.println("Add Operation Time: " + (addEndTime - addStartTime) + " ns");

		// ---------------- INSERT OPERATION ----------------
		long insertStartTime = System.nanoTime();

		// Inserting in middle (shifting happens internally)
		list.add(1, 99);

		long insertEndTime = System.nanoTime();

		System.out.println("After inserting at index 1: " + list);
		System.out.println("Insert Operation Time: " + (insertEndTime - insertStartTime) + " ns");

		// ---------------- RETRIEVE OPERATION ----------------
		long getStartTime = System.nanoTime();

		// Direct index access (fast)
		int value = list.get(2);

		long getEndTime = System.nanoTime();

		System.out.println("Retrieved element at index 2: " + value);
		System.out.println("Retrieve Operation Time: " + (getEndTime - getStartTime) + " ns");

		// ---------------- UPDATE OPERATION ----------------
		long updateStartTime = System.nanoTime();

		list.set(2, 100);

		long updateEndTime = System.nanoTime();

		System.out.println("After updating index 2: " + list);
		System.out.println("Update Operation Time: " + (updateEndTime - updateStartTime) + " ns");

		// ---------------- REMOVE OPERATION ----------------
		long removeStartTime = System.nanoTime();

		// Removing causes shifting
		list.remove(2);

		long removeEndTime = System.nanoTime();

		System.out.println("After removing index 2: " + list);
		System.out.println("Remove Operation Time: " + (removeEndTime - removeStartTime) + " ns");

		// ---------------- SIZE ----------------
		System.out.println("Size of ArrayList: " + list.size());
	}

}
