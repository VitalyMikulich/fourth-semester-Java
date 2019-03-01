package by.bsu.lab3a;

public class Bus {
    private String driver;
    private int bus_numb;
    private int route_numb;
    private String brand;
    private int year;
    private int mileage;

    public Bus(String driver, int bus_numb, int route_numb, String brand, int year, int mileage) {
        this.driver = driver;
        this.bus_numb = bus_numb;
        this.route_numb = route_numb;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getBus_numb() {
        return bus_numb;
    }

    public void setBus_numb(int bus_numb) {
        this.bus_numb = bus_numb;
    }

    public int getRoute_numb() {
        return route_numb;
    }

    public void setRoute_numb(int route_numb) {
        this.route_numb = route_numb;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}


