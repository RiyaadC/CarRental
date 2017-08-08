package Domain;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.awt.print.Book;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Riyaad on 8/8/2017.
 */
@SpringBootApplication
public class Report implements Serializable
{

    @ManyToOne
    @JoinColumn(name = "carReport")
    private List<Car> carReport;

    @ManyToOne
    @JoinColumn(name = "bookingReport")
    private List<BookCar> bookingReport;

    @ManyToOne
    @JoinColumn(name = "customerReport")
    private List<Customer> customerReport;

    @ManyToOne
    @JoinColumn(name = "employeeReport")
    private List<Employee> employeeReport;





}
