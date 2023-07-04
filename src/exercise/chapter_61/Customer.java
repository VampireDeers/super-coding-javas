package exercise.chapter_61;

import java.io.Serializable;

public class Customer implements Serializable {

    public static int serialNum = 1;
    public static final int FINAL_VALUE = 5;

    public String customerID;
    protected String customerName;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;

    @Override
    @MyAnnotation(name = "Equal")
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Customer){
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("(ID: %s, 이름: %s) 님의 등급은 %s 이며, 보너스 포인트는 %d ", this.customerID, this.customerName, this.customerGrade, this.bonusPoint);
    }


    /**
     * @param price int 물건의 가격
     * @return int 마지막 계산된 가격
     */
    @MyAnnotation(name = "가격 계산 하기")
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return String.format("(ID: %s, 이름: %s) 님의 등급은 %s 이며, 보너스 포인트는 %d ", this.customerID, this.customerName, this.customerGrade, this.bonusPoint);
    }

    public Customer() {
    }

    @MyAnnotation(name = "생성자")
    public Customer(String customerID, String name){
        this(customerID, name, "SILVER", 0, 0.01);
    }

    public Customer(String name){
        this("Customer" + serialNum++, name, "SILVER", 0, 0.01);
    }

    public Customer(String customerID, String customerName,
                    String customerGrade, int bonusPoint, double bonusRatio) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = customerGrade;
        this.bonusPoint = bonusPoint;
        this.bonusRatio = bonusRatio;
    }

    /**
     * @param customerName String 고객 이름
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
