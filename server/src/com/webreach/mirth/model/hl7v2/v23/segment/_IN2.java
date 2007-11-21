package com.webreach.mirth.model.hl7v2.v23.segment;
import com.webreach.mirth.model.hl7v2.v23.composite.*;
import com.webreach.mirth.model.hl7v2.*;

public class _IN2 extends Segment {
	public _IN2(){
		fields = new Class[]{_CX.class, _ST.class, _XCN.class, _IS.class, _IS.class, _ST.class, _XPN.class, _ST.class, _XPN.class, _ST.class, _CE.class, _ST.class, _ST.class, _IS.class, _IS.class, _IS.class, _DT.class, _ID.class, _ID.class, _ID.class, _ST.class, _XPN.class, _ST.class, _IS.class, _CX.class, _CX.class, _IS.class, _CM.class, _CM.class, _CM.class, _IS.class, _IS.class, _IS.class, _CE.class, _IS.class, _CE.class, _ID.class, _IS.class, _IS.class, _XPN.class, _CE.class, _IS.class, _IS.class, _DT.class, _DT.class, _ST.class, _JCC.class, _IS.class, _XPN.class, _XTN.class, _IS.class, _XPN.class, _XTN.class, _IS.class, _DT.class, _DT.class, _IS.class, _XTN.class, _IS.class, _IS.class, _CX.class, _IS.class, _XTN.class, _XTN.class, _CE.class, _ID.class, _ID.class, _ID.class, _XON.class, _XON.class, _IS.class, _CE.class};
		repeats = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		required = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
		fieldDescriptions = new String[]{"Insured's Employee ID", "Insured's Social Security Number", "Insured's Employer Name", "Employer Information Data", "Mail Claim Party", "Medicare Health Ins Card Number", "Medicaid Case Name", "Medicaid Case Number", "Champus Sponsor Name", "Champus ID Number", "Dependent of Champus Recipient", "Champus Organization", "Champus Station", "Champus Service", "Champus Rank/Grade", "Champus Status", "Champus Retire Date", "Champus Non-Avail Cert on File", "Baby Coverage", "Combine Baby Bill", "Blood Deductible", "Special Coverage Approval Name", "Special Coverage Approval Title", "Non-Covered Insurance Code", "Payor ID", "Payor Subscriber ID", "Eligibility Source", "Room Coverage Type/Amount", "Policy Type/Amount", "Daily Deductible", "Living Dependency", "Ambulatory Status", "Citizenship", "Primary Language", "Living Arrangement", "Publicity Indicator", "Protection Indicator", "Student Indicator", "Religion", "Mother�s Maiden Name", "Nationality", "Ethnic Group", "Marital Status", "Insured's Employment Start Date", "Insured's Employment Stop Date", "Job Title", "Job Code/Class", "Job Status", "Employer Contact Person Name", "Employer Contact Person Phone Number", "Employer Contact Reason", "Insured�s Contact Person�s Name", "Insured�s Contact Person Telephone Number", "Insured�s Contact Person Reason", "Relationship to the Patient Start Date", "Relationship to the Patient Stop Date", "Insurance Co. Contact Reason", "Insurance Co Contact Phone Number", "Policy Scope", "Policy Source", "Patient Member Number", "Guarantor�s Relationship to Insured", "Insured�s Telephone Number - Home", "Insured�s Employer Telephone Number", "Military Handicapped Program", "Suspend Flag", "Copay Limit Flag", "Stoploss Limit Flag", "Insured Organization Name and ID", "Insured Employer Organization Name and ID", "Race", "HCFA Patient Relationship to Insured"};
		description = "Insurance Additional Information";
		name = "IN2";
	}
}
