package com.sys.pojo;

public class Phone {
	private int pid;
	private int uid;
	private long tel;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", uid=" + uid + ", tel=" + tel + "]";
	}

}
