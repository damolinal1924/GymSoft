# GymSoft
 Sistema de gimnasio GymSoft

----------------------------------------------------------------------------------
# INSTRUCCIONES DE INSTALACIÓN Y CONFIGURACION DEL PROYECTO
----------------------------------------------------------------------------------

* NOTA: Es un proyecto que realice en mi época de estudiante de ingeniería de sistemas y estaba aprendiendo buenas prácticas de programación, pero este proyecto
les va a servir para reutilizar código, mejorarlo, adaptarlo a lo que quieren y aprender muchisimo de programación en especial de Java. 
Por eso hoy quiero compartirlo con ustedes para que puedan aprender que es la idea del canal compartir el conocimiento con los suscriptores, a continuación el
paso a paso de instalación.

1. Utilice IDE Netbeans, pero pueden utilizar cualquier otro con el que se sientan comodos, Eclipse, IntelliJ IDEA, etc.
2. Base de datos Mysql, para este proyecto utilice Xampp pero pueden utilizar el de su gusto tambien.
3. Para los reportes utilice iReport, solo deben tener en cuenta que el logo del informe viene de una ruta de base de datos y deben cambiarla por una ruta
   de su computadora para que pueda encontrar la imagen o logo si no lo cambia por una imagen fija que no venga de base de datos.   
4. Deben cambiar la conexión de base de datos por sus parametros es decir nombre de base de datos contraseña, ip, en este caso serian los siguientes:
   String bd = "gymsoft";
   String user="root";
   String pass="";
   String url="jdbc:mysql://localhost/"+bd;
5. Las librerias del proyecto se encuentra en la siguiente ruta del proyecto GymSoft/utilidades/lib deberan importarlas,
   si no aparecen las pueden descargar en el siguiente link xxxx y colocarlas en la ruta antes emncionada.
6. Deben importar la base de datos que se encuentra en la siguiente ruta del proyecto: GymSoft/db/gymsoft.sql

Cualquier duda me pueden escribir al correo o a mis redes.

Muchas gracias, se pueden suscribir al canal en el siguiente link https://bit.ly/MLtutoriales para que puedan acceder a todos los contenidos y temas de actualidad.