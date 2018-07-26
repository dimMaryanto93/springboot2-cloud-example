create table m_kecamatan (
  id          bigint not null primary key auto_increment,
  id_kota_kab bigint not null,
  nama        varchar(75)
)
  engine = InnoDB;

alter table m_kecamatan
  add constraint fk_kotakab_id foreign key (id_kota_kab)
references m_kota_kab (id);