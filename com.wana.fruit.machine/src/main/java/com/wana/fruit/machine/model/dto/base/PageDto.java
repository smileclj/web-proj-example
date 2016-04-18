package com.wana.fruit.machine.model.dto.base;

public class PageDto extends BaseDto {
	private int pageNumber;
	private int pageSize;
	private int total;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public boolean validate() {
		if (pageNumber < 1 || pageSize < 0) {
			return false;
		}
		return true;
	}

}
