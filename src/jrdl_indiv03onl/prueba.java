
package jrdl_indiv03onl;


import javax.swing.JOptionPane;


public class prueba {

    
    public static void main(String[] args) {
        usuario usuario1 = new usuario("José", "Romero Pérez",52,"51484485Y");
        producto producto2 = new producto("157S", "PCI",85);
        int op=0;
        String mensaje;
        String continua="s";
    do {        
           try
              {    // estructura para capturar excepción
                mensaje = String.format("¿Que desea hacer? \n" + "1 - Ver datos almacenados. \n"+
                                "2 - Cambiar los datos. \n"+
                                "3 - Salir. \n");
                    op= Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,
                                               "ELEGIR OPCIÓN (1-3)", JOptionPane.OK_CANCEL_OPTION));
                   if (op >= 1 & op <= 3) 
                     {
                       switch (op) 
                        {
                           case 1: 
                              System.out.println(usuario1.toString() + "\n" + producto2.toString());
                             break;
                           case 2: 
                             usuario1.setNombre("Juan");
                             usuario1.setApellidos("Fernandez López");
                             producto2.setreferencia("143V");
                             producto2.setunidades(73);
                             System.out.println(usuario1.toString());
                              System.out.println(producto2.toString());
                             break;
                           case 3: 
                             System.out.println("Hasta luego!");
                             break; 
                          
                        }   
                      
                       continua = JOptionPane.showInputDialog(null,"¿Desea continuar? (S/N)"," ELEGIR OPCION",
                                            JOptionPane.INFORMATION_MESSAGE);
                    }   
                }              
                catch(Exception e){
                                     JOptionPane.showMessageDialog(null, "Por favor ingrese"
                                             + " solo numeros, entre 1 y 3 ", "ERROR",JOptionPane.ERROR_MESSAGE);
                                   }
       
        }
        while ("s".equals(continua));
    }
    
}
