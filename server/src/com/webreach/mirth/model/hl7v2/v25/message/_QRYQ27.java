package com.webreach.mirth.model.hl7v2.v25.message;
import com.webreach.mirth.model.hl7v2.v25.segment.*;
import com.webreach.mirth.model.hl7v2.*;

public class _QRYQ27 extends Message{	
	public _QRYQ27(){
		segments = new Class[]{_MSH.class, _SFT.class, _QRD.class, _QRF.class, _DSC.class};
		repeats = new int[]{0, -1, 0, 0, 0};
		required = new boolean[]{true, false, true, false, false};
		groups = new int[][]{}; 
		description = "Pharmacy/Treatment Administration Information";
		name = "QRYQ27";
	}
}
