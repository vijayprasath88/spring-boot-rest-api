package com.vijaythoughts.demo.controller;

import com.vijaythoughts.demo.model.Friend;
import com.vijaythoughts.demo.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by vijayprasath on 19/03/18.
 */

@RestController
@RequestMapping("api/friends")
public class FriendController {


    @Autowired
    private FriendService friendService;



    @GetMapping(
            produces = "application/json"
    )
    public List<Friend> getAllFriends(){
       return friendService.getAllFriends();
    }

    @GetMapping("{friendId}")
    public Friend getFriendId(@PathVariable UUID friendId){

        return friendService.getFriendById(friendId);
    }

    @PostMapping
    public void insertNewFriend(@RequestBody Friend friend){

         friendService.insertNewFriend(friend);
    }

    @DeleteMapping("{friendId}")
    public void deleteAFriend(@PathVariable UUID friendId){

        friendService.deleteAFriend(friendId);
    }


@PutMapping("{friendId}")
    public ResponseEntity<?> updateAFriend(@RequestBody Friend friend, @PathVariable UUID friendId) {
            friend.setFriendId(friendId);
            friendService.updateAfriend(friendId, friend);
            return ResponseEntity.ok("resource saved");
    }





}
