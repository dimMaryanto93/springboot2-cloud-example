# Spring Cloud - Configuration server

Aplikasi untuk stored config-config, dari git repository

## System required

- Oracle JDK 8
- Apache maven

```bash
mvn clean spring-boot:run -Dserver.port=8888
```

- Internet connection

Internet connection digunakan untuk mengambil configuration dari github dari repository [@dimmaryanto93/spring-cloud-config-example](https://github.com/dimMaryanto93/spring-cloud-config-example)


## Wilayah service

request wilayah service configuration properties

```bash
curl -X GET \
  http://localhost:8888/wilayah-service/default \
  -H 'Cache-Control: no-cache'
```

berikut hasilnya:

```json
{
    "name": "wilayah-service",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": "84628f7c3890015cac7b2cd2f7c2660c43e097f9",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/dimMaryanto93/spring-cloud-config-example/wilayah-service.properties",
            "source": {
                "spring.datasource.url": "jdbc:mysql://localhost:3306/wilayah_indonesia?useSSL=false",
                "spring.datasource.username": "wilayah_service",
                "spring.datasource.password": "wilayah_service",
                "spring.jpa.database": "mysql",
                "spring.jpa.generate-ddl": "false",
                "spring.jpa.hibernate.ddl-auto": "validate",
                "spring.jpa.show-sql": "true",
                "spring.jpa.properties.hibernate.enable_lazy_load_no_trans": "true",
                "spring.jpa.properties.hibernate.id.new_generator_mappings": "false",
                "spring.jpa.properties.hibernate.globally_quoted_identifiers": "true",
                "spring.flyway.baseline-on-migrate": "true",
                "spring.flyway.enabled": "true"
            }
        }
    ]
}
```