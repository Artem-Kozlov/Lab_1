public class QueueClient {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        myQueue.insert(16);
        myQueue.insert(20);
        myQueue.insert(34);
        myQueue.insert(77);

        myQueue.remove();
        myQueue.remove();


        myQueue.insert(37);

        while (!myQueue.isEmpty()) {
            int n = myQueue.remove();
            System.out.println("Elem: " + n);
        }





    }
}
