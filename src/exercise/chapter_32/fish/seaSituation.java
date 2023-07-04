package exercise.chapter_32.fish;

public class seaSituation {

    public static void main(String[] args){
//        // 자식 물고기
//        FishChild fishChild = new FishChild(); //
//
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("동해");
//
//        fishChild.printfMyInfo();
//
//        //생성자 오버로딩
//        FishChild fishChild2 = new FishChild("Female", true, "서해");
//        fishChild2.printfMyInfo();

        // 자식 물고기 생성
//        FishChild fishChild = new FishChild();
//        fishChild.setLeavingSea("동해");
//        fishChild.setLeavingSeaChild("서해");
//
//        fishChild.printSea();

        // 핵심 타입 s

        // 타입선언 부모, 인스턴스화: 부모
        // 타입선언: 부모, 인스턴스화: 자식
        // 타입선언: 자식, 인스턴스화: 자식
        // 타입선언: 자식, 인스턴스화: 부모 => 묵시적 변환 X

        Fish fish1 = new Fish();
        fish1.eat("새우");

        Fish fish2 = new FishChild();
        fish2.eat("새우");

        FishChild fish3 = new FishChild();
        fish3.eat("새우");

    }
}
