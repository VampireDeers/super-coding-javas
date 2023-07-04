package exercise.chapter_39;

import exercise.chapter_34.Customer;
import exercise.chapter_34.GolderCustomer;
import exercise.chapter_34.Staff;
import exercise.chapter_34.VIPCustomer;

public class DepartmentStoreSituation {

    public static void main(String[] args){
        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer = new VIPCustomer("아이유");

        Customer[] customerQueue = {
                new Customer("권율"), new Customer("이순신"), new VIPCustomer("광해군"),
                customer, new Customer("김좌진"), customer,
                new Customer("장원영"), customer, new VIPCustomer("김혜수"),
                new GolderCustomer("정우영"), new GolderCustomer("정우성"), new GolderCustomer("손흥민")
        };

        // 시나리오
        for(Customer customerEach: customerQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();
    }
}
