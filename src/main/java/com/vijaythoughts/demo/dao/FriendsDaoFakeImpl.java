package com.vijaythoughts.demo.dao;

import com.vijaythoughts.demo.model.Friend;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by vijayprasath on 19/03/18.
 */

@Repository("FriendFakeDao")
public class FriendsDaoFakeImpl implements FriendsDao{

   private final Map<UUID, Friend> database;

    public FriendsDaoFakeImpl() {
        database  = new HashMap<UUID, Friend>();
        UUID intial_friend_id = UUID.randomUUID();
        Friend friend = new Friend(intial_friend_id, "Vijay Prasath", "Muralidharan","Wilmington, Delaware");
        database.put(intial_friend_id, friend);
    }


    @Override
    public Friend selectFriendById(UUID friendId) {

        return database.get(friendId);
    }

    @Override
    public List<Friend> selectAllFriends() {

        return  new ArrayList<>(database.values());
    }

    @Override
    public void insertFriendDetails(Friend friend) {
        UUID initialFriendId = UUID.randomUUID();
        friend.setFriendId(initialFriendId);
        database.put(initialFriendId, friend);
    }

    @Override
    public void deleteFriendDetails(UUID friendID) {
        database.remove(friendID);
    }

    @Override
    public void updateFriendDetails(UUID friendId, Friend friend) {
        database.replace(friendId,friend);
    }
}
