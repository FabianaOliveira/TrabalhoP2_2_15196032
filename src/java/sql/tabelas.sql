/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  CASA-PC
 * Created: 15/06/2016
 */

CREATE DATABASE /*!32312 IF NOT EXISTS*/`netbeans` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `netbeans`;

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL auto_increment,
  `nome` varchar(60) default NULL,
  `cpf` varchar(15) default NULL,
  `endereco` varchar(60) default NULL,
  `bairro` varchar(60) default NULL,
  `cidade` varchar(60) default NULL,
  `cep` varchar(20) default NULL,
  `telefone` varchar(20) default NULL,
  `celular` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

insert  into `cliente`(`id`,`nome`,`cpf`,`endereco`,`bairro`,`cidade`,`cep`,`telefone`,`celular`) values (14,'Fabiana silva','010101010','mem de sa','centro','rio de janeiro','0101010','01010101','010101');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `id` int(11) NOT NULL auto_increment,
  `usuario` varchar(60) default NULL,
  `senha` varchar(60) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`id`,`usuario`,`senha`) values (1,'FABIANA','fafasilva'),(2,'professor','123');

/*Table structure for table `produto` */

DROP TABLE IF EXISTS `produto`;

CREATE TABLE `produto` (
  `id` int(11) NOT NULL auto_increment,
  `descricao` varchar(50) default NULL,
  `marca` varchar(40) default NULL,
  `quantidade` int(11) default NULL,
  `preco` float default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `produto` */

insert  into `produto`(`id`,`descricao`,`marca`,`quantidade`,`preco`) values (2,'perfume malbec','boticario',1,120);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;