## Ejercicio

Simular el comportamiento de un smartphone al instalar una aplicación. Deberá existir una clase que cumpla la función de tienda/repositorio de aplicaciones. Cada aplicación cuenta con su paquete "com" siendo este un valor único e irrepetible en el repositorio, nombre, lenguaje, tipo, tamaño de descarga y tamaño de instalación (ambos en GB, tamaño de instalación corresponde al 110% del tamaño de descarga) y precio (en USD, $0.00 para las gratuitas).
Las aplicaciones serán publicadas en la tienda, con la única condición que no exista otra aplicación con el mismo nombre de paquete.
El smartphone tendrá una marca, modelo, OS, capacidad de plan de datos, y capacidad en GB de almacenamiento.
Para que un usuario pueda descargar una aplicación, deben tomarse en cuenta los siguientes criterios:
* La aplicación no debe estar instalada previamente.
* El tamaño de descarga debe ser menor a la capacidad de plan de datos restante del usuario.
* El tamaño de instalación debe ser menor a la capacidad de almacenamiento restante del dispositivo.
* Si la aplicación es de paga, debe haber un prompt de confirmación previa para que el usuario reafirme que desea instalar la aplicación.
<br>

Su programa deberá encargarse de manejar cualquier tipo de error a través de excepciones personalizadas y/o del sistema, además deberá constar de:
* Agregar aplicación a la tienda
* Consultar aplicaciones de la tienda (todas)
* Instalar aplicación
* Mostrar aplicaciones instaladas
* Desinstalar aplicación
* Mostrar datos y almacenamiento restante
* Salir