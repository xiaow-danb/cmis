package com.wander.cmis.service;

import com.wander.cmis.bean.PolguaappDto;
import com.wondersgroup.wssip.framework.common.JsonResult;

public interface LoanPolguaappService {

    JsonResult syncAudit(PolguaappDto polguaappDto);
}
