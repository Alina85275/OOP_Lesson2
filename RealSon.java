public class RealSon implements Son {

    int year;
    int yearOfBirth;
    int age;

    RealSon() {

        yearOfBirth = 2005;
        age = 0;
    }

    @Override
    public Integer idPerson() {
        return 2;
    }

    @Override
    public String getName() {
        return "Щербаков Максим";
    }

    @Override
    public int setAge(int year) {
        age = year - yearOfBirth;
        return age;

    }

    @Override
    public String getInfo() {
        return "Сын";
    }

}
