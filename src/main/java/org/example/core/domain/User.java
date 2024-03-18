<<<<<<< HEAD:src/main/java/org/example/core/domain/User.java
package org.example.core.domain;

import org.example.core.interfaces.IProgress;

=======
package org.example.domain;
import org.example.interfaces.IProgress;
>>>>>>> ac4c8da4d417946ba4001d93000c55da1396d882:src/main/java/org/example/domain/User.java
import java.util.UUID;

public class User {
    public final UUID userId;
    private String userName;
    private String password;
    private IProgress progress;
    private boolean isAdministrator;

    public User(String userName, String password, boolean isAdministrator) {
        this.userId = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        this.isAdministrator = isAdministrator;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }
    public void setAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public IProgress getProgress() {
        return progress;
    }
    public void setProgress(IProgress progress) {
        this.progress = progress;
    }
}