public class Person {
        private String name;
        private int age;
        private String occupation;

    public Person() {
        name = "Sarah";
        age = 37;
        occupation = "VP Sales";
    }

    public Person(String n, int a, String o) {
        name = n;
        age = a;
        occupation = o;
    }

    public Person(String n) {
        name = n;
        age = 0;
        occupation = "";
    }

        public String getName() {
            return name;
        }

        public void setName(String newName) {
            name = newName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int newAge) {
            age = newAge;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String newOccupation) {
            occupation = newOccupation;
        }

        public void sayHello() {
            System.out.println("Hello, my name is " + name + ".");
        }

        public void sayAge() {
            System.out.println("I am " + age + " years old.");
        }
}
