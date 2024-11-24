package queue;

public class Uygulama {

	public static void main(String[] args) {
		Liste kuyruk=new Liste(6);
		kuyruk.enQueue(1);		
		kuyruk.enQueue(2);
		kuyruk.enQueue(3);
		kuyruk.enQueue(4);
		kuyruk.enQueue(5);
		kuyruk.printKuyruk();
		kuyruk.enQueue(6);		kuyruk.enQueue(1);		kuyruk.printKuyruk();
		kuyruk.deQueue();kuyruk.deQueue();kuyruk.deQueue();kuyruk.printKuyruk();kuyruk.kuyrukBoyut();kuyruk.deQueue();kuyruk.deQueue();kuyruk.deQueue();kuyruk.deQueue();kuyruk.deQueue();kuyruk.deQueue();
		kuyruk.printKuyruk();



	}

}
