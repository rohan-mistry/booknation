package booknation.example.booknation;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "Userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Userid;

    @Column(name="name")
    private String name;

    @Column(name="emailId")
    private String emailId;

    @Column(name="contact")
    private long contact;

    public Long getId() {
        return Userid;
    }

    public void setId(Long id) {
        this.Userid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}
