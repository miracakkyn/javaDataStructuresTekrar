package queue;

public class Liste {
	int size;
	int cnt;
	Node rear;
	Node front;
	public Liste(int size) {
		this.size = size;
		this.cnt =0;
		rear=null;
		front=null;
	}
	void enQueue(int data) {
		if(isFull()) {
			System.out.println("Kuyruk dolu eleman eklenecek yer yok");
		}else {
			Node eleman=new Node(data);
			if(isEmpty()) {
				front=eleman;
				rear=eleman;
			}else {
				rear.next=eleman;
				rear=rear.next;
			}
			cnt++;
			System.out.println(data+" kuyruğa eklendi");
		}
	}
	void deQueue() {
		if(isEmpty()) {
			System.out.println("Kuyruk boş çıkarılacak eleman yok");
		}else {
			System.out.println(front.data+" kuyruktan çıktı");
			front=front.next;
			cnt--;
		}
	}
	void printKuyruk() {
		if(isEmpty()) {
			System.out.println("Kuyruk boş yazdırılacak eleman yok");
		}else {
			Node temp=front;
			System.out.print("Front <- ");
			while(temp!=null) {
				System.out.print(temp.data+" <- ");
				temp=temp.next;
			}
			System.out.println("Rear");
		}
	}
	void kuyrukBoyut() {
		System.out.println(cnt);
	}
	boolean isFull() {
		return cnt==size;
	}
	boolean isEmpty() {
		return cnt==0;
	}
	
}
