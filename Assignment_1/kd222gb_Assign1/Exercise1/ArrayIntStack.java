package kd222gb_Assign1.Exercise1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	
	
	@Override
	public void push(int n) {
		if( size==values.length)
			resize();
		values[size]=n;
		size++;
		

	}
	

	@Override
	public int pop() throws IndexOutOfBoundsException {
		int element;
		element=values[size-1];
		values[size]=0;
		size--;
		return element;
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		int element = 0;
		
		element=values[size-1];
		
		return element;
	}

}
