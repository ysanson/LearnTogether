package client;

import client.Room.RoomServices;
import client.Users.UserServices;
import com.lloseng.ocsf.client.AdaptableClient;
import common.ClientIF;
import common.DisplayIF;

import java.io.IOException;

public class CoreClient implements ClientIF {
    private UserServices user;
    private RoomServices room;
    private AdaptableClient connection;
    private DisplayIF display;

    public UserServices getUser() {
        return user;
    }

    public void setUser(UserServices user) {
        this.user = user;
    }

    public AdaptableClient getConnection() {
        return connection;
    }

    public void setConnection(AdaptableClient client) {
        this.connection = client;
    }

    public DisplayIF getDisplay() {
        return display;
    }

    public void setDisplay(DisplayIF display) {
        this.display = display;
    }

    public CoreClient(String host, int port, DisplayIF display) throws IOException {
        connection = new AdaptableClient(host, port, this);
        this.display = display;
        connection.openConnection();
        user = new UserServices(this);
        room = new RoomServices(this);
    }

    /**
     * Handles whatever comes from the server. It then calls the related functions.
     *
     * @param msg: what the server sent.
     */
    @Override
    public void handleMessageFromServer(Object msg) {
        if (msg instanceof String) {
            if (((String) msg).startsWith("#LOGON")) {
                user.handleAnswerLogin((String) msg);
            } else if (((String) msg).startsWith("#FIRSTCONN")) {
                user.handleFirstConnAnswer((String) msg);
            }
        }
    }

    @Override
    public void connectionClosed() {
    }

    @Override
    public void connectionException(Exception exception) {
    }

    @Override
    public void connectionEstablished() {
    }

    public void handleLogin(String login, String password) {
        user.handleLogin(login, password);
    }

    public void setFirstPassword(String login, String password) {
        user.setFirstPassword(login, password);
    }

    public void handleCreateRoom(String name, int capacity, int building, boolean hasProjector, boolean hasComputer, String description) {
        room.handleCreateRoom(name, capacity, building, hasProjector, hasComputer, description);
    }
}