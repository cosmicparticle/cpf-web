package cho.carbon.hc.copframe.dto.page;

public class CommonPageInfo implements PageInfo {
	private Integer pageNo;
	private Integer pageSize;
	private Integer count;
	private boolean isPaging;

	public CommonPageInfo() {
		this(1, 10, (Integer) null, true);
	}

	public CommonPageInfo(Integer pageNo, Integer pageSize, Integer count, boolean isPaging) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.count = count;
		this.isPaging = isPaging;
	}

	public CommonPageInfo(Integer pageNo, Integer pageSize) {
		this(pageNo, pageSize, (Integer) null, true);
	}

	public CommonPageInfo(boolean isPaging) {
		this((Integer) null, (Integer) null, (Integer) null, isPaging);
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public boolean getIsPaging() {
		return this.isPaging;
	}

	public void setIsPaging(boolean isPaging) {
		this.isPaging = isPaging;
	}

	public Integer getFirstIndex() {
		return this.getPageNo() != null && this.getPageSize() != null
				? (this.getPageNo() - 1) * this.getPageSize()
				: null;
	}

	public Integer getEndIndex() {
		Integer firstIndex = this.getFirstIndex();
		return firstIndex != null ? firstIndex + this.getPageSize() - 1 : null;
	}
}