public class GeoThree {
    public static void main(String[] args) {
        String family = Doughter.getFamily();
        System.out.println(family);
        RealDoughter doughter = new RealDoughter();
        System.out.println(doughter.idPerson());
        System.out.println(doughter.getInfo());
        System.out.println(doughter.getName());
        System.out.println("Возраст: " + doughter.setAge(2023));
        RealSon son = new RealSon();
        System.out.println(son.idPerson());
        System.out.println(son.getInfo());
        System.out.println(son.getName());
        System.out.println("Возраст: " + son.setAge(2023));
    }
}