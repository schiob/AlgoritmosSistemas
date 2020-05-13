## Ejercicio Práctica 8 - Búsqueda secuencial sencillita

Susana es fanática de las estampillas, tiene cientos de miles de ellas. Afortunadamente tiene todo ordenado en libros, y estos libros en las repisas de un mueble. El mueble de Susana tiene $3$ repisas, a cada repisa le caben $5$ libros, cada libro tiene $10$ páginas, y cada página tiene $5$ estampillas.

Susana te va a dar una lista con todas sus estampillas ordenadas por repisa, libro y página. Y te pide que cuando te pida un identificador de una estampilla le digas en qué $repisa$, $libro$, $página$ y $posición$ está esa estampilla.

### Input

La entrada será recibida por $STDIN$

Consiste en 3 grupos, uno por repisa, separados por una linea en blanco. Cada grupo se conforma de $5$ lineas, una por libro. Estas 5 lineas tienen $10$ grupos separados por un espacio, y cada uno de estos grupos tienen $5$ números separados por comas.

Cada identificador de las estampillas es un número entre 1 y 750.

 - Ejemplo de uno de los libros:
```
569,734,458,405,450 718,428,74,257,67 433,145,431,599,166 69,233,695,232,616 558,717,688,592,80 214,619,614,507,157 411,525,97,222,701 702,461,249,663,13 554,290,712,289,713 491,699,470,567,590
```
En este ejemplo 569,734,458,405 y 450 son las estampillas que están en la primera página de este libro.

Varias lineas de este estilo conforman los libros de una repisa.
Si hay una linea en blanco esto representa el final de una repisa.

En la última linea, después de una linea en blanco, hay un entero $n$ el identificador de la estampilla que está buscando Susana.

### Output

Imprime a salida estandar $STDOUT$ la posición de la estampilla dando el índice de la $repisa$, $libro$, $página$ y $posición$ o un $-1$ si no está en la colección. Estos índices deben comenzar con 1.

### Ejemplos

#### Entrada
```
430,323,642,466,370 292,687,141,560,394 537,70,348,661,181 641,63,542,388,127 275,652,749,446,738 626,683,94,418,480 282,298,667,424,742 237,485,629,484,384 468,509,95,640,576 271,248,140,349,422
569,734,458,405,450 718,428,74,257,67 433,145,431,599,166 69,233,695,232,616 558,717,688,592,80 214,619,614,507,157 411,525,97,222,701 702,461,249,663,13 554,290,712,289,713 491,699,470,567,590
14,125,600,669,366 311,189,674,312,131 338,479,197,346,167 747,745,84,666,620 675,143,226,595,478 499,511,165,246,618 65,170,61,274,444 178,515,343,184,625 173,643,240,330,44 93,89,540,690,356
79,741,10,260,635 120,168,206,396,630 483,291,308,192,53 325,536,549,85,417 234,748,710,421,408 562,581,188,368,746 651,578,297,11,606 147,376,262,58,345 216,703,551,29,215 326,144,281,715,155
533,111,129,459,493 119,279,532,146,420 191,571,656,256,570 270,16,24,650,682 83,432,78,448,615 722,218,208,247,20 460,664,7,397,574 731,12,464,678,476 494,183,363,344,320 352,685,30,107,594

389,497,573,416,520 477,502,132,25,534 265,612,109,426,303 504,398,258,264,350 419,137,37,691,43 82,602,150,139,550 162,110,229,628,729 354,694,357,245,593 160,57,310,227,577 49,243,5,288,199
193,589,283,66,529 359,242,50,488,435 730,3,369,296,591 266,671,151,136,621 182,324,45,638,390 381,708,518,439,55 737,253,750,4,711 588,175,727,662,277 100,329,28,321,148 633,250,596,561,658
202,6,648,18,81 187,563,134,88,527 276,101,268,177,169 455,195,728,300,423 186,604,452,171,172 733,71,56,467,414 364,87,399,200,583 720,353,286,386,334 231,383,39,104,580 86,114,653,724,681
92,210,105,36,59 124,582,473,395,161 52,108,185,707,198 706,293,566,239,307 425,700,152,697,72 603,46,487,163,601 721,332,680,413,342 512,677,472,637,287 122,318,434,607,337 686,306,644,377,544
51,744,278,220,676 361,244,9,611,622 123,716,379,692,456 373,90,212,714,530 510,121,586,339,474 387,598,523,684,374 106,315,735,528,96 410,740,522,228,617 407,732,462,471,47 255,103,149,698,679

230,116,138,585,441 154,221,610,496,489 225,351,505,328,135 393,555,319,572,403 261,469,547,609,62 304,382,98,552,205 538,340,482,498,194 22,263,475,463,392 438,294,126,646,429 115,17,201,77,301
362,355,517,64,133 636,117,1,305,605 299,500,501,465,660 217,40,284,236,726 516,112,54,211,486 564,445,42,341,317 158,15,440,316,302 213,391,556,371,295 634,503,709,26,490 719,541,48,437,545
704,539,68,360,27 584,400,380,314,673 723,102,481,613,60 142,130,322,21,327 159,358,649,174,401 659,335,347,508,443 8,34,31,153,32 91,76,689,531,672 252,41,179,447,632 597,38,696,2,267
647,367,385,668,449 453,309,624,519,118 579,705,280,365,559 743,223,219,180,568 639,451,654,524,251 543,442,19,415,99 113,454,406,655,657 693,203,521,409,513 535,457,207,404,378 665,645,128,436,241
269,73,623,427,272 565,495,553,375,575 402,736,331,224,372 273,176,608,526,412 23,156,557,285,35 190,254,164,33,631 333,514,313,725,336 548,209,627,204,670 75,506,196,259,587 546,235,492,238,739

566
```
#### Salida

```
2 4 4 3
```

##### Explicación
El número 566 está en la tercera posición, de la cuarta hoja, del cuarto libro, del segundo estante.

### Detalles
En la página de github tal vez se vean como que una linea se pasa a la siguiente, es solo porque está larga, sigue siendo una sola línea. Viendo el archivo raw pueden ver las lineas tal cuál.