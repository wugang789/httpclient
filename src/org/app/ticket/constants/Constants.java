package org.app.ticket.constants;

public class Constants
{
  public static final String JSESSIONID = "JSESSIONID";
  public static final String BIGIPSERVEROTSWEB = "BIGipServerotsweb";
  public static String JSESSIONID_VALUE = "";

  public static String BIGIPSERVEROTSWEB_VALUE = "";
  public static String TOKEN;
  public static String LEFTTICKETSTR;
  public static final String POST_UTL_LOGINACTION_LOGINAYSNSUGGEST = "http://dynamic.12306.cn/otsweb/loginAction.do?method=loginAysnSuggest";
  public static final String POST_UTL_LOGINACTION = "http://dynamic.12306.cn/otsweb/loginAction.do?method=login";
  public static final String GET_URL_USERTOKEN = "http://dynamic.12306.cn/otsweb/order/querySingleAction.do?method=init";
  public static final String GET_URL_QUERYTICKET = "http://dynamic.12306.cn/otsweb/order/querySingleAction.do?method=queryLeftTicket";
  public static final String POST_URL_SUBMUTORDERREQUEST = "http://dynamic.12306.cn/otsweb/order/querySingleAction.do?method=submutOrderRequest";
  public static final String GET_LOGINURL_PASSCODE = "http://dynamic.12306.cn/otsweb/passCodeAction.do?rand=sjrand";
  public static final String GET_SUBMITURL_PASSCODE = "http://dynamic.12306.cn/otsweb/passCodeAction.do?rand=randp";
  public static final String GET_URL_CONFIRMPASSENGER = "http://dynamic.12306.cn/otsweb/order/confirmPassengerAction.do?method=init";
  public static final String GET_URL_GETQUEUECOUNT = "http://dynamic.12306.cn/otsweb/order/confirmPassengerAction.do?method=getQueueCount";
  public static final String POST_URL_CHECKORDERINFO = "http://dynamic.12306.cn/otsweb/order/confirmPassengerAction.do?method=checkOrderInfo&rand=";
  public static final String POST_URL_CONFIRMSINGLEFORQUEUEORDER = "http://dynamic.12306.cn/otsweb/order/confirmPassengerAction.do?method=confirmSingleForQueueOrder";
  public static final String SIGN = "&";
  public static final String RAND = "rand";
  public static final String TICKET_INFO = "--";
  public static final String SYS_TRAINCODE = "traincode";
  public static final String SYS_USERSEAT = "settype";
  public static final String SYS_THREAD_SLEEPTIME = "5000";
  public static final String SYS_STRING_DATEFORMAT = "-  -";
  public static final String SYS_TICKET_SIGN_1 = "--";
  public static final String SYS_TICKET_SIGN_2 = "无";
  public static final String SYS_USER_INFO = "userinfo";
  public static String BUSS_SEAT = "9";
  public static String BEST_SEAT = "P";
  public static String ONE_SEAT = "M";
  public static String TWO_SEAT = "O";
  public static String VAG_SLEEPER = "6";
  public static String SOFT_SLEEPER = "4";
  public static String HARD_SLEEPER = "3";
  public static String SOFT_SEAT = "2";
  public static String HARD_SEAT = "1";
  public static String NONE_SEAT = "-1";
  public static final String LOGIN_LOGINRAND = "loginRand";
  public static final String LOGIN_USERNAME = "loginUser.user_name";
  public static final String LOGIN_NAMEERRORFOCUS = "nameErrorFocus";
  public static final String LOGIN_PASSWORDERRORFOCUS = "passwordErrorFocus";
  public static final String LOGIN_RANDCODE = "randCode";
  public static final String LOGIN_RANDERRORFOCUS = "randErrorFocus";
  public static final String LOGIN_REFUNDFLAG = "refundFlag";
  public static final String LOGIN_REFUNDLOGIN = "refundLogin";
  public static final String LOGIN_PASSWORD = "user.password";
  public static final String QUERY_INCLUDESTUDENT = "includeStudent";
  public static final String QUERY_FROM_STATION_TELECODE = "orderRequest.from_station_telecode";
  public static final String QUERY_START_TIME_STR = "orderRequest.start_time_str";
  public static final String QUERY_TO_STATION_TELECODE = "orderRequest.to_station_telecode";
  public static final String QUERY_TRAIN_DATE = "orderRequest.train_date";
  public static final String QUERY_TRAIN_NO = "orderRequest.train_no";
  public static final String QUERY_SEATTYPEANDNUM = "seatTypeAndNum";
  public static final String QUERY_TRAINCLASS = "trainClass";
  public static final String QUERY_TRAINPASSTYPE = "trainPassType";
  public static final String GETQUEUECOUNT_FROM = "from";
  public static final String GETQUEUECOUNT_SEAT = "seat";
  public static final String GETQUEUECOUNT_STATION = "station";
  public static final String GETQUEUECOUNT_TICKET = "ticket";
  public static final String GETQUEUECOUNT_TO = "to";
  public static final String GETQUEUECOUNT_TRAIN_DATE = "train_date";
  public static final String ORDER_ARRIVE_TIME = "arrive_time";
  public static final String ORDER_FROM_STATION_NAME = "from_station_name";
  public static final String ORDER_FROM_STATION_NO = "from_station_no";
  public static final String ORDER_FROM_STATION_TELECODE = "from_station_telecode";
  public static final String ORDER_FROM_STATION_TELECODE_NAME = "from_station_telecode_name";
  public static final String ORDER_INCLUDE_STUDENT = "include_student";
  public static final String ORDER_LISHI = "lishi";
  public static final String ORDER_LOCATIONCODE = "locationCode";
  public static final String ORDER_MMSTR = "mmStr";
  public static final String ORDER_ROUND_START_TIME_STR = "round_start_time_str";
  public static final String ORDER_ROUND_TRAIN_DATE = "round_train_date";
  public static final String ORDER_SEATTYPE_NUM = "seattype_num";
  public static final String ORDER_SINGLE_ROUND_TYPE = "single_round_type";
  public static final String ORDER_START_TIME_STR = "start_time_str";
  public static final String ORDER_STATION_TRAIN_CODE = "station_train_code";
  public static final String ORDER_TO_STATION_NAME = "to_station_name";
  public static final String ORDER_TO_STATION_NO = "to_station_no";
  public static final String ORDER_TO_STATION_TELECODE = "to_station_telecode";
  public static final String ORDER_TO_STATION_TELECODE_NAME = "to_station_telecode_name";
  public static final String ORDER_TRAIN_CLASS_ARR = "train_class_arr";
  public static final String ORDER_TRAIN_DATE = "train_date";
  public static final String ORDER_TRAIN_PASS_TYPE = "train_pass_type";
  public static final String ORDER_TRAIN_START_TIME = "train_start_time";
  public static final String ORDER_TRAINNO4 = "trainno4";
  public static final String ORDER_YPINFODETAIL = "ypInfoDetail";
  public static final String SUBMIT_LEFTTICKETSTR = "leftTicketStr";
  public static final String SUBMIT_OLDPASSENGERS = "oldPassengers";
  public static final String SUBMIT_BED_LEVEL_ORDER_NUM = "orderRequest.bed_level_order_num";
  public static final String SUBMIT_CANCEL_FLAG = "orderRequest.cancel_flag";
  public static final String SUBMIT_END_TIME = "orderRequest.end_time";
  public static final String SUBMIT_FROM_STATION_NAME = "orderRequest.from_station_name";
  public static final String SUBMIT_FROM_STATION_TELECODE = "orderRequest.from_station_telecode";
  public static final String SUBMIT_ID_MODE = "orderRequest.id_mode";
  public static final String SUBMIT_RESERVE_FLAG = "orderRequest.reserve_flag";
  public static final String SUBMIT_SEAT_DETAIL_TYPE_CODE = "orderRequest.seat_detail_type_code";
  public static final String SUBMIT_START_TIME = "orderRequest.start_time";
  public static final String SUBMIT_STATION_TRAIN_CODE = "orderRequest.station_train_code";
  public static final String SUBMIT_TICKET_TYPE_ORDER_NUM = "orderRequest.ticket_type_order_num";
  public static final String SUBMIT_TO_STATION_NAME = "orderRequest.to_station_name";
  public static final String SUBMIT_TO_STATION_TELECODE = "orderRequest.to_station_telecode";
  public static final String SUBMIT_TO_SEAT_TYPE_CODE = "orderRequest.seat_type_code";
  public static final String SUBMIT_TOKEN = "org.apache.struts.taglib.html.TOKEN";
  public static final String SUBMIT_PASSENGERTICKETS = "passengerTickets";
  public static final String SUBMIT_RANDCODE = "randCode";
  public static final String SUBMIT_TEXTFIELD = "textfield";
  public static final String SUBMIT_TFLAG = "dc";
}