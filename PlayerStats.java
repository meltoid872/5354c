package DataBase;

import java.util.Date;

public class PlayerStats {
    private String uuid;
    private Date lastLogin;
    private Date lastLogout;

    public Date getLastLogout() {
        return lastLogout;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public String getUuid() {
        return uuid;
    }

    public PlayerStats(String uuid) {
        this.uuid = uuid;
    }

    public PlayerStats(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public PlayerStats() {
    }

    public PlayerStats(String uuid, Date lastLogin, Date lastLogout){
        this.uuid = uuid;
        this.lastLogin = lastLogin;
        this.lastLogout = lastLogout;

    }
}