public interface Son {

    public Integer idPerson();

    public String getName();

    int setAge(int year);

    default String getInfo() { // метод по умолчанию
        return "Ребёнок";
    }
}
