public class stackClass  {
    //
    // Public
    //
    public stackClass(){
        init();
    }

    public void push(int item) throws Exception{
        // Check for stack overflow.
        if (topPtr > 0) {
            topPtr = topPtr - 1;
            arr[topPtr] = item;
        }
    }

    public int pop() throws Exception{
        int retVal = 0;
        // Check for stack underflow.
        if (topPtr < CAPACITY) {
            retVal = arr[topPtr];
            topPtr = topPtr + 1;
        }
        return retVal;
    }

    public boolean isEmpty() {
        boolean retVal = false;
        if (topPtr == CAPACITY) {
            retVal = true;
        }
        return retVal;
    }


    public int getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    //
    // Private
    //
    private int CAPACITY = 1000;
    private int[] arr = new int[CAPACITY];
    private int topPtr = 0;

    private void init() {
        for (int i = 0; i < CAPACITY; i++) {
            arr[i] = 0;
        }
        topPtr = CAPACITY;
    }


}