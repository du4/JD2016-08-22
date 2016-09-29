package by.it.snegurskiy.jd02_01;

/**
 * Created by snegurskiy.nn on 26.09.2016.
 */
public class Runner0201 {
    protected volatile static int countCashiers=0;
    static int countBuyer=0;
    public static void main(String[] args) throws InterruptedException {

        new Thread(cashier).start();
while (countBuyer++<10){
try {
    Thread.sleep(100);
    int n=TimeHelper.random(0,2);
    for (int i = 0; i <n ; i++) {
        new Buyer(countBuyer);
    }
    int size=0;
    {
        synchronized (QueueBuyer.buyers){
            size=QueueBuyer.buyers.size();
        }
    }
    if (size>0&&countCashiers<5){
        Cashier cashier=new Cashier();
        new Thread(cashier);
    }

    } catch (InterruptedException e) {
    e.printStackTrace();
}
}
    }
}
