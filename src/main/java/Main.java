public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Flor", "Zalazar")
                .edad(65)
                .telefono("1234567")
                .direccion("Yrigoyen 123")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Daniel", "hahiahvdif")
                .edad(40)
                .telefono("5655")

                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Iron", "Man")

                .build();

        System.out.println(user3);
    }

}