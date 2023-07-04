package exercise.chapter_51;

public class ThrowUncheckException {

    public static void main(String[] args){
        System.out.println("메인 메소드 실행합니다.");

        int myInt = 0;
        try {
            myInt = getDivide(0);
        } catch (Exception e){
            System.out.println("Exception 처리했습니다.");
            e.printStackTrace();
        }

        System.out.println("myInt: " + myInt);
        System.out.println("메인 메소드 종료합니다.");
    }


    static int getIntElement(int index) throws Exception {
        int[] arrInt = {1,2,3,4,5,6,7,8,9,10};

        if (index >= arrInt.length){
            throw new Exception("Index는 ArrInt의 길이를 넘을 수 없습니다.");
        }

        return arrInt[index];
    }
    static int getDivide(int num) throws Exception {
        if (num == 0){
            throw new Exception("num은 0이 될 수 없습니다.");
        }

        int data = 100 / num;
        return data;
    }
}
