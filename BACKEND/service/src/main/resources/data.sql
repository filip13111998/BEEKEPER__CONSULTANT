--BEEKEEPER TABLE
insert into PCELAR ( username , password , OCENA_PCELAR , UKUPNA_OCENA_PCELINJAKA )
            values ( 'bb1' , '$2a$12$zf/xQmgOilOlFgiZylI/veC2SWmgcNUYbpnsBwL4dFu0sjun4xD2C',5,3);
insert into PCELAR ( username , password , OCENA_PCELAR , UKUPNA_OCENA_PCELINJAKA )
            values ('bb2' , '$2a$12$zf/xQmgOilOlFgiZylI/veC2SWmgcNUYbpnsBwL4dFu0sjun4xD2C',3,3);
insert into PCELAR ( username , password , OCENA_PCELAR , UKUPNA_OCENA_PCELINJAKA )
            values ( 'bb3' , '$2a$12$zf/xQmgOilOlFgiZylI/veC2SWmgcNUYbpnsBwL4dFu0sjun4xD2C',2,1);
            
  

insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 25 , 70 ,3,'SUNCE' , 0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 27 , 70 ,7,'SUNCE' , 0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 25 , 70 ,39,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 25 , 60 ,23,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 32 , 80 ,3,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 33 , 70 ,53,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 37 , 70 ,3,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 39 , 32 ,3,'SUNCE',0);


insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 25 , 70 ,3,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 23 , 50 ,13,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 22 , 32 ,23,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 22 , 90 ,21,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 25 , 80 ,5,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 19 , 70 ,5,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 21 , 70 ,9,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 16 , 69 ,43,'SUNCE',0);
insert into DAN ( temperatura , vlaznost_vazduha , jacina_vetra , tip_dana, ocena )
values ( 13 , 61 ,21,'SUNCE',0);


--KOSNICEEEE

insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 8 , 8 ,13,9,5);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 12 , 16 ,2,2,2);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 2 , 8 ,3,3,1);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 4 , 9 ,7,2,3);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 2 , 12 ,7,9,4);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 6 , 2 ,9,9,3);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 8 , 3 ,13,6,5);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 9 , 2 ,13,6,4);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 11 , 16 ,9,19,5);
insert into KOSNICA ( broj_ramova_legla , broj_ramova_meda , broj_ramova_pcela , broj_ramova_polena , ocena)
values ( 11 , 13 ,9,12,5);


--NADMORSKA VISINA

insert into NADMORSKA_VISINA (nadmorska_visina , polozaj_terena , ocena) 
values (1200 , 'BRDO' , 0);

--PRIRODA

insert into PRIRODA (teritorijalna_rasprostranjenost , udaljenost_reke , ocena) 
values (1800 , 800 , 0);

--PASA

insert into PASA ( tip_pase , godina , ocena , nadmorksa_visina_id , priroda_id)
values ( 'BAGREM' , 2022 ,0 , 1 , 1 );

--PASA KOSNICE
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,1);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,2);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,3);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,4);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,5);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,6);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,7);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,8);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,9);
insert into PASA_KOSNICE (PASA_ID , KOSNICE_ID)
values (1,10);

--PASA VREMENSKA PROGNOZA
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,1);
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,2);
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,3);
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,4);
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,5);
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,6);
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,7);
insert into PASA_VREMENSKA_PROGNOZA (PASA_ID , VREMENSKA_PROGNOZA_ID)
values (1,8);

            
