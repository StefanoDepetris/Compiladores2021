grammar compilador;

@header{ 
package compiladores2021;
}

 PA: '(';
 PC: ')';
 IGUAL: '=';
 DIGITO : [0-9] ;  
 PCOMA: ';';
 TIPO_DATO: 'int' | 'double'| 'char';
 COMA: ',';
 ID: [a-zA-Z_] [a-zA-Z0-9_]*;

programa: { System.out.println("INICIO"); }instrucciones { System.out.println("FIN"); } EOF;  
instrucciones: instruccion instrucciones
             |
             ; 
instruccion: declaracion;
declaracion: TIPO_DATO secvar PCOMA {System.out.println("Encontrado");} 
           ;  
secvar: ID igual COMA  secvar  //para ahcer int a,b,c;
      | ID igual    //para ahcer int a,b,c;
      | ID COMA secvar
   
      | ID
      ;
igual: IGUAL ID
     | IGUAL DIGITO
     ;