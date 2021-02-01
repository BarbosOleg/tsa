public class Foo {
    private int first;
    private int second;

    public Foo(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }
    public int bigger(){
        if (this.first > this.second)
            return this.first;
        else if(this.second == this.first)
            return second;
        else return this.second;
    }
}
