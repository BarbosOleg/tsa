public class Foo {
    private int first;
    private int second;

    public Foo(int first, int second) {
        setFirst(first);
        setSecond(second);
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
    public void bigger(){
        if (this.first > this.second)
            System.out.println(first + " is bigger than " + second);
        else if(this.second == this.first)
            System.out.println("number is equal");
        else System.out.println(second + " is bigger than " + first);
    }
}
