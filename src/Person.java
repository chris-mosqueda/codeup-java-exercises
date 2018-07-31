public class Person {
    //do not need static because Person.name can change and should be the same for every Person obj
    //Class Variable
    private String name;
    //public get method, returns the persons name
    public String getName(){
        return this.name;
    }
    //changes the name property to the passed value. VOID because we don't need to return a value, just perform an action
    public void setName(String newName){ //!needs newName so method knows what to accept & change
        this.name = newName;
    }
    //do not need a return so VOID
    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
    //above are blueprints

    //Constructor
    public Person(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        Person persona = new Person("Jimmy");
        persona.setName("John");  //changes this.name from Jimmy to > John
        persona.sayHello(); //method to say hello w/ this.name

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person3 = new Person("John");
//        Person person4 = person3;
//        System.out.println(person3 == person4);
//
//        Person person5 = new Person("John");
//        Person person6 = person5;
//        System.out.println(person5.getName());
//        System.out.println(person6.getName());
//        person6.setName("Jane");
//        System.out.println(person5.getName());
//        System.out.println(person6.getName());
    }
}
