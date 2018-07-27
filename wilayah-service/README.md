# Spring cloud - Wilayah indonesia service

Aplikasi daftar seluruh wilayah indonesia yang terdiri dari:

- Provinsi
- Kota / Kabupaten
- Kecamatan
- Kelurahan

## System required

- Mysql

```mysql
create user wilayah_service;
grant all privileges on *.* to wilayah_service@'%' identified by 'wilayah_service';
create database wilayah_indonesia; 
```

- Java JDK 8
- Apache Maven

```bash
mvn clean spring-boot:run -Dserver.port=7000
```