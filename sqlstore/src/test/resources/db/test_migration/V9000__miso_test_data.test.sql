DELETE FROM `_Partition`;
INSERT INTO `_Partition` (`partitionId`, `partitionNumber`, `pool_poolId`, `securityProfile_profileId`)
VALUES (1,1,1,1);

DELETE FROM `Experiment`;
INSERT INTO `Experiment`(`experimentId`, `name`, `description`, `accession`, `title`, `securityProfile_profileId`, `study_studyId`, `alias`, `platform_platformId`,`lastModifier`) 
VALUES (1,'EXP1','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_1',16,1),
(2,'EXP2','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_2',16,1),
(3,'EXP3','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_3',16,1),
(4,'EXP4','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_4',16,1),
(5,'EXP5','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_5',16,1),
(6,'EXP6','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_6',16,1),
(7,'EXP7','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_7',16,1),
(8,'EXP8','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_8',16,1),
(9,'EXP9','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_9',16,1),
(10,'EXP10','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_10',16,1),
(11,'EXP11','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_11',16,1),
(12,'EXP12','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_12',16,1),
(13,'EXP13','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_13',16,1),
(14,'EXP14','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_14',16,1),
(15,'EXP15','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_15',16,1),
(16,'EXP16','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_16',16,1),
(17,'EXP17','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_17',16,1),
(18,'EXP18','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_18',16,1),
(19,'EXP19','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_19',16,1),
(20,'EXP20','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_20',16,1),
(21,'EXP21','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_21',16,1),
(22,'EXP22','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_22',16,1),
(23,'EXP23','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_23',16,1),
(24,'EXP24','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_24',16,1),
(25,'EXP25','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_25',16,1),
(26,'EXP26','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_26',16,1),
(27,'EXP27','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_27',16,1),
(28,'EXP28','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_28',16,1),
(29,'EXP29','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_29',16,1),
(30,'EXP30','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_30',16,1),
(31,'EXP31','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_31',16,1),
(32,'EXP32','TEST',NULL,'PRO1 Illumina Other experiment (Auto-gen)',1,1,'EXP_AUTOGEN_STU1_Other_32',16,1);

DELETE FROM `Library`;
INSERT INTO `Library`(`libraryId`, `name`, `description`, `accession`, `securityProfile_profileId`, `sample_sampleId`, `identificationBarcode`, `locationBarcode`, `libraryType`, `concentration`, `creationDate`, `platformName`, `alias`, `paired`, `librarySelectionType`, `libraryStrategyType`, `qcPassed`, `lastModifier`)
VALUES (1,'LIB1','Inherited from TEST_0001',NULL,1,1,'LIB1::TEST_0001_Bn_P_PE_300_WG','LIBRARY_INBOX_A01',3,0,'2015-08-27','Illumina','TEST_0001_Bn_P_PE_300_WG',1,1,1,'true',1),
(2,'LIB2','Inherited from TEST_0001',NULL,1,2,'LIB2::TEST_0001_Bn_R_PE_300_WG','LIBRARY_INBOX_A02',3,0,'2015-08-27','Illumina','TEST_0001_Bn_R_PE_300_WG',1,1,1,'true',1),
(3,'LIB3','Inherited from TEST_0002',NULL,1,3,'LIB3::TEST_0002_Bn_P_PE_300_WG','LIBRARY_INBOX_A03',3,0,'2015-08-27','Illumina','TEST_0002_Bn_P_PE_300_WG',1,1,1,'true',1),
(4,'LIB4','Inherited from TEST_0002',NULL,1,4,'LIB4::TEST_0002_Bn_R_PE_300_WG','LIBRARY_INBOX_A04',3,0,'2015-08-27','Illumina','TEST_0002_Bn_R_PE_300_WG',1,1,1,'true',1),
(5,'LIB5','Inherited from TEST_0003',NULL,1,5,'LIB5::TEST_0003_Bn_P_PE_300_WG','LIBRARY_INBOX_A05',3,0,'2015-08-27','Illumina','TEST_0003_Bn_P_PE_300_WG',1,1,1,'true',1),
(6,'LIB6','Inherited from TEST_0003',NULL,1,6,'LIB6::TEST_0003_Bn_R_PE_300_WG','LIBRARY_INBOX_A06',3,0,'2015-08-27','Illumina','TEST_0003_Bn_R_PE_300_WG',1,1,1,'true',1),
(7,'LIB7','Inherited from TEST_0004',NULL,1,7,'LIB7::TEST_0004_Bn_P_PE_300_WG','LIBRARY_INBOX_A07',3,0,'2015-08-27','Illumina','TEST_0004_Bn_P_PE_300_WG',1,1,1,'true',1),
(8,'LIB8','Inherited from TEST_0004',NULL,1,8,'LIB8::TEST_0004_Bn_R_PE_300_WG','LIBRARY_INBOX_A08',3,0,'2015-08-27','Illumina','TEST_0004_Bn_R_PE_300_WG',1,1,1,'true',1),
(9,'LIB9','Inherited from TEST_0005',NULL,1,9,'LIB9::TEST_0005_Bn_P_PE_300_WG','LIBRARY_INBOX_A09',3,0,'2015-08-27','Illumina','TEST_0005_Bn_P_PE_300_WG',1,1,1,'true',1),
(10,'LIB10','Inherited from TEST_0005',NULL,1,10,'LIB10::TEST_0005_Bn_R_PE_300_WG','LIBRARY_INBOX_A10',3,0,'2015-08-27','Illumina','TEST_0005_Bn_R_PE_300_WG',1,1,1,'true',1),
(11,'LIB11','Inherited from TEST_0006',NULL,1,11,'LIB11::TEST_0006_Bn_P_PE_300_WG','LIBRARY_INBOX_B01',3,0,'2015-08-27','Illumina','TEST_0006_Bn_P_PE_300_WG',1,1,1,'true',1),
(12,'LIB12','Inherited from TEST_0006',NULL,1,12,'LIB12::TEST_0006_Bn_R_PE_300_WG','LIBRARY_INBOX_B02',3,0,'2015-08-27','Illumina','TEST_0006_Bn_R_PE_300_WG',1,1,1,'true',1),
(13,'LIB13','Inherited from TEST_0007',NULL,1,13,'LIB13::TEST_0007_Bn_P_PE_300_WG','LIBRARY_INBOX_B03',3,0,'2015-08-27','Illumina','TEST_0007_Bn_P_PE_300_WG',1,1,1,'true',1),
(14,'LIB14','Inherited from TEST_0007',NULL,1,14,'LIB14::TEST_0007_Bn_R_PE_300_WG','LIBRARY_INBOX_B04',3,0,'2015-08-27','Illumina','TEST_0007_Bn_R_PE_300_WG',1,1,1,'true',1);

DELETE FROM `Kit`;
INSERT INTO `Kit`(`kitId`,`identificationBarcode`,`locationBarcode`,`lotNumber`,`kitDate`,`kitDescriptorId`) VALUES
(1,'1234','Freezer2','LOT34',NOW(),1),
(2,'5678','Freezer3','LOT35',NOW(),2);

DELETE FROM `LibraryDilution`;
INSERT INTO `LibraryDilution`(`dilutionId`, `concentration`, `library_libraryId`, `identificationBarcode`, `creationDate`, `dilutionUserName`, `name`, `securityProfile_profileId`) 
VALUES (1,2,1,'LDI1::TEST_0001_Bn_P_PE_300_WG','2015-08-27','admin','LDI1',1),
(2,2,2,'LDI2::TEST_0001_Bn_R_PE_300_WG','2015-08-27','admin','LDI2',1),
(3,2,3,'LDI3::TEST_0002_Bn_P_PE_300_WG','2015-08-27','admin','LDI3',1),
(4,2,4,'LDI4::TEST_0002_Bn_R_PE_300_WG','2015-08-27','admin','LDI4',1),
(5,2,5,'LDI5::TEST_0003_Bn_P_PE_300_WG','2015-08-27','admin','LDI5',1),
(6,2,6,'LDI6::TEST_0003_Bn_R_PE_300_WG','2015-08-27','admin','LDI6',1),
(7,2,7,'LDI7::TEST_0004_Bn_P_PE_300_WG','2015-08-27','admin','LDI7',1),
(8,2,8,'LDI8::TEST_0004_Bn_R_PE_300_WG','2015-08-27','admin','LDI8',1),
(9,2,9,'LDI9::TEST_0005_Bn_P_PE_300_WG','2015-08-27','admin','LDI9',1),
(10,2,10,'LDI10::TEST_0005_Bn_R_PE_300_WG','2015-08-27','admin','LDI10',1),
(11,2,11,'LDI11::TEST_0006_Bn_P_PE_300_WG','2015-08-27','admin','LDI11',1),
(12,2,12,'LDI12::TEST_0006_Bn_R_PE_300_WG','2015-08-27','admin','LDI12',1),
(13,2,13,'LDI13::TEST_0007_Bn_P_PE_300_WG','2015-08-27','admin','LDI13',1),
(14,2,14,'LDI14::TEST_0007_Bn_R_PE_300_WG','2015-08-27','admin','LDI14',1);

DELETE FROM `LibraryQC`;
INSERT INTO `LibraryQC`(`qcId`, `library_libraryId`, `qcUserName`, `qcDate`, `qcMethod`, `results`, `insertSize`) 
VALUES (1,1,'admin','2015-08-27',4,3,300),(2,2,'admin','2015-08-27',4,3,300),(3,3,'admin','2015-08-27',4,3,300),
(4,4,'admin','2015-08-27',4,3,300),(5,5,'admin','2015-08-27',4,3,300),(6,6,'admin','2015-08-27',4,3,300),
(7,7,'admin','2015-08-27',4,3,300),(8,8,'admin','2015-08-27',4,3,300),(9,9,'admin','2015-08-27',4,3,300),
(10,10,'admin','2015-08-27',4,3,300),(11,11,'admin','2015-08-27',4,3,300),(12,12,'admin','2015-08-27',4,3,300),
(13,13,'admin','2015-08-27',4,3,300),(14,14,'admin','2015-08-27',4,3,300);

DELETE FROM `Library_TagBarcode`;
INSERT INTO `Library_TagBarcode` 
VALUES (1,12),(2,11),(3,10),(4,9),(5,8),(6,7),(7,6),(8,5),(9,4),(10,3),(11,2),(12,1),(13,24),(14,23);

DELETE FROM `Pool`;
INSERT INTO `Pool`(`poolId`, `concentration`, `identificationBarcode`, `name`, `creationDate`, `securityProfile_profileId`, `experiment_experimentId`, `platformType`, `ready`, `alias`, `qcPassed`, `boxPositionId`) 
VALUES (1,2,'IPO1::Illumina','IPO1','2015-08-27',2,1,'Illumina',1,'Pool 1',NULL,201),
(2,2,'IPO2::Illumina','IPO2','2015-08-27',3,NULL,'Illumina',1,'Pool 2',NULL,202),
(3,2,'IPO3::Illumina','IPO3','2015-08-27',4,NULL,'Illumina',1,'Pool 3',NULL,203),
(4,2,'IPO4::Illumina','IPO4','2015-08-27',5,NULL,'Illumina',1,'Pool 4',NULL,204),
(5,2,'IPO5::Illumina','IPO5','2015-08-27',6,NULL,'Illumina',1,'Pool 5',NULL,205),
(6,2,'IPO6::Illumina','IPO6','2015-08-27',7,NULL,'Illumina',0,'Pool 6',NULL,206),
(7,2,'IPO7::Illumina','IPO7','2015-08-27',8,NULL,'Illumina',0,'Pool 7',NULL,207),
(8,2,'IPO8::Illumina','IPO8','2015-08-27',9,NULL,'Illumina',0,'Pool 8',NULL,208),
(9,2,'IPO9::Illumina','IPO9','2015-08-27',10,NULL,'Illumina',0,'Pool 9',NULL,209),
(10,2,'IPO10::Illumina','IPO10','2015-08-27',11,NULL,'Illumina',0,'Pool 10',NULL,210);

DELETE FROM `Pool_Elements`;
INSERT INTO `Pool_Elements`(`pool_poolId`, `elementType`, `elementId`) 
VALUES (1,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',2),
(2,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',6),
(2,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',5),
(2,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',4),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',7),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',8),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',9),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',10),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',11),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',12),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',13),
(4,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',1),
(5,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',2),
(6,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',3),
(6,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',4),
(6,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',5),
(6,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',6),
(7,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',7),
(7,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',8),
(8,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',8),
(8,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',9),
(9,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',11),
(9,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',12),
(10,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',13),
(10,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',14),
(3,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',14),
(1,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',1),
(2,'uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryDilution',3);

DELETE FROM `Pool_Experiment`;
INSERT INTO `Pool_Experiment`(`pool_poolId`, `experiments_experimentId`) 
VALUES (1,1),(2,2),(3,3),(3,4),(4,5),(4,6),(4,7),(4,8),(5,9),(5,10),(5,11),(5,12),(6,13),(6,14),(6,15),(6,16),(7,17),(7,18),(7,19),(7,20),
(8,21),(8,22),(8,23),(8,24),(9,29),(9,30),(9,31),(9,32),(10,25),(10,26),(10,27),(10,28);

DELETE FROM `PoolQC`;
INSERT INTO `PoolQC`(`qcId`, `pool_poolId`, `qcUserName`, `qcDate`, `qcMethod`, `results`)
VALUES (1,1,'person','2016-03-18',1,12.3),
(2,1,'person','2016-03-18',1,45.6),
(3,2,'person','2016-03-18',1,7.89);

DELETE FROM `ReferenceGenome`;
INSERT INTO `ReferenceGenome` (`referenceGenomeId`, `alias`) VALUES (1, 'Human hg19 random');
INSERT INTO `ReferenceGenome` (`referenceGenomeId`, `alias`) VALUES (2, 'Human hg19');
INSERT INTO `ReferenceGenome` (`referenceGenomeId`, `alias`) VALUES (3, 'Human hg18 random');

DELETE FROM `Project`;
INSERT INTO `Project`(`projectId`, `creationDate`, `description`, `name`, `securityProfile_profileId`, `progress`, `alias`, `lastUpdated`, `referenceGenomeId`)
VALUES (1,'2015-08-27 15:40:15','Test project','PRO1',1,'Active','TEST','2015-08-27 19:40:40', 1);
INSERT INTO `Project`(`projectId`, `creationDate`, `description`, `name`, `securityProfile_profileId`, `progress`, `alias`, `lastUpdated`, `referenceGenomeId`)
VALUES (2,'2013-11-27 12:20:15','Test project2','PRO2',1,'Active','TEST','2015-11-30 15:23:18', 1);
INSERT INTO `Project`(`projectId`, `creationDate`, `description`, `name`, `securityProfile_profileId`, `progress`, `alias`, `lastUpdated`, `referenceGenomeId`)
VALUES (3,'2016-01-27 11:11:15','Test project3','PRO3',1,'Active','TEST','2016-02-22 10:43:18', 2);

DELETE FROM `Project_Study`;
INSERT INTO `Project_Study` 
VALUES (1,1);

DELETE FROM `Run`;
INSERT INTO `Run`(`runId`, `name`, `description`, `accession`, `platformRunId`, `pairedEnd`, `cycles`, `filePath`, `securityProfile_profileId`, `platformType`, `status_statusId`, `alias`, `sequencerReference_sequencerReferenceId`, `lastModifier`) 
VALUES (1,'RUN1','BC0JHTACXX',NULL,0,1,202,'/.mounts/labs/prod/archive/h1179/120323_h1179_0070_BC0JHTACXX',12,'Illumina',1,'120323_h1179_0070_BC0JHTACXX',1,1),
(2,'RUN2','AD0VJ9ACXX',NULL,2,1,202,'/.mounts/labs/prod/archive/h1179/120404_h1179_0072_AD0VJ9ACXX',13,'Illumina',2,'120404_h1179_0072_AD0VJ9ACXX',1,1),
(3,'RUN3','BC075RACXX',NULL,3,1,209,'/.mounts/labs/prod/archive/h1179/120412_h1179_0073_BC075RACXX',14,'Illumina',3,'120412_h1179_0073_BC075RACXX',1,1),
(4,'RUN4','AC0KY7ACXX',NULL,8,1,209,'/.mounts/labs/prod/archive/h1179/120314_h1179_0068_AC0KY7ACXX',15,'Illumina',4,'120314_h1179_0068_AC0KY7ACXX',1,1);

DELETE FROM RunQC;
INSERT INTO `RunQc`(`run_runId`, `qcUserName`, `qcDate`, `qcMethod`, `information`, `doNotProcess`)
VALUES ( 1, 'username1', '2016-01-26', 1, 'information1', 1),
( 2, 'username2', '2016-02-26', 2, 'information2', 0),
( 3, 'username3', '2015-03-26', 3, 'information3', 1);

DELETE FROM RunQC_Partition;
INSERT INTO `RunQC_Partition`(`runQc_runQcId`, `containers_containerId`, `partitionNumber`)
VALUES (1, 2, 3), (2, 4, 5), (3,6,7);

DELETE FROM `Run_SequencerPartitionContainer`;
INSERT INTO `Run_SequencerPartitionContainer`(`Run_runId`, `containers_containerId`) 
VALUES (1,1),(2,2),(3,3),(4,4);

DELETE FROM `Sample`;
INSERT INTO `Sample`(`sampleId`, `accession`, `name`, `description`, `securityProfile_profileId`, `identificationBarcode`, `locationBarcode`, `sampleType`, `receivedDate`, `qcPassed`, `alias`, `project_projectId`, `scientificName`, `taxonIdentifier`, `lastModifier`) 
VALUES (1,NULL,'SAM1','Inherited from TEST_0001',1,'SAM1::TEST_0001_Bn_P_nn_1-1_D_1','Freezer1_1','GENOMIC','2015-01-27','true','TEST_0001_Bn_P_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(2,NULL,'SAM2','Inherited from TEST_0001',1,'SAM2::TEST_0001_Bn_R_nn_1-1_D_1','Freezer1_2','GENOMIC','2005-01-27','true','TEST_0001_Bn_R_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(3,NULL,'SAM3','Inherited from TEST_0002',1,'SAM3::TEST_0002_Bn_P_nn_1-1_D_1','Freezer1_3','GENOMIC','2014-01-17','true','TEST_0002_Bn_P_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(4,NULL,'SAM4','Inherited from TEST_0002',1,'SAM4::TEST_0002_Bn_R_nn_1-1_D_1','Freezer1_4','GENOMIC','2015-01-27','true','TEST_0002_Bn_R_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(5,NULL,'SAM5','Inherited from TEST_0003',1,'SAM5::TEST_0003_Bn_P_nn_1-1_D_1','Freezer1_5','GENOMIC','2015-01-27','true','TEST_0003_Bn_P_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(6,NULL,'SAM6','Inherited from TEST_0003',1,'SAM6::TEST_0003_Bn_R_nn_1-1_D_1','Freezer1_6','GENOMIC','2016-01-03','true','TEST_0003_Bn_R_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(7,NULL,'SAM7','Inherited from TEST_0004',1,'SAM7::TEST_0004_Bn_P_nn_1-1_D_1','Freezer1_7','GENOMIC','2015-02-27','true','TEST_0004_Bn_P_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(8,NULL,'SAM8','Inherited from TEST_0004',1,'SAM8::TEST_0004_Bn_R_nn_1-1_D_1','Freezer1_8','GENOMIC','2015-01-07','true','TEST_0004_Bn_R_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(9,NULL,'SAM9','Inherited from TEST_0005',1,'SAM9::TEST_0005_Bn_P_nn_1-1_D_1','Freezer1_9','GENOMIC','2015-01-22','true','TEST_0005_Bn_P_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(10,NULL,'SAM10','Inherited from TEST_0005',1,'SAM10::TEST_0005_Bn_R_nn_1-1_D_1','Freezer1_10','GENOMIC','2015-01-27','true','TEST_0005_Bn_R_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(11,NULL,'SAM11','Inherited from TEST_0006',1,'SAM11::TEST_0006_Bn_P_nn_1-1_D_1','Freezer1_11','GENOMIC','2015-01-27','true','TEST_0006_Bn_P_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(12,NULL,'SAM12','Inherited from TEST_0006',1,'SAM12::TEST_0006_Bn_R_nn_1-1_D_1','Freezer1_12','GENOMIC','2015-01-27','true','TEST_0006_Bn_R_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(13,NULL,'SAM13','Inherited from TEST_0007',1,'SAM13::TEST_0007_Bn_P_nn_1-1_D_1','Freezer1_13','GENOMIC','2015-01-27','true','TEST_0007_Bn_P_nn_1-1_D_1',1,'Homo sapiens',NULL,1),
(14,NULL,'SAM14','Inherited from TEST_0007',1,'SAM14::TEST_0007_Bn_R_nn_1-1_D_1','Freezer1_14','GENOMIC','2015-01-27','true','TEST_0007_Bn_R_nn_1-1_D_1',1,'Homo sapiens',NULL,1);

INSERT INTO `Sample`(`sampleId`, `accession`, `name`, `description`, `securityProfile_profileId`, `identificationBarcode`, `locationBarcode`, `sampleType`, `receivedDate`, `qcPassed`, `alias`, `project_projectId`, `scientificName`, `taxonIdentifier`, `lastModifier`) 
VALUES (15,NULL,'SAM15','identity1',1,'SAM15::TEST_0001_IDENTITY_1','Freezer1_1','GENOMIC','2016-04-05','true','TEST_0001_IDENTITY_1',1,'Homo sapiens',NULL,1),
(16,NULL,'SAM16','tissue1',1,'SAM16::TEST_0001_TISSUE_1','Freezer1_1','GENOMIC','2016-04-05','true','TEST_0001_TISSUE_1',1,'Homo sapiens',NULL,1),
(17,NULL,'SAM17','tissue2',1,'SAM17::TEST_0001_TISSUE_2','Freezer1_1','GENOMIC','2016-04-05','true','TEST_0001_TISSUE_2',1,'Homo sapiens',NULL,1);

INSERT INTO `SampleClass`(`sampleClassId`, `alias`, `sampleCategory`, `createdBy`, `creationDate`, `updatedBy`, `lastUpdated`)
VALUES (1,'Identity','Identity',1,'2016-04-05 14:57:00',1,'2016-04-05 14:57:00'),
(2,'Primary Tumor Tissue','Tissue',1,'2016-04-05 14:57:00',1,'2016-04-05 14:57:00');

INSERT INTO `SampleAdditionalInfo`(`sampleId`, `sampleClassId`, `archived`, `parentId`)
VALUES (15,1,0,NULL),
(16,2,0,15),
(17,2,0,15);

INSERT INTO `Identity`(`sampleId`, `internalName`, `externalName`)
VALUES (15,'INT1','EXT1');

INSERT INTO `SampleTissue`(`sampleId`)
VALUES (16),
(17);

DELETE FROM `SampleQC`;
INSERT INTO `SampleQC`(`qcId`, `sample_sampleId`, `qcUserName`, `qcDate`, `qcMethod`, `results`) 
VALUES (1,1,'admin','2015-08-27',1,5),(2,2,'admin','2015-08-27',1,5),(3,3,'admin','2015-08-27',1,5),(4,4,'admin','2015-08-27',1,5),
(5,5,'admin','2015-08-27',1,5),(6,6,'admin','2015-08-27',1,5),(7,7,'admin','2015-08-27',1,5),(8,8,'admin','2015-08-27',1,5),
(9,9,'admin','2015-08-27',1,5),(10,10,'admin','2015-08-27',1,5),(11,11,'admin','2015-08-27',1,5),(12,12,'admin','2015-08-27',1,5),
(13,13,'admin','2015-08-27',1,5),(14,14,'admin','2015-08-27',1,5), (15,14,'admin','2015-08-27',1,5);

DELETE FROM `SequencerPartitionContainer`;
INSERT INTO `SequencerPartitionContainer`(`containerId`, `securityProfile_profileId`, `identificationBarcode`, `locationBarcode`, `platform`, `validationBarcode`, `lastModifier`) 
VALUES (1,12,'C0JHTACXX','',16,'',1),(2,13,'D0VJ9ACXX','',16,'',1),(3,14,'C075RACXX','',16,'',1),(4,15,'C0KY7ACXX','',16,'',1);

DELETE FROM `SequencingParameters`;
DELETE FROM `Platform`;
INSERT INTO `Platform`(`platformId`, `name`, `instrumentModel`, `description`, `numContainers`) 
VALUES (16,'Illumina','Illumina HiSeq 2000','4-channel flowgram',1),(17,'Illumina','Illumina MiSeq','Tiny Seq',1),(18,'PacBio','PacBio RS','Long Seq',1);

DELETE FROM `SequencerPartitionContainer_Partition`;
INSERT INTO `SequencerPartitionContainer_Partition`(`container_containerId`, `partitions_partitionId`) 
VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(2,9),(2,10),(2,11),(2,12),(2,13),(2,14),(2,15),(2,16),(3,17),(3,18),(3,19),
(3,20),(3,21),(3,22),(3,23),(3,24),(4,25),(4,26),(4,27),(4,28),(4,29),(4,30),(4,31),(4,32);

DELETE FROM `SequencerReference`;
INSERT INTO `SequencerReference`(`referenceId`, `name`, `ipAddress`, `platformId`, `available`) 
VALUES (1,'h1179',X'0F000001',16,1),
(2,'h1180',X'0F000001',16,1);

DELETE FROM `SequencerServiceRecord`;
INSERT INTO `SequencerServiceRecord`(`recordId`, `sequencerReferenceId`, `title`, `details`, `servicedBy`, `referenceNumber`, `serviceDate`, `shutdownTime`, `restoredTime`)
VALUES (1,1,'Seq1_Rec1','Test service','Service Person','12345','2016-01-01', '2016-01-01 07:30:00', '2016-01-01 09:00:00'),
(2,1,'Seq1_Rec2',NULL,'Service Person',NULL,'2016-01-21',NULL,NULL),
(3,2,'Seq2_Rec1',NULL,'Service Person',NULL,'2016-01-21',NULL,NULL);

DELETE FROM `Status`;
INSERT INTO `Status`(`statusId`, `health`, `completionDate`, `startDate`, `instrumentName`, `lastUpdated`, `runName`, `xml`) 
VALUES (1,'Completed','2012-03-31','2012-03-23','SN7001179','2015-08-28 18:32:29','120323_h1179_0070_BC0JHTACXX',RAWTOHEX('<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!--Illumina RTA Status Report-->\n<Status>\n  <Software>Illumina RTA 1.12.4.2</Software>\n  <RunName>120323_h1179_0070_BC0JHTACXX</RunName>\n  <InstrumentName>H1179</InstrumentName>\n  <RunStarted>Tuesday, March 27, 2012 5:22 PM</RunStarted>\n  <NumCycles>202</NumCycles>\n  <ImgCycle>202</ImgCycle>\n  <ScoreCycle>202</ScoreCycle>\n  <CallCycle>202</CallCycle>\n  <InputDir>E:\\Illumina\\HiSeqTemp\\120323_h1179_0070_BC0JHTACXX</InputDir>\n  <OutputDir>\\\\storage4.stg.oicr.on.ca\\bas005\\archive\\h1179\\120323_h1179_0070_BC0JHTACXX</OutputDir>\n  <Configuration>\n    <CopyAllFiles>true</CopyAllFiles>\n    <CopyImages>False</CopyImages>\n    <DeleteImages>True</DeleteImages>\n    <RunInfoExists>True</RunInfoExists>\n    <IsPairedEndRun>True</IsPairedEndRun>\n    <NumberOfReads>2</NumberOfReads>\n    <NumberOfLanes>8</NumberOfLanes>\n    <TilesPerLane>48</TilesPerLane>\n    <ControlLane>8</ControlLane>\n  </Configuration>\n</Status>\n')),
(2,'Unknown','2012-04-04','2012-04-04','SN7001179','2015-08-28 18:32:31','120404_h1179_0072_AD0VJ9ACXX',RAWTOHEX('<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!--Illumina RTA Status Report-->\n<Status>\n  <Software>Illumina RTA 1.12.4.2</Software>\n  <RunName>120404_h1179_0072_AD0VJ9ACXX</RunName>\n  <InstrumentName>H1179</InstrumentName>\n  <RunStarted>Sunday, April 08, 2012 10:55 AM</RunStarted>\n  <NumCycles>202</NumCycles>\n  <ImgCycle>101</ImgCycle>\n  <ScoreCycle>101</ScoreCycle>\n  <CallCycle>101</CallCycle>\n  <InputDir>D:\\Illumina\\HiSeqTemp\\120404_h1179_0072_AD0VJ9ACXX</InputDir>\n  <OutputDir>\\\\storage4.stg.oicr.on.ca\\bas005\\archive\\h1179\\120404_h1179_0072_AD0VJ9ACXX</OutputDir>\n  <Configuration>\n    <CopyAllFiles>true</CopyAllFiles>\n    <CopyImages>False</CopyImages>\n    <DeleteImages>True</DeleteImages>\n    <RunInfoExists>True</RunInfoExists>\n    <IsPairedEndRun>True</IsPairedEndRun>\n    <NumberOfReads>2</NumberOfReads>\n    <NumberOfLanes>8</NumberOfLanes>\n    <TilesPerLane>48</TilesPerLane>\n    <ControlLane>0</ControlLane>\n  </Configuration>\n</Status>\n')),
(3,'Completed','2012-04-20','2012-04-12','SN7001179','2015-08-28 18:32:35','120412_h1179_0073_BC075RACXX',RAWTOHEX('<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!--Illumina RTA Status Report-->\n<Status>\n  <Software>Illumina RTA 1.12.4.2</Software>\n  <RunName>120412_h1179_0073_BC075RACXX</RunName>\n  <InstrumentName>H1179</InstrumentName>\n  <RunStarted>Tuesday, April 17, 2012 5:36 PM</RunStarted>\n  <NumCycles>209</NumCycles>\n  <ImgCycle>209</ImgCycle>\n  <ScoreCycle>209</ScoreCycle>\n  <CallCycle>209</CallCycle>\n  <InputDir>E:\\Illumina\\HiSeqTemp\\120412_h1179_0073_BC075RACXX</InputDir>\n  <OutputDir>\\\\storage4.stg.oicr.on.ca\\bas005\\archive\\h1179\\120412_h1179_0073_BC075RACXX</OutputDir>\n  <Configuration>\n    <CopyAllFiles>true</CopyAllFiles>\n    <CopyImages>False</CopyImages>\n    <DeleteImages>True</DeleteImages>\n    <RunInfoExists>True</RunInfoExists>\n    <IsPairedEndRun>True</IsPairedEndRun>\n    <NumberOfReads>3</NumberOfReads>\n    <NumberOfLanes>8</NumberOfLanes>\n    <TilesPerLane>48</TilesPerLane>\n    <ControlLane>0</ControlLane>\n  </Configuration>\n</Status>\n')),
(4,'Completed','2012-03-23','2012-03-14','SN7001179','2015-08-28 18:32:35','120314_h1179_0068_AC0KY7ACXX',RAWTOHEX('<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!--Illumina RTA Status Report-->\n<Status>\n  <Software>Illumina RTA 1.12.4.2</Software>\n  <RunName>120314_h1179_0068_AC0KY7ACXX</RunName>\n  <InstrumentName>H1179</InstrumentName>\n  <RunStarted>Sunday, March 18, 2012 3:37 PM</RunStarted>\n  <NumCycles>209</NumCycles>\n  <ImgCycle>209</ImgCycle>\n  <ScoreCycle>209</ScoreCycle>\n  <CallCycle>209</CallCycle>\n  <InputDir>D:\\Illumina\\HiSeqTemp\\120314_h1179_0068_AC0KY7ACXX</InputDir>\n  <OutputDir>\\\\storage4.stg.oicr.on.ca\\bas005\\archive\\h1179\\120314_h1179_0068_AC0KY7ACXX</OutputDir>\n  <Configuration>\n    <CopyAllFiles>true</CopyAllFiles>\n    <CopyImages>False</CopyImages>\n    <DeleteImages>True</DeleteImages>\n    <RunInfoExists>True</RunInfoExists>\n    <IsPairedEndRun>True</IsPairedEndRun>\n    <NumberOfReads>3</NumberOfReads>\n    <NumberOfLanes>8</NumberOfLanes>\n    <TilesPerLane>48</TilesPerLane>\n    <ControlLane>0</ControlLane>\n  </Configuration>\n</Status>\n'));

DELETE FROM `Study`;
INSERT INTO `Study`(`studyId`, `name`, `description`, `accession`, `securityProfile_profileId`, `project_projectId`, `studyType`, `alias`, `lastModifier`)
VALUES (1,'STU1','Test study1',NULL,1,1,'Other','Test Study1',1),
(2,'STU2','Test study2',NULL,1,1,'Other','Test Study2',1),
(3,'STU3','OICR',NULL,1,1,'Other','Test Study3',1),
(4,'STU4','OICR',NULL,1,1,'Other','Test Study4',1);

DELETE FROM `Watcher`;
INSERT INTO `Watcher`(`entityName`, `userId`) 
VALUES ('IPO1',1),('IPO10',1),('IPO2',1),('IPO3',1),('IPO4',1),('IPO5',1),('IPO6',1),('IPO7',1),('IPO8',1),('IPO9',1);

DELETE FROM `SecurityProfile`;
INSERT INTO `SecurityProfile`(`profileId`, `allowAllInternal`, `owner_userId`) 
VALUES (1,1,1),(2,1,1),(3,1,1),(4,1,1),(5,1,1),(6,1,1),(7,1,1),(8,1,1),(9,1,1),(10,1,1),(11,1,1),(12,1,NULL),(13,1,NULL),(14,1,NULL),(15,1,NULL);

DELETE FROM `Institute`;
INSERT INTO `Institute`(`instituteId`, `alias`, `createdBy`, `creationDate`, `updatedBy`, `lastUpdated`)
VALUES (1,'Institute A',1,'2016-01-28 14:32:00',1,'2016-01-28 14:32:00'),(2,'Institute B',1,'2016-01-29 09:32:00',1,'2016-01-29 09:32:00');

DELETE FROM `Lab`;
INSERT INTO `Lab`(`labId`, `instituteId`, `alias`, `createdBy`, `creationDate`, `updatedBy`, `lastUpdated`)
VALUES (1,1,'Lab A1',1,'2016-02-10 15:35:00',1,'2016-02-10 15:35:00'),(2,1,'Lab A2',1,'2016-02-10 15:35:00',1,'2016-02-10 15:35:00'),
(3,1,'Lab B1',1,'2016-02-10 15:35:00',1,'2016-02-10 15:35:00'),(4,1,'Lab B2',1,'2016-02-10 15:35:00',1,'2016-02-10 15:35:00');

INSERT INTO `SampleNumberPerProject`
(`sampleNumberPerProjectId`, `projectId`, `highestSampleNumber`, `padding`, `createdBy`, `updatedBy`, `creationDate`, `lastUpdated`)
VALUES ('1', '1', '1', '4', '1', '1', '2016-01-28 14:32:00', '2016-01-28 14:32:00');
INSERT INTO `SampleNumberPerProject`
(`sampleNumberPerProjectId`, `projectId`, `highestSampleNumber`, `padding`, `createdBy`, `updatedBy`, `creationDate`, `lastUpdated`)
VALUES ('2', '3', '9999', '4', '1', '1', '2016-01-28 14:32:00', '2016-01-28 14:32:00');

DELETE FROM `BoxSize`;
INSERT INTO `BoxSize` (`boxSizeId`, `rows`, `columns`, `scannable`)
VALUES
('1', '4', '4', '0');

DELETE FROM `BoxUse`;
INSERT INTO `BoxUse` (`boxUseId`, `alias`)
VALUES
('1', 'boxuse1'),
('2', 'boxuse2');

DELETE FROM Box;
INSERT INTO `Box` (`boxId`, `boxSizeId`, `boxUseId`, `name`, `alias`, `description`, `identificationBarcode`, `locationBarcode`, `securityProfile_profileId`, `lastModifier`)
VALUES
('1','1', '1', 'box1', 'box1alias', 'box1', 'barcode1','identifcationbarcode1', '1', '1'),
('2','1', '2', 'box2', 'box2alias', 'box2', 'barcode2','identifcationbarcode2', '1', '1');

DELETE FROM BoxPosition;
INSERT INTO `BoxPosition` (`BoxPositionId`, `boxId`, `column`, `row`, `lastModifier`)
VALUES
('1', '1', '1', '1', '1'),
('2', '2', '1', '2', '1');

DELETE FROM Submission;
INSERT INTO `Submission` (`submissionId`, `creationDate`, `submittedDate`, `verified`, `description`, `name`, `title`, `accession`, `alias`, `completed`)
VALUES
(1, '2012-04-20', '2012-04-20', 0, 'test description 1', 'name 1', 'title 1', 'accession 1', 'alias 1', 0),
(2, '2012-04-20', '2012-04-20', 1, 'test description 2', 'name 2', 'title 2', 'accession 2', 'alias 2', 1),
(3, '2012-04-20', '2012-04-20', 0, 'test description 3', 'name 3', 'title 3', 'accession 3', 'alias 3', 0);

DELETE FROM Submission_Experiment;
INSERT INTO `Submission_Experiment` (`submission_submissionId`, `experiments_experimentId`)
VALUES
(1, 1),
(2, 1),
(3, 2);

DELETE FROM QCType;
INSERT INTO `QCType` (`qcTypeId`, `name`, `description`, `qcTarget`, `units`)
VALUES
    (2,'Bioanalyzer','Chip-based capillary electrophoresis machine to analyse RNA, DNA, and protein, manufactured by Agilent','Library','nM'),
    (7,'QuBit','Quantitation of DNA, RNA and protein, manufacturered by Invitrogen','Sample','ng/&#181;l'),
    (3,'Bioanalyser','Chip-based capillary electrophoresis machine to analyse RNA, DNA, and protein, manufactured by Agilent','Sample','ng/&#181;l'),
    (4,'QuBit','Quantitation of DNA, RNA and protein, manufacturered by Invitrogen','Library','ng/&#181;l'),
    (6,'SeqInfo QC','Post-run completion run QC step, undertaken by the SeqInfo team, as part of the primary analysis stage.','Run',''),
    (5,'SeqOps QC','Post-run completion run QC step, undertaken by the SeqOps team, to move a run through to the primary analysis stage.','Run',''),
    (1,'qPCR','Quantitative PCR','Library','mol/&#181;l'),
    (8,'poolQcType1', 'qc 1 for pools', 'Pool', 'nM'),
	(9,'poolQcType2', 'qc 2 for pools', 'Pool', 'nM'),
	(10,'poolQcType3', 'qc 3 for pools', 'Pool', 'nM'),
	(11,'poolQcType4', 'qc 4 for pools', 'Pool', 'nM');

DELETE FROM Alert;
INSERT INTO `Alert` (
  `alertId`,
  `title`,
  `text`,
  `userId`,
  `date`,
  `isRead`,
  `level`,
) VALUES 
(1, 'Alert 1', 'Alert 1 Text', 1, '2012-04-20', 0, 'INFO'),
(2, 'Alert 2', 'Alert 2 Text', 1, '2012-04-20', 1, 'INFO'),
(3, 'Alert 3', 'Alert 3 Text', 1, '2012-04-20', 0, 'INFO');

DELETE FROM Note;
INSERT INTO `Note`(`noteId`, `creationDate`, `internalOnly`, `text`, `owner_userId`)
VALUES
(1, '2016-02-25', 1, 'first note', 1),
(2, '2016-01-23', 0, 'second note', 1),
(3, '2016-03-11', 0, 'third note', 1);

DELETE FROM `ProjectOverview_note`;
INSERT INTO `ProjectOverview_note`(`overview_overviewId`, `notes_noteId`)
VALUES (33, 2);


DELETE FROM `Kit_Note`;
INSERT INTO `Kit_Note`(`kit_kitId`, `notes_noteId`)
VALUES (33, 1);

DELETE FROM `Sample_Note`;
INSERT INTO `Sample_Note`(`sample_sampleId`, `notes_noteId`)
VALUES (33, 2);

DELETE FROM `Library_Note`;
INSERT INTO `Library_Note`(`library_libraryId`, `notes_noteId`)
VALUES (33, 3);

DELETE FROM `Run_Note`;
INSERT INTO `Run_Note`(`run_runId`, `notes_noteId`)
VALUES (33, 1);

DELETE FROM `Pool_Note`;
INSERT INTO `Pool_Note`(`pool_poolId`, `notes_noteId`)
VALUES (33, 2);
	
DELETE FROM `emPCR`;
INSERT INTO `emPCR` (`pcrId`, `concentration`, `dilution_dilutionId`, `creationDate`, `pcrUserName`, `name`, `securityProfile_profileId`)
VALUES 
(1, 10.00, 1, '2016-03-19', 'Bobby Davro', 'Mr emPCR', 1),
(2, 30.01, 1, '2016-03-19', 'Bobby Charlton', 'Mrs emPCR', 1),
(3, 30.11, 1, '2016-03-19', 'Bobby Dazzler', 'Professor emPCR', 1);

INSERT INTO `User` (`userId`, `active`, `admin`, `external`, `fullName`, `internal`, `loginName`, `password`, `email`)
VALUES (3,1,0,0,'user',1,'user','user','user@user.user');

INSERT INTO `User_Group` (`users_userId`, `groups_groupId`)
VALUES (3,1),(3,2),(1,1);

DELETE FROM `TissueOrigin`;
INSERT INTO `TissueOrigin`(`tissueOriginId`, `alias`, `description`, `createdBy`, `creationDate`, `updatedBy`, `lastUpdated`)
VALUES (1,'Test Origin','for testing',1,'2016-02-19 11:28:00',1,'2016-02-19 11:28:00');

DELETE FROM `TissueType`;
INSERT INTO `TissueType`(`tissueTypeId`, `alias`, `description`, `createdBy`, `creationDate`, `updatedBy`, `lastUpdated`)
VALUES (1,'Test Type','for testing',1,'2016-02-19 11:28:00',1,'2016-02-19 11:28:00');

DELETE FROM `LibraryAdditionalInfo`;
INSERT INTO `LibraryAdditionalInfo`(`libraryId`, `tissueOriginId`, `tissueTypeId`, `kitDescriptorId`, `createdBy`, `creationDate`, `updatedBy`, `lastUpdated`)
VALUES (1,1,1,1,1,'2016-02-19 11:28:00',1,'2016-02-19 11:28:00');
