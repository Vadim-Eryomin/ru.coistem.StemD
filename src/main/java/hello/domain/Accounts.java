package hello.domain;

import javax.persistence.*;
import java.util.GregorianCalendar;


@Entity
@Table(name = "usr")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private boolean active = true;

    private String login;
    private String password;

    private String name;
    private String surname;

    private int stemCoins;

    private boolean isTeacher = false;
    private boolean isAdmin = false;

    private String avatarUrl;

    private GregorianCalendar firstDate;

    private String stringLesson;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getStemCoins() {
        return stemCoins;
    }

    public void setStemCoins(int stemCoins) {
        this.stemCoins = stemCoins;
    }

    public GregorianCalendar getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(GregorianCalendar firstDate) {
        this.firstDate = firstDate;
    }

    public String getStringLesson() {
        return stringLesson;
    }

    public void setStringLesson(String stringLesson) {
        this.stringLesson = stringLesson;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setTeacher(boolean teacher) {
        isTeacher = teacher;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Accounts() {

    }

    public Accounts(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
