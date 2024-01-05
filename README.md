
## mysql container 생성 및 초기화
~~~SHELL
$ cd dockers
$ docker-compose up -d

$ docker exec -it mysql /bin/bash
bash-4.4# mysql -u root -p
mysql> create database springbook;
mysql> create user 'spring'@'%' identified by 'book';
mysql> grant all privileges on springbook.* to 'spring'@'%';
mysql> grant grant option on springbook.* to 'spring'@'%';
mysql> flush privileges;


~~~


## 1.1 초난감 DAO
```SQL
CREATE TABLE USERS (
    id varchar(10) primary key,
    name varchar(20) not null,
    password varchar(10) not null
)
```

