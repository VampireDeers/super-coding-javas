package exercise.chapter_53;

public class OuterStaticClass {

    private static int outerDate;

    public OuterStaticClass(int outerDate) {
//        this.outerDate = outerDate;
    }

    public static class InnerClass{
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println("OuterData:" + outerDate);
            System.out.println("InnerData: " + innerData );
        }
    }
}
