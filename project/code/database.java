package electric_bill;

public class database {
	
	public int[] billno;
	public int[] admin_id;
	public int[] cust_id;
	public int[] unit;
	public int len;
	public float[] tariff;
	int temp;
	float ftemp;
	

	public int billnocheck(int billno1, int admin_id2, int cust_id2) {
		len=billno.length;
		for(int i=1;i<len;i++) {
			if(billno1==billno[i]) {
				temp=1;
			}
			else {temp=123;}
		}
		return temp;
	}

	public void billciddbms(int tunit, int billno1) {
		len=billno.length;
		for(int i=0;i<len;i++) {
			if(billno1==billno[i]) {
				unit[i]=tunit;
			}
		}
		
	}

	public void billdeldbms(int billno1, int admin_id1) {
		len=billno.length;
		for(int i=1;i<len;i++) {
			if(billno1==billno[i]) {
				billno[i]=0;
			}
		}
		System.out.println("Bill deleted by admin_id: "+admin_id1);
	}

	public int bill_no(int cust_id1) {
		len=cust_id.length;
		for(int i=1;i<len;i++) {
			if(cust_id[i]==cust_id1) {
				billno[i]=i;
				temp=billno[i];
			}
		}
		return temp;
		
	}

	public float tariff_values(float i) {
		for(int j=1;j<5;j++) {
			tariff[j]=(float) (j*0.5);
		}
		for(int j=1;j<5;j++) {
			if(j==i) {
				ftemp=tariff[j];
			}
		}
		return ftemp;
	}

	

}
