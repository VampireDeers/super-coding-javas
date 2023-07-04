package exercise.chapter_52;

public class PTMemberTest {

    public static void main(String[] args){
        PTMember member = new PTMember("민철", 178, 70, "남자");
        try {
            member.setID("abcdasfdfassd");
        } catch (Exception e){
            // 고객에게 알람 보내기
        }

        System.out.println(member);
    }
}
