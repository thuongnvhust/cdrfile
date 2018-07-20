package cdrfile.convert;

/**
 * <p>
 * Title: CDR File System
 * </p>
 * <p>
 * Description: VMS IS Departerment
 * </p>
 * <p>
 * Copyright: Copyright (c) by eKnowledge 2004
 * </p>
 * <p>
 * Company: VietNam Mobile Telecom Services
 * </p>
 *
 * @author eKnowledge - Software
 * @version 1.0
 */

public class StructHuaweiCDR
{
    public String RecordType;
    public String CallType;
    public String Calling_isdn;
    public String Calling_IMEI;
    public String Calling_IMSI;
    public int Duration;
    public String DateForStartOfCharge;
    public String TimeForStartOfCharge;
    public String TimeForStopOfCharge;
    public String Called_isdn;
    public String Cell_id;
    public String ic_route;
    public String og_route;
    public String tariff_class;
    public String in_mark;
    public String charging_indicator;
    public String org_call_id;
    public int rec_seq_number;
    public String Service_center;
    public String SwitchIdentity;
    public String TeleServiceCode;
    public String BearerServiceCode;
    public String TranslatedNumber;
    public String CallingOrg;
    public String CalledOrg;
    public String MsgTypeIndicator;
    public String SystemType;
    public String rateIndication;
    public String GSM_SCF_Address;
    public String FCIData;
    //4-10
    public String levelOfCamel;
    public String serviceKey;
    public String EmlppPriorityLevel;
    public String seizureTime;
    public String causeForTerm;

    public String supplServicesUsed;
    public String camelDestinationNumber;
    public String countryCode;
    public String networkCode;
    public String smsResult;
    
	public String callerIP;
	public String calledIP;
	
	public String CallTypeDetail;
	public String RMnumber;
	
	public String originalCalledNumber;

}
