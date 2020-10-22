package com.wander.cmis.service;

import com.wander.cmis.bean.PolguaappDto;
import com.wondersgroup.commons.json.JsonResult;

public interface LoanPolguaappService {

    /**
     * 接受就业局贷款申请审核结果
     * @param polguaappDto
     * @return
     */
    JsonResult syncAudit(PolguaappDto polguaappDto);

    JsonResult getLoan(String applyNo,String type);
}
