package exercise.chapter_59;


import exercise.chapter_57.Customer;

import java.util.List;

public class ListUtils {

    public synchronized static void addList(List<Customer> customerList, Customer newCustomer){
        customerList.add(newCustomer);
    }
}
