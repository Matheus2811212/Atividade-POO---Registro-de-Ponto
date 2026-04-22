package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {

    private long idRegPonto;
    Funcionario func;
    LocalDate dataRegistro;
    LocalDateTime horaEntrada;
    LocalDateTime horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    //métodos

    public void setDataRegistro(){
        this.dataRegistro = dataRegistro;

    }


    public void setHoraEntrada(){
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(){
        this.horaSaida = horaSaida;

    }


    public void apresentarRegistroPonto(){

        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");


        System.out.println("======================================");
        System.out.println("Funcionário: "  + func.getNome());
        System.out.println("Data de Registro: " + dataRegistro.format(fmtData));
        System.out.println("Horário de Entrada: " + horaEntrada.format(fmtHora));

        if(horaSaida!= null){
            System.out.println("Horário de Saída: " + horaSaida.format(fmtHora));
           }
        System.out.println("======================================");

    }

}











