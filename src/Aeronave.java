public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis () {
        return totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo == true) {//sei que ativo == true é redudante fiz como exemplo.
            assentosReservados += numeroAssentos;
        } else {
            /*existe uma forma de fazer isso () Mas ainda não estudamos
            * sobre isso.*/
            System.out.println("Aeronave desativada. Assentos não reservados");
        }
    }

    void desativar () {/* Isso é metodo de instancia da variavel ativo pode
    ter outras regras ou só essa mesmo*/
        ativo = false;
    }

    void ativar () {
        ativo = true;
    }
}
