package com.amiya.hotelratingapp.apigateway.model;

import java.util.Collection;

public class AuthResponse {
	
	private String userId;
	
	private String accessToken;
	
	private String refreshToke;
	
	private long expireAt;
	
	private Collection<String> authorities;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccessToke() {
		return accessToken;
	}

	public void setAccessToke(String accessToke) {
		this.accessToken = accessToke;
	}

	public String getRefreshToke() {
		return refreshToke;
	}

	public void setRefreshToke(String refreshToke) {
		this.refreshToke = refreshToke;
	}

	public long getExpireAt() {
		return expireAt;
	}

	public void setExpireAt(long expireAt) {
		this.expireAt = expireAt;
	}

	public Collection<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<String> authorities) {
		this.authorities = authorities;
	}
}
