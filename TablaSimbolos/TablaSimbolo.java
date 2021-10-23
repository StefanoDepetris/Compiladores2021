import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

 public class TablaSimbolo{
    private List<HashMap<String,Id>> tabla;
    private static  TablaSimbolo TablaSimbolo;
    public TablaSimbolo(){
        tabla= new  ArrayList<HashMap<String,Id>>();//String es el nombre de la variable y Id() TENDRIA QUE SER UNA LinkedList
    }
    public static TablaSimbolo getSingletonInstance() {
        TablaSimbolo= new TablaSimbolo();
        return TablaSimbolo;  
    }
    public void addContexto(){
         HashMap<String,Id> map1 = new HashMap<String,Id>();
        // map1.put(id.getId(),id);
        tabla.add(map1);

    }
    public void delContexto(){
        int ultimoValor;
        if(tabla.size()>0){
             ultimoValor= tabla.size()-1;
             tabla.remove(ultimoValor);
        }
        else{
           System.out.println("No tiene ningun nodo la Lista  de contextos");
        }
       
    }
    public boolean agregarAlContextoActual(Id id){
        if(tabla.size()>0){
            
           // System.out.println("Se puede agregar a la tabla porque hay un contexto creado");
            tabla.get(tabla.size()-1).put(id.getId(),id);
            return true;
        }
       else{
        System.out.println("No hay un contexto creado");
        return false;
       }

        
    }
    public boolean buscarSimbolo(Id id){
        if(tabla.size()>0){

        
        for(HashMap<String,Id> mapa: tabla){ //Con esto recorro la lista
    
            for (HashMap.Entry<String, Id> entry : mapa.entrySet()) {
                if(entry.getValue()==id){
                    System.out.println("Se encontro el simbolo: "+id.getId()+" en el contexto Global");
                    return true;
                }
            }
        }
        System.out.println("No se encontro el simbolo: "+id.getId()+" en el contexto Global");
        return false;
        }
        else{
            
        System.out.println("No se encontro el simbolo: "+id.getId()+" en el contexto Global");
            return false; //Porque no hay elementos en la lista.
        }
    }
    
    public boolean buscarSimboloLocal(Id id){
        if(tabla.size()>0){
            HashMap<String,Id> maaux= tabla.get(tabla.size()-1);
            for (Map.Entry<String, Id> entry : maaux.entrySet()) {
                if(entry.getValue()==id){
                    System.out.println("Se encontro el simbolo: "+id.getId()+" en el contexto Local");
                    return true;
                }
            }
            System.out.println("No se encontro el simbolo: "+id.getId()+" en el contexto Local");
            return false;
        }
        else{
            System.out.println("No se encontro el simbolo: "+id.getId()+" en el contexto Local");
            return false; //Porque no hay elementos en la lista.
        }
    }
    


    public static void main(String[] args)
    {
        
        TablaSimbolo tabla= new TablaSimbolo();

        System.out.println("###################SE CREO NUEVO CONTEXTO#######################");
            tabla.addContexto();                                         //################CREO CONTEXTO############################################

            Id id= new Variable("Id",TipoDato.STRING);
            tabla.agregarAlContextoActual(id);                          //################AGREGO  ID############################################
            System.out.println("#AGREGO AL CONTEXTO ACTUAL ID");
            tabla.buscarSimboloLocal(id);

            id.setInicicializado();
            if(id.getInicializado()==true){
                System.out.println(id.getId()+ "------->Fue inicializado");
            }
            else{
                System.out.println(id.getId()+ "------->No fue inicializado");
            }


            Id id2= new Variable("Id2",TipoDato.STRING);     //################AGREGO  ID############################################
            tabla.agregarAlContextoActual(id2);
            System.out.println("#AGREGO AL CONTEXTO ACTUAL ID2");
            tabla.buscarSimboloLocal(id2);     
       
       
        System.out.println("\n" +"###################SE CREO NUEVO CONTEXTO#######################");
        tabla.addContexto();//                                      //################CREO CONTEXTO 2############################################
        

            tabla.buscarSimboloLocal(id);
            tabla.buscarSimbolo(id);
            
            Id id5= new Variable("Id",TipoDato.STRING);
            tabla.agregarAlContextoActual(id5);                          //###############LO AGREGO#############################################
            System.out.println("#AGREGO AL CONTEXTO ACTUAL ID");
            tabla.buscarSimboloLocal(id5);
            tabla.buscarSimbolo(id5);
            if(id5.getInicializado()==true){
                System.out.println(id5.getId()+ "------->Fue inicializado en este contexto");
            }
            else{
                System.out.println(id5.getId()+ "------->No fue inicializado en este contexto");
            }



            Id id3= new Variable("ID3",TipoDato.STRING);     //################AGREGO  ID3############################################
            tabla.agregarAlContextoActual(id3);
            System.out.println("#AGREGO AL CONTEXTO ACTUAL ID3");
            tabla.buscarSimbolo(id3);
            tabla.buscarSimboloLocal(id3);


            Id id4= new Funcion("ID4" , TipoDato.VOID);     //################AGREGO  ID4############################################
            tabla.agregarAlContextoActual(id4);
            System.out.println("#AGREGO AL CONTEXTO ACTUAL id4");
            tabla.buscarSimbolo(id4);
            tabla.buscarSimboloLocal(id4);
           
            
            
            
            
            System.out.println("\n" +"###################ELIMINO NUEVO CONTEXTO#######################");
            tabla.delContexto();


            tabla.buscarSimbolo(id4);
            tabla.buscarSimboloLocal(id4);

            tabla.buscarSimbolo(id3);
            tabla.buscarSimboloLocal(id3);

            tabla.buscarSimbolo(id);
            tabla.buscarSimboloLocal(id);


    }
 }



        //  tabla.delContexto();
        //  if(tabla.buscarSimboloLocal(id)==true){
        //      System.out.println("Se encontro el simbolo");
        //  }
        //  else{
        //      System.out.println("No se encontro el simbolo");
        //  }
    




