# Práctica parcial 01

## Implementaciones
Con este ejercicio se pretende aplicar todos los conceptos vistos en la
 primera unidad de 
programación orientada a objetos.

Los conceptos aplicados son:

* Creación de clases y objetos
* Clases estáticas
* Herencia
* Polimorfismo
* Clases abstractas
* Variables finales
* Funciones lambda
* Excepciones

Cada una de las implementaciones puede ser vista rápidamente en su IDE IntelliJ 
en la parte inferior, en TODO. Los comentarios con está etiqueta corresponderán 
a las secciones concretas en las cuales podrán consultar el funcionamiento de 
cada punto.
<hr>

## Enunciado

A través de conceptos de OO (orientación a objetos) simule el comportamiento 
de usuarios de un foro. Los usuarios se clasifican en ***final, moderador
 y administrador***.

### Usuario (final y base de los demás)
Los usuarios, sin importar su tipo tendrán un email y contraseña con las que 
se registraron en el foro, además de un nombre de usuario único que servirá
como identificador. <br> Los usuarios podrán crear posts, y solamente el OP
(Original Poster, o Posteador Original) a parte de los moderadores y
administradores podrá borrar/modificar el contenido de su post. Si el OP desea
modificar el post, deberá solicitarse su contraseña.

### Moderador
Los moderadores serán capaces de alterar contenido en los posts, pero no serán
capaces de eliminar el post como tal del foro.

### Administrador
Los administradores cuentan con el permiso total sobre cada post, 
independientemente de quien lo haya creado. Pueden modificar su contenido, o en
otra instancia eliminar completamente el post.

### Post
Un post es creado por un usuario. Se almacena fecha y hora de creación, el creador 
(nombre de usuario), un título o tema, y su contenido. 
Si un post es modificado, deberá guardar las fechas y horas de las modificaciones
realizadas. <br>
Todos los posts son almacenados en una única estructura principal, cuando un post
se elimina pasa a formar parte de una estructura adicional que funciona como papelera
de reciclaje, esto con finalidad de llevar un registro ordenado únicamente.
<br>
<br>
Cree las clases que crea conveniente para el funcionamiento del programa.

