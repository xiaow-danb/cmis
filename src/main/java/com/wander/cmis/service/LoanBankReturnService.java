package com.wander.cmis.service;

import com.wander.cmis.bean.BankReturnDto;
import com.wondersgroup.commons.json.JsonResult;

public interface LoanBankReturnService {

    JsonResult bankReturn(BankReturnDto bankReturnDto);
}
