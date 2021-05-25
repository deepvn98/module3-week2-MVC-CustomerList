package sevice;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements CustomerInterface{
    private static List<Customer> customerList = new ArrayList<>();
    static { ;
        Customer customer1 = new Customer(1,"Híu","Bắc Ninh","123@gmail.com");
        Customer customer2 = new Customer(2,"Sáng","Bắc Giang","123@gmail.com");
        Customer customer3 = new Customer(3,"Lực","Mỹ Đức","123@gmail.com");
        Customer customer4 = new Customer(4,"Công","Thường Tín","123@gmail.com");
        Customer customer5 = new Customer(5,"Hà","Sóc Sơn","123@gmail.com");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerList);
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);

    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerList.set(id,customer);

    }

    @Override
    public void remove(int id) {
        customerList.remove(customerList.get(id));

    }
}
