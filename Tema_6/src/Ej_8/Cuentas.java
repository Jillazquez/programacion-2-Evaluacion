package Ej_8;

public class Cuentas {

		// TODO Auto-generated method stub
		
		CuentaCorriente[] Cuentas = new CuentaCorriente[100];
		int numero=0;
		
		public void mayorSaldo() {
			float saldo = 0;
			for(int i = 0; i <numero;i++) {
			if(Cuentas[i].getSaldo()>saldo)
				saldo=Cuentas[i].getSaldo();
			}
			for(int i = 0 ; i<numero;i++) {
				if(Cuentas[i].getSaldo()==saldo) {
					System.out.println("Titular: "+Cuentas[i].getTirular()+" Codigo: "+Cuentas[i].getCodigo());
					System.out.println(saldo);
				}
			}
		}
		
		public void añadoCuenta(CuentaCorriente cuentas) {
			Cuentas[numero]= cuentas;
			numero++;
		}

}
