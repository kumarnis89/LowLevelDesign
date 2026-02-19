package lldpractice.BuilderPattern;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String hobby;

    public User(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private String hobby;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setHobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        private UserBuilder(){

        }

        public static UserBuilder getInstance(){
            return new UserBuilder();
        }

        public User build(){
            User user = new User();
            user.setFirstName(this.firstName);
            user.setLastName(this.lastName);
            user.setAge(this.age);
            user.setHobby(this.hobby);
            return user;
        }

    }
}
