grammar ParserT;
import LexerT;
// Inicio de la gramática

program : BEGINGPS BEGIN instrucciones* END;

instrucciones:  (instruccion | instruccion operador instruccion | ciclo | operacion | declaracion | lectura | impresion);
instruccion : orden sentido distancia;


declaracion: VARNAME IGUAL (INT | FLOAT);

operacion : (suma | resta | multiplicacion | division | funcion);

operador : (AND | OR);
orden : ORDEN;
sentido : ( SENTIDO | DIRECCION );
distancia : DISTANCIA (INT | FLOAT) MEDIDA;
lectura: INPUT PARENTESIS_I (INT | FLOAT | VARNAME) PARENTESIS_D;
// ej. preferencias de ruta: (20)
impresion: OUTPUT PARENTESIS_I (INT | FLOAT | VARNAME) PARENTESIS_D;
// ej. indicaciones de ruta: (40)
ciclo: si | mientras | hacermientras;
funcion : exp | cos | sqrt;

si : IF senlogica THEN instrucciones;
mientras : MIENTRAS senlogica DO instrucciones;
hacermientras : instruccion HACERMIENTRAS senlogica;

senlogica : afirmacion ((OR | AND) afirmacion)*;
afirmacion : mayor | menor | igual | distinto;

mayor : MAYOR THAN INT MEDIDA;
menor : MENOR THAN INT MEDIDA;
igual : EQUAL THAN INT MEDIDA;
distinto : NOTEQUAL THAN INT MEDIDA;

suma : VARNAME IGUAL ID_SUMA (INT | FLOAT | VARNAME) SUMA (INT | FLOAT | VARNAME);
resta : VARNAME IGUAL ID_RESTA (INT | FLOAT | VARNAME) RESTA (INT | FLOAT | VARNAME);
multiplicacion : VARNAME IGUAL ID_MULT (INT | FLOAT | VARNAME) MULT (INT | FLOAT | VARNAME);
division : VARNAME IGUAL ID_DIV (INT | FLOAT | VARNAME) DIV (INT | FLOAT | VARNAME);

exp : VARNAME IGUAL EXPONENCIAL (INT | FLOAT) MEDIDA;
cos : VARNAME IGUAL COSENO (INT | FLOAT) MEDIDA;
sqrt : VARNAME IGUAL RAIZC (INT | FLOAT) MEDIDA;