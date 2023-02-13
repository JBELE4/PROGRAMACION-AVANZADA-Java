package Estructuras.pdf.eje3;

import java.util.*;

public class GestorDeViajes {
    private List<Viaje>viajes=new ArrayList<>();
    private Map<String,List<Viaje>>viajesOrigen=new HashMap<>();
    private Map<String,List<Viaje>>viajesDestino=new HashMap<>();
    private Set<String>ciudades=new HashSet<>();
public void addViaje(Viaje viaje){
    this.viajes.add(viaje);
    this.viajesDestino.put(viaje.devolverDes(),this.viajes);
    this.viajesOrigen.put(viaje.devolverOrg(),this.viajes);
    this.ciudades.add(viaje.devolverDes());
    this.ciudades.add(viaje.devolverOrg());

}

public Collection<Viaje>devovlerOG(String city){
  return this.viajesOrigen.get(city)  ;

}
    public Collection<Viaje>devovlerDes(String city){
        return this.viajesDestino.get(city)  ;

    }
    public Collection<Viaje>todo(){
    return  this.viajes;
    }
    public Collection<String>ciudades(){
        return  this.ciudades;
    }
}
