package Entity;

import javax.persistence.*;


/**
 * Created by Алексей on 25.11.2015.
 */
@Entity
@Table(name = "account")
public class Account
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "userName", length = 20)
    private String userName;
    @Column(name = "userPassword", length = 20)
    private String userPassword;
    @Column(name = "userEmail", length = 30)
    private String userEmail;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "account")
    private List<Hero> hero;

    public Account()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword(String userPasvord)
    {
        this.userPassword = userPasvord;
    }

    public List<Hero> getHero()
    {
        return hero;
    }

    public void setHero(List<Hero> hero)
    {
        this.hero = hero;
    }
}
