package kd222gb_Assign1.Exercise1;

public class ArrayIntList extends AbstractIntCollection implements IntList  {

	
	
	
	@Override
	public void add(int n) {
	
		values[size++]=n;
		if ( size==values.length) {
			resize();
			}
		
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		checkIndex(index, size+1);
		for (int i=size;i>index;i--) {
			values[i]=values[i-1];
			
			
		
		if (size==values.length) {
			resize();
		}
		values[index]=n;
		size++;	
		}
		
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		checkIndex(index, size);
		for(int i=index; i<size; i++) {
			values[i]=values[i+1];
			
			size--;
			
		}
		
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		checkIndex(index, size);
		
		return values[index];
	}

	@Override
	public int indexOf(int n) {
		
		for(int i =0; i<size; i++) {
			if ( values[i]==n)
				return i;
		}
		return -1;
	}
	
	
	}
//	public String toString(){
//		return "[ "+ data+" ]";
//		
//	}


