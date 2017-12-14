package com.mmall.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

public interface IOrderService {

	ServerResponse queryOrderPayStatus(Integer id, Long orderNo);

	ServerResponse pay(Long orderNo, Integer id, String path);

	ServerResponse aliCallback(Map<String, String> params);
	
	
	
	//backend
	ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

	ServerResponse<OrderVo> manageDetail(Long orderNo);

	ServerResponse<PageInfo> manageSearch(Long orderNo, int pageNum, int pageSize);

	ServerResponse<String> manageSendGoods(Long orderNo);

}
