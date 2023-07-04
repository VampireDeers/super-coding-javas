package exercise.chapter_29;

// 시나리오 참고
// - ‘아메리카노 커피 ＇는 물 500mL와 원두 30g 으로 만들어진다.
// - ‘아메리카노 커피’는 '테이크 아웃용'으로 포장된다.
public class Coffee {
    // 속성
    private String coffeeName;
    private long waterQuantity; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp; // 포장됨 여부

    // 행위
    void beWrappedUp(){
        this.isWrappedUp = true;
    }

    // 생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }
}
