package lldpractice.BuilderPattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        User user = User.UserBuilder
                .getInstance()
                .setFirstName("Nishant")
                .setLastName("kumar")
                .build();

        System.out.println(user.toString());
    }
}
