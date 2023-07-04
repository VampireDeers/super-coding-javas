package mission;

public class ChucheonTicket1 {

    /**
     * Q1) 이 티켓 값은 얼마인가?
     *,전문가 4명(Kim,Park,Lee,Hong)가 제시하는 적정 티켓 값의 평균을 티켓 값으로 최종 책정하려고 한다.
     * 각각 제시한 티켓 값 Kim: 3000, Park: 5000, Lee: 2000, Hong: 2000 이다.
     */
    public static void main(String[] args){
        int priceKim = 3000;
        int pricePark = 5000;
        long priceHong = 695402305910230L;

        int finalTicketPrice = (int) ((priceKim + pricePark + priceHong) / 4);
        System.out.println(finalTicketPrice);
    }
}
