package transport;

public enum Size {
    SUPER_MIN(0,10),
    MIN(11,25),
    MIDDLE(40,50),
    BIG(60,80),
    SUPER_BIG(100,120);
    private double min;
    private double max;
    Size(double min,double max){
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
    public static Size getValue(double value){
        for (Size x : Size.values()){
            if (value >= x.getMin() && value <= x.getMax()){
                System.out.println(x);
            }
        }
        return null;
    }
}
