public interface Doughter {

    public Integer idPerson();

    public String getName();

    int setAge(int year);

    default String getInfo() { // метод по умолчанию
        return "Ребёнок";
    }

    static String getFamily() { // статический метод
        return "Семья Щербаковых";
    }
}