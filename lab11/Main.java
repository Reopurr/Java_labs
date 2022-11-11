package lab11;

class Main {
    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueue(3);
        queue.enqueue(1);
        queue.dequeue();
//        queue.element(); // Пустая строка
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
//        queue.enqueue(9); //Переполнение


        queue = new ArrayQueueModule();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        queue = new ArrayQueueModule();
        System.out.println("queue: " + queue);
        System.out.println("size: " + queue.size());
        System.out.println("element(): " + queue.element());
        System.out.println("dequeue(): " + queue.dequeue());
    }
}

