package com.wander.cmis.controller;

import com.wander.cmis.bean.BankReturnDto;
import com.wander.cmis.bean.PolguaappDto;
import com.wander.cmis.service.LoanBankReturnService;
import com.wander.cmis.service.LoanPolguaappService;
import com.wondersgroup.commons.json.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class LoanPolguaappController {

    @Autowired
    private LoanPolguaappService loanPolguaappService;

    @Autowired
    private LoanBankReturnService loanBankReturnService;

    @RequestMapping("/syncAudit")
    public JsonResult syncAudit(@RequestBody PolguaappDto polguaappDto){
        JsonResult jsonResult = loanPolguaappService.syncAudit(polguaappDto);
        return jsonResult;
    }

    @RequestMapping("/getLoan")
    public JsonResult getLoan(@RequestParam(name = "applyNo") String applyNo,
                              @RequestParam(name = "type") String type){
        JsonResult jsonResult = loanPolguaappService.getLoan(applyNo,type);
        return jsonResult;
    }

    @RequestMapping("/bankReturn")
    public JsonResult bankReturn(@RequestBody BankReturnDto bankReturnDto){
        JsonResult jsonResult = loanBankReturnService.bankReturn(bankReturnDto);
        return jsonResult;
    }
}
