package classes;

public class User {

    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }
    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        int i = 0;
        StringBuilder user = new StringBuilder();
        char[] loginCharArray = login.toCharArray();
        char[] passwordCharArray = password.toCharArray();
        for (char c : loginCharArray){
            user.append(String.valueOf(c));
            i++;
        }
        for (int j=20;j>=i;j--){
            user.append(" ");
        }
        user.append("|");
        i = 20-passwordCharArray.length;
        for (int j=0;j<=i;j++){
            user.append(" ");
        }
        for (char c : passwordCharArray){
            user.append(String.valueOf(c));
            i++;
        }
        return user.toString();
    }

    public String getLogin() {
        return login;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

