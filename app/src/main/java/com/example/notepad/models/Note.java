package com.example.notepad.models;

import java.time.LocalDateTime;

public class Note {
	private Integer id;
	private String title;
	private LocalDateTime time;
	private String text;

	public Note() {
	}

	public Note(String title, LocalDateTime time, String text) {
		this.title = title;
		this.time = time;
		this.text = text;
	}

	public Note(Integer id, String title, LocalDateTime time, String text) {
		this.id = id;
		this.title = title;
		this.time = time;
		this.text = text;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Note{" +
			"id=" + id +
			", title='" + title + '\'' +
			", time=" + time +
			", text='" + text + '\'' +
			'}';
	}
}
