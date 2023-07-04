package exercise.chapter_47;

import java.util.Objects;

public class VIPCustomer extends Customer {
    static int serialNums = 1;

    // 속성
    private String agentID;
    private double discountRatio;

    // 행위
    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent(){
        System.out.println("담당직원 " + this.agentID + "님 문의드릴게 있어요~");
    }

    public VIPCustomer(String name){
        super();
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public void printMyInfo(){
        System.out.print("VIP");
        super.printMyInfo();
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
               "agentID='" + agentID + '\'' +
               ", customerID='" + customerID + '\'' +
               ", name='" + name + '\'' +
               ", customerGrade='" + customerGrade + '\'' +
               ", bonusPoint=" + bonusPoint +
               '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}
