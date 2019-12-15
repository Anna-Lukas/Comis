package pl.altkom.dao;
import pl.altkom.CarBean;
import javax.sql.DataSource;

public interface CarInfoDAO {
    public void saveCarInfo(CarBean car, DataSource dataSource);
}
