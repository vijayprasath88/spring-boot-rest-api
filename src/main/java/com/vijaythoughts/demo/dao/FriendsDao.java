package com.vijaythoughts.demo.dao;

import com.vijaythoughts.demo.model.Friend;

import java.util.List;
import java.util.UUID;

/**
 * Created by vijayprasath on 19/03/18.
 */
public interface FriendsDao {

     Friend selectFriendById(UUID friendId);

     List<Friend> selectAllFriends();

     void insertFriendDetails(Friend friend);

     void deleteFriendDetails(UUID friendID);

     void updateFriendDetails(UUID friendId, Friend friend);







}
