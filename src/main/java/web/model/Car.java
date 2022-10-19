package web.model;

import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")

@Service
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

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }
}