package src.com.teachmeskills.lesson16.task1.client;

public class Client {
    private String name;
    private String age;
    private String registrationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Client(String name, String age, String registrationDate){
        this.name = name;
        this.age = age;
        this.registrationDate= registrationDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }
}

