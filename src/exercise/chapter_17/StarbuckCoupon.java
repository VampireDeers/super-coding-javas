package exercise.chapter_17;

public class StarbuckCoupon {

    public static void main(String[] args){
        //
        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = true;
        boolean clearCondition4 = true;

        if ( clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4){
            System.out.println("스타벅스 쿠폰 이벤트에 참여할 수 있게되었습니다.");
        }
        else {
            System.out.println("아니요, 내돈내산으로 커피 먹겠습니다.");
        }
        // 도착
    }
}
