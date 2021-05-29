var nombre="Ed123gdo";

if(isLetter(nombre)){
   alert("Es correcto el dato");
}else{
   alert("el dato no es correcto")
}

function isLetter(cadena){
   return /^[a-z,A-Z]{6,12}$/.test(cadena) && (cadena.length>6&&cadena.length<=12)
}