lexer grammar LexerT;

// Tokens
BEGINGPS: 'bienvenido al gps';
END: 'has llegado a tu destino';
BEGIN: 'desde tu ubicacion actual,';

INPUT: 'preferencias de ruta:';
OUTPUT: 'indicaciones de ruta:';

ORDEN : ('dirigete' | 'sigue' | 'continua' | 'gira');
DIRECCION :( 'al norte' | 'al sur' | 'al este' | 'al oeste' | 'recto');
DISTANCIA : ( 'durante' | 'en' );
SENTIDO : ( 'a la derecha' | 'a la izquierda' );
MEDIDA : ( 'kilometros' | 'metros' | 'kilometro' | 'metro' );

IGUAL: 'es';
ID_SUMA: 'tomar salida';
ID_RESTA: 'corte camino en';
ID_MULT: 'realice un recorrido de';
ID_DIV: 'para llegar a';
SUMA: 'con';
RESTA: 'hacia';
MULT: 'veces alrededor de';
DIV: 'desvia en';

EXPONENCIAL : 'acelera';
COSENO : 'pasar cambio en';
RAIZC : 'derrapar a';

OR: 'o';
AND: 'y';

MAYOR: 'es distancia mayor';
MENOR: 'es distancia menor';
EQUAL: 'es distancia igual';
NOTEQUAL: 'es distancia diferente';
THAN: 'que';

IF: 'si';
THEN: 'entonces';
MIENTRAS: 'mientras';
DO: 'conduzca';
HACERMIENTRAS: 'cuando';

// Reglas léxicas
PUNTO: '.';
PARENTESIS_I: ('(');
PARENTESIS_D: (')');
VARNAME: [a-zA-Z]+ ;
INT: '-'?[0-9]+ ;
FLOAT: '-'?[0-9]+ '.' [0-9]+;
WS : [ \t\r\n]+ -> skip;