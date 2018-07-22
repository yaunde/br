package io.br.neko.demain;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(  )
	 */
	private static final long serialVersionUID = 1L;

	private int totalNum;

	private List pageList;
	
	private int currentPage;

	public List getPageList() {
		return pageList;
	}

	public void setPageList(List pageList) {
		this.pageList = pageList;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
}
