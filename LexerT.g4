lexer grammar LexerT;

// Tokens
BEGINGPS: 'bienvenido al gps.';
END: 'has llegado a tu destino.';
BEGIN: 'desde tu ubicacion actual,';

INPUT: 'preferencias de ruta:';
OUTPUT: 'indicaciones de ruta:';

ORDEN : ('dirigete' | 'sigue' | 'continua' | 'gira');
DIRECCION :( 'al norte' | 'al sur' | 'al este' | 'al oeste' | 'recto');
DISTANCIA : ( 'durante' | 'en' );
SENTIDO : ( 'a la derecha' | 'a la izquierda' );
MEDIDA : ( 'kilometros' | 'metros' | 'kilometro' | 'metro' );
PUNTO : '.';

EXPONENCIAL : 'acelera';
COSENO : 'pasar cambio en';
RAIZC : 'derrapar a';

OR: 'o';
AND: 'y';

MAYOR: 'distancia mayor';
MENOR: 'distancia menor';
EQUAL: 'distancia igual';
NOTEQUAL: 'distancia diferente';

// Reglas léxicas
VARNAME: [a-zA-Z]+ ;
INT: '-'?[0-9]+ ;
FLOAT: '-'?[0-9]+ '.' [0-9]+;
WS : [ \t\r\n]+ -> skip;