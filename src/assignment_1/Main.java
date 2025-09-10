package assignment_1;

class Main {
    public static void main(String[] args) {
        User userWithFullData = new User.Builder()
                .fullName("Latiyev Abylay")
                .email("abilailat@gmail.com")
                .age(19)
                .phoneNumber("+7 778 247 1929")
                .address("Astana")
                .build();
        User userWithOnlyName = new User.Builder()
                .fullName("Shin Denis")
                .build();
        System.out.println("User with Full Data:");
        System.out.println(userWithFullData);

        System.out.println("User with Only Name:");
        System.out.println(userWithOnlyName);
    }
}
