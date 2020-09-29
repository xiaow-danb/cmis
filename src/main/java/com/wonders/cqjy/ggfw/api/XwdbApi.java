package com.wonders.cqjy.ggfw.api;

import com.wonders.cqjy.ggfw.dto.XwdbQueryApiDTO;
import com.wonders.cqjy.ggfw.dto.XwdbReviewDTO;
import com.wondersgroup.commons.json.JsonResult;

public interface XwdbApi {

	/**
	* @方法名: queryPersonalXwdbReview
	* @描述: 查询个人待小微担保审核数据
	* @参数 @param dto
	* @参数 @return
	* @返回类型 JsonResult
	 */
	JsonResult queryPersonalXwdbReview(XwdbQueryApiDTO dto);
	/**
	* @方法名: queryCompanyXwdbReview
	* @描述: 企业审核贷款查询
	* @参数 @param dto
	* @参数 @return
	* @返回类型 JsonResult
	 */
	JsonResult queryCompanyXwdbReview(XwdbQueryApiDTO dto);
	/**
	* @方法名: loadPersonLoanDetail
	* @描述: 加载个人贷款详细信息
	* @参数 @param tac001
	* @参数 @return
	* @返回类型 JsonResult
	 */
	JsonResult loadPersonLoanDetailXwd(Long tac001);
	/**
	* @方法名: loadCompanyLoanDetail
	* @描述: 企业贷款详细信息
	* @参数 @param tac001
	* @参数 @return
	* @返回类型 JsonResult
	 */
	JsonResult loadCompanyLoanDetailXwd(Long tac001);
	/**
	* @方法名: saveXwdbReview
	* @描述: 小微担保审核
	* @参数 @param dto
	* @参数 @return
	* @返回类型 JsonResult
	 */
	JsonResult saveXwdbReview(XwdbReviewDTO dto);
	/**
	* @方法名: saveXwdbFinanced
	* @描述: 贷款发放
	* @参数 @param dto
	* @参数 @return
	* @返回类型 JsonResult
	 */
	JsonResult saveXwdbFinanced(XwdbReviewDTO dto);
}
