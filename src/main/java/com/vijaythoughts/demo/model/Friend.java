package com.vijaythoughts.demo.model;

import java.util.UUID;

/**
 * Created by vijayprasath on 19/03/18.
 */
public class Friend {

    private UUID friendId;

    private String friendFirstName;

    private String friendLastName;

    private String address;

    public Friend(UUID friendId, String friendFirstName, String friendLastName, String address) {
        this.friendId = friendId;
        this.friendFirstName = friendFirstName;
        this.friendLastName = friendLastName;
        this.address = address;
    }

    public UUID getFriendId() {
        return friendId;
    }

    public void setFriendId(UUID friendId) {
        this.friendId = friendId;
    }

    public String getFriendFirstName() {
        return friendFirstName;
    }

    public void setFriendFirstName(String friendFirstName) {
        this.friendFirstName = friendFirstName;
    }

    public String getFriendLastName() {
        return friendLastName;
    }

    public void setFriendLastName(String friendLastName) {
        this.friendLastName = friendLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
