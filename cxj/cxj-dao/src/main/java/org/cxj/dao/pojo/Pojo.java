package org.cxj.dao.pojo;

import java.math.BigDecimal;

public class Pojo {
      private BigDecimal max;
      private BigDecimal min;
	public BigDecimal getMax() {
		return max;
	}
	public void setMax(BigDecimal max) {
		this.max = max;
	}
	public BigDecimal getMin() {
		return min;
	}
	public void setMin(BigDecimal min) {
		this.min = min;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String toStr = "最大值：【"+max+"】,最小值：【"+min+"】";
		return toStr;
	}
      
      
}
