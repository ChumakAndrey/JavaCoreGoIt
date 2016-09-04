package Lection3.Task3;

/**
 * Created by Администратор on 04.09.2016.
 */
public class SpecialStudent extends CollegeStudent {
   private long secretKey;
    private String email;

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SpecialStudent(long secretKey) {

        this.secretKey = secretKey;
    }

    public SpecialStudent(String firstName, String lastName, int group) {

        super(firstName, lastName, group);
    }

    public SpecialStudent(String collegeName, int rating, long id) {

        super(collegeName, rating, id);
    }
}
