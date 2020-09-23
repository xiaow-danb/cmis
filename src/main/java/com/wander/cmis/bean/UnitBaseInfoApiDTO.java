package com.wander.cmis.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * 参数代码DTO
 *
 * @author qinxi
 * @create 2020-02-19 9:23
 **/
@Data
public class UnitBaseInfoApiDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6819977979278399091L;
	
	/**
     * 办件公共信息
     */
    private CommApiDTO commApiDTO;
    private Long aab001;
   // @CheckNullCustomAnnotation(checkNull = false,tipsMsg = "资质证件类别")
    private String cab003;
    private String cab003des;
    private String aab003;//统一社会信用代码
    private String aab004;//单位名称
    private String aab019;//单位类型
    private String aab019des;
    private String aab022;//行业分类
    private String aab022des;
    private String aab020;//经济类型
    private String aab020des;
    private String aab013;//法人姓名
    private String aab014;//法人证件号
    private String cce014;//联系人姓名
    private String cce015;//联系电话
    private String aab078;//单位所在区域
    private String aab078des;
    private String aae006;//单位注册地址
    private String aab035; //产业分类
    private String aab035des;
    private String cce099;
    private String cce099des;
    private String handlingno;
    private Date aae036;
    private String cce111;
    private String cce112;
    private String aae011;
    private String aaf001;
    private String bandingflag;
    private String needverfiy;
    private String bae182;
    private String cca027;
    private String cca027des;
    private String aae805;
    private String aae009;
    private String aae010;
    private String aaf021;
    private String aab007;
    private Integer aab008;
    private String cab026;
    private String cca087;
    private String recordid;
}
