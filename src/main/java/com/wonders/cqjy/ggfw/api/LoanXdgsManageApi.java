package com.wonders.cqjy.ggfw.api;

import com.wander.cmis.bean.LoanXdgsApiDto;
import com.wondersgroup.commons.json.JsonResult;

public interface LoanXdgsManageApi {

    /**
     * 小贷公司专用贷款申请数据推送接口
     * @param apiDto
     * @return
     */
    JsonResult saveLoan(LoanXdgsApiDto apiDto);
}
