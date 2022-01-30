package com.elisson.bookstore.exceptions;

public class StandardError {

	private Long timeStamp;
	private Integer statusHttp;
	private String error;

	public StandardError(Long timeStamp, Integer statusHttp, String error) {
		super();
		this.timeStamp = timeStamp;
		this.statusHttp = statusHttp;
		this.error = error;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatusHttp() {
		return statusHttp;
	}

	public void setStatusHttp(Integer statusHttp) {
		this.statusHttp = statusHttp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
