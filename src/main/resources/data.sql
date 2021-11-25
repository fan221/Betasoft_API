-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: appbeta
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id_curso` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ubicacion_img` varchar(255) DEFAULT NULL,
  `ubicacion_vid` varchar(255) DEFAULT NULL,
  `id_instructor` bigint DEFAULT NULL,
  PRIMARY KEY (`id_curso`),
  KEY `FKqjnb59pdu6ufhtgsevriucmaw` (`id_instructor`),
  CONSTRAINT `FKqjnb59pdu6ufhtgsevriucmaw` FOREIGN KEY (`id_instructor`) REFERENCES `instructor` (`id_instructor`)
) ENGINE=InnoDB AUTO_INCREMENT=17906 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'Crea un software profesional en desarrollo web con php, html 5,\n material design y bases de datos de cero a experto...','Ingenieria de software','https://i.imgur.com/GYNgOfm.jpeg','https://www.youtube.com/watch?v=xXd-44d_xgc',1),(2,'Entrenamiento especializado y practico','Informatica forence','https://escuelaselect.com/wp-content/uploads/informatica-forense.jpg','https://www.youtube.com/watch?v=vp_2mv1U9ng',2),(3,'¡Hazte un experto! Aprende tecnicas avanzadas de programacion','Programacion avanzada','https://i.ytimg.com/vi/SzlYjn0gLxw/maxresdefault.jpg','https://www.youtube.com/watch?v=7TKY-jksHRQ',3),(4,'Formación completa en ciencia de datos: Matemáticas, Estadística, Python, \n Estadística Avanzada, Aprendizaje Automático','Ciencia de datos','https://i.imgur.com/GYNgOfm.jpg','https://www.youtube.com/watch?v=IFRRS__B5Ms',4),(5,'Matemáticas, Estadística, Estadística Avanzada','Datawarehouse','https://i.imgur.com/GYNgOfm.jpg','https://www.youtube.com/watch?v=J326LIUrZM8',4),(6,'Context API, MERN, Hooks, Firestore, JWT, Testing, Autenticaciones, Despliegues, CRUD, Logs, SASS, Multiple Routers...','React: De cero a experto ( Hooks y MERN )','https://img-c.udemycdn.com/course/240x135/3096364_6113_3.jpg','https://www.youtube.com/watch?v=Bh7j2upPAT8&list=PLdcAPGja1uw1fmhVo-obnAXEXPqYQ9HLy',5),(7,'Rest, despliegues, Heroku, Mongo, Git, GitHub, Sockets, archivos, JWT y mucho más para ser un experto en Node','Node: De cero a experto ( Edición 2021 )','https://img-c.udemycdn.com/course/240x135/1562070_d426_2.jpg','https://www.youtube.com/watch?v=BhvLIzVL8_o',5),(8,'Aprende con el mejor curso Java desde cero usando las mejores prácticas de desarrollo incluye Java EE 9, JPA, Web y más','Máster Completo en Java de cero a experto 2021 (+108 hrs)','https://img-c.udemycdn.com/course/240x135/3078492_1a27_2.jpg','https://www.youtube.com/watch?v=Z8zAKYLZBqc',6),(9,'El Curso que te enseña como hacer cualquier Aplicación o Sitio web desde 0 con PHP y MYSQL','PHP 8 y MYSQL: El Curso Completo, Práctico y Desde Cero !','https://img-c.udemycdn.com/course/240x135/672600_1def_7.jpg','https://www.youtube.com/watch?v=mX0z6wSWJtA',7),(10,'Aprende Desarrollo Web con este curso 100% práctico, paso a paso y sin conocimientos previos, INCLUYE PROYECTO FINAL','Desarrollo Web Completo con HTML5, CSS3, JS AJAX PHP y MySQL','https://img-c.udemycdn.com/course/240x135/980450_7fc0_3.jpg','https://www.youtube.com/watch?v=bIDBvLJrZ20',8),(12,'El objetivo de este curso es convertirse en un desarrollador full stack en Java y React','Fullstack Java y React','https://img-c.udemycdn.com/course/240x135/3657264_4270_2.jpg','https://www.youtube.com/watch?v=XkVpb_8IPUM',9),(14,'Aprende a crear cualquier sitio web adaptable a dispositivos móviles con Boostrap 5, el mejor framework de diseño web','Bootstrap 5: El Curso Completo, Práctico y Desde Cero','https://img-c.udemycdn.com/course/240x135/1245130_efdb_10.jpg','https://www.youtube.com/watch?v=1kNwZbRiVcQ',7),(15,'En este curso aprenderás desde las bases hasta POO en Python Versión 3. Empieza a Aprender ya Mismo de forma Gratuita.','Master en Python 3.x. Aprende de 0 a EXPERTO con Práctica','https://img-c.udemycdn.com/course/240x135/2297910_788e_2.jpg','https://www.youtube.com/watch?v=ppz1e_ceeIw',10),(16,'El objetivo de este curso es generar un espacio para aprender logica, algoritmos y estructuras de datos en javascript','Estructuras de datos y logica en Javascript','https://img-c.udemycdn.com/course/240x135/3694466_c5db_5.jpg','https://www.youtube.com/watch?v=31QEXZR-cRI',11),(17,'Este curso de programación está dirigido a personas con o sin conocimientos previos en lógica y algoritmos, \n que deseen aprender la habilidad de programar científicamente mediante una metodología de aprendizaje práctica e interactiva.','Programación Completo','https://i.ytimg.com/vi/7TKY-jksHRQ/maxresdefault.jpg','https://www.youtube.com/watch?v=7TKY-jksHRQ',1),(18,'Diseña y desarrolla sitios web poniendo énfasis en la comunicación, interacción, creatividad y experiencia del usuario','Diseño y Desarrollo Web','https://i.ytimg.com/vi/bYOjmW-740M/maxresdefault.jpg','https://www.youtube.com/watch?v=bYOjmW-740M&list=PL5vjFJ0wFekIZFFUMzSOB12a-e0z-pOV2',1),(19,'Hazte experto en Bootstrap con un curso en línea impartido por instructores profesionales.','Bootstrap 4','https://i.ytimg.com/vi/-83eiJ9EaD4/hqdefault.jpg','https://www.youtube.com/watch?v=-83eiJ9EaD4&list=PL5vjFJ0wFekIZFFUMzSOB12a-e0z-pOV2&index=6',1),(20,'Sin duda, este es el mejor curso de CSS, en el que aprenderás gratis, desde cero a 100 a utilizar el lenguaje de estilos CSS exclusivo para diseñar y maquetar páginas web, \n ahora podremos tomar el control total de la apariencia de los elementos HTML que ','CSS desde CERO','https://i.ytimg.com/vi/OWKXEJN67FE/maxresdefault.jpg','https://www.youtube.com/watch?v=OWKXEJN67FE',1),(21,'Domina las bases del único lenguaje que te da la oportunidad de trabajar del lado del cliente y del lado del servidor.','JAVASCRIPT desde CERO','https://www.redvirtual.bid/wp-content/uploads/2018/09/JavaScript-Desde-Cero.jpg','https://www.youtube.com/watch?v=EbMi1Qj4rVE',2),(22,'¡Estupendo! es momento de aprender HTML desde cero hasta avanzado, si eres principiante  has elegido el \n lugar perfecto para aprender y entender el lenguaje más básico de la web completamente.','HTML5 desde CERO (Completo)','https://i.ytimg.com/vi/kN1XP-Bef7w/maxresdefault.jpg','https://www.youtube.com/watch?v=kN1XP-Bef7w',2),(23,'Hola y bienvenido a este curso de Comienza con SQL.\nEn este curso aprenderás desde cero todos los comando utilizados para convertirte en un experto del el lenguaje SQL. Trabajaras con bases de datos MySQL, pero estos comandos te servirán para otros tipos ','SQL EN MySQL - COMPLETO','https://i.ytimg.com/vi/c4P__KoPZwo/sddefault.jpg','https://www.youtube.com/watch?v=c4P__KoPZwo&list=PL5vjFJ0wFekI5HkKRK1w786kbZ1z2g42Z&index=4',2),(24,'Verás como manejar un repositorio local (GIT) a través del uso de la terminal y como ... ya se \n como halarlos desde GitHub, todo fue muy util y practico :D.','Git y Github | Curso Práctico de Git y Github Desde Cero','https://i.ytimg.com/vi/HiXLkL42tMU/maxresdefault.jpg','https://www.youtube.com/watch?v=HiXLkL42tMU&t=1894s',2),(25,'Python es uno de los lenguajes de programación más importantes actualmente, siendo un \n lenguaje de propósito general puedes llegar a crear con el aplicaciones web, aplicaciones de escritorio, \n aprende Hacking e Inteligencia Artificial, y mucho más. En e','Curso Python para Principiantes','https://i.ytimg.com/vi/chPhlsHoEPo/maxresdefault.jpg','https://www.youtube.com/watch?v=chPhlsHoEPo',3),(26,'En este curso te voy a enseñar Angular desde Cero, Paso a paso, empezando por instalar el \n entorno con Node.js, visual studio code, y angular-cli hasta hacer una aplicación de ejemplo con \n angular y typescript desde cero en el entorno más conocido que e','Angular 4| Curso Practico Completo, Desde Cero, Para Principiantes','https://i.ytimg.com/vi/Sx_2dOYOtes/maxresdefault.jpg','https://www.youtube.com/watch?v=Sx_2dOYOtes',3),(27,'Sean todos Bienvenidos a este el curso del Framework Vue.js, desde cero para principiantes. ','Curso VueJS | [Desde Cero]','https://i.ytimg.com/vi/Y4hfWBJ-UzY/maxresdefault.jpg','https://www.youtube.com/watch?v=Y4hfWBJ-UzY',3),(28,'Aprende a crear tu primera aplicación web con Laravel 8. Este mini curso está enfocado para que \n aprendas los conceptos básicos de Laravel.','APRENDE LARAVEL 8 DESDE CERO EN MENOS DE 2 HRS','https://i.ytimg.com/vi/a-4923Uyu54/maxresdefault.jpg','https://www.youtube.com/watch?v=a-4923Uyu54',3),(29,'Si tienes interés en dominar Java Web Services con Spring Boot este es tu curso.','Curso de Java Fullstack Completo (springboot, hibernate, JWT, API Rest)','https://i.ytimg.com/vi/7vHzVN0EiQc/maxresdefault.jpg','https://www.youtube.com/watch?v=7vHzVN0EiQc',4),(30,'Este curso online es la mejor forma de aprender en serio a programar con C#.','Curso Completo de C# para Principiantes','https://i.ytimg.com/vi/TqiysLEBZo4/maxresdefault.jpg','https://www.youtube.com/watch?v=TqiysLEBZo4',4),(31,'Curso organizado por la Comunidad Estudiantil de Ingeniería Informática en la aprenderemos a \n desarrollar aplicaciones backend con Node.js y el framework Express.','Desarrollo backend con Node.js y Express ','https://i.ytimg.com/vi/Sp2zeGW6qpk/mqdefault.jpg','https://www.youtube.com/watch?v=Sp2zeGW6qpk',5),(32,'Aprende Kotlin en Español desde cero y desarrolla tus Aplicaciones en Android Oreo. Descubre Kotlin rápidamente','Curso KOTLIN BÁSICO','https://i.ytimg.com/vi/W71ARwMFxLg/maxresdefault.jpg','https://www.youtube.com/watch?v=W71ARwMFxLg',5),(33,'Introducción pragmática al paradigma de la programación funcional, usando JavaScript con el \n objetivo de validarlo como candidato para dicho paradigma así como la posibilidad de migrar de \n forma progresiva y suave.','Programacion Funcional, Javascript','https://i.ytimg.com/vi/Ga3XXNAIPt0/maxresdefault.jpg','https://www.youtube.com/watch?v=Xb1pTP26WKo',6),(34,'Es hora de aprender gratis! En esta ocasión os traemos un curso de Programación Orientada a Objetos.','Programación Orientada a Objetos con Java','https://res.cloudinary.com/practicaldev/image/fetch/s--DIzpeifw--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/i/ce4hh9a22iczp43yn6e2.png','https://www.youtube.com/watch?v=HKnNvNW3msc',6),(35,'¡Hola! en este vídeo de Programación Para Todos te traemos el nível básico del curso de Python; \n en él podrás encontrar todos los temas y ejercicios resueltos de forma secuencial y agrupados en un sólo vídeo.','CURSO PYTHON PARA PRINCIPIANTES - NIVEL BÁSICO [COMPLETO] | Curso Python desde cero','https://i.ytimg.com/vi/INcD3Bjy6iE/maxresdefault.jpg','https://www.youtube.com/watch?v=INcD3Bjy6iE',6),(36,'¡Hola! en este vídeo de Programación Para Todos te traemos el nível intermedio del curso de \n Python; en él podrás encontrar todos los temas y ejercicios resueltos de forma secuencial y agrupados en un sólo vídeo.','CURSO PYTHON PARA PRINCIPIANTES - NIVEL INTERMEDIO [COMPLETO] | Curso Python desde cero ','https://i.ytimg.com/vi/Gk_fk1RvAys/maxresdefault.jpg','https://www.youtube.com/watch?v=Gk_fk1RvAys',6),(37,'¡Hola! en este vídeo de Programación Para Todos te traemos el nível avanzado del curso de \n Python; en él podrás encontrar todos los temas y ejercicios resueltos de forma secuencial y agrupados en un sólo vídeo.','CURSO PYTHON PARA PRINCIPIANTES - NIVEL AVANZADO [COMPLETO] | Curso Python desde cero ','https://i.ytimg.com/vi/57PT5153odg/maxresdefault.jpg','https://www.youtube.com/watch?v=57PT5153odg',6),(38,'Aprende a gestionar una base de datos PostgreSQL y conocer los comandos SQL para \n manejar una base de datos PostgreSQL.\n','Curso completo de bases de datos en postgreSQL','https://i.ytimg.com/vi/HGfrzsGg3As/maxresdefault.jpg','https://www.youtube.com/watch?v=HGfrzsGg3As',7),(39,'En este curso de introducción a la inteligencia artificial y machine Learning con Python la Doctora \n Yesi Days nos enseña desde las bases hasta ejercicios prácticos para aprender sobre IA usando el \n lenguaje de programación Python.','Curso de Inteligencia Artificial y Machine Learning con Python Desde Cero','https://i.ytimg.com/vi/4c7oFu36d6k/maxresdefault.jpg','https://www.youtube.com/watch?v=us90RPAECKo',8),(40,'En este curso practico de Raspberry Pi, vamos aprender las bases de esta plataforma de hardware. \n Instalaremos un Sistema operativo Linux que en nuestro caso sera Raspbian, aprenderemos las \n partes principales de la placa, los comandos básicos de la ter','Raspberry Pi, Curso para principiantes','https://i.ytimg.com/vi/ra6kNSIB1uA/maxresdefault.jpg','https://www.youtube.com/watch?v=ra6kNSIB1uA',8),(41,'En este curso, aprenderás a crear 5 proyectos fáciles para principiantes, pero que dan un aire de profesionalismo y sorpresa.','Top 5 Proyectos de Arduino para Principiantes - Curso GRATIS y COMPLETO','https://descubrearduino.com/wp-content/uploads/2016/03/arduino-uno.jpg','https://www.youtube.com/watch?v=DWbv4t1sPdg',8),(42,'Una guía básica para iniciarse en el mundo GNU/Linux y entender sus fundamentos.','Curso Básico GNU Linux','https://sites.google.com/site/elsoftware005/_/rsrc/1492471800708/clasificacion-y-descripcion-del-software/linux/linux-logo.jpg','https://www.youtube.com/watch?v=sRLaeyEJpW4',8),(43,'Como ser hacker con programacion python, hoy comparto contigo mi curso de hacking etico con python.','Curso Hacking Etico con Python desde Cero | Aprende Hacking Etico con Programacion Python','https://i.ytimg.com/vi/5-IRImDXjjc/maxresdefault.jpg','https://www.youtube.com/watch?v=5-IRImDXjjc',9),(44,'Curso de introduccion al hacking etico. Aprende toda la teoria y te apunta en el camino correcto \n para aprender a ser hacker etico.','Curso Hacking Etico - Introduccion al Hacking Etico','https://i.ytimg.com/vi/ANThYpIjDLM/maxresdefault.jpg','https://www.youtube.com/watch?v=bquM3077ljk',9),(45,'Introduccion a desarrrollo web con django, curso completo.','Introduccion a Django','https://i.ytimg.com/vi/X20GJXuLQW4/maxresdefault.jpg','https://www.youtube.com/watch?v=mQ0IUy_18mI',10),(46,'En este curso gratuito de Coldd Security, \n podrás aprender #Ciberseguridad desde cero y gratis, no necesitas conocimientos previos.','Aprende CIBERSEGURIDAD desde CERO | Curso de Ciberseguridad y Privacidad 101 Completo','https://i.ytimg.com/vi/spMYZHepjko/maxresdefault.jpg','https://www.youtube.com/watch?v=spMYZHepjko',11),(47,'Aprende los conceptos básicos necesarios para combatir el ciberdelito.','Ciberseguridad para Principiantes. Aprende ciberseguridad Básica para todos.','https://i.ytimg.com/vi/8aAVZh2yPUM/maxresdefault.jpg','https://www.youtube.com/watch?v=8aAVZh2yPUM',11),(48,'En este curso aprenderemos a trabajar con Postman, conoceremos acerca de postman y sus \n bondades, realizaremos operaciones CRUD, parametrizaremos, configuraremos ambientes y \n lanzaremos colecciones de APIs.','¡Curso Básico de Postman!','https://edteam-media.s3.amazonaws.com/courses/original/1c2ff3b5-8420-4f6b-abd0-18dc22667705.png','https://www.youtube.com/watch?v=KzLpI_saOnc',11),(49,'El objetivo es explicar cómo debemos enfocar el desarrollo de proyectos y cómo es fundamental \n un aprendizaje sólido de todas las disciplinas del desarrollo del software, desde la programación, \n el diseño, análisis, arquitectura, pruebas, etc.','Metodologías de gestión de proyectos de desarrollo de software','https://i.ytimg.com/vi/GyI5ps96DXI/maxresdefault.jpg','https://www.youtube.com/watch?v=GyI5ps96DXI',11),(17655,'Programación orientada a objetos!','C#','https://www.pcprogramasymas.net/wp-content/uploads/2020/01/ctraining_resize_md.jpg','https://www.youtube.com/watch?v=6W2wYwHQNT4',1),(17795,'Aprende la librería de pandas!','Pandas - Python','https://www.ecured.cu/images/a/a8/Pandas_python.png','https://www.youtube.com/watch?v=PvNKKrPE0AI',3),(17805,'Python','Pandas','https://s3-ap-south-1.amazonaws.com/av-blog-media/wp-content/uploads/2018/03/pandas.jpg','https://www.youtube.com/watch?v=PvNKKrPE0AI',5),(17815,'Aprende Tkinter','Tkinter','https://i.ytimg.com/vi/ACT9uDY2oY0/maxresdefault.jpg','https://www.youtube.com/watch?v=jqRHhWjKDD8',6),(17855,'En este curso Aprenderás a programar en el lenguaje de programación Java, con un curso 30% teórico, 70% practico.','Programación JAVA desde CERO','https://i.ytimg.com/vi/wSqBnj7fC8Q/sddefault.jpg','https://www.youtube.com/watch?v=wSqBnj7fC8Q',1),(17885,'Bases de Datos, teoría y práctica, SQL completo, Base de datos MySQL, HeidiSQL, Workbench, Diagrama EER, AWS RDS ','Base de datos ','https://www.hn.cl/wp-content/uploads/2020/11/BDM-1.png','https://www.youtube.com/watch?v=yoeV4Ex8C8U',1);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `id_estudiante` bigint NOT NULL AUTO_INCREMENT,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (1,'Alcon','Mauricio','jeanpool@gmail.com','Jean Pool','1999-01-01'),(2,'Real','Fernandez','marielafer@gmail.com','Mariela','1999-02-02'),(3,'Ayma','Marza','savinmar@gmail.com','Savina','1998-03-03'),(4,'Gandarillas','Heredia','rodrigogandal@gmail.com','Rodrigo','1997-04-04'),(5,'Mamani','Flores','vilmamani@gmail.com','Vilma','1998-05-05'),(6,'Lafuente',' Paniagua','brizamarcia@gmail.com','Briza Marcia','1996-06-06'),(7,'Soliz','Martinez','gary12@gmail.com','Gary','1996-07-07'),(8,'Flores','Cáceres','ivancaceres@gmail.com','Iván','1995-08-08');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion`
--

DROP TABLE IF EXISTS `inscripcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inscripcion` (
  `id_inscripcion` bigint NOT NULL AUTO_INCREMENT,
  `id_curso` bigint DEFAULT NULL,
  `id_estudiante` bigint DEFAULT NULL,
  PRIMARY KEY (`id_inscripcion`),
  KEY `FK6sw931ij561k2fq5sx4xonmlr` (`id_curso`),
  KEY `FK8hgaf3r1wwea199gneh6m8035` (`id_estudiante`),
  CONSTRAINT `FK6sw931ij561k2fq5sx4xonmlr` FOREIGN KEY (`id_curso`) REFERENCES `curso` (`id_curso`),
  CONSTRAINT `FK8hgaf3r1wwea199gneh6m8035` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=1221 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion`
--

LOCK TABLES `inscripcion` WRITE;
/*!40000 ALTER TABLE `inscripcion` DISABLE KEYS */;
INSERT INTO `inscripcion` VALUES (1,1,1),(2,1,2),(3,1,3),(4,2,1),(5,2,2),(6,4,2),(7,4,3),(8,4,4),(9,4,5),(10,1,5),(11,1,6),(12,1,7),(13,2,7),(14,2,6),(15,4,7),(1220,4,7);
/*!40000 ALTER TABLE `inscripcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `instructor` (
  `id_instructor` bigint NOT NULL AUTO_INCREMENT,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_instructor`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor`
--

LOCK TABLES `instructor` WRITE;
/*!40000 ALTER TABLE `instructor` DISABLE KEYS */;
INSERT INTO `instructor` VALUES (1,'Camacho','Castillo','indira@gmail.com','Indira'),(2,'Baptista','Lopez','juan@gmail.com','Juan'),(3,'Meneses','Reinaga','marcelo@gmail.com','Marcelo'),(4,'Meneses','Cartagena','ruben@gmail.com','Ruben'),(5,'Lopez','Herrera','herrera@gmail.com','Fernando'),(6,'Gonzales','Guzman','guzman@gmail.com','Andres José'),(7,'Montaño','Esparza','esparza@gmail.com','Carlos Arturo'),(8,'Valdez','de la Torre','valdez@gmail.com','Juan Pablo'),(9,'Maigua','Peñaloza','maigua@gmail.com','Jhonatan'),(10,'Chavez','Chirou','chirou@gmail.com','Alvaro'),(11,'Aguilar','Sire','sire@gmail.com','Damian'),(12,'Perez','Ramirez','fazt@gmail.com','Fazt'),(13,'Gonzales','Mujica','daltomujica@gmail.com','Dalto'),(14,'Suarez','Esteban','leonidas@gmail.com','Leonidas'),(15,'Sanchez','Gallardo','yoneyga@gmail.com','Yoney'),(16,'Medrano','Money','lucas@gmail.com','Lucas');
/*!40000 ALTER TABLE `instructor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` bigint NOT NULL AUTO_INCREMENT,
  `passwd` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `id_estudiante` bigint DEFAULT NULL,
  `id_instructor` bigint DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `FKioi8amqjetmdancxlqdudlje6` (`id_estudiante`),
  KEY `FKru36s3e0nynlerk2slt7pvnft` (`id_instructor`),
  CONSTRAINT `FKioi8amqjetmdancxlqdudlje6` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`),
  CONSTRAINT `FKru36s3e0nynlerk2slt7pvnft` FOREIGN KEY (`id_instructor`) REFERENCES `instructor` (`id_instructor`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'1234abc','indira',NULL,1),(2,'2232acc','juan',NULL,2),(3,'4433aacb','marcelo',NULL,3),(4,'2233cb','ruben',NULL,4),(5,'123abcc','fernando',NULL,5),(6,'222abcc','andresJose',NULL,6),(7,'333aacc','CarlosArturo',NULL,7),(8,'jean12','jeanPool',1,NULL),(9,'mariela123','mariela',2,NULL),(10,'savi123','savina',3,NULL),(11,'rodrigo123','rodrigo',4,NULL),(12,'vilma12','vilma',5,NULL),(13,'briza12','briza',6,NULL),(14,'gary123','gary',7,NULL),(15,'ivan123','ivan',8,NULL),(16,'abc123','fazt',NULL,12),(17,'def123','dalto',NULL,13),(18,'ghi123','leonidas',NULL,14),(19,'jkl123','yoney',NULL,15),(20,'mno123','lucas',NULL,16);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-25  9:23:37
