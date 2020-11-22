package edu.upc.eetac.dsa;


import java.util.List;
import edu.upc.eetac.dsa.models.Product;
import edu.upc.eetac.dsa.models.User;
import edu.upc.eetac.dsa.models.Pedido;

public interface ProductManager {
    //lista de productos
    List<Product> getSortedProductsByPrice();
    //lista de usuarios
    List<User> getUserList();
    List<Product> getSortedProductsByVentas();
    List<Pedido> getPedidoPorUsuario(String idUser);

    int addPedido(String idUser, List<Product> listProducts, int cantidad);

    int servirPedido(List<Product> listProducts);

    void liberarRecursos();



}
