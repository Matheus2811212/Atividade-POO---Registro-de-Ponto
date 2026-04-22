import Model.Gerente;
import Model.Operador;
import Model.RegistroPonto;
import Model.Secretaria;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();

        gerente.setIdFunc(1);
        gerente.setNome("Matheus Freitas");
        gerente.setEmail("mfreitas@gmail.com");
        gerente.setDocumento("123.456.789-00");
        gerente.setLogin("matheus.freitas");
        gerente.setSenha("1234");

        Secretaria secretaria = new Secretaria();

        secretaria.setIdFunc(2);
        secretaria.setNome("Maria Oliveira");
        secretaria.setEmail("maria.oliveira@manufatura.com");
        secretaria.setDocumento("987.654.321-11");
        secretaria.setTelefone("(11) 98888-7777");
        secretaria.setRamal("4002");


        Operador operador = new Operador();

        operador.setIdFunc(3);
        operador.setNome("Pedro Santos");
        operador.setEmail("pedro.santos@manufatura.com");
        operador.setDocumento("444.555.666-77");
        operador.setValorHora(25.50);


        //registro de ponto de cada pessoa

        RegistroPonto rpGerente = new RegistroPonto();
        rpGerente.setIdRegPonto(01);
        rpGerente.setFunc(gerente);
        rpGerente.setDataRegistro(LocalDate.now());
        rpGerente.setHoraEntrada(LocalDateTime.now());
        rpGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        RegistroPonto rpOperador = new RegistroPonto();
        rpOperador.setIdRegPonto(02);
        rpOperador.setFunc(operador);
        rpOperador.setDataRegistro(LocalDate.now());
        rpOperador.setHoraEntrada(LocalDateTime.now());
        rpOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        RegistroPonto rpSecretaria = new RegistroPonto();
        rpSecretaria.setIdRegPonto(3L);
        rpSecretaria.setFunc(secretaria);
        rpSecretaria.setDataRegistro(LocalDate.now());
        rpSecretaria.setHoraEntrada(LocalDateTime.now());
        rpSecretaria.apresentarRegistroPonto();

        //registro de saida

        rpGerente.setHoraSaida(LocalDateTime.now());
        rpGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        rpOperador.setHoraSaida(LocalDateTime.now());
        rpOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        rpSecretaria.setHoraSaida(LocalDateTime.now());
        rpSecretaria.apresentarRegistroPonto();


    }
}