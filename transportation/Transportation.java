package transportation;

public abstract class Transportation {
    int _Total;

    protected int _TransportationNum(){
        return (int) (Math.random() * 100 + 1);
    };//차량 번호
    public abstract void TransportationNum(int i);
    public abstract void AmountFuel(int i);
    public abstract void CurrentSpeed(int i);
    public abstract void Status(String i);
    public abstract void Current(int i);
}
