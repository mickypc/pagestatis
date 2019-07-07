package cn.edu.cuc.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResItem {
  //@ApiNote("接口调用是否成功")
	private boolean success = false;
  //@ApiNote("调用成功说明")
	private String msg = "";
  //@ApiNote("调用失败代码")
	private int errcode = 0;
  //@ApiNote("调用失败说明")
	private String errmsg = "";
  //@ApiNote("HTTP status")
	private int httpcode = 200;
  //@ApiNote("业务数据")
	private Object item = null;

  public ResItem() {
      // Jackson deserialization
  }

  @JsonProperty
  public boolean getSuccess() {
    return this.success;
  }
  public void setSuccess(boolean success) {
    this.success = success;
  }

  @JsonProperty
  public String getMsg() {
    return this.msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }

  @JsonProperty
  public String getErrmsg() {
    return this.errmsg;
  }
  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  @JsonProperty
  public int getHttpcode() {
    return this.httpcode;
  }
  public void setHttpcode(int httpcode) {
    this.httpcode = httpcode;
  }

  @JsonProperty
  public int getErrcode() {
    return this.errcode;
  }
  public void setErrcode(int errcode) {
    this.errcode = errcode;
  }

  @JsonProperty
  public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ResItem [success=" + success + ", msg=" + msg + ", errmsg=" + errmsg + ", httpcode=" + httpcode + ", item=" + item + "]";
	}

}
