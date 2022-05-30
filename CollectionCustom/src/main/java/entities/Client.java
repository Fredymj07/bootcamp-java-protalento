package entities;

public class Client {

    private String name;
    private String lastName;
    private String age;
    private String typeDocument;
    private String numberDocument;

    public Client() {
    }

    public Client(String name, String lastName, String age, String typeDocument, String numberDocument) {
        this();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.typeDocument = typeDocument;
        this.numberDocument = numberDocument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    @Override
    public String toString() {
        return "Client " + name + " " + lastName + " " + age + " " + typeDocument + " " + numberDocument;
    }
}
