package cho.carbon.hc.copframe.dto.ajax;

import com.alibaba.fastjson.annotation.JSONField;



/**
 * 
 * <p>Title: AjaxPageResponse</p>
 * <p>Description: </p><p>
 * 页面发送ajax请求来执行数据时的响应对象，与cpf-ajax中的JsonResponse对象对应
 * </p>
 * @author Copperfield Zhang
 * @date 2017年1月16日 下午5:35:52
 */
public class AjaxPageResponse {
	//当前页面的动作
	private PageAction localPageAction;
	//当前重定向时跳转的页面链接
	private String localPageRedirectURL;
	//处理指定页面的id
	private String targetPageId;
	//处理指定页面的动作
	private PageAction targetPageAction;
	//指定页面重定向时跳转的页面链接
	private String targetPageRedirectURL;
	//指定页面要修改的标题
	private String targetPageTitle;
	//如果指定页面不存在，那么要以何种类型打开
	private PageType targetPageType = PageType.DIALOG;
	private String status;
	//页面响应时的提示语
	private String notice;
	//响应提示语类型
	private NoticeType noticeType;
	//标识
	@JSONField(name="ajax_page_response")
	private final String ajax_page_response = "cpf";
	
	public String getTargetPageId() {
		return targetPageId;
	}
	public void setTargetPageId(String targetPageId) {
		this.targetPageId = targetPageId;
	}
	public String getTargetPageTitle() {
		return targetPageTitle;
	}
	public void setTargetPageTitle(String targetPageTitle) {
		this.targetPageTitle = targetPageTitle;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PageAction getLocalPageAction() {
		return localPageAction;
	}
	public void setLocalPageAction(PageAction localPageAction) {
		this.localPageAction = localPageAction;
	}
	public PageAction getTargetPageAction() {
		return targetPageAction;
	}
	public void setTargetPageAction(PageAction targetPageAction) {
		this.targetPageAction = targetPageAction;
	}
	
	
	/**
	 * 创建一个响应对象，用于刷新当前页面
	 * @param msg 响应提示
	 * @return
	 */
	public static AjaxPageResponse REFRESH_LOCAL(String notice){
		AjaxPageResponse response = new AjaxPageResponse();
		response.setLocalPageAction(PageAction.REFRESH);
		response.setNotice(notice);
		response.setNoticeType(NoticeType.SUC);
		return response;
	}
	
	public static AjaxPageResponse REFRESH_LOCAL_BY_TYPE(String notice, NoticeType noticeType){
		AjaxPageResponse response = new AjaxPageResponse();
		response.setLocalPageAction(PageAction.REFRESH);
		response.setNotice(notice);
		response.setNoticeType(noticeType);
		return response;
	}
	
	public static AjaxPageResponse FAILD(String notice){
		AjaxPageResponse response = new AjaxPageResponse();
		response.setNotice(notice);
		response.setNoticeType(NoticeType.ERROR);
		return response;
	}
	
	/**
	 * 创建一个响应对象，关闭当前页面并且刷新指定页面
	 * @param notice 响应提示
	 * @param pageId 要刷新的指定页面的id
	 * @return
	 */
	public static AjaxPageResponse CLOSE_AND_REFRESH_PAGE(String notice, String pageId){
		AjaxPageResponse response = new AjaxPageResponse();
		response.setLocalPageAction(PageAction.CLOSE);
		response.setTargetPageId(pageId);
		response.setTargetPageAction(PageAction.REFRESH);
		response.setNotice(notice);
		response.setNoticeType(NoticeType.SUC);
		return response;
	}
	public PageType getTargetPageType() {
		return targetPageType;
	}
	public void setTargetPageType(PageType targetPageType) {
		this.targetPageType = targetPageType;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public NoticeType getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(NoticeType noticeType) {
		this.noticeType = noticeType;
	}
	public String getAjax_page_response() {
		return ajax_page_response;
	}
	public String getLocalPageRedirectURL() {
		return localPageRedirectURL;
	}
	public void setLocalPageRedirectURL(String localPageRedirectURL) {
		this.setLocalPageAction(PageAction.REDIRECT);
		this.localPageRedirectURL = localPageRedirectURL;
	}
	public String getTargetPageRedirectURL() {
		return targetPageRedirectURL;
	}
	public void setTargetPageRedirectURL(String targetPageRedirectURL) {
		this.setTargetPageAction(PageAction.REDIRECT);
		this.targetPageRedirectURL = targetPageRedirectURL;
	}
	
}
