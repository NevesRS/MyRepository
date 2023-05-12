public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int diaParam, int mesParam, int anoParam){
        dia = diaParam;
        mes = mesParam;
        ano = anoParam;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String mesExtensto(){
        String mes = "";
        switch(getMes()){
            case 1: mes = "Janeiro"; break;
            case 2: mes = "Fevereiro"; break;
            case 3: mes = "Março"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Maio"; break;
            case 6: mes = "Junho"; break;
            case 7: mes = "Julho"; break;
            case 8: mes = "Agosto"; break;
            case 9: mes = "Setembro"; break;
            case 10: mes = "Outubro"; break;
            case 11: mes = "Novembro"; break;
            case 12: mes = "Dezembro"; break;
        }
        return mes;
    }

    public boolean testeBissexto(){
        boolean teste = false;
        if(getAno()%4 == 0){
            teste = true;
        }
        return teste;
    }

    public boolean validarData(){
        boolean teste = true;
        if(getDia() > 31 || getDia() < 0){
            teste = false;
        }
        if(getMes() > 12 || getDia() < 0){
            teste = false;
        }
        return teste;
    }

    public String ehFinados(){
        boolean mesOk = false;
        boolean diaOk = false;

        String fraseFinados = "";

        if(getMes() == 11){
            mesOk = true;
        }
        if(getDia() == 2){
            diaOk = true;
        }

        if(diaOk == true && mesOk == true){
            fraseFinados = "é dia de finados."; 
        }else{
            fraseFinados = "não é dia de finados.";
        }
        return fraseFinados;
    }
}
