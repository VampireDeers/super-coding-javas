package exercise.chapter_45;

public class GeneralPrint<T> {
    private T material;

    public void printMyInfo(){
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(T material){this.material = material;}

    public T getMaterial(){
        return this.material;
    }
}