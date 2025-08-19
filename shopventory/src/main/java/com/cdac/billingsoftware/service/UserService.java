package com.cdac.billingsoftware.service;

import java.util.List;

import com.cdac.billingsoftware.io.UserRequest;
import com.cdac.billingsoftware.io.UserResponse;

public interface UserService {

	UserResponse createUser(UserRequest request);

	String getUserRole(String email);

	List<UserResponse> readUsers();

	void deleteUser(String id);
}
