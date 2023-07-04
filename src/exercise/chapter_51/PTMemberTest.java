package exercise.chapter_51;

public class PTMemberTest {

    public static void main(String[] args){
        PTMember member = new PTMember("민철", 178, 70, "Male");
        try {
            member.setID("abcd");
        } catch (Exception e){
            // 고객에게 알람 보내기
        }

        System.out.println(member);
    }
}
