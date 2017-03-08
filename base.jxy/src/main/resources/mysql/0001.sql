/*用户表*/
DROP TABLE IF EXISTS sm_user;
CREATE TABLE sm_user (
  PK_USER bigint(20)  AUTO_INCREMENT,
  PK_CORP varchar(20) DEFAULT NULL,
  PK_ROLE varchar(20)  DEFAULT NULL,
  USER_CODE varchar(30) NOT NULL,
  USER_NAME varchar(50) NOT NULL,
  USER_NOTE varchar(75) DEFAULT NULL,
  USER_PASSWORD varchar(50) NOT NULL,
  EMAIL varchar(50),
  MOBILE varchar(15),
  BE_LOCKED char(1) DEFAULT 'N',
  ABLE_TIME datetime,
  DISABLE_TIME datetime,
  DEF1 varchar(128) DEFAULT NULL,
  DEF2 varchar(128) DEFAULT NULL,
  DEF3 varchar(128) DEFAULT NULL,
  DEF4 varchar(128) DEFAULT NULL,
  DEF5 varchar(128) DEFAULT NULL,
  BE_STD char(1) DEFAULT NULL,
  TS timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  dr int(1) DEFAULT NULL,
  PRIMARY KEY (PK_USER)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ;

/*角色表*/
DROP TABLE IF EXISTS `sm_role`;
CREATE TABLE `sm_role` (
  `PK_ROLE` bigint(20) NOT NULL AUTO_INCREMENT,
  `PK_CORP` varchar(20) DEFAULT NULL,
  `ROLE_CODE` varchar(30) NOT NULL,
  `ROLE_NAME` varchar(50) NOT NULL,
  `MEMO` varchar(150) DEFAULT NULL,
  `DEF1` varchar(128) DEFAULT NULL,
  `DEF2` varchar(128) DEFAULT NULL,
  `DEF3` varchar(128) DEFAULT NULL,
  `DEF4` varchar(128) DEFAULT NULL,
  `DEF5` varchar(128) DEFAULT NULL,
  `BE_STD` char(1) DEFAULT NULL,
  `TS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dr` int(1) DEFAULT NULL,
  PRIMARY KEY (`PK_ROLE`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/

/*导航目录表*/
DROP TABLE IF EXISTS `bd_navigation`;
CREATE TABLE `base_navigation` (
  `pk_navigation` bigint(20) NOT NULL AUTO_INCREMENT,
  `pk_father_navigation` bigint(20) DEFAULT NULL,
  `navigation_code` varchar(32) DEFAULT NULL,
  `navigation_name` varchar(64) DEFAULT NULL,
  `navigation_path` varchar(255) DEFAULT NULL,
  `icon_path` varchar(255) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `def1` varchar(255) DEFAULT NULL,
  `def2` varchar(255) DEFAULT NULL,
  `def3` varchar(255) DEFAULT NULL,
  `def4` varchar(255) DEFAULT NULL,
  `def5` varchar(255) DEFAULT NULL,
  `be_std` char(1) DEFAULT NULL,
  `ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dr` int(255) DEFAULT '0',
  PRIMARY KEY (`pk_navigation`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/

/*角色目录关系表*/
DROP TABLE IF EXISTS `bd_relation_role_navigate`;
CREATE TABLE `base_relation_role_navigate` (
  `pk_relation_role_navigate` bigint(20) NOT NULL,
  `pk_role` bigint(20) NOT NULL,
  `pk_navigate` bigint(20) NOT NULL,
  `def1` varchar(255) DEFAULT NULL,
  `def2` varchar(255) DEFAULT NULL,
  `def3` varchar(255) DEFAULT NULL,
  `def4` varchar(255) DEFAULT NULL,
  `def5` varchar(255) DEFAULT NULL,
  `ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`pk_relation_role_navigate`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/

/*年级表*/
DROP TABLE IF EXISTS `bd_yeargrade`;
CREATE TABLE `bd_yeargrade` (
  `pk_yeargrade` bigint(20) NOT NULL AUTO_INCREMENT,
  `pk_school` bigint(20) DEFAULT NULL,
  `pk_user` bigint(20) DEFAULT NULL,
  `grade_code` varchar(64) DEFAULT NULL,
  `grade_name` varchar(128) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `def1` varchar(255) DEFAULT NULL,
  `def2` varchar(255) DEFAULT NULL,
  `def3` varchar(255) DEFAULT NULL,
  `def4` varchar(255) DEFAULT NULL,
  `def5` varchar(255) DEFAULT NULL,
  `ts` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `dr` int(1) DEFAULT NULL,
  `be_std` char(1) DEFAULT NULL,
  PRIMARY KEY (`pk_yeargrade`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/

/*班级表*/
DROP TABLE IF EXISTS `bd_class`;
CREATE TABLE `bd_class` (
  `pk_class` bigint(20) NOT NULL AUTO_INCREMENT,
  `pk_yeargrade` bigint(20) DEFAULT NULL,
  `pk_staff` bigint(20) DEFAULT NULL,
  `classcode` varchar(64) DEFAULT NULL,
  `classname` varchar(128) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `def1` varchar(255) DEFAULT NULL,
  `def2` varchar(255) DEFAULT NULL,
  `def3` varchar(255) DEFAULT NULL,
  `def4` varchar(255) DEFAULT NULL,
  `def5` varchar(255) DEFAULT NULL,
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dr` int(1) DEFAULT NULL,
  `bd_std` char(1) DEFAULT NULL,
  PRIMARY KEY (`pk_class`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/

/*教职工基础信息表*/
DROP TABLE IF EXISTS `bd_staff`;
CREATE TABLE `bd_staff` (
  `pk_staff` bigint(20) NOT NULL AUTO_INCREMENT,
  `staffcode` varchar(64) DEFAULT NULL,
  `staffname` varchar(64) DEFAULT NULL,
  `phone` int(20) DEFAULT NULL,
  `used_name` varchar(64) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL COMMENT '0:男，1:女',
  `address` varchar(255) DEFAULT NULL COMMENT '居住地址',
  `email` varchar(64) DEFAULT NULL,
  `education` varchar(64) DEFAULT NULL,
  `nation` varchar(64) DEFAULT NULL,
  `workdate` char(10) DEFAULT NULL,
  `educationdate` char(10) DEFAULT NULL,
  `birthday` char(10) DEFAULT NULL,
  `nativeplace` varchar(255) DEFAULT NULL COMMENT '籍贯',
  `census_register` varchar(255) DEFAULT NULL COMMENT '户口所在地',
  `register_type` varchar(64) DEFAULT NULL COMMENT '户口性质',
  `credential_type` varchar(64) DEFAULT NULL COMMENT '证件类型',
  `credential_no` varchar(64) DEFAULT NULL COMMENT '证件号码',
  `be_marry` int(1) DEFAULT NULL COMMENT '婚姻状况 0:未婚,1:已婚',
  `political_status` varchar(32) DEFAULT NULL COMMENT '政治面貌',
  `memo` varchar(255) DEFAULT NULL,
  `def1` varchar(255) DEFAULT NULL,
  `def2` varchar(255) DEFAULT NULL,
  `def3` varchar(255) DEFAULT NULL,
  `def4` varchar(255) DEFAULT NULL,
  `def5` varchar(255) DEFAULT NULL,
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dr` int(1) DEFAULT NULL,
  `bd_std` char(1) DEFAULT NULL,
  PRIMARY KEY (`pk_staff`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/

/*部门信息表*/
DROP TABLE IF EXISTS `bd_deptdoc`;
CREATE TABLE `bd_deptdoc` (
  `pk_deptdoc` bigint(20) NOT NULL AUTO_INCREMENT,
  `pk_user` bigint(20) DEFAULT NULL COMMENT '部门负责人',
  `pk_school` bigint(20) DEFAULT NULL,
  `deptcode` varchar(64) DEFAULT NULL,
  `deptname` varchar(255) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `def1` varchar(255) DEFAULT NULL,
  `def2` varchar(255) DEFAULT NULL,
  `def3` varchar(255) DEFAULT NULL,
  `def4` varchar(255) DEFAULT NULL,
  `def5` varchar(255) DEFAULT NULL,
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dr` int(1) DEFAULT NULL,
  `bd_std` char(1) DEFAULT NULL,
  PRIMARY KEY (`pk_deptdoc`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*学校概况表*/
DROP TABLE IF EXISTS `bd_schoolsurvey`;
CREATE TABLE `bd_schoolsurvey` (
  `pk_school` bigint(20)  NOT NULL AUTO_INCREMENT,
  `schoolcode` bigint(20) NOT NULL,
  `schoolname` varchar(50) NOT NULL,
  `eng_name` varchar(50) NOT NULL,
  `school_address` varchar(50) NOT NULL,
  `postal_code` int(11) NOT NULL,
  `area` varchar(20) NOT NULL,
  `year_month` char(10) DEFAULT NULL,
  `dec_day` char(10) DEFAULT NULL COMMENT '校庆日',
  `school_type` varchar(30) NOT NULL COMMENT '办学类型',
  `department` varchar(20) NOT NULL COMMENT '主管部门',
  `legalperson_no` bigint(20) NOT NULL COMMENT '法人号',
  `corporate_no` bigint(20) NOT NULL COMMENT '法人证书号',
  `organization` varchar(30) DEFAULT NULL COMMENT '组织机构',
  `contact_no` bigint(20) DEFAULT NULL COMMENT '联系电话',
  `fax_no` bigint(20) DEFAULT NULL COMMENT '传真号码',
  `email` varchar(30) DEFAULT NULL,
  `homepage` varchar(50) NOT NULL,
  `history` varchar(50) DEFAULT NULL,
  `local_eco` varchar(20) DEFAULT NULL COMMENT '所在地经济属性',
  `property` varchar(20) DEFAULT NULL COMMENT '学校办别',
  `charge_unit` varchar(30) DEFAULT NULL COMMENT '负责单位',
  `local_type` varchar(30) NOT NULL COMMENT '所在地类型',
  `self_rule` int(11) NOT NULL,
  `primary_length` double NOT NULL COMMENT '小学学制',
  `junior_mid_length` double NOT NULL COMMENT '初中学制',
  `primary_age` int(11) NOT NULL COMMENT '小学入学年龄',
  `enroll_radius` varchar(50) DEFAULT NULL COMMENT '招生半径',
  `junior_mid_age` int(11) NOT NULL COMMENT '初中入学年龄',
  `junior_high_length` double NOT NULL COMMENT '高中学制',
  `primary_language` varchar(20) NOT NULL COMMENT '主教学语言',
  `aux_language` varchar(20) NOT NULL COMMENT '辅教学语言',
  `ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dr` int(11) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `def1` varchar(255) DEFAULT NULL,
  `bd_std` char(1) DEFAULT NULL,
  `be_std` char(255) DEFAULT NULL,
  PRIMARY KEY (`pk_school`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;