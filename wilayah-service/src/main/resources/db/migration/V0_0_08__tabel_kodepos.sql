create table m_kode_pos (
  id        bigint       not null primary key auto_increment,
  kelurahan varchar(100) not null,
  kecamatan varchar(100) not null,
  kabupaten varchar(100) not null,
  provinsi  varchar(100) not null,
  kodepos   varchar(5)   not null
)
  engine = InnoDB;