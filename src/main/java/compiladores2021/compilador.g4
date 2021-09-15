grammar compilador;

@header{ 
package compiladores2021;
}

 PA: '(';
 PC: ')';
 LA: '{';
 LC: '}';
 I_WHILE: 'while';
 FOR:'for';
 IF: 'if';
 ELSE: 'else';
 ELSEIF: 'else if';
 AND: '&&';
 OR:  '||';
 IGUAL: '='; 
 MENOR: '<';
 MAYOR: '>';
 SUMA: '+';
 RESTA: '-';
 MULT: '*';
 DIVISION: '/'; 

//  ENTERO: '-'[0-9]+ | [0-9]+;  5 + (7-2) * 3
 ENTERO:  [0-9]+; 
 PCOMA: ';';
 TIPO_DATO: 'int' | 'double'| 'char';
 COMA: ',';
 ID: [a-zA-Z_] [a-zA-Z0-9_]*;

i_if:  IF PA ladoA signosdecomparacion ladoB PC bloque i_if 
    | ELSEIF PA ladoA signosdecomparacion ladoB PC bloque i_if
    | ELSE  bloque
    |
    ;
 
i_while : I_WHILE PA ladoA signosdecomparacion ladoB PC bloque;

signosdecomparacion :  MENOR
                    | MENOR IGUAL 
                    | MAYOR IGUAL
                    | MAYOR
                    | IGUAL IGUAL
                    | andor
                    ;
ladoA: ENTERO
     | ID
     | oal
     ;

ladoB: ENTERO
     | ID
     | oal
     ;


bloque :  LA instrucciones LC
       |  instruccion    
       ;

programa: instrucciones  EOF;  
instrucciones: instruccion instrucciones
             |
             ; 
instruccion: declaracion
            |estructuradecontrol
            ;
estructuradecontrol: i_while
|i_if
|i_for
;    
i_for: FOR PA secvar PCOMA ladoA signosdecomparacion ladoB PCOMA secvar PC  bloque ;       
    
declaracion: TIPO_DATO secvar PCOMA {System.out.println("Encontrado");}
|  secvar PCOMA {System.out.println("Encontrado");}
           ;  
secvar: ladoA IGUAL ladoB COMA  secvar  //para ahcer int a,b,c;
      | ladoA IGUAL ladoB
      | ladoA     
      | ladoA COMA secvar 
      ; 

oal: term t ;
term: factores f //Un termino puede ser un factor o un conjunto de suma y restas
    ;
t: SUMA term t
 | RESTA term t
 |
 ;

factores: ENTERO
      | '-' ENTERO
      | ID
      | PA oal PC//Al abri parentesis resetea loas prioriudades y vuewlve al comienzo
      ;

f: MULT factores f 
 | DIVISION factores f
 |
 ;


 andor: AND 
 | OR  
 ;