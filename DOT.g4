
/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
*/
/** Derived from http://www.graphviz.org/doc/info/lang.html.
    Comments pulled from spec.
 */
grammar DOT;

graph
   : STRICT? ( GRAPH | DIGRAPH ) id? '{' stmt_list '}'
   ;

stmt_list
   : ( stmt end_line? )*
   ;

stmt
   : node_stmt | edge_stmt | attr_stmt | property | subgraph
   ;

attr_stmt
   : ( GRAPH | NODE | EDGE ) attr_list
   ;

attr_list
   : ( '[' a_list? ']' )+
   ;

end_line
   : ';'
   ;

comma
   : ','
   ;

assign
   : '='
   ;

a_list
   : ( a_list_prop comma? )+
   ;

a_list_prop
   : ( id ( assign id )? )
   ;
property
  : ( id assign id )+
  ;

edge_stmt
   : ( node_id | subgraph ) edgeRHS attr_list?
   ;

edgeRHS
   : ( edgeop ( node_id | subgraph ) )+
   ;

edgeop
   : '->' | '--'
   ;

node_stmt
   : node_id attr_list?
   ;

node_id
   : id port?
   ;

port
   : ':' id ( ':' id )?
   ;

subgraph
   : ( SUBGRAPH id? )? '{' stmt_list '}'
   ;

id
   : ID | STRING | HTML_STRING | NUMBER
   ;

// "The keywords node, edge, graph, digraph, subgraph, and strict are
// case-independent"

STRICT
   : [Ss] [Tt] [Rr] [Ii] [Cc] [Tt]
   ;


GRAPH
   : [Gg] [Rr] [Aa] [Pp] [Hh]
   ;


DIGRAPH
   : [Dd] [Ii] [Gg] [Rr] [Aa] [Pp] [Hh]
   ;


NODE
   : [Nn] [Oo] [Dd] [Ee]
   ;


EDGE
   : [Ee] [Dd] [Gg] [Ee]
   ;


SUBGRAPH
   : [Ss] [Uu] [Bb] [Gg] [Rr] [Aa] [Pp] [Hh]
   ;


/** "a numeral [-]?(.[0-9]+ | [0-9]+(.[0-9]*)? )" */ 
NUMBER
   : '-'? ( '.' DIGIT+ | DIGIT+ ( '.' DIGIT* )? )
   ;


fragment DIGIT
   : [0-9]
   ;


/** "any double-quoted string ("...") possibly containing escaped quotes" */ 
STRING
   : '"' ( '\\"' | . )*? '"'
   ;


/** "Any string of alphabetic ([a-zA-Z\200-\377]) characters, underscores
 *  ('_') or digits ([0-9]), not beginning with a digit"
 */ 
ID
   : LETTER ( LETTER | DIGIT )*
   ;


fragment LETTER
   : [a-zA-Z\u0080-\u00FF_]
   ;


/** "HTML strings, angle brackets must occur in matched pairs, and
 *  unescaped newlines are allowed."
 */ 
HTML_STRING
   : '<' ( TAG | ~ [<>] )* '>'
   ;


fragment TAG
   : '<' .*? '>'
   ;


COMMENT
   : '/*' .*? '*/' -> skip
   ;


LINE_COMMENT
   : '//' .*? '\r'? '\n' -> skip
   ;


/** "a '#' character is considered a line output from a C preprocessor (e.g.,
 *  # 34 to indicate line 34 ) and discarded"
 */ 
PREPROC
   : '#' .*? '\n' -> skip
   ;


WS
   : [ \t\n\r]+ -> skip
   ;
