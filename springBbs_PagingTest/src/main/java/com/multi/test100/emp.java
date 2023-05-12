package com.multi.test100;

import java.util.Date;

public class emp {
	private int rownum; // row 번호
	private String bizId; // 정책ID
	private String polyBizSecd; // 정책일련번호
	private String polyBizTy; // 기관 및 지자체 구분
	private String polyBizSjnm; // 정책명
	private String polyItcnCn; // 정책소개
	private String plcyTpNm; // 정책유형
	private String sporScvl; // 지원규모
	private String sporCn; // 지원내용
	private String ageInfo; // 참여요건 - 연령
	private String empmSttsCn; // 참여요건 - 취업상태
	private String accrRqisCn; // 참여요건 - 학력
	private String majrRqisCn; // 참여요건 - 전공
	private String splzRlmRqisCn; // 참여요건 - 특화분야
	private String cnsgNmor; // 신청기관명
	private String rqutPrdCn; // 신청기간
	private String rqutProcCn; // 신청절차
	private String jdgnPresCn; //심사발표
	private String rqutUrla; //사이트 링크
	
	public emp(int rownum, String bizId, String polyBizSecd, String polyBizTy, String polyBizSjnm, String polyItcnCn,
			String plcyTpNm, String sporScvl, String sporCn, String ageInfo, String empmSttsCn, String accrRqisCn,
			String majrRqisCn, String splzRlmRqisCn, String cnsgNmor, String rqutPrdCn, String rqutProcCn,
			String jdgnPresCn, String rqutUrla) {
		this.rownum = rownum;
		this.bizId = bizId;
		this.polyBizSecd = polyBizSecd;
		this.polyBizTy = polyBizTy;
		this.polyBizSjnm = polyBizSjnm;
		this.polyItcnCn = polyItcnCn;
		this.plcyTpNm = plcyTpNm;
		this.sporScvl = sporScvl;
		this.sporCn = sporCn;
		this.ageInfo = ageInfo;
		this.empmSttsCn = empmSttsCn;
		this.accrRqisCn = accrRqisCn;
		this.majrRqisCn = majrRqisCn;
		this.splzRlmRqisCn = splzRlmRqisCn;
		this.cnsgNmor = cnsgNmor;
		this.rqutPrdCn = rqutPrdCn;
		this.rqutProcCn = rqutProcCn;
		this.jdgnPresCn = jdgnPresCn;
		this.rqutUrla = rqutUrla;
	}

	@Override
	public String toString() {
		return "emp [rownum=" + rownum + ", bizId=" + bizId + ", polyBizSecd=" + polyBizSecd + ", polyBizTy="
				+ polyBizTy + ", polyBizSjnm=" + polyBizSjnm + ", polyItcnCn=" + polyItcnCn + ", plcyTpNm=" + plcyTpNm
				+ ", sporScvl=" + sporScvl + ", sporCn=" + sporCn + ", ageInfo=" + ageInfo + ", empmSttsCn="
				+ empmSttsCn + ", accrRqisCn=" + accrRqisCn + ", majrRqisCn=" + majrRqisCn + ", splzRlmRqisCn="
				+ splzRlmRqisCn + ", cnsgNmor=" + cnsgNmor + ", rqutPrdCn=" + rqutPrdCn + ", rqutProcCn=" + rqutProcCn
				+ ", jdgnPresCn=" + jdgnPresCn + ", rqutUrla=" + rqutUrla + "]";
	}
	
	
	
}
