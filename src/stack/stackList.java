package stack;

public class stackList {
	int size;
	int cnt = 0;
	Node top;

	public stackList(int size) {
		this.size = size;
		cnt = 0;
		top = null;
	}

	void push(int data) {
		if (isFull()) {
			System.out.println("Yığın dolu eklenecek yer yok");
		} else {
			Node eleman = new Node(data);

			if (isEmpty()) {
				top = eleman;
			} else {
				eleman.next = top;
				top = eleman;
			}
			System.out.println(top.data + " eklendi");
			cnt++;

		}
	}

	void pop() {
		if (isEmpty()) {
			System.out.println("Stack boş silinecek eleman yok");
		} else {
			System.out.println(top.data + " çıkarıldı");
			top = top.next;
			cnt--;

		}
	}

	boolean isFull() {
		return cnt == size;
	}

	boolean isEmpty() {
		return cnt == 0;
	}

	void yiginBoyut() {

		System.out.println("Yığının boyutu " + cnt);
	}

	void printYigin() {
		if(isEmpty()) {
			System.out.println("Yığın boş yazdırılacak eleman yok");
		}else {
			Node temp=top;
			
			while(temp!=null) {
				System.out.println("|"+temp.data+"|");
				temp=temp.next;
			}
			System.out.println("---");
		}
	}
}
