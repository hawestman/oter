  create table service(
      numberId text,
      provider text,
      service text,
      data text,
      created timestamp,
      lastChanged timestamp,
      PRIMARY KEY (fonr, provider, service)
  	);

insert into oter.service(fonr,provider,service,data,created,lastChanged) values (10049047105,'kartverket','hentEiendom','<xml>somexml</xml>',dateof(now()),dateof(now()));

o