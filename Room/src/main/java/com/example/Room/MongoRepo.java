package com.example.Room;


import java.util.List;

import com.example.Room.Model.Room;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MongoRepo extends MongoRepository <Room,String>{
	public List<Room> findAll();



	@Query("{RoomNo : ?0}")                                       
    List<Room> getRoomByRoomNo(String RoomNo);
	
}
