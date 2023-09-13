# Script_Java_Python

# Explicacion 

## Script Java para MongoDB y MySql

1. Importamos las clases necesarias para poder ejecutar nuestro codigo en java, haciendo uso de la extension de mysql para poder cargar nuestro codigo en la base de datos.
2. Configura la información de conexión a la base de datos ingresando nuestras creedenciales que son la url, esuario y contraseña. Se establece una conexión a la base de datos utilizando DriverManager.getConnection() y la información de conexión proporcionada.
3. Definimos la cantidad de nombres aleatorios que se insertarán en la base de datos (en este caso, 10).
4. Se prepara una consulta SQL parametrizada utilizando PreparedStatement. La consulta SQL se insertará en la tabla nombres de la base de datos. La consulta tiene un parámetro (?) el cual se llenará con nombres aleatorios.
5. Utilizamos un bucle for para generar nombres aleatorios y realizar inserciones en la base de datos.
6. Se muestra un mensaje en la consola indicando cuántos nombres aleatorios se insertaron en la base de datos.
7. Se cierra la conexión a la base de datos y el objeto PreparedStatement para liberar recursos y asegurarse de que la conexión se maneje adecuadamente.


## Script Python para MongoDB y MySql

1. Importación de bibliotecas: pymysql, pymongo y faker. Esta ultima nos permite generar datos ficticios.
2. Configuración de la conexión a la base de datos MySQL, se establece una conexión a una base de datos MySQL en un servidor local con las siguientes credenciales:
host: localhost (el servidor de la base de datos se encuentra en la misma máquina).
user: root (el nombre de usuario de la base de datos).
password: SoaD1725. (la contraseña del usuario de la base de datos).
database: NOMBRES_ALEATORIOS (el nombre de la base de datos en la que se insertarán los nombres).
3. Creamos un cursor el cual se utilizará para ejecutar consultas SQL en la base de datos.
4. Creamos una instancia de Faker, esta instancia se utilizará para generar nombres aleatorios.
5. Definición del número de nombres a insertar, se define mediante la variable num_nombres y se establece en 20, lo que significa que se generarán e insertarán 20 nombres aleatorios en la base de datos.
6. Bucle para insertar nombres en la base de datos:
Se utiliza un bucle for que se ejecuta 20 veces (según el valor de num_nombres).
Dentro del bucle, se genera un nombre aleatorio utilizando faker.first_name() y un apellido aleatorio utilizando faker.last_name().
7. Para confirmar la transacción, se utiliza conexion.commit(), ademas guarda los cambios en la base de datos.
8. Se imprime un mensaje que indica cuántos nombres reales se insertaron en la base de datos.
