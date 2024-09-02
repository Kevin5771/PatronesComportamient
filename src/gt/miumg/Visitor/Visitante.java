
package gt.miumg.Visitor;

//Visitante
public interface Visitante {
    void visitar(Coche coche);
    void visitar(Moto moto);
    void visitar(Camion camion);
}
