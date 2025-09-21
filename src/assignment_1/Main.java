package assignment_1;

class Main {
    public static void main(String[] args) {
        User userAbylay = new User.Builder()
                .fullName("Latiyev Abylay")
                .email("abilailat@gmail.com")
                .age(19)
                .phoneNumber("+7 778 247 1929")
                .address("Astana")
                .build();
        User userDenis = new User.Builder()
                .fullName("Shin Denis")
                .build();

        System.out.println("User with Full Data:");
        System.out.println(userAbylay);

        System.out.println("User with Only Name:");
        System.out.println(userDenis);
    }
}
