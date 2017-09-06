
package pedidospizza;


public class Pizza {
    private Tipo sabor;
    private String tamaño;
    private static int TotalPedidas = 0;
    private static int TotalServidas = 0;
    private boolean estado;
    
    public Pizza(){
        this.estado = false;
        this.sabor   = Tipo.MARGARITA;
        this.tamaño = "mediana";
        TotalPedidas += 1;
    }
    
    public Pizza(Tipo sabor, String tamaño){
        this.estado = false;
        this.sabor = sabor;
        this.tamaño = tamaño;
        TotalPedidas += 1;
    }

    
     
    public void sirve(){
        if(estado == true){
            System.out.println("servida");
        } else {
            estado = true;
            TotalServidas += 1;
            TotalPedidas -= 1;
        }
        
        
    }

    public static int getTotalPedidas() {
        return TotalPedidas;
    }
    
    
    
    
    public static void setTotalPedidas(int TotalPedidas) {
        Pizza.TotalPedidas = TotalPedidas;
    }

    public static int getTotalServidas() {
        return TotalServidas;
    }

    public static void setTotalServidas(int TotalServidas) {
        Pizza.TotalServidas = TotalServidas;
    }

       
    
    public Tipo getTipo() {
        return sabor;
    }

    public void setTipo(Tipo sabor) {
        this.sabor = sabor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
    @Override
    public String toString(){
        String estadoString = "";
        if(estado){
            estadoString = "servida";
        } else {
            estadoString = "pedida";
        }
        
        return ("pizza " + sabor + " " + tamaño + " " + estadoString).toLowerCase();
    }
    
    
    
}
