public class TakenTable extends Table {
    /*
    *   Constructor
    */
    public TakenTable(int heads, String arrivalTime, String waiter) {
        this.heads = heads;
        this.arrivalTime = arrivalTime;
        this.waiter = waiter;
    }
    
    /*
    *   Getters
    */
    public int getHeads() { return heads; }
    public string getArrivalTime() { return arrivalTime; }
    public String getWaiter() { return waiter; }
    
    /*
    *   Private Variables
    */
    private int heads;           // Number of people at the table
    private int arrivalTime;    // Time the guests were seated
    private int waiter;          // Waiter who is serving them
}