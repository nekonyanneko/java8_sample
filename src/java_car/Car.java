package java_car;

public class Car {
    private int num;
    private double gas;

    public Car()
    {
        this.num = 0;
        this.gas = 0;
        System.out.println("車を作成しました");
    }
    public void setCar(int n, double g)
    {
        this.num = n;
        this.gas = g;
        System.out.println("ナンバーを"+this.num+"にガソリンを"+this.gas+"にしました");
    }
    public void show()
    {
        System.out.println("車のナンバーは"+this.num);
        System.out.println("ガソリン量は"+this.gas);
    }
}
