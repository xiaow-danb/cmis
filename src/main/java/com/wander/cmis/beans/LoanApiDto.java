package com.wander.cmis.beans;

import java.math.BigDecimal;
import java.util.List;

//�������ݴ�����
public class LoanApiDto {

	private CommApiDTO commApiDTO;//ҵ�񾭰���Ϣ
	private String aac002;//��������֤��
	private String aac003;//���������
	private String tac002;//������������  yyyyMMdd��ʽ
	private String cca080;//���������� cca130��cca080������һ��
	private String caa135;//������֤�����
	private String caa136;//������֤����
	private String caa131;//�Ƿ�21���ļ�������Ⱥ
	private String caa130;//��Ⱥ���
	private String caa132;//�Ƿ��ⷴ����
	private String caa133;//�ⷴ������Ⱥ���
	private String caa137;//����״��
	private String caa126;//�Ƿ�����żִ�մ���
	private String tal003;//��ż����	
	private String tal002;//��ż���֤����
	private String tal007;//��ż�ֻ�����
	private String tal008;//��ż������λ
	private Number tac011;//��ͥ�¾����루Ԫ��
	private String caa138;//���ɣ����ϣ������ʹ��ַ
	private String tac017;//ͳһ������ô���
	private String tac016;//���幤�̻�����
	private String tac018;//��Ӫ��Ŀ
	private String tac019;//��Ӫ�ص绰
	private String tac013;//��Ӫ��ַ
	private String tac010;//�Ƿ�С΢��ҵ 0��1С΢��2΢�͡�
	private String tac;//Ӫҵִ��
	private String tac121;//ע��ʱ��	
	private String tac117;//˰��ǼǺ�
	private Number tac028;//Ա�����������������ˣ�
	private Number tac012;//�����������������������ˣ�
	private String aaa027;//������������
	private String aab301;//��������ֵ�/����
	private String caa127;//��������
	private BigDecimal tac089;//��ҵ���������Ԫ�� NUMBER(10,2)
	private BigDecimal tac090;//�����ҵ������ NUMBER(10,2)
	private BigDecimal tac003;//��������ܽ�Ԫ�� NUMBER(10,2)
	private String tac079;//��������
	private String tac004;//������;
	private List<LoanJm65ApiDto> jm65ApiDtos;//�������б�
	private List<LoanJm66ApiDto> jm66ApiDtos;//��Ѻ��Ѻ��Ϣ�б�
	private String cce099;//���������ύ״̬   1001����������ǩ�֣�1002�ύ����ˡ�	
	public LoanApiDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanApiDto(CommApiDTO commApiDTO, String aac002, String aac003, String tac002, String cca080, String caa135,
			String caa136, String caa131, String caa130, String caa132, String caa133, String caa137, String caa126,
			String tal003, String tal002, String tal007, String tal008, Number tac011, String caa138, String tac017,
			String tac016, String tac018, String tac019, String tac013, String tac010, String tac, String tac121,
			String tac117, Number tac028, Number tac012, String aaa027, String aab301, String caa127, BigDecimal tac089,
			BigDecimal tac090, BigDecimal tac003, String tac079, String tac004, List<LoanJm65ApiDto> jm65ApiDtos,
			List<LoanJm66ApiDto> jm66ApiDtos, String cce099) {
		super();
		this.commApiDTO = commApiDTO;
		this.aac002 = aac002;
		this.aac003 = aac003;
		this.tac002 = tac002;
		this.cca080 = cca080;
		this.caa135 = caa135;
		this.caa136 = caa136;
		this.caa131 = caa131;
		this.caa130 = caa130;
		this.caa132 = caa132;
		this.caa133 = caa133;
		this.caa137 = caa137;
		this.caa126 = caa126;
		this.tal003 = tal003;
		this.tal002 = tal002;
		this.tal007 = tal007;
		this.tal008 = tal008;
		this.tac011 = tac011;
		this.caa138 = caa138;
		this.tac017 = tac017;
		this.tac016 = tac016;
		this.tac018 = tac018;
		this.tac019 = tac019;
		this.tac013 = tac013;
		this.tac010 = tac010;
		this.tac = tac;
		this.tac121 = tac121;
		this.tac117 = tac117;
		this.tac028 = tac028;
		this.tac012 = tac012;
		this.aaa027 = aaa027;
		this.aab301 = aab301;
		this.caa127 = caa127;
		this.tac089 = tac089;
		this.tac090 = tac090;
		this.tac003 = tac003;
		this.tac079 = tac079;
		this.tac004 = tac004;
		this.jm65ApiDtos = jm65ApiDtos;
		this.jm66ApiDtos = jm66ApiDtos;
		this.cce099 = cce099;
	}
	public CommApiDTO getCommApiDTO() {
		return commApiDTO;
	}
	public void setCommApiDTO(CommApiDTO commApiDTO) {
		this.commApiDTO = commApiDTO;
	}
	public String getAac002() {
		return aac002;
	}
	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}
	public String getAac003() {
		return aac003;
	}
	public void setAac003(String aac003) {
		this.aac003 = aac003;
	}
	public String getTac002() {
		return tac002;
	}
	public void setTac002(String tac002) {
		this.tac002 = tac002;
	}
	public String getCca080() {
		return cca080;
	}
	public void setCca080(String cca080) {
		this.cca080 = cca080;
	}
	public String getCaa135() {
		return caa135;
	}
	public void setCaa135(String caa135) {
		this.caa135 = caa135;
	}
	public String getCaa136() {
		return caa136;
	}
	public void setCaa136(String caa136) {
		this.caa136 = caa136;
	}
	public String getCaa131() {
		return caa131;
	}
	public void setCaa131(String caa131) {
		this.caa131 = caa131;
	}
	public String getCaa130() {
		return caa130;
	}
	public void setCaa130(String caa130) {
		this.caa130 = caa130;
	}
	public String getCaa132() {
		return caa132;
	}
	public void setCaa132(String caa132) {
		this.caa132 = caa132;
	}
	public String getCaa133() {
		return caa133;
	}
	public void setCaa133(String caa133) {
		this.caa133 = caa133;
	}
	public String getCaa137() {
		return caa137;
	}
	public void setCaa137(String caa137) {
		this.caa137 = caa137;
	}
	public String getCaa126() {
		return caa126;
	}
	public void setCaa126(String caa126) {
		this.caa126 = caa126;
	}
	public String getTal003() {
		return tal003;
	}
	public void setTal003(String tal003) {
		this.tal003 = tal003;
	}
	public String getTal002() {
		return tal002;
	}
	public void setTal002(String tal002) {
		this.tal002 = tal002;
	}
	public String getTal007() {
		return tal007;
	}
	public void setTal007(String tal007) {
		this.tal007 = tal007;
	}
	public String getTal008() {
		return tal008;
	}
	public void setTal008(String tal008) {
		this.tal008 = tal008;
	}
	public Number getTac011() {
		return tac011;
	}
	public void setTac011(Number tac011) {
		this.tac011 = tac011;
	}
	public String getCaa138() {
		return caa138;
	}
	public void setCaa138(String caa138) {
		this.caa138 = caa138;
	}
	public String getTac017() {
		return tac017;
	}
	public void setTac017(String tac017) {
		this.tac017 = tac017;
	}
	public String getTac016() {
		return tac016;
	}
	public void setTac016(String tac016) {
		this.tac016 = tac016;
	}
	public String getTac018() {
		return tac018;
	}
	public void setTac018(String tac018) {
		this.tac018 = tac018;
	}
	public String getTac019() {
		return tac019;
	}
	public void setTac019(String tac019) {
		this.tac019 = tac019;
	}
	public String getTac013() {
		return tac013;
	}
	public void setTac013(String tac013) {
		this.tac013 = tac013;
	}
	public String getTac010() {
		return tac010;
	}
	public void setTac010(String tac010) {
		this.tac010 = tac010;
	}
	public String getTac() {
		return tac;
	}
	public void setTac(String tac) {
		this.tac = tac;
	}
	public String getTac121() {
		return tac121;
	}
	public void setTac121(String tac121) {
		this.tac121 = tac121;
	}
	public String getTac117() {
		return tac117;
	}
	public void setTac117(String tac117) {
		this.tac117 = tac117;
	}
	public Number getTac028() {
		return tac028;
	}
	public void setTac028(Number tac028) {
		this.tac028 = tac028;
	}
	public Number getTac012() {
		return tac012;
	}
	public void setTac012(Number tac012) {
		this.tac012 = tac012;
	}
	public String getAaa027() {
		return aaa027;
	}
	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
	public String getAab301() {
		return aab301;
	}
	public void setAab301(String aab301) {
		this.aab301 = aab301;
	}
	public String getCaa127() {
		return caa127;
	}
	public void setCaa127(String caa127) {
		this.caa127 = caa127;
	}
	public BigDecimal getTac089() {
		return tac089;
	}
	public void setTac089(BigDecimal tac089) {
		this.tac089 = tac089;
	}
	public BigDecimal getTac090() {
		return tac090;
	}
	public void setTac090(BigDecimal tac090) {
		this.tac090 = tac090;
	}
	public BigDecimal getTac003() {
		return tac003;
	}
	public void setTac003(BigDecimal tac003) {
		this.tac003 = tac003;
	}
	public String getTac079() {
		return tac079;
	}
	public void setTac079(String tac079) {
		this.tac079 = tac079;
	}
	public String getTac004() {
		return tac004;
	}
	public void setTac004(String tac004) {
		this.tac004 = tac004;
	}
	public List<LoanJm65ApiDto> getJm65ApiDtos() {
		return jm65ApiDtos;
	}
	public void setJm65ApiDtos(List<LoanJm65ApiDto> jm65ApiDtos) {
		this.jm65ApiDtos = jm65ApiDtos;
	}
	public List<LoanJm66ApiDto> getJm66ApiDtos() {
		return jm66ApiDtos;
	}
	public void setJm66ApiDtos(List<LoanJm66ApiDto> jm66ApiDtos) {
		this.jm66ApiDtos = jm66ApiDtos;
	}
	public String getCce099() {
		return cce099;
	}
	public void setCce099(String cce099) {
		this.cce099 = cce099;
	}
	@Override
	public String toString() {
		return "LoanApiDto [commApiDTO=" + commApiDTO + ", aac002=" + aac002 + ", aac003=" + aac003 + ", tac002="
				+ tac002 + ", cca080=" + cca080 + ", caa135=" + caa135 + ", caa136=" + caa136 + ", caa131=" + caa131
				+ ", caa130=" + caa130 + ", caa132=" + caa132 + ", caa133=" + caa133 + ", caa137=" + caa137
				+ ", caa126=" + caa126 + ", tal003=" + tal003 + ", tal002=" + tal002 + ", tal007=" + tal007
				+ ", tal008=" + tal008 + ", tac011=" + tac011 + ", caa138=" + caa138 + ", tac017=" + tac017
				+ ", tac016=" + tac016 + ", tac018=" + tac018 + ", tac019=" + tac019 + ", tac013=" + tac013
				+ ", tac010=" + tac010 + ", tac=" + tac + ", tac121=" + tac121 + ", tac117=" + tac117 + ", tac028="
				+ tac028 + ", tac012=" + tac012 + ", aaa027=" + aaa027 + ", aab301=" + aab301 + ", caa127=" + caa127
				+ ", tac089=" + tac089 + ", tac090=" + tac090 + ", tac003=" + tac003 + ", tac079=" + tac079
				+ ", tac004=" + tac004 + ", jm65ApiDtos=" + jm65ApiDtos + ", jm66ApiDtos=" + jm66ApiDtos + ", cce099="
				+ cce099 + "]";
	}
	

}
