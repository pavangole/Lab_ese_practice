public class BinaryHeap {
	int[] arr = new int[1000];
	int arrsize = 0;

	void insert(int data) {
		int size = ++this.arrsize;
		System.out.println("size is " + size);
		if(this.arrsize == 1) {
			this.arr[arrsize] = data;
		}
		else {
				while(size > 1) {
					int parent = size / 2;
					int child = data;
					if(arr[parent] < data ) {
						int temp = arr[parent];
						arr[parent] = child;
						arr[size] = temp;
						size  = parent;
						data = arr[parent];
					}
					else {
						arr[size] = child;
						break;
				}
			}
		}
	}

	void display() {
		System.out.println(this.arrsize);
		for(int i = 1; i <=	 this.arrsize ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		BinaryHeap heap = new BinaryHeap();
		heap.insert(15);
		heap.insert(20);
		heap.insert(7);
		heap.insert(9);
		heap.insert(30);
		heap.display();
	}
}
