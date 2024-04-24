public class Move {
    private int truckCapacity;
    private int truckContainer;
    private int storage;
    private int pass;

    public Move(int boxes, int truckCapacity) {
        this.truckCapacity = truckCapacity;
        this.storage = boxes;
    }

    public void boxes() {
        for (int i = 0; i < truckCapacity && i < storage; i++) {
            if (i == (truckCapacity - 1) || i == (storage - 1)) {
                storage = (storage - truckCapacity);
                truckContainer = (i + 1);
                pass++;
                
                System.out.println(pass + " passage du camion.");
                System.out.println("Le camion est rempli de " + truckContainer + " cartons\n");
                
                i = 0;
            }
        }
    }
}