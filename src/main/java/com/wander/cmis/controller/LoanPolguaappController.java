package com.wander.cmis.controller;

import com.wander.cmis.bean.PolguaappDto;
import com.wander.cmis.service.LoanPolguaappService;
import com.wondersgroup.commons.json.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanPolguaappController {

    @Autowired
    private LoanPolguaappService loanPolguaappService;

    @RequestMapping("/syncAudit")
    public JsonResult syncAudit(@RequestBody PolguaappDto polguaappDto){
        JsonResult jsonResult = loanPolguaappService.syncAudit(polguaappDto);
        return jsonResult;
    }

}
