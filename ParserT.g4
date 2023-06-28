grammar ParserT;
import LexerT;
// Inicio de la gramática

program : BEGINGPS BEGIN instrucciones* END;
instrucciones:  (instruccion | instruccion operador instruccion | ciclo | operacion | declaracion | lectura | impresion);
instruccion : orden sentido distancia PUNTO*;
declaracion: VARNAME 'es' (INT | FLOAT);

operacion : (suma | resta | multiplicacion | division | funcion);

operador : (AND | OR);
orden : ORDEN;
sentido : ( SENTIDO | DIRECCION );
distancia : DISTANCIA (INT | FLOAT) MEDIDA;
lectura: INPUT '(' (INT | FLOAT | VARNAME) ')';
// ej. preferencias de ruta: (20)
impresion: OUTPUT '(' (INT | FLOAT | VARNAME) ')';
// ej. indicaciones de ruta: (40)
ciclo: si | mientras | hacermientras;
funcion : exp | cos | sqrt;

si : 'si' senlogica 'entonces' instrucciones;
mientras : 'mientras' senlogica 'conduzca' instrucciones PUNTO*;
hacermientras : instruccion 'cuando' senlogica PUNTO*;

senlogica : afirmacion ((OR | AND) afirmacion)*;
afirmacion : mayor | menor | igual | distinto;

mayor : MAYOR 'que' INT MEDIDA;
menor : MENOR 'que' INT MEDIDA;
igual : EQUAL 'que' INT MEDIDA;
distinto : NOTEQUAL 'que' INT MEDIDA;

suma : VARNAME 'es' 'tomar salida' (INT | FLOAT | VARNAME) 'con' (INT | FLOAT | VARNAME);
resta : VARNAME 'es' 'corte camino en' (INT | FLOAT | VARNAME) 'hacia' (INT | FLOAT | VARNAME);
multiplicacion : VARNAME 'es' 'realice un recorrido de' (INT | FLOAT | VARNAME) 'veces alrededor de' (INT | FLOAT | VARNAME);
division : VARNAME 'es' 'para llegar a' (INT | FLOAT | VARNAME) 'desvia en' (INT | FLOAT | VARNAME);

exp : VARNAME 'es' EXPONENCIAL (INT | FLOAT) MEDIDA;
cos : VARNAME 'es' COSENO (INT | FLOAT) MEDIDA;
sqrt : VARNAME 'es' RAIZC (INT | FLOAT) MEDIDA;