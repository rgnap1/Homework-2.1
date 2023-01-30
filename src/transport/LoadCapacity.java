package transport;

public enum LoadCapacity {
    N1(3.5,20),
    N2(4,10),
    N3(20,100);

    private double min;
    private double max;
    LoadCapacity(double min,double max){
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
    public static LoadCapacity getValue(double value){
        for (LoadCapacity x : LoadCapacity.values()){
            if (value >= x.getMin() && value <= x.getMax()){
                System.out.println(x);
            }
        }
        return null;
    }



}
