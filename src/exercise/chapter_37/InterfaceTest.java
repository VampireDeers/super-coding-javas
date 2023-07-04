package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args){
        // Male 3개 남편, 아빠, 회사원
        HusbandRole male = new Male("철수");
        Wife wife = new Female("아이유");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        // 이어서 아빠
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("정우성");

        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        // 회사원
        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        EmployeeRole maleEmployeeTwo = new MaleTwo("민철");


        maleEmployee.workTogether(maleEmployeeTwo);
     }
}
