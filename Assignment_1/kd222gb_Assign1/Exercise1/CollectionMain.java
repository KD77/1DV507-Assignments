package kd222gb_Assign1.Exercise1;

import java.util.Iterator;

public class CollectionMain {
	public static void main(String[] args) {
		ArrayIntList array = new ArrayIntList();
		for (int i = 5; i < 15; i++) {

			array.add(i);
			array.addAt(2, i);
		}
		System.out.println("\nsize " + array.size());
		System.out.println("is Empty: " + array.isEmpty());
//	System.out.println("add "+ array.add(1));
		System.out.println("get " + array.get(2));
		System.out.println("index " + array.indexOf(2));
		System.out.println("show elements " + array.toString());
		System.out.println("size " + array.size());
		for (int i = 0; i < 10; i++) {
			array.remove(7);
		}

		Iterator<Integer> it = array.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
//		System.out.println("\nsize "+ array.size());	
//		System.out.println("is Empty "+ array.isEmpty());
////		System.out.println("add "+ array.add(1));
//		System.out.println("get "+ array.get(2));
//		System.out.println("index "+ array.indexOf(2) );
		System.out.println();
		for (int i = 1; i < 5; i++) {
//		array.addAt(1, i);
		}
		System.out.println("show elements " + array.toString());
//		System.out.println("size "+ array.size());

		ArrayIntStack stack = new ArrayIntStack();
		for (int x = 0; x < 10; x++) {
			stack.push(x);

		}
		System.out.println("elements " + stack.toString());
		System.out.println("size " + stack.size);
		System.out.println("pop " + stack.pop());
		System.out.println("peek " + stack.peek());
		Iterator<Integer> i = stack.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}

}
