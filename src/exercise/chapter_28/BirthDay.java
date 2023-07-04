package exercise.chapter_28;

public class BirthDay {
    //
    private int year;
    private int month;
    private int day;

    public void setYear(int year){
        this.year = year;
    }

    private void printHi(){
        System.out.println("Hi");
    }

    BirthDay(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        this.printHi();
    }
}
