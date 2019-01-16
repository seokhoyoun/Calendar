package sche.vo;

import java.util.Date;

public class Schedule {

	private String title;
	private String text;
	private Date time;
	
	public Schedule() {
	}

	public Schedule(String title, String text, Date time) {
		super();
		this.title = title;
		this.text = text;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Schedule [title=" + title + ", text=" + text + ", time=" + time + "]";
	}
	
	
	
}
