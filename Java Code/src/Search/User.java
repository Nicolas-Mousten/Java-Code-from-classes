package Search;



public class User {
    private String username;
    private String password;

    public User(String usernameFromParameter, String passwordFromParameter){
        this.username = usernameFromParameter;
        this.password = passwordFromParameter;
    }

    public String getUsername(){
        return this.username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
