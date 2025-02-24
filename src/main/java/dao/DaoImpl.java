package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Inside getData method");
        return 80;
    }
}
