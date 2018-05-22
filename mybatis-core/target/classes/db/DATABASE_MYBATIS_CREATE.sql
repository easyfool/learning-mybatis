create database mybatis default character set utf8 collate utf8_general_ci;

use MYBATIS;
create table `country`(
`id`  INT not null AUTO_INCREMENT,
`countryname` VARCHAR(255),
`countrycode` VARCHAR(255),
PRIMARY KEY(`id`)
);
insert into `country`(`countryname`,`countrycode`) VALUES ('中国','cn');
insert into country(`countryname`,`countrycode`) VALUES('美国','us');
insert into country(`countryname`,`countrycode`) VALUES('俄罗斯','ru');
insert into country(`countryname`,`countrycode`) VALUES('英国','gb');
insert into country(`countryname`,`countrycode`) VALUES('法国','fr');
