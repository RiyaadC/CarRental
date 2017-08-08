package Domain;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.awt.print.Book;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Riyaad on 8/7/2017.
 */
@SpringBootApplication
public class BookCar implements Serializable
{
    @Id
    @Column(name="bookRef", unique=false)
    @GeneratedValue
    private String bookRef;

    @Column(name="startDate")
    private String startDate;

    @Column(name="endDate")
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "catID")
    private List<Category> catList;

    @ManyToOne
    @JoinColumn(name = "carRegNo")
    private List<Car> carList;

    public BookCar()
    {

    }

    public BookCar(BookCar.Builder build)
    {
        this.startDate = build.startDate;
        this.endDate= build.endDate;

    }
    public static class Builder
    {
        private String startDate;
        private String endDate;

        public Builder startDate(String value)
        {
            this.startDate = value;
            return this;
        }

        public Builder endDate(String value)
        {
            this.endDate= value;
            return this;
        }



        public BookCar build()
        {
            return new BookCar(this);
        }
    }





}
