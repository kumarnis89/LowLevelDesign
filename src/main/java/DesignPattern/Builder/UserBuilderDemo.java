package DesignPattern.Builder;

public class UserBuilderDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .username("Nishant")
                .password("nishant123@#")
                .build();

        System.out.println(user);
    }
}
