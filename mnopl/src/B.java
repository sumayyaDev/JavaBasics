
public class B extends A {
	private int num;
    public B(int num, double length){
        super(length);
        this.num = num;
    }
    public double value(){
        return super.value() * num;
    }

}
