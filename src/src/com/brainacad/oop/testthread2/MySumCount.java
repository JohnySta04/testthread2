package src.com.brainacad.oop.testthread2;

public class MySumCount extends Thread {

    private int startIndex;
    private int stopIndex;
    private int[] arrayOfInteger;
    private long resultSum;

    public int getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return this.stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int[] getArrayOfInteger() {
        return this.arrayOfInteger;
    }

    public void setArrayOfInteger(int[] arrayOfInteger) {
        this.arrayOfInteger = arrayOfInteger;
    }

    public long getResultSum() {
        return this.resultSum;
    }

    public void run() {

        this.resultSum = 0;
        for (int i = this.startIndex; i < this.stopIndex + 1; i++) {
            this.resultSum = this.resultSum + this.arrayOfInteger[i];

        }
    }

}
