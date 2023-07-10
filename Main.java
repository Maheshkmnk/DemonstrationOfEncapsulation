public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("mahesh");
        person.setAge(22);
        person.setAddress("Kakinada");

        System.out.println(
                "Name: " + person.getName() + "\nAge: " + person.getAge() + "\nAddress: " + person.getAddress());
    }
}
