package web.model;

public class Car {
    private String model;
    private int num;
    private int series;

    public Car(String model, int num, int series) {
        this.model = model;
        this.num = num;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", num=" + num +
                ", series=" + series +
                '}';
    }
}

