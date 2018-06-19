package com.vijaythoughts.demo.service;

import com.vijaythoughts.demo.dao.FriendsDao;
import com.vijaythoughts.demo.model.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by vijayprasath on 19/03/18.
 */
@Service
public class FriendService {

    @Autowired
    private FriendsDao friendsDao;

    public void setFriendsDao( @Qualifier("FriendFakeDao") FriendsDao friendsDao) {
        this.friendsDao = friendsDao;
    }

    public List<Friend> getAllFriends(){
        return friendsDao.selectAllFriends();
    }

    public Friend getFriendById(UUID friendId){
        return friendsDao.selectFriendById(friendId);

    }

    public void insertNewFriend(Friend friend){
         friendsDao.insertFriendDetails(friend);
    }

    public void deleteAFriend(UUID friendID){
        friendsDao.deleteFriendDetails(friendID);
    }

    public void updateAfriend(UUID friendId, Friend friend) {
        friendsDao.updateFriendDetails(friendId, friend);
    }
}
