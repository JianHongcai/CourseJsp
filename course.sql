/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50730
Source Host           : localhost:3306
Source Database       : mybatisplus

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2023-05-19 08:46:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for edu_course
-- ----------------------------
DROP TABLE IF EXISTS `edu_course`;
CREATE TABLE `edu_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_cno` varchar(11) DEFAULT NULL COMMENT '课程号',
  `course_name` varchar(50) DEFAULT '' COMMENT '课程名称',
  `parent_id` int(11) DEFAULT '0' COMMENT '父课程id',
  `teacher_id` int(11) DEFAULT '0' COMMENT '教师id',
  `recruits_plan` int(10) DEFAULT '0' COMMENT '计划招收数',
  `recruits_actual` int(10) DEFAULT '0' COMMENT '实际招收数',
  `recruits_request` int(10) DEFAULT '0' COMMENT '已申请数',
  `is_valid` tinyint(1) DEFAULT '1' COMMENT '课程有效性（1-上架，2-下架）',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否已删除 0-未删除 1-已删除',
  `sort` tinyint(2) DEFAULT '0' COMMENT '排序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of edu_course
-- ----------------------------
INSERT INTO `edu_course` VALUES ('1', 'WL230001', '物理23学年', '0', '1', '0', '0', '0', '1', '0', '1', '2023-03-06 01:25:52', '2023-03-06 01:26:19');
INSERT INTO `edu_course` VALUES ('2', 'HX230002', '化学23学年', '0', '2', '0', '0', '0', '1', '0', '1', '2023-03-06 01:26:29', '2023-03-06 01:26:33');

-- ----------------------------
-- Table structure for edu_course_studyhistory
-- ----------------------------
DROP TABLE IF EXISTS `edu_course_studyhistory`;
CREATE TABLE `edu_course_studyhistory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) DEFAULT '0' COMMENT '课程id',
  `student_id` int(11) DEFAULT '0' COMMENT '学生id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `course_status` int(2) DEFAULT '0' COMMENT '课程状态（0-可申请，1-待审核，2-已审核）',
  `sort` int(2) DEFAULT '0' COMMENT '排序',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否已删除 0-未删除 1-已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of edu_course_studyhistory
-- ----------------------------

-- ----------------------------
-- Table structure for sys_student
-- ----------------------------
DROP TABLE IF EXISTS `sys_student`;
CREATE TABLE `sys_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `sex` tinyint(1) DEFAULT '1' COMMENT '性别  1男  2女',
  `age` tinyint(3) DEFAULT '0' COMMENT '年龄',
  `create_time` datetime DEFAULT NULL COMMENT '注册时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否已删除 0-未删除 1-已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_student
-- ----------------------------
INSERT INTO `sys_student` VALUES ('1', '13612340001', '张三', '1', '16', '2023-03-06 01:22:25', '2023-03-06 01:23:04', '0');
INSERT INTO `sys_student` VALUES ('2', '13612340002', '李四', '2', '17', '2023-03-06 01:22:55', '2023-03-06 01:22:57', '0');
INSERT INTO `sys_student` VALUES ('3', '13612340003', '王五', '1', '18', '2023-03-06 01:23:21', '2023-03-06 01:23:24', '0');

-- ----------------------------
-- Table structure for sys_teacher
-- ----------------------------
DROP TABLE IF EXISTS `sys_teacher`;
CREATE TABLE `sys_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_no` varchar(20) DEFAULT '' COMMENT '教职工号',
  `name` varchar(200) DEFAULT '' COMMENT '教师姓名',
  `sex` tinyint(1) DEFAULT '1' COMMENT '性别  1男  2女',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否已删除 0-未删除 1-已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_teacher
-- ----------------------------
INSERT INTO `sys_teacher` VALUES ('1', 'JS2023001', '刘老师', '1', '15943210001', '2023-03-06 01:24:25', '2023-03-06 01:24:28', '0');
INSERT INTO `sys_teacher` VALUES ('2', 'JS2023002', '王老师', '0', '15943210002', '2023-03-06 01:24:50', '2023-03-06 01:24:53', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Jone', '18', 'test1@baomidou.com');
INSERT INTO `user` VALUES ('2', 'Jack', '20', 'test2@baomidou.com');
INSERT INTO `user` VALUES ('3', 'Tom', '28', 'test3@baomidou.com');
INSERT INTO `user` VALUES ('4', 'Sandy', '21', 'test4@baomidou.com');
INSERT INTO `user` VALUES ('5', 'Billie', '24', 'test5@baomidou.com');
INSERT INTO `user` VALUES ('6', 'test', '18', 'qqqq@qq.com');
INSERT INTO `user` VALUES ('7', 'test7', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('8', 'test7', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('9', 'test7', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('10', 'test7', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('11', 'test7', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('12', 'test7', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('13', 'test11', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('14', null, '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('15', null, '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('16', null, '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('17', 'test7', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('18', 'test8', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('19', 'te12312312', '19', '1231321@qq.com');
INSERT INTO `user` VALUES ('20', 'testAddUser', '18', '1123123123@qq.com');
INSERT INTO `user` VALUES ('21', 'testAddUser', '18', '1123123123@qq.com');
