/*
Navicat MySQL Data Transfer

Source Server         : yeah
Source Server Version : 80021
Source Host           : localhost:3306
Source Database       : psmis

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2021-01-07 12:25:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `excerpt` varchar(255) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `views` int DEFAULT NULL,
  `like` int DEFAULT NULL,
  `star` int DEFAULT NULL,
  `top` int DEFAULT NULL,
  `sid` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fkey1` (`category_id`),
  CONSTRAINT `fkey1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `article_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fkey0` (`article_id`),
  CONSTRAINT `fkey0` FOREIGN KEY (`article_id`) REFERENCES `article` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '文章标题',
  `url` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '文件的url',
  `rtime` datetime DEFAULT NULL COMMENT '发布的时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('1', '学费和国家助学贷款代偿申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-06-21 08:33:21');
INSERT INTO `file` VALUES ('2', '基层单位在岗证明', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-26 08:33:21');
INSERT INTO `file` VALUES ('3', '基层单位工作证明', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-27 12:35:24');
INSERT INTO `file` VALUES ('4', '高校学生应征入伍学费补偿国家助学贷款代偿申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-25 12:35:30');
INSERT INTO `file` VALUES ('5', '高校学生退役复学学费减免申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-18 12:35:40');
INSERT INTO `file` VALUES ('6', '二次分配就业证明', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-04 12:35:44');
INSERT INTO `file` VALUES ('7', '助学贷款提前还款申请书', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-15 12:35:47');
INSERT INTO `file` VALUES ('8', '毕业生基层就业代偿账户信息表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-08 12:35:50');
INSERT INTO `file` VALUES ('9', '生源地助学贷款毕业生信息档案表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-10-13 12:35:53');
INSERT INTO `file` VALUES ('10', '暑假校内用工部门勤工助学申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-22 12:35:58');

-- ----------------------------
-- Table structure for fund
-- ----------------------------
DROP TABLE IF EXISTS `fund`;
CREATE TABLE `fund` (
  `f_id` int NOT NULL AUTO_INCREMENT,
  `f_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `f_abs` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `f_amount` double NOT NULL,
  `f_time` bigint NOT NULL,
  `f_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `istop` int DEFAULT NULL,
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of fund
-- ----------------------------
INSERT INTO `fund` VALUES ('1', '新生入学资助项目', '中西部生源的家庭经济困难新生可申请入学资助项目，解决入校报到的交通费和入学后短期生活费。就读本省院校的新生每人500元，就读省外院校的新生每人1000元。学生可向当地县级教育部门咨询办理。', '500', '1591228385793', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/10.jpg', null);
INSERT INTO `fund` VALUES ('2', '国家助学贷款', '家庭经济困难学生可申请办理国家助学贷款，解决学费与住宿费，每人每年最高不超过8000元，在校期间利息由国家承担，还款期限原则上按学制加13年确定，最长不超过20年。国家助学贷款包括生源地信用助学贷款与校园地国家助学贷款，家庭经济困难学生可向户籍所在县(市、区)的学生资助管理机构咨询办理生源地信用助学贷款，或向高校学生资助部门咨询办理校园地国家助学贷款。', '8000', '1591228413882', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/2.jpg', null);
INSERT INTO `fund` VALUES ('3', '国家助学金', '家庭经济困难学生入学后可申请国家助学金，解决在校学习期间的生活费，平均每人每年3000元。学生持《家庭经济困难学生认定申请表》于每年9月向高校提出申请，高校每学年评定一次。\r\n\r\n', '3000', '1591228440029', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/264d77fb2f214a179f2f0eb458404e6a.jpg', null);
INSERT INTO `fund` VALUES ('4', '国家奖学金', '特别优秀的学生，从二年级起可申请获得国家奖学金，每人每年8000元。颁发国家统一印制的荣誉证书，并记入学生的学籍档案。', '8000', '1591228469397', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/2ae725eed0924ba585d7203bf0015c36.jpg', null);
INSERT INTO `fund` VALUES ('5', '国家励志奖学金', '品学兼优的家庭经济困难学生，从二年级起可申请获得国家励志奖学金，每人每年5000元。高校将获奖情况记入学生的学籍档案。', '5000', '1591228499083', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/5.jpg', null);
INSERT INTO `fund` VALUES ('6', '江芳测试', '1111111111111111111111111111111111', '8000', '1606279424807', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/6.jpg', null);
INSERT INTO `fund` VALUES ('7', '资助项目2', '资助项目2资助项目2资助项目2资助项目2资助项目2资助项目2资助项目2资助项目2资助项目2资助项目2资助项目2资助项目2', '8000', '1606287601307', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/8.jpg', null);

-- ----------------------------
-- Table structure for f_apply
-- ----------------------------
DROP TABLE IF EXISTS `f_apply`;
CREATE TABLE `f_apply` (
  `fa_id` int NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fid` int NOT NULL,
  `fa_time` bigint NOT NULL,
  `fa_flag` int NOT NULL,
  `fa_reviewer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`fa_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of f_apply
-- ----------------------------
INSERT INTO `f_apply` VALUES ('1', '172219605201', '1', '1591190693363', '0', '无');
INSERT INTO `f_apply` VALUES ('2', '172219605222', '5', '1591229578664', '0', '无');
INSERT INTO `f_apply` VALUES ('3', '172219605222', '2', '1591229590641', '0', '无');
INSERT INTO `f_apply` VALUES ('4', '172219605218', '3', '1591229706101', '0', '无');
INSERT INTO `f_apply` VALUES ('5', '172219605201', '5', '1591229774552', '0', '无');
INSERT INTO `f_apply` VALUES ('6', '172219605102', '4', '1591229829864', '0', '无');
INSERT INTO `f_apply` VALUES ('7', '172219605220', '4', '1591229907122', '0', '无');
INSERT INTO `f_apply` VALUES ('8', '162219605124', '5', '1605441821421', '0', '无');
INSERT INTO `f_apply` VALUES ('9', '162219605124', '4', '1606267468506', '0', '无');

-- ----------------------------
-- Table structure for pratice
-- ----------------------------
DROP TABLE IF EXISTS `pratice`;
CREATE TABLE `pratice` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `p_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `p_abs` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `p_time` bigint NOT NULL,
  `p_amount` double NOT NULL,
  `p_img` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of pratice
-- ----------------------------

-- ----------------------------
-- Table structure for p_apply
-- ----------------------------
DROP TABLE IF EXISTS `p_apply`;
CREATE TABLE `p_apply` (
  `pa_id` int NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pid` int NOT NULL,
  `pa_time` bigint NOT NULL,
  `pa_flag` int NOT NULL,
  `pa_reviewer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`pa_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of p_apply
-- ----------------------------

-- ----------------------------
-- Table structure for question_table
-- ----------------------------
DROP TABLE IF EXISTS `question_table`;
CREATE TABLE `question_table` (
  `q_id` int NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `time` datetime DEFAULT NULL,
  `r_content` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `r_reviewer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `r_time` datetime DEFAULT NULL,
  `tag_id` int DEFAULT NULL,
  PRIMARY KEY (`q_id`) USING BTREE,
  KEY `fkey3` (`tag_id`),
  CONSTRAINT `fkey3` FOREIGN KEY (`tag_id`) REFERENCES `tag` (`id`) ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of question_table
-- ----------------------------
INSERT INTO `question_table` VALUES ('1', '172219605201', '国家助学贷款如何办理？', '哈哈', '2020-11-17 20:36:04', null, null, null, null);
INSERT INTO `question_table` VALUES ('2', '172219605201', '奖助贷管理系统贷学金部分如何使用？', '具体怎么办呢', '2020-11-10 20:36:09', '1', '1', null, null);
INSERT INTO `question_table` VALUES ('3', '172219605201', '我本科毕业后想考研究生，没有能力偿还贷款怎么办？', 'ff', '2020-11-03 20:39:11', null, null, null, null);
INSERT INTO `question_table` VALUES ('4', '172219605201', '国家助学贷款违约会有哪些后果？', 'ff', '2020-11-10 20:39:48', null, null, null, null);
INSERT INTO `question_table` VALUES ('5', '172219605201', '我要申请国家助学贷款，需要准备哪些材料？', 'hh', '2020-11-16 20:40:05', null, null, null, null);
INSERT INTO `question_table` VALUES ('6', '162219605124', '我毕业后后想参军，请问国家对此有没有优惠政策？', '怎么样', '2020-11-17 20:42:34', null, null, null, null);
INSERT INTO `question_table` VALUES ('7', '162219605124', '我申请了国家助学贷款，不知贷款如何发放？', '发', '2020-11-20 20:42:37', null, null, null, null);
INSERT INTO `question_table` VALUES ('8', '162219605124', '我筹足了钱，想提前把国家助学贷款结清如何办理？', '2', '2020-11-05 20:42:42', null, null, null, null);
INSERT INTO `question_table` VALUES ('9', '162219605124', '个人联系方式变化后如何通知银行？', '3', '2020-11-08 20:42:46', null, null, null, null);
INSERT INTO `question_table` VALUES ('10', '162219605124', '我筹足了钱，想提前把国家助学贷款结清如何办理？', '4', '2020-11-03 20:42:50', null, null, null, null);
INSERT INTO `question_table` VALUES ('11', '162219605124', '我在校期间获得国家助学贷款，想问一下如何偿还贷款？', '2', '2020-11-03 20:44:23', null, null, null, null);
INSERT INTO `question_table` VALUES ('12', '162219605124', '计算机设计大赛', 'fadsffffffffffff', '2020-11-26 11:47:46', null, null, null, null);
INSERT INTO `question_table` VALUES ('15', '162219605124', '江江的博客', '阿发发打发发发发发烦烦烦烦烦烦烦烦烦', '2020-11-24 14:06:42', null, null, null, null);

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `s_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_nation` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_birth` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_major` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_income` double NOT NULL,
  `s_res` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_other` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '其他说明',
  `s_isps` int NOT NULL DEFAULT '0' COMMENT '0为未认证；1为正在申请；2为已经通过申请',
  `score` int DEFAULT '0',
  `avatar_url` varchar(255) DEFAULT NULL,
  `poor_level` int DEFAULT NULL,
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('162219605124', '王新硕', '', '', '', '', '', '', '0', '', '', '', '1', '0', null, null);
INSERT INTO `stu` VALUES ('172219605102', '邵倩', '汉', '', '', '', '', '', '0', '', '', '', '0', '0', null, null);
INSERT INTO `stu` VALUES ('172219605201', '江芳', '汉', '女', '2020-06-05', '', '', '', '0', '', '', '', '1', '0', null, null);
INSERT INTO `stu` VALUES ('172219605218', '穆成浩', '汉', '男', '', '', '', '', '0', '', '', '', '0', '0', null, null);
INSERT INTO `stu` VALUES ('172219605219', '潘晴无雨', '汉', '男', '', '', '', '', '0', '', '', '', '0', '0', null, null);
INSERT INTO `stu` VALUES ('172219605220', '钱聿豪', '汉', '', '', '', '', '', '0', '', '', '', '1', '0', null, null);
INSERT INTO `stu` VALUES ('172219605221', '宋子豪', '汉', '男', '2020-06-16', '软件工程', '', '', '0', '', '', '', '0', '0', null, null);
INSERT INTO `stu` VALUES ('172219605222', '王庚辉', '汉', '男', '', '', '', '', '0', '', '', '', '0', '0', null, null);

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tag
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_power` int NOT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('162219605101', '江芳好', '123456', '0');
INSERT INTO `user` VALUES ('162219605111', '测试三', '123456', '0');
INSERT INTO `user` VALUES ('162219605122', '江哈', '123456', '0');
INSERT INTO `user` VALUES ('162219605123', '测试啊', '123456', '0');
INSERT INTO `user` VALUES ('162219605124', '王新硕', '123456', '0');
INSERT INTO `user` VALUES ('172219605102', '邵倩', '123456', '0');
INSERT INTO `user` VALUES ('172219605201', '江芳', '123456', '0');
INSERT INTO `user` VALUES ('172219605218', '穆成浩', '123456', '1');
INSERT INTO `user` VALUES ('172219605219', '潘晴无雨', '123456', '1');
INSERT INTO `user` VALUES ('172219605220', '钱聿豪', '123456', '0');
INSERT INTO `user` VALUES ('172219605221', '宋子豪', '123456', '1');
INSERT INTO `user` VALUES ('172219605222', '王庚辉', '123456', '1');
INSERT INTO `user` VALUES ('182219605124', '刘小强', '123456', '0');
INSERT INTO `user` VALUES ('182219605201', '江以歌', '123456', '0');
INSERT INTO `user` VALUES ('192219605111', '刚刚', '123456', '0');
INSERT INTO `user` VALUES ('192219605124', '巧乐兹', '123456', '0');
INSERT INTO `user` VALUES ('192219605201', '月半', '123456', '0');
INSERT INTO `user` VALUES ('202219605101', '测试', '123456', '0');
INSERT INTO `user` VALUES ('202219605124', '纪威', '123456', '0');

-- ----------------------------
-- Table structure for vol_table
-- ----------------------------
DROP TABLE IF EXISTS `vol_table`;
CREATE TABLE `vol_table` (
  `vid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '项目名称',
  `abs` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '项目简介',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `img` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  `num` int DEFAULT NULL COMMENT '招募人数',
  `anum` int DEFAULT NULL COMMENT '已经报名人数',
  `stime` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '项目服务时间',
  `btime` datetime DEFAULT NULL COMMENT '报名开始时间',
  `etime` datetime DEFAULT NULL COMMENT '报名截至时间',
  `rtime` datetime DEFAULT NULL COMMENT '发布时间',
  `istop` int DEFAULT NULL,
  PRIMARY KEY (`vid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of vol_table
-- ----------------------------
INSERT INTO `vol_table` VALUES ('2', '“阳光侨界爱在港城”爱心义诊', '组织侨界医卫专家开展爱心义诊活动，为有需求的市民提供健康咨询、义诊、保健讲座等服务。', '杨舍镇横河社区新时代文明实践站', '\r\nhttps://fangjiang.oss-cn-shanghai.aliyuncs.com/yz.jpg', '16', '4', '2020年11月11日至2020年12月31日', '2020-11-16 00:00:00', '2020-11-28 00:00:00', '2020-11-16 18:57:59', null);
INSERT INTO `vol_table` VALUES ('3', '“护水清源”水知识科普', '以“实境课堂”的模式，通过参观水源地保护区、防洪引排工程、江堤、新海坝水源地二级保护区滨江湿地公园湿地等点位，使参观者了解水源地保护、防洪安全等水法及环保知识，进一步提升公众保护水源地及防洪工程的意识。', '张家港长江治理工程管理处', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/cj.jpg', '10', '3', '2020年11月11日至2020年12月31日', '2020-11-11 00:00:00', '2020-11-18 00:00:00', '2020-11-11 18:58:06', null);
INSERT INTO `vol_table` VALUES ('4', '志愿同心文艺汇演', '为进一步满足群众的精神文化需求，庆祝中华人民共和国成立71周年，大新镇大新社区新时代文明实践志愿服务队，拟于9月下旬，阳光家园南区广场举办“百姓群星大舞台追梦新时代”巡演暨大新社区“志愿同心 文明同行”党群文艺汇演。', '张家港市大新镇大新社区', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/OIP4.jpg', '8', '2', '2020年11月11日至2020年12月31日', '2020-11-12 00:00:00', '2020-11-20 00:00:00', '2020-11-12 18:58:39', null);
INSERT INTO `vol_table` VALUES ('5', '“奇妙水世界”科普教育', '组织参观水资源科普馆，多角度开展水资源、水生态知识的宣传，特别是科普馆内设置了很多互动体验项目，深受未成年人的喜爱，让他们在玩中学，在学中乐，寓教于乐。', '张家港市南丰镇新德村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/szy.jpg', '7', '6', '2020年11月11日至2020年12月31日', '2020-11-13 00:00:00', '2020-11-28 00:00:00', '2020-11-13 18:58:42', null);
INSERT INTO `vol_table` VALUES ('6', '青春奉献理论宣讲', '围绕“青春奉献 岗位建功”中心主题，大新镇新时代文明实践志愿服务支队，于8月下旬在镇文化中心举行理论宣传宣讲活动，志愿者将紧扣习近平新时代中国特色社会主义思想等理论体系，结合自身理解进行宣讲。', '张家港市大新镇新海坝村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/OIP2.jpg', '2', '1', '2020年11月11日至2020年12月31日', '2020-11-10 00:00:00', '2020-11-28 00:00:00', '2020-11-10 18:58:46', null);
INSERT INTO `vol_table` VALUES ('7', '地图版图知识进社区', '开展“地图版图知识进社区”活动，宣讲主题为“规范使用地图，一点都不能错”。讲座以国家版图基本概念、中国版图空间构成、增强国家版图意识为课堂主要内容，从国家版图的历史演变过程、识别“问题地图”等多个切入点深入浅出地阐释了规范使用地图、维护国家版图尊严的重要性。', '张家港市凤凰镇新时代文明实践所', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/bt.jpg', '5', '1', '2020年11月11日至2020年12月31日', '2020-10-24 00:00:00', '2020-11-28 00:00:00', '2020-10-24 18:58:49', null);
INSERT INTO `vol_table` VALUES ('8', '垃圾分类知识青年宣讲', '团市委、市青年志愿者协会开展垃圾分类知识青年宣讲！', '张家港市南丰镇振兴社区', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/ljfl.jpg', '10', '3', '2020年11月11日至2020年12月31日', '2020-11-14 00:00:00', '2020-12-28 00:00:00', '2020-11-14 18:58:53', null);
INSERT INTO `vol_table` VALUES ('9', '“关爱老年人”免费测量血糖血压活动  ', '冬季是心脑血管疾病的多发季节，为了提高社区老年人的健康意识，做到有病早发现，早治疗，用我们实际行动，提升老年人的幸福感，关爱老年人的身体健康水平，为此一家人郑重向您提出邀请，加入我们，一起温暖爱的世界。', '张家港市南丰镇海坝村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/gg.jpg', '3', '4', '2020年11月11日至2020年12月31日', '2020-11-04 00:00:00', '2020-12-28 00:00:00', '2020-11-04 18:58:55', null);
INSERT INTO `vol_table` VALUES ('10', '走访退役军人老人', '“关爱老年人”免费测量血糖血压活动  ', '张家港市南丰镇东风村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/x.jpg', '5', '2', '2020年11月11日至2020年12月31日', '2020-11-21 00:00:00', '2021-02-12 00:00:00', '2020-11-21 18:58:58', null);
INSERT INTO `vol_table` VALUES ('11', '烈士陵园绿化环保志愿服务', '每周一到周四开馆时协助晚间值班老师完成晚间开馆时的工作任务； 协助图书馆微信公众号的内容整理、排版、编辑。', '张家港市杨舍镇钱塘社区', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/OIP6.jpg', '8', '6', '2020年11月11日至2020年12月31日', '2020-11-02 00:00:00', '2020-12-28 00:00:00', '2020-11-02 18:59:01', null);

-- ----------------------------
-- Table structure for v_apply
-- ----------------------------
DROP TABLE IF EXISTS `v_apply`;
CREATE TABLE `v_apply` (
  `va_id` int NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vid` int NOT NULL,
  `va_time` datetime DEFAULT NULL,
  `va_flag` int NOT NULL,
  `va_reviewer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`va_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of v_apply
-- ----------------------------
INSERT INTO `v_apply` VALUES ('1', '162219605124', '2', '2020-11-24 21:56:19', '0', '无');
INSERT INTO `v_apply` VALUES ('2', '162219605124', '2', '2020-11-24 21:57:09', '0', '无');
INSERT INTO `v_apply` VALUES ('3', '162219605124', '2', '2020-11-24 21:57:13', '0', '无');
INSERT INTO `v_apply` VALUES ('4', '162219605124', '2', '2020-11-24 21:57:31', '0', '无');
INSERT INTO `v_apply` VALUES ('5', '162219605124', '2', '2020-11-24 22:01:38', '0', '无');
INSERT INTO `v_apply` VALUES ('6', '162219605124', '2', '2020-11-24 22:06:13', '0', '无');
INSERT INTO `v_apply` VALUES ('7', '162219605124', '8', '2020-11-25 09:31:51', '0', '无');
INSERT INTO `v_apply` VALUES ('8', '162219605124', '8', '2020-11-25 09:33:09', '0', '无');
INSERT INTO `v_apply` VALUES ('9', '162219605124', '7', '2020-11-25 09:41:39', '0', '无');

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `w_id` int NOT NULL AUTO_INCREMENT,
  `w_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `w_abs` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `w_time` bigint NOT NULL,
  `w_position` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `w_money` double NOT NULL,
  `w_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `istop` int DEFAULT NULL,
  PRIMARY KEY (`w_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of work
-- ----------------------------
INSERT INTO `work` VALUES ('2', '图书馆管理员', '整理图书，管理图书借阅，做到有序有证借阅，维护图书馆秩序', '1591228918851', '图书馆', '8', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/library.jpg', null);
INSERT INTO `work` VALUES ('3', '食堂打饭', '为学生打饭', '1591228991217', '食堂', '12', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/bg.jpg', null);
INSERT INTO `work` VALUES ('4', '实验室管理人员', '实验室管理仪器，整理仪器，打扫实验室', '1591229098411', '实验室', '15', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/lab.jpeg', null);
INSERT INTO `work` VALUES ('5', '超市收银员', '在大学城超市收银', '1591229211662', '大学城超市', '8', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/cashier.jpeg', null);
INSERT INTO `work` VALUES ('6', '数码城维修学徒', '帮助数码城维修师傅做维修工作', '1591229318863', '数码城', '16', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/fix.jpg', null);

-- ----------------------------
-- Table structure for w_apply
-- ----------------------------
DROP TABLE IF EXISTS `w_apply`;
CREATE TABLE `w_apply` (
  `wa_id` int NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fid` int NOT NULL,
  `wa_time` bigint NOT NULL,
  `wa_flag` int NOT NULL,
  `wa_reviewer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`wa_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of w_apply
-- ----------------------------
INSERT INTO `w_apply` VALUES ('1', '172219605201', '1', '1591190679936', '0', '无');
INSERT INTO `w_apply` VALUES ('2', '172219605222', '6', '1591229607442', '0', '无');
INSERT INTO `w_apply` VALUES ('3', '172219605222', '3', '1591229619044', '0', '无');
INSERT INTO `w_apply` VALUES ('4', '172219605218', '2', '1591229683721', '0', '无');
INSERT INTO `w_apply` VALUES ('5', '172219605218', '4', '1591229693064', '0', '无');
INSERT INTO `w_apply` VALUES ('6', '172219605201', '6', '1591229800804', '0', '无');
INSERT INTO `w_apply` VALUES ('7', '172219605102', '2', '1591229836270', '0', '无');
INSERT INTO `w_apply` VALUES ('8', '172219605220', '2', '1591229879884', '0', '无');
INSERT INTO `w_apply` VALUES ('9', '172219605220', '4', '1591229902382', '0', '无');
INSERT INTO `w_apply` VALUES ('10', '162219605124', '6', '1605441838613', '0', '无');
INSERT INTO `w_apply` VALUES ('11', '162219605124', '3', '1606267145783', '0', '无');
INSERT INTO `w_apply` VALUES ('12', '162219605124', '5', '1606267365743', '0', '无');
