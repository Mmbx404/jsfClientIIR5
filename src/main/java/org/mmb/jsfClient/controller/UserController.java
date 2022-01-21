package org.mmb.jsfClient.controller;

import java.util.List;

import metier.beans.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface UserController {
	
	@GET("all")
	Call<List<User>> findAll();

}
