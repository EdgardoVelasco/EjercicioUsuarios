public class App {
    public static void main(String[] args) throws Exception {
        String cadena="Edgardo asd";
        char[] letras=cadena.toCharArray();
        String mensaje="es correcto";
        if(cadena.length()>=6&&cadena.length()<=12){
        for (int i=0;i<letras.length;i++){
            if(!((letras[i]>='a' && letras[i]<='z')||(letras[i]>='A'&&letras[i]<='Z'))){
                mensaje="no es correcto";
            }
        }
    }else{
        mensaje="no es correcto";
    }
        System.out.println(mensaje);
    }
}
