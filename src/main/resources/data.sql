

INSERT INTO estudiante (apellido_materno, apellido_paterno, email, nombre)
 VALUES ('Alcon','Mauricio','jeanpool@gmail.com','Jean Pool'),
 ('Real','Fernandez','marielafer@gmail.com','Mariela'),
 ('Marza','Ayma','savinmar@gmail.com','Savina'),
 ('Heredia','Gandarillas','rodrigogandal@gmail.com','Rodrigo'),
 ('Flores','Mamani','vilmamani@gmail.com','Vilma'),
 ('Lafuente',' Paniagua','brizamarcia@gmail.com','Briza Marcia'),
 ('Martinez','Soliz','gary12@gmail.com','Gary'),
 #datos recien agregados;
 ('Flores','Cáceres','ivancaceres@gmail.com','Iván');


INSERT INTO instructor (apellido_materno, apellido_paterno, email, nombre)
 VALUES
 ('Camacho','Castillo','indira@gmail.com','Indira'),
 ('Baptista','Lopez','juan@gmail.com','Juan'),
 ('Meneses','Reinaga','marcelo@gmail.com','Marcelo'),
 ('Meneses','Cartagena','ruben@gmail.com','Ruben'),
 ('Lopez','Herrera','herrera@gmail.com','Fernando'),
 ('Gonzales','Guzman','guzman@gmail.com','Andres José'),
 ('Montaño','Esparza','esparza@gmail.com','Carlos Arturo'),
 ('Valdez','de la Torre','valdez@gmail.com','Juan Pablo'),
 ('Maigua','Peñaloza','maigua@gmail.com','Jhonatan'),
 ('Chavez','Chirou','chirou@gmail.com','Alvaro'),
 ('Aguilar','Sire','sire@gmail.com','Damian'),
#datos recien agregados;
 ('Perez','Ramirez','fazt@gmail.com','Fazt'),
 ('Gonzales','Mujica','daltomujica@gmail.com','Dalto'),
 ('Suarez','Esteban','leonidas@gmail.com','Leonidas'),
 ('Sanchez','Gallardo','yoneyga@gmail.com','Yoney'),
 ('Medrano','Money','lucas@gmail.com','Lucas');


INSERT INTO usuario (passwd,username,id_estudiante,id_instructor) VALUES
 ('1234abc','indira',NULL,1),
 ('2232acc','juan',NULL,2),
 ('4433aacb','marcelo',NULL,3),
 ('2233cb','ruben',NULL,4),
 ('123abcc','fernando',NULL,5),
 ('222abcc','andresJose',NULL,6),
 ('333aacc','CarlosArturo',NULL,7),
 ('jean12','jeanPool',1,NULL),
 ('mariela123','mariela',2,NULL),
 ('savi123','savina',3,NULL),
 ('rodrigo123','rodrigo',4,NULL),
 ('vilma12','vilma',5,NULL),
 ('briza12','briza',6,NULL),
 ('gary123','gary',7,NULL),
#datos recien agregados;
 ('ivan123','ivan',8,NULL),
 ('abc123','fazt',NULL,12),
 ('def123','dalto',NULL,13),
 ('ghi123','leonidas',NULL,14),
 ('jkl123','yoney',NULL,15),
 ('mno123','lucas',NULL,16);



INSERT INTO curso (id_curso,descripcion,nombre,ubicacion_img,ubicacion_vid,id_instructor)
VALUES
 (1,'Crea un software profesional en desarrollo web con php, html 5,\n material design y bases de datos de cero a experto','Ingenieria de software...','https://i.imgur.com/GYNgOfm.jpg','https://www.youtube.com/watch?v=xXd-44d_xgc',1),
(2,'Entrenamiento especializado y practico','Informatica forence','https://escuelaselect.com/wp-content/uploads/informatica-forense.jpg','https://www.youtube.com/watch?v=vp_2mv1U9ng',2),
(4,'Formación completa en ciencia de datos: Matemáticas, Estadística, Python, \n Estadística Avanzada, Aprendizaje Automático','Ciencia de datos','https://i.imgur.com/GYNgOfm.jpg','https://www.youtube.com/watch?v=IFRRS__B5Ms',4),
(5,'Matemáticas, Estadística, Estadística Avanzada','Datawarehouse','https://i.imgur.com/GYNgOfm.jpg','https://www.youtube.com/watch?v=J326LIUrZM8',4),
(9,'El Curso que te enseña como hacer cualquier Aplicación o Sitio web desde 0 con PHP y MYSQL','PHP 8 y MYSQL: El Curso Completo, Práctico y Desde Cero !','https://img-c.udemycdn.com/course/240x135/672600_1def_7.jpg','https://www.youtube.com/watch?v=mX0z6wSWJtA',7),
(10,'Aprende Desarrollo Web con este curso 100% práctico, paso a paso y sin conocimientos previos, INCLUYE PROYECTO FINAL','Desarrollo Web Completo con HTML5, CSS3, JS AJAX PHP y MySQL','https://img-c.udemycdn.com/course/240x135/980450_7fc0_3.jpg','https://www.youtube.com/watch?v=bIDBvLJrZ20',8),
(12,'El objetivo de este curso es convertirse en un desarrollador full stack en Java y React','Fullstack Java y React','https://img-c.udemycdn.com/course/240x135/3657264_4270_2.jpg','https://www.youtube.com/watch?v=XkVpb_8IPUM',9),
(14,'Aprende a crear cualquier sitio web adaptable a dispositivos móviles con Boostrap 5, el mejor framework de diseño web','Bootstrap 5: El Curso Completo, Práctico y Desde Cero','https://img-c.udemycdn.com/course/240x135/1245130_efdb_10.jpg','https://www.youtube.com/watch?v=1kNwZbRiVcQ',7),
(15,'En este curso aprenderás desde las bases hasta POO en Python Versión 3. Empieza a Aprender ya Mismo de forma Gratuita.','Master en Python 3.x. Aprende de 0 a EXPERTO con Práctica','https://img-c.udemycdn.com/course/240x135/2297910_788e_2.jpg','https://www.youtube.com/watch?v=ppz1e_ceeIw',10),
(16,'El objetivo de este curso es generar un espacio para aprender logica, algoritmos y estructuras de datos en javascript','Estructuras de datos y logica en Javascript','https://img-c.udemycdn.com/course/240x135/3694466_c5db_5.jpg','https://www.youtube.com/watch?v=31QEXZR-cRI',11),
#datos recien agregados;
(3,'¡Hazte un experto! Aprende tecnicas avanzadas de programacion','Programacion avanzada','https://i.ytimg.com/vi/SzlYjn0gLxw/maxresdefault.jpg','https://www.youtube.com/watch?v=7TKY-jksHRQ',3),
(6,'Context API, MERN, Hooks, Firestore, JWT, Testing, Autenticaciones, Despliegues, CRUD, Logs, SASS, Multiple Routers...','React: De cero a experto ( Hooks y MERN )','https://img-c.udemycdn.com/course/240x135/3096364_6113_3.jpg','https://www.youtube.com/watch?v=Bh7j2upPAT8&list=PLdcAPGja1uw1fmhVo-obnAXEXPqYQ9HLy',5),
(7,'Rest, despliegues, Heroku, Mongo, Git, GitHub, Sockets, archivos, JWT y mucho más para ser un experto en Node','Node: De cero a experto ( Edición 2021 )','https://img-c.udemycdn.com/course/240x135/1562070_d426_2.jpg','https://www.youtube.com/watch?v=BhvLIzVL8_o',5),
(8,'Aprende con el mejor curso Java desde cero usando las mejores prácticas de desarrollo incluye Java EE 9, JPA, Web y más','Máster Completo en Java de cero a experto 2021 (+108 hrs)','https://img-c.udemycdn.com/course/240x135/3078492_1a27_2.jpg','https://www.youtube.com/watch?v=Z8zAKYLZBqc',6),
(17,'Este curso de programación está dirigido a personas con o sin conocimientos previos en lógica y algoritmos, \n que deseen aprender la habilidad de programar científicamente mediante una metodología de aprendizaje práctica e interactiva.','Programación Completo','https://i.ytimg.com/vi/7TKY-jksHRQ/maxresdefault.jpg','https://www.youtube.com/watch?v=7TKY-jksHRQ',1),
(18,'Diseña y desarrolla sitios web poniendo énfasis en la comunicación, interacción, creatividad y experiencia del usuario','Diseño y Desarrollo Web','https://i.ytimg.com/vi/bYOjmW-740M/maxresdefault.jpg','https://www.youtube.com/watch?v=bYOjmW-740M&list=PL5vjFJ0wFekIZFFUMzSOB12a-e0z-pOV2',1),
(19,'Hazte experto en Bootstrap con un curso en línea impartido por instructores profesionales.','Bootstrap 4','https://i.ytimg.com/vi/-83eiJ9EaD4/hqdefault.jpg','https://www.youtube.com/watch?v=-83eiJ9EaD4&list=PL5vjFJ0wFekIZFFUMzSOB12a-e0z-pOV2&index=6',1),
(20,'Sin duda, este es el mejor curso de CSS, en el que aprenderás gratis, desde cero a 100 a utilizar el lenguaje de estilos CSS exclusivo para diseñar y maquetar páginas web, \n ahora podremos tomar el control total de la apariencia de los elementos HTML que conforman una página web aún si eres principiante o ya tienes conocimientos previos.','CSS desde CERO','https://i.ytimg.com/vi/OWKXEJN67FE/maxresdefault.jpg','https://www.youtube.com/watch?v=OWKXEJN67FE',1),
(21,'Domina las bases del único lenguaje que te da la oportunidad de trabajar del lado del cliente y del lado del servidor.','JAVASCRIPT desde CERO','https://www.redvirtual.bid/wp-content/uploads/2018/09/JavaScript-Desde-Cero.jpg','https://www.youtube.com/watch?v=EbMi1Qj4rVE',2),
(22,'¡Estupendo! es momento de aprender HTML desde cero hasta avanzado, si eres principiante  has elegido el \n lugar perfecto para aprender y entender el lenguaje más básico de la web completamente.','HTML5 desde CERO (Completo)','https://i.ytimg.com/vi/kN1XP-Bef7w/maxresdefault.jpg','https://www.youtube.com/watch?v=kN1XP-Bef7w',2),
(23,'Hola y bienvenido a este curso de Comienza con SQL.
En este curso aprenderás desde cero todos los comando utilizados para convertirte en un experto del el lenguaje SQL. Trabajaras con bases de datos MySQL, pero estos comandos te servirán para otros tipos de bases de datos como SQLite o SQL Server.','SQL EN MySQL - COMPLETO','https://i.ytimg.com/vi/c4P__KoPZwo/sddefault.jpg','https://www.youtube.com/watch?v=c4P__KoPZwo&list=PL5vjFJ0wFekI5HkKRK1w786kbZ1z2g42Z&index=4',2),
(24,'Verás como manejar un repositorio local (GIT) a través del uso de la terminal y como ... ya se \n como halarlos desde GitHub, todo fue muy util y practico :D.','Git y Github | Curso Práctico de Git y Github Desde Cero','https://i.ytimg.com/vi/HiXLkL42tMU/maxresdefault.jpg','https://www.youtube.com/watch?v=HiXLkL42tMU&t=1894s',2),
(25,'Python es uno de los lenguajes de programación más importantes actualmente, siendo un \n lenguaje de propósito general puedes llegar a crear con el aplicaciones web, aplicaciones de escritorio, \n aprende Hacking e Inteligencia Artificial, y mucho más. En este curso voy a darte las \n bases de lenguaje para que puedas iniciar con el y luego continuar aprendiendo algún framework o \n bibliotecas que te permitan crear estas aplicaciones.','Curso Python para Principiantes','https://i.ytimg.com/vi/chPhlsHoEPo/maxresdefault.jpg','https://www.youtube.com/watch?v=chPhlsHoEPo',3),
(26,'En este curso te voy a enseñar Angular desde Cero, Paso a paso, empezando por instalar el \n entorno con Node.js, visual studio code, y angular-cli hasta hacer una aplicación de ejemplo con \n angular y typescript desde cero en el entorno más conocido que es windows.','Angular 4| Curso Practico Completo, Desde Cero, Para Principiantes','https://i.ytimg.com/vi/Sx_2dOYOtes/maxresdefault.jpg','https://www.youtube.com/watch?v=Sx_2dOYOtes',3),
(27,'Sean todos Bienvenidos a este el curso del Framework Vue.js, desde cero para principiantes. ','Curso VueJS | [Desde Cero]','https://i.ytimg.com/vi/Y4hfWBJ-UzY/maxresdefault.jpg','https://www.youtube.com/watch?v=Y4hfWBJ-UzY',3),
(28,'Aprende a crear tu primera aplicación web con Laravel 8. Este mini curso está enfocado para que \n aprendas los conceptos básicos de Laravel.','APRENDE LARAVEL 8 DESDE CERO EN MENOS DE 2 HRS','https://i.ytimg.com/vi/a-4923Uyu54/maxresdefault.jpg','https://www.youtube.com/watch?v=a-4923Uyu54',3),
(29,'Si tienes interés en dominar Java Web Services con Spring Boot este es tu curso.','Curso de Java Fullstack Completo (springboot, hibernate, JWT, API Rest)','https://i.ytimg.com/vi/7vHzVN0EiQc/maxresdefault.jpg','https://www.youtube.com/watch?v=7vHzVN0EiQc',4),
(30,'Este curso online es la mejor forma de aprender en serio a programar con C#.','Curso Completo de C# para Principiantes','https://i.ytimg.com/vi/TqiysLEBZo4/maxresdefault.jpg','https://www.youtube.com/watch?v=TqiysLEBZo4',4),
(31,'Curso organizado por la Comunidad Estudiantil de Ingeniería Informática en la aprenderemos a \n desarrollar aplicaciones backend con Node.js y el framework Express.','Desarrollo backend con Node.js y Express 1','https://i.ytimg.com/vi/Sp2zeGW6qpk/mqdefault.jpg','https://www.youtube.com/watch?v=Sp2zeGW6qpk',5),
(32,'Aprende Kotlin en Español desde cero y desarrolla tus Aplicaciones en Android Oreo. Descubre Kotlin rápidamente','Curso KOTLIN BÁSICO','https://i.ytimg.com/vi/W71ARwMFxLg/maxresdefault.jpg','https://www.youtube.com/watch?v=W71ARwMFxLg',5),
(33,'Introducción pragmática al paradigma de la programación funcional, usando JavaScript con el \n objetivo de validarlo como candidato para dicho paradigma así como la posibilidad de migrar de \n forma progresiva y suave.','Programacion Funcional, Javascript','https://i.ytimg.com/vi/Ga3XXNAIPt0/maxresdefault.jpg','https://www.youtube.com/watch?v=Xb1pTP26WKo',6),
(34,'Es hora de aprender gratis! En esta ocasión os traemos un curso de Programación Orientada a Objetos.','Programación Orientada a Objetos con Java','https://res.cloudinary.com/practicaldev/image/fetch/s--DIzpeifw--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/i/ce4hh9a22iczp43yn6e2.png','https://www.youtube.com/watch?v=HKnNvNW3msc',6),
(35,'¡Hola! en este vídeo de Programación Para Todos te traemos el nível básico del curso de Python; \n en él podrás encontrar todos los temas y ejercicios resueltos de forma secuencial y agrupados en un sólo vídeo.','CURSO PYTHON PARA PRINCIPIANTES - NIVEL BÁSICO [COMPLETO] | Curso Python desde cero','https://i.ytimg.com/vi/INcD3Bjy6iE/maxresdefault.jpg','https://www.youtube.com/watch?v=INcD3Bjy6iE',6),
(36,'¡Hola! en este vídeo de Programación Para Todos te traemos el nível intermedio del curso de \n Python; en él podrás encontrar todos los temas y ejercicios resueltos de forma secuencial y agrupados en un sólo vídeo.','CURSO PYTHON PARA PRINCIPIANTES - NIVEL INTERMEDIO [COMPLETO] | Curso Python desde cero ','https://i.ytimg.com/vi/Gk_fk1RvAys/maxresdefault.jpg','https://www.youtube.com/watch?v=Gk_fk1RvAys',6),
(37,'¡Hola! en este vídeo de Programación Para Todos te traemos el nível avanzado del curso de \n Python; en él podrás encontrar todos los temas y ejercicios resueltos de forma secuencial y agrupados en un sólo vídeo.','CURSO PYTHON PARA PRINCIPIANTES - NIVEL AVANZADO [COMPLETO] | Curso Python desde cero ','https://i.ytimg.com/vi/57PT5153odg/maxresdefault.jpg','https://www.youtube.com/watch?v=57PT5153odg',6),
(38,'Aprende a gestionar una base de datos PostgreSQL y conocer los comandos SQL para \n manejar una base de datos PostgreSQL.
','Curso completo de bases de datos en postgreSQL','https://i.ytimg.com/vi/HGfrzsGg3As/maxresdefault.jpg','https://www.youtube.com/watch?v=HGfrzsGg3As',7),
(39,'En este curso de introducción a la inteligencia artificial y machine Learning con Python la Doctora \n Yesi Days nos enseña desde las bases hasta ejercicios prácticos para aprender sobre IA usando el \n lenguaje de programación Python.','Curso de Inteligencia Artificial y Machine Learning con Python Desde Cero','https://i.ytimg.com/vi/4c7oFu36d6k/maxresdefault.jpg','https://www.youtube.com/watch?v=us90RPAECKo',8),
(40,'En este curso practico de Raspberry Pi, vamos aprender las bases de esta plataforma de hardware. \n Instalaremos un Sistema operativo Linux que en nuestro caso sera Raspbian, aprenderemos las \n partes principales de la placa, los comandos básicos de la terminal, y a como utilizar una conexion SSH.','Raspberry Pi, Curso para principiantes','https://i.ytimg.com/vi/ra6kNSIB1uA/maxresdefault.jpg','https://www.youtube.com/watch?v=ra6kNSIB1uA',8),
(41,'En este curso, aprenderás a crear 5 proyectos fáciles para principiantes, pero que dan un aire de profesionalismo y sorpresa.','Top 5 Proyectos de Arduino para Principiantes - Curso GRATIS y COMPLETO','https://descubrearduino.com/wp-content/uploads/2016/03/arduino-uno.jpg','https://www.youtube.com/watch?v=DWbv4t1sPdg',8),
(42,'Una guía básica para iniciarse en el mundo GNU/Linux y entender sus fundamentos.','Curso Básico GNU Linux','https://sites.google.com/site/elsoftware005/_/rsrc/1492471800708/clasificacion-y-descripcion-del-software/linux/linux-logo.jpg','https://www.youtube.com/watch?v=sRLaeyEJpW4',8),
(43,'Como ser hacker con programacion python, hoy comparto contigo mi curso de hacking etico con python.','Curso Hacking Etico con Python desde Cero | Aprende Hacking Etico con Programacion Python','https://i.ytimg.com/vi/5-IRImDXjjc/maxresdefault.jpg','https://www.youtube.com/watch?v=5-IRImDXjjc',9),
(44,'Curso de introduccion al hacking etico. Aprende toda la teoria y te apunta en el camino correcto \n para aprender a ser hacker etico.','Curso Hacking Etico - Introduccion al Hacking Etico','https://i.ytimg.com/vi/ANThYpIjDLM/maxresdefault.jpg','https://www.youtube.com/watch?v=bquM3077ljk',9),
(45,'Introduccion a desarrrollo web con django, curso completo.','Introduccion a Django','https://i.ytimg.com/vi/X20GJXuLQW4/maxresdefault.jpg','https://www.youtube.com/watch?v=mQ0IUy_18mI',10),
(46,'En este curso gratuito de Coldd Security, \n podrás aprender #Ciberseguridad desde cero y gratis, no necesitas conocimientos previos.','Aprende CIBERSEGURIDAD desde CERO | Curso de Ciberseguridad y Privacidad 101 Completo','https://i.ytimg.com/vi/spMYZHepjko/maxresdefault.jpg','https://www.youtube.com/watch?v=spMYZHepjko',11),
(47,'Aprende los conceptos básicos necesarios para combatir el ciberdelito.','Ciberseguridad para Principiantes. Aprende ciberseguridad Básica para todos.','https://i.ytimg.com/vi/8aAVZh2yPUM/maxresdefault.jpg','https://www.youtube.com/watch?v=8aAVZh2yPUM',11),
(48,'En este curso aprenderemos a trabajar con Postman, conoceremos acerca de postman y sus \n bondades, realizaremos operaciones CRUD, parametrizaremos, configuraremos ambientes y \n lanzaremos colecciones de APIs.','¡Curso Básico de Postman!','https://edteam-media.s3.amazonaws.com/courses/original/1c2ff3b5-8420-4f6b-abd0-18dc22667705.png','https://www.youtube.com/watch?v=KzLpI_saOnc',11),
(49,'El objetivo es explicar cómo debemos enfocar el desarrollo de proyectos y cómo es fundamental \n un aprendizaje sólido de todas las disciplinas del desarrollo del software, desde la programación, \n el diseño, análisis, arquitectura, pruebas, etc.','Metodologías de gestión de proyectos de desarrollo de software','https://i.ytimg.com/vi/GyI5ps96DXI/maxresdefault.jpg','https://www.youtube.com/watch?v=GyI5ps96DXI',11);
