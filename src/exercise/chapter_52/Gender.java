package exercise.chapter_52;

public enum Gender {
    FEMALE("Female", "여자"),
    MALE("Male", "남자"),
    UNKNOWN("Unknown", "미정");

    private String englishTerm;
    private String koreanTerm;

    Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static Gender valueOfTerm(String str){
        for(Gender gender: values()){
            if(str.equals(gender.englishTerm) || str.equals(gender.koreanTerm)){
                return gender;
            }
        }
        return Gender.UNKNOWN;
    }
}
