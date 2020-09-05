package com.telstra.cpack;

public class Consumer {

	private int meterNo;
	private int unitConsumed;
	private int unitPrice;
	public Consumer(int meterNo, int unitConsumed, int unitPrice) {
		super();
		this.meterNo = meterNo;
		this.unitConsumed = unitConsumed;
		this.unitPrice = unitPrice;
	}
	
		private int calBill()
		{
			return(unitConsumed * unitPrice);
		}

		@Override
		public String toString() {
			return "Consumer [meterNo=" + meterNo + ", unitConsumed=" + unitConsumed + 
					", unitPrice=" + unitPrice + ", Billamt= " + calBill() + "]";
		}
		
}
