
package pedidospizza;

public class PedidosPizza {

    public static void main(String[] args) {
        Pizza p1 = new Pizza(Tipo.MARGARITA, "mediana");
        Pizza p2 = new Pizza(Tipo.FUNGHI, "familiar");
        p2.sirve();
        Pizza p3 = new Pizza(Tipo.CUATRO_QUESOS, "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
    
}
