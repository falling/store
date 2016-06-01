package action;

import bean.Usertablebean;

/**
 * Created by falling on 2016/6/1.
 */
public class LoginAction {
    private Usertablebean user;

    public Usertablebean getUser() {
        return user;
    }

    public void setUser(Usertablebean user) {
        this.user = user;
    }

    public String execute() throws Exception {
        System.out.println(user.getUsername() + user.getPassword());
        if(user.getUsername().equals("test"))
            return "error";
        return "success";
    }
}
