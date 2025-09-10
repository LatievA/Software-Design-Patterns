package assignment_1;

class User {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private int age;

    private User(Builder builder) {
        this.fullName = builder.fullName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.age = builder.age;
    }

    /* Override to print object data in nice format*/
    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    static class Builder {
        private String fullName;
        private String email;
        private String phoneNumber;
        private String address;
        private int age;

        Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        Builder email(String email) {
            this.email = email;
            return this;
        }

        Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        Builder address(String address) {
            this.address = address;
            return this;
        }

        Builder age(int age) {
            this.age = age;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}
