package web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "vin")
    private String vin;

    @Column(name = "year")
    private int year;

    public Car() {
    }

    public Car(String model, String vin, int year) {
        this.model = model;
        this.vin = vin;
        this.year = year;
    }

    public Car(int id, String model, String vin, int year) {
        this.id = id;
        this.model = model;
        this.vin = vin;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}