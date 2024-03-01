package student_code.practice.models;

// Модель
public class Reader {
    private String email;
    private String password;

    public Reader(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
