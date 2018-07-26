create table m_kelurahan (
  id     bigint not null  primary key auto_increment,
  id_kec bigint not null,
  nama   varchar(75)
)
  engine = InnoDb;

alter table m_kelurahan
  add constraint fk_kecamatan_id foreign key (id_kec)
references m_kecamatan (id);
