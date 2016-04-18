package com.wana.fruit.machine.model.dto.game;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.wana.fruit.machine.model.dto.base.PageDto;

public class GameRecordListReqDto extends PageDto {
	private Integer userId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date start;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date end;
	private Boolean prize;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Boolean getPrize() {
		return prize;
	}

	public void setPrize(Boolean prize) {
		this.prize = prize;
	}

}
