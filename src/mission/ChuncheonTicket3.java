package mission;

public class ChuncheonTicket3 {

    public static void main(String[] args){
        /**
         * Q) 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
         * 나이가 65세 이상이고, 국적이 ＂한국”이면 반값으로 줄 예정이다.
         * Alice(나이: 70, 나라: 미국)
         * Kim (나이: 65, 나라: 한국)
         * Yoo (나이: 42, 나라: 한국)
         */
        final int SENIOR_AGE_STANDARD = 70;

        int ageOfAlice = 70;
        String countryOfAlice = "USA";

        int ageOfKim = 65;
        String countryOfKim = "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        boolean isHalfPriceForAlice = (ageOfAlice >= SENIOR_AGE_STANDARD) && (countryOfAlice == "Korea");
        boolean isHalfPriceForKim = (ageOfKim >= SENIOR_AGE_STANDARD) && (countryOfKim == "Korea");
        boolean isHalfPriceForYoo = (ageOfYoo >= SENIOR_AGE_STANDARD) && (countryOfYoo == "Korea");

        System.out.println("Alice는 적용 대상자인가?");
        System.out.println(isHalfPriceForAlice);
        System.out.println("Kim는 적용 대상자인가?");
        System.out.println(isHalfPriceForKim);
        System.out.println("Yoo는 적용 대상자인가?");
        System.out.println(isHalfPriceForYoo);
    }
}
