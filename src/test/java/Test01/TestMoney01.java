package Test01;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TestMoney01 {

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal("100");
		DecimalFormat df = new DecimalFormat("###,###.00");
		System.out.println(df.format(1234567.87));
	}

}
