package Practice;

public class Operation extends Thread{

    String operationName;
    int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        System.out.println("start " + Thread.currentThread().getName());

        for (int i = 0; i < operationTime; i++) {
            System.out.println(operationName + " add Client to Bank " + i + " second");
        }
        System.out.println("end " + Thread.currentThread().getName());
    }
}
