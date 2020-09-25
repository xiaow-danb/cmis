package com.wander.cmis.service;

import com.wander.cmis.bean.CompanyInfoDto;
import com.wander.cmis.bean.PersonalInfoDto;
import com.wander.cmis.bean.UnitBaseInfoApiDTO;
import com.wondersgroup.commons.json.JsonResult;

/**
 * 同步个人信息
 */
public interface TransferCustService {

    /**
     * 接受就业局人员绑定审核结果
     */
    JsonResult syncPersonal(PersonalInfoDto personalInfoDto);
    /**
     * 接受就业局企业绑定审核结果
     */
    JsonResult syncCompany(CompanyInfoDto companyInfoDto);
}
