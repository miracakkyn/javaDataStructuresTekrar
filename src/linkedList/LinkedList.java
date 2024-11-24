package linkedList;

public class LinkedList {
	Node head;
	Node tail;

	void basaEkle(int data) {
		Node eleman = new Node();
		eleman.data = data;
		if (head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Liste oluşturuldu , başına " + eleman.data + " değeri eklendi");

		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			System.out.println("Listenin başına " + eleman.data + " değeri eklendi");

		}

	}

	void sonaEkla(int data) {
		Node eleman = new Node();
		eleman.data = data;
		if (head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Liste oluşturuldu , başına " + eleman.data + " değeri eklendi");

		} else {
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
			System.out.println("Listenin sonuna " + eleman.data + " değeri eklendi");

		}

	}

	void arayaEkle(int data, int index) {

		Node eleman = new Node();
		eleman.data = data;
		if (head == null) {
			if (index == 0) {
				head = eleman;
				tail = eleman;
				System.out.println("Liste oluşturuldu , başına " + eleman.data + " değeri eklendi");
			} else {
				System.out.println("Liste lütfen geçerli bir index giriniz");
			}
		} else {
			Node temp = head;
			int listeBoyut = 0;
			while (temp != null) {
				temp = temp.next;
				listeBoyut++;
			}
			if (index == 0) {
				eleman.next = head;
				head.prev = eleman;
				head = eleman;
				System.out.println("Listenin başına " + eleman.data + " değeri eklendi");
			} else if (index == listeBoyut) {
				tail.next = eleman;
				eleman.prev = tail;
				tail = eleman;
				System.out.println("Listenin sonuna " + eleman.data + " değeri eklendi");
			} else if (index < 0 || index > listeBoyut) {
				System.out.println("Liste lütfen geçerli bir index giriniz");
			} else {
				temp = head;
				Node temp2 = head;
				int k = 0;
				while (temp != null) {
					temp2 = temp;
					temp = temp.next;
					k++;
					if (k == index) {
						temp2.next = eleman;
						eleman.next = temp;
						temp.prev = eleman;
						eleman.prev = temp;
						break;
					}
				}
			}
		}

	}

	void yazdir() {
		if (head == null) {
			System.out.println("Liste boş yazdırılacak eleman yok");
		} else {
			Node temp = head;
			System.out.print("Baş <- ");
			while (temp != null) {
				System.out.print(temp.data + " <- ");temp=temp.next;
			}
			System.out.println("Kuyruk");
		}
	}

	void indexSil(int index) {
		if (head == null) {
			System.out.println("Liste boş silinecek eleman yok");
		} else {
			Node temp = head;
			int listeBoyut = 0;
			while (temp != null) {
				temp = temp.next;
				listeBoyut++;
			}
			if (index > listeBoyut - 1 || index < 0) {
				System.out.println("Lütfen geçerli bir index giriniz");
			} else {
				if (head.next == null && index == 0) {
					head = null;
					tail = null;

				} else if (head.next != null && index == 0) {
					head = head.next;
					head.prev = null;
				} else if(head.next != null && index==listeBoyut-1) {
					tail=tail.prev;
					tail.next=null;
				}else {
					temp=head;
					int k=0;
					while(temp!=null) {
						if(k==index) {
							temp.prev.next=temp.next;
							temp.next.prev=temp.prev;
							break;
						}
						k++;
						temp=temp.next;

					}
				}
			}

		}

	}
}
