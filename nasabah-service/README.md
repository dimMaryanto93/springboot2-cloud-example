# Spring Cloud - Nasabah Service

Aplikasi data nasabah

## System required

- Postgresql 9.6 or later

```postgresql
create user nasabah_service with superuser login password 'nasabah_service';
create database nasabah with owner nasabah_service;
```

- Oracle JDK 8
- Apache Maven

```bash
mvn clean spring-boot:run -Dserver.port=6000
```