# alexf14-Calculadora_AWT_Alejandro_Fuertes
Recuperación calculadora en AWT
Para crear este proyecto se ha debido seguir una serie de pasos. El primero de ellos ha sido diseñar la interfaz la cual procederemos a crear dentro del programa una vez 
hayamos finalizado el primer paso.
Con la interfaz ya diseñada procederemos a crearla dentro de la aplicación, usando únicamente AWT, lo primero es crear los GridBagLayout necesarios para poder agrupar los botones 
de una forma sencilla y ordenada, después procederemos a declarar la pantalla (en este caso es un TextField) en la que mostraremos las operaciones que vayamos haciendo. 
Ahora declararemos los botones que usaremos tanto para mostrar los números con los cuales queremos operar, que irán en un GridBagLayout, como los operadores que vamos a usar, que 
irán en el otro que hemos declarado. Después de declarar todos los botones debemos indicar en que posición se encontrará cada uno de ellos, una vez hecho eso y haber ajustado 
todos los tamaños necesarios procederemos al último paso que se trata de la programación para poder llegar a operar con varios números sin ningún problema. En este último paso
hemos creado un método aparte exclusivamente para dichas operaciones, en el cual se le pasara un String con el contenido de nuestra operación, para que todo funcione lo hemos 
realizado todo dentro de un bucle For para así poder recorrer el String de manera sencilla, lo primero que hacemos es comprobar que no haya ningún operador, mediante su 
denominación en ASCII, si la operación tiene un operador se agregará a la variable símbolo que hemos declarado para guardar el operador que vayamos a utilizar, si no hay ningún 
operador se añadir el número a la variable la cual guarda el número actual. Si existe algún operador se realizará la operación con el número actual y con el resultado de las 
anteriores operaciones, cuando se haya recorrido por completo el String de la operación se mostrará el resultado por pantalla.
