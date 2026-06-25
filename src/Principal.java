public class Principal {

    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        //aviaoGol.ativo = false;

        aviaoGol.desativar();/*É assim que acessamos um metodo de instacia
e assim desativamos a duplicação de regras dessa forma*/
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponiveis%n",
                aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());

        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalAssentos = 120;


        aviaoLatam.reservarAssentos(5);

        System.out.printf("Latam (%s): %d assentos disponiveis%n",
                aviaoLatam.ativo ? "Ativo" : "Inativo",
                aviaoLatam.calcularAssentosDisponiveis());
    }
}

/*Aprendi que os métodos de instância podem tbm alterar as variaveis
da própria innstaância que esse metodo esta sendo rodado.*/

