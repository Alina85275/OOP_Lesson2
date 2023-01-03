public class RealDoughter implements Doughter {

    int year;
    int yearOfBirth;
    int age;

    RealDoughter() {

        yearOfBirth = 1999;
        age = 0;
    }

    @Override
    public Integer idPerson() {
        return 1;
    }

    @Override
    public String getName() {
        return "Щербакова Дарья";
    }

    @Override
    public int setAge(int year) {
        age = year - yearOfBirth;
        return age;

    }

    @Override
    public String getInfo() {
        return "Дочь";
    }

}
