package cho.carbon.hc.copframe.dto.page;

public interface PageInfo {
	Integer getPageNo();

	void setPageNo(Integer var1);

	Integer getPageSize();

	void setPageSize(Integer var1);

	Integer getCount();

	void setCount(Integer var1);

	boolean getIsPaging();

	void setIsPaging(boolean var1);

	Integer getFirstIndex();

	Integer getEndIndex();
}