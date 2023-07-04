package exercise.chapter_53;

public class OuterClass {

    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass{

        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println("OuterData: " + outerData);
            System.out.println("InnerData: " + innerData);
        }
    }
}
