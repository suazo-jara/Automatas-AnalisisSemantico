grammar ParserT;
import LexerT;
// Inicio de la gramática

program : BEGINGPS BEGIN instrucciones* END;
instrucciones:  (instruccion | instruccion operador instruccion | ciclo | operacion);
instruccion : orden sentido distancia PUNTO*;

operacion : (suma | resta | multiplicacion | division | funcion);

operador : (AND | OR);
orden : ORDEN;
sentido : ( SENTIDO | DIRECCION );
distancia : DISTANCIA (INT | FLOAT) MEDIDA;
lectura: INPUT 'hacia' CADENA;
// ej. preferencias de ruta: hacia "Cochrane"
impresion: OUTPUT 'hacia' CADENA;
// ej. indicaciones de ruta: hacia "Cochrane"
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

suma : 'tomar salida' (INT | FLOAT) 'con' (INT | FLOAT);
resta : 'corte camino en' (INT | FLOAT) 'hacia' (INT | FLOAT);
multiplicacion : 'realice un recorrido de' (INT | FLOAT) 'veces alrededor de' (INT | FLOAT);
division : 'para llegar a' (INT | FLOAT) 'desvia en' (INT | FLOAT);

exp : EXPONENCIAL (INT | FLOAT) MEDIDA;
cos : COSENO (INT | FLOAT) MEDIDA;
sqrt : RAIZC (INT | FLOAT) MEDIDA;