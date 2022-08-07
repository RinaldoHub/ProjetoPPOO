package parksystem;

public class FilialFactory {
    
    public Filial construirFilal(String filial) {
        Filial filialEspecificada = null;
        
        if (filial.equals("Recife")) {
            filialEspecificada = new FilialRecife();
        }
        else if (filial.equals("Olinda")) {
            filialEspecificada = new FilialOlinda();
        }
        
        return filialEspecificada;
    }

}
