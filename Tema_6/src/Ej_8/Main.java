package Ej_8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuentas cuenta = new Cuentas();
		
		cuenta.añadoCuenta(new CuentaCorriente(1234,13413,"asdad"));
		cuenta.añadoCuenta(new CuentaCorriente(4152356,1249,"asdad"));
		cuenta.añadoCuenta(new CuentaCorriente(134343,84908,"asdad"));
		cuenta.añadoCuenta(new CuentaCorriente(4152356,1239,"asdad"));
		cuenta.mayorSaldo();
	}

}
