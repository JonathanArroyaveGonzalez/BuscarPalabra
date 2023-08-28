Primera prueba:
Carpeta “pruebas1”, con tres archivos de texto:

Archivo “Texto1.txt” que tiene el siguiente texto internamente:
“Cómo arar un campo de trigo.
Para cultivar un campo de trigo primero se debe alistar la tierra (arar, preliminar)
apropiadamente; y para ello se debe arar, por lo general con herramientas como un
tractor, creando los surcos necesarios para las semillas.”

Archivo “Texto2.txt” que tiene el siguiente texto internamente:
“Es importante encarar las situaciones negativas cuando se presentan, para salir de ellas
rápidamente.”

Archivo “Texto3.txt” que tiene el siguiente texto internamente:
“En el cultivo, arar es una función importante. No es solo mover tierra, arar es:
conectarse con la tierra.”

Palabra buscada: “arar”
Resultado esperado:
Texto1.txt 3 veces
Texto2.txt 0 veces
Texto3.txt 2 veces
Total: 5 veces

Segunda prueba:
Carpeta “pruebas2” que tiene un archivo llamado “imagen.jpg”, no contiene archivos de texto.
Palabra buscada: “foto”

Resultado esperado: Mensaje indicando que no se encontraron archivos de texto en la carpeta.

Tercera prueba:
Carpeta “Incorrecta”, que no debe existir en el computador.
Palabra buscada: “ejemplo”
Resultado esperado: Mensaje indicando que no se encuentra la carpeta indicada.