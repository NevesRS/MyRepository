public class Data {
    String dia;
    String mes;
    String ano;

    public Data(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }
    public String getMes() {
        return mes;
    }
    public String getDia() {
        return dia;
    }
    
    public boolean validaData(String dia, String mes, String ano){
        boolean estado = false;

        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);

        int bissexto = 0;

        if(anoInt%4 == 0){
            bissexto = 29;
        }else{
            bissexto = 28;
        }
        
        if(mesInt > 0 && mesInt <= 12){
            switch(mesInt){
                case 1: if(diaInt > 0 && diaInt <= 31){
                    estado = true;
                }
                case 2: if(diaInt > 0 && diaInt <= bissexto){
                    estado = true;
                }
                case 3: if(diaInt > 0 && diaInt <= 31){
                    estado = true;
                }
                case 4: if(diaInt > 0 && diaInt <= 30){
                    estado = true;
                }
                case 5: if(diaInt > 0 && diaInt <= 30){
                    estado = true;
                }
                case 6: if(diaInt > 0 && diaInt <= 31){
                    estado = true;
                }
                case 7: if(diaInt > 0 && diaInt <= 31){
                    estado = true;
                }
                case 8: if(diaInt > 0 && diaInt <= 31){
                    estado = true;
                }
                case 9: if(diaInt > 0 && diaInt <= 30){
                    estado = true;
                }
                case 10: if(diaInt > 0 && diaInt <= 31){
                    estado = true;
                }
                case 11: if(diaInt > 0 && diaInt <= 30){
                    estado = true;
                }
                case 12: if(diaInt > 0 && diaInt <= 31){
                    estado = true;
                }
            }
        }

        return estado;
    }

    public String toString(String dia, String mes, String ano){
        if(validaData(dia, mes, ano)){
            return dia +"/"+mes+"/"+ano;
        }else{
            return "Data inválida!";
        }
    }
}
