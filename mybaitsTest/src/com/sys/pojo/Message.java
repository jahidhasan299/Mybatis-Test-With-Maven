package com.sys.pojo;

public class Message {
	private int mid;
	private int uid;
	private int idcard;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getIdcard() {
		return idcard;
	}

	public void setIdcard(int idcard) {
		this.idcard = idcard;
	}

	@Override
	public String toString() {
		return "Message [mid=" + mid + ", uid=" + uid + ", idcard=" + idcard + "]";
	}

}
