/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : psmis

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 08/01/2021 11:40:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `excerpt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `created_time` datetime NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  `views` int(11) NULL DEFAULT NULL,
  `like` int(11) NULL DEFAULT NULL,
  `star` int(11) NULL DEFAULT NULL,
  `top` int(11) NULL DEFAULT NULL,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fkey1`(`category_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (1, '从盐津到东华，来听听这两位盐津学子的成长故事', '积极参加学生工作，竞选班干部；积极参加志愿者活动，回报社会，是这两位盐津学子在前两年付出了极大精力的事情。也正是凭借着热心和善良，这两位同学积极递交入党申请书，并在大学毕业前顺利发展成为中共（预备）党员，带着自己的热血与希望，在社会上岗位中继续发光发热。能够在新环境中打下良好的群众基础，这正是两位学长自身的努力与坚持得到了同学们的认可。\r\n\r\n\r\n\r\n“来到大学，认识了更多的同学，性格也变得更加外向了。我觉得这一切都是源于刚入大学时的社会工作和志愿者工作，一定程度上提升了交流技巧和表达能力，也能让我在将来的求职过程中少了很多阻碍。”', '办好繁杂的升学手续，带着老师和亲人的谆谆教导，背上背包，踏上火车，去往一个完全陌生的都市，等待他们的是一场未知的旅程，他们就是我们今天介绍的主人公谢伟和杨伟。', '2021-01-12 10:36:18', 1, 100, 20, 5, 1, '172219605201');
INSERT INTO `article` VALUES (2, '2020届优秀毕业生的科大故事', '2015年，余石龙同学响应国家号召携笔从戎，在部队期间表现优异，获得优秀义务兵、团嘉奖各一次。\r\n\r\n研究生期间，他不忘初心，砥砺前行，研一开学主动请缨担任班级临时召集人，后被推选为184硕班长，工作认真负责、扎实勤勉，致力于优秀班风、学风的带动与打造；科研学习上，他严谨求实、锐意进取，研究生期间学习成绩专业排名第二，发表EI检索论文两篇，受理专利两项，荣获2019年研究生国家奖学金和东华大学优秀学生荣誉称号；他时刻牢记身份与使命，用实际行动诠释了一名退役士兵，一名学生党员的责任与担当！', '长路浩浩荡荡，\r\n\r\n万事皆可期待。\r\n\r\n最后一期，\r\n\r\n也与小阳共读\r\n\r\n优秀的毕业生们\r\n\r\n带来的精彩故事吧 ', '2021-01-04 10:44:56', 2, 200, 31, 6, 0, '172219605201');
INSERT INTO `article` VALUES (3, '无偿献血，无限光荣', '热心的廖同学：\r\n\r\n    我觉得献血是一件很公益性的事情，血库里没有充足的血对病人是一种危险，如果我们每个人都多献血的话病人们就多一点希望。也算是我们年轻人为国家和社会做贡献，倡导大家都积极参与。', '   无偿献血是无私奉献、救死扶伤的崇高行为，由于血液不能人工制造或是用其它的物质所代替，所以献血是帮助病人解除病痛、抢救他们的生命，其价值是无法用金钱来衡量的。', '2021-01-04 10:45:01', 3, 512, 60, 7, 0, '172219605201');
INSERT INTO `article` VALUES (4, '慈善育人基地优秀典型风采展示', '献血箴言:\r\n\r\n爱心是冬日的一缕阳光，能够给黑暗中徘徊前行的人以光明，更能够给生命垂危者以活下来的勇气和信心。在自己的成长过程中受到了很多帮助，古人云“赠人玫瑰，手有余香”自己也一直常怀感恩之心，希望有机会能够去回馈社会。\r\n\r\n曾经看到过医院因为血库储量不足，导致患者不能得到及时救治的新闻，自己看到后会感到十分的惋惜。从那时开始，自己就萌生了献血的想法。在一年多的大学生活中，自己先后报名并参加学校组织的两次献血活动，希望自己的鲜血能够救助有需要的人。', '当慈善文化进入校园\r\n\r\n筑梦更铸人\r\n\r\n我校慈善育人基地自2007年建立以来\r\n\r\n为传播“慈善·志愿·担当”的慈善文化\r\n\r\n恪尽职守、无私奉献着', '2020-12-29 10:45:01', 4, 33, 23, 4, 1, '172219605201');
INSERT INTO `article` VALUES (5, '甜蜜养生谁在行？黄芪蜂蜜找宕昌！', '经过激烈讨论与多方考虑，\r\n\r\n东华甜蜜蜜队最终选择了宕昌县的黄芪蜂蜜\r\n\r\n并且最终通过分析Needs,Competitors,Advantages,STP,4P…\r\n\r\n为它做了个详尽的市场分析！黄芪蜂蜜：黄芪是治疗气虚不可缺少的药物之一。黄芪蜂蜜采自天然黄芪花花蜜 ，属稀有蜜种，呈浅琥珀色，甘甜不腻，气味清香，不易结晶。酿蜜周期长，营养价值高，无任何添加，集百花之精华，中药材之药效。常服此蜂蜜，除一般蜂蜜保健作用外，更有中药黄芪之益卫固表、利水消肿的功效，增强人体特异性和非特异性免疫功能，对心血管系统疾病，如强心、改善血液循环方面有辅助疗效。', '2020年是全面建成小康社会的的决胜之年，\r\n\r\n是乡村振兴的衔接之年。\r\n\r\nDHUer们也走上了扶贫之路，\r\n\r\n运用学到的营销知识，\r\n\r\n为扶贫事业献出自己的一份力量！', '2021-01-01 10:45:01', 5, 12, 6, 2, 0, '172219605201');
INSERT INTO `article` VALUES (6, '无由持一碗，寄与爱茶人', '茶，\r\n\r\n始于神农时代，\r\n\r\n与中华文化相伴已走过数千年的历史长河；\r\n\r\n源远流长的中国茶文化，\r\n\r\n糅合了儒、道、佛诸派思想，\r\n\r\n历久弥新，生生不息。\r\n\r\n饮茶，\r\n\r\n不仅是极富仪式感的雅事。\r\n\r\n还是中国人生活中不可缺少的一部分。', '于子月同学的“黑暗”料理之——茶泡饭', '2021-01-04 10:45:01', 3, 67, 30, 12, 0, '172219605201');
INSERT INTO `article` VALUES (7, '“乘风破浪”的不止姐姐们，还有咱会计支部的代言人们！', '此次会计系学生党支部的代言人们，\r\n\r\n亲身力行，\r\n\r\n用自己的实践体会，\r\n\r\n为超多扶贫好物代言。代言人：欧阳\r\n\r\n产品：盐津云津红红茶\r\n\r\n个人体验：拥有盐津云津红红茶就拥有了家庭版自制奶茶！当茶的清香遇上奶的香醇，回味无穷，唇齿留香～', '有人说，\r\n\r\n每个人对世界的爱，\r\n\r\n从孩童就开始了。\r\n\r\n爱与被爱，成长与体会，\r\n\r\n坚持与感动，永恒交替。', '2021-01-05 10:45:01', 4, 111, 67, 24, 0, '172219605201');
INSERT INTO `article` VALUES (8, '国家资助政策知识竞赛 | 叮咚！你的奖品已送达~', '组织团队严格按照参赛选手的答题速度和正确率进行评分，评选出前100名获得90分以上的选手获得我们精心准备的奖品一份！至此，本次的国家资助政策知识竞赛告一段落，感谢所有参与此次活动策划的老师同学，感谢每一位参赛者，正是你们的参与，让更多人感受到资助的温暖。', '2020年，是决胜脱贫攻坚之年。暑假期间，学生资助宣传大使团特别策划了国家资助政策知识竞赛活动，经过10天的赛前筹备，4天的正式竞赛，共计143名学生资助宣传大使参与宣传工作，来自33个省市，涵盖各学段、各年龄段的1780名参赛者完成了本次竞赛。', '2021-01-04 10:45:01', 6, 245, 46, 34, 0, '172219605201');
INSERT INTO `article` VALUES (9, '跨千山递真情', ' 由团队中优秀受助成员现身说法，向学生家长们介绍自己在国家资助政策帮助下如何安心学习、 健康成长，国家资助政策如何彻底扫除他们经济上的顾虑。通过成员真实的自身经历描述，可以 让学弟学妹们更直观的感受到国家资助的真实性与重要性，并产生共鸣，激励困难生们对未来充满希望并积极的面对当下，心无旁骛努力学习，创造美好未来。', '这是一支来自江苏科技大学机械工程学院的专项实践团队，实践活动主要内容是向学生、老师与家长介绍国家资助政策（国家为家庭经济困难的学生提供经济资助的相关政策）相关内容，并通过权威资料与学生的亲身经历具体详细生动的将资助政策资讯传递给需要的人。', '2021-01-01 10:45:01', 6, 34, 12, 5, 0, '172219605201');
INSERT INTO `article` VALUES (10, '科大资助筑梦，带信勇敢逐梦', ' 视频留存的时间是非常长的，在微博上我们一共发布12条博文，每天每条微博的观看量都在增长，到现在为止，总共观看量为4087。在抖音上发布的短视频9条，到目前为止观看量为747。在哔哩哔哩上发布的是长视频，总共4条，累计观看115次。与支持单位对接后在班级群中发布视频涉及的群聊人数总共559人.加上其他方向发散的，大约观看人数达到6000人以上。', '增加高中生对国家资助政策的了解，让更多学生不因经济原因而失去受教育的机会，学生获得好的教育资源得以成才从而带动家庭，乃至整个地区的富裕，助力国家教育脱贫。', '2021-01-04 10:45:01', 5, 12, 6, 2, 0, '172219605201');
INSERT INTO `article` VALUES (11, '资助育人显关怀，宣讲助学赴小康', '实践团成员去到当地的云南省南华第一中学，面向准高三生，介绍国家资助政策和东华大学育人体系，帮助家庭贫困的学子消除疑虑、安心升学；分享本人作为困难生在国家资助政策的关怀下安心学习、努力进取的亲身经历，鼓励贫困学子砥砺奋进、勇担使命、报效国家、服务人民。', '宣讲团共有4名成员，分别位于云南省南华县、辽宁省营口市、贵州省务川县、贵州省安顺市。此次实践以线下和线上结合的形式开展，分为四个实践内容：“现身说法”、“实地走访”、“多方宣传”和“探寻蜡染”，进行了为期10天的实践活动', '2020-12-29 10:45:01', 1, 45, 12, 8, 1, '172219605201');
INSERT INTO `article` VALUES (12, '扶贫扶智，砥砺前行', '实践团成员多才多艺，多位成员曾有过院级、校级学生组织、社团的工作经历。在实践活动的开展过程中，成员们团结协作，充分发挥自己的优势。在新媒体平台推送、实地走访视频剪辑、调查问卷制作等等环节中，展现出了超高的业务水平。\r\n\r\n实践团成员多才多艺，多位成员曾有过院级、校级学生组织、社团的工作经历。在实践活动的开展过程中，成员们团结协作，充分发挥自己的优势。在新媒体平台推送、实地走访视频剪辑、调查问卷制作等等环节中，展现出了超高的业务水平。\r\n\r\n实践团成员多才多艺，多位成员曾有过院级、校级学生组织、社团的工作经历。在实践活动的开展过程中，成员们团结协作，充分发挥自己的优势。在新媒体平台推送、实地走访视频剪辑、调查问卷制作等等环节中，展现出了超高的业务水平。部分成员所在地临近偏远地区，受疫情影响，地方在脱贫攻坚上面临相应挑战；同时，在部分成员的家乡，有些高中有不少同学因为家庭经济原因，可能面临着大学学费的压力；团队成员中有国家助学贷款的受益者，也有获得过奖学金的大二学生。通过他们的现身说法，为有兴趣了解的同学普及学校的相关资助政策实施情况。', '为进一步深入贯彻习近平新时代中国特色社会主义思想和全国教育大会精神，践行社会主义核心价值观，大力宣传国家资助政策，助力脱贫攻坚，进一步培育获奖受助学生思想品德，引导学生勇担使命、报效国家、服务人民，培养德智体美劳全面发展的社会主义建设者和接班人。我们小组成员积极响应学校、国家的号召。决定利用这个假期开展学生资助事业相关方面的宣传工作。', '2020-12-28 10:45:01', 2, 67, 12, 4, 0, '172219605201');
INSERT INTO `article` VALUES (13, '收到习总书记回信后，他们向全国高校毕业生发出倡议', '全国高校毕业生同学们：\r\n\r\n\r\n\r\n我们是中国石油大学（北京）克拉玛依校区118名即将到新疆基层就业的大学生。在离开母校之际，我们给习近平总书记写信汇报了大学四年学习和思想上的收获，表达了立志同各族群众一起奋斗、建设美丽边疆的决心。令我们万分惊喜的是，总书记在百忙之中很快给我们写了回信。拜读总书记回信时，我们亲切地感到总书记好像站在我们面前循循善诱地给我们上了人生重要一课，我们愈加坚定了理想信念、领悟了志向追求、升华了人生境界、强化了奋斗决心，更加深刻领悟到，总书记重要回信既是对我们118名同学巨大的关怀和鼓励，也是对全国高校2020届毕业生们的指引和期许。为此，我们向全国高校毕业生们发出倡议：\r\n\r\n\r\n\r\n第一，要做志向高远的新时代先锋者。总书记激励我们“实现中华民族伟大复兴的中国梦需要一代一代青年矢志奋斗”。我们深感，生逢其时、肩负重任是历史赋予我们的人生机遇。“为中华民族崛起而读书”激励革命先辈投身解放事业，“强国一代有我在”召唤我们投身强国伟业。我们倡议全国高校毕业生要以习近平新时代中国特色社会主义思想为指导，志存高远、脚踏实地，把小我融入大我，奋战助力2020，奋勇拼搏2035，奋斗圆梦2050。\r\n\r\n\r\n\r\n第二，要做不畏艰难的新长征突击手。总书记教导我们要懂得“志不求易者成，事不避难者进”的道理。我们深感，这场突如其来的疫情打破了生活常态，对我们是一场严峻的考验，但也是一次宝贵的经历。青春由磨砺而出彩，人生因奋斗而升华，前进的道路不会一帆风顺，本身就是精神、意志、力量的一次次提升。我们倡议，在新时代的长征路上，全国高校毕业生要遇逆境不馁、迎风雨而上，不做求易者、避难者，要在艰难困苦中求进求成，在挫折坎坷中成长成才，在平凡的岗位上争取为党、为祖国、为人民多作贡献。\r\n\r\n\r\n\r\n第三，要做扎根基层的新一代追梦人。总书记支持我们“奔赴新疆基层工作，立志同各族群众一起奋斗”的人生选择，鼓励我们“努力成为可堪大用、能担重任的西部建设者”。我们要向各族人民学习，向实践学习。我们倡议全国高校毕业生，要遵照总书记感召和鼓励，把所学知识奉献给人民，在改造客观世界时改造主观世界，不断完善自我、超越自我，充分展现新时代中国青年的良好作风和昂扬风貌。\r\n\r\n\r\n\r\n在这个特殊的毕业季，我们深深感到党和政府为我们顺利毕业就业做出了千方百计的支持和帮助，让我们在即将离开学校之时上了一堂生动的制度自信教育大课。全国高校毕业生要更加不畏艰难险阻，勇担时代使命，以拼搏进取之人生不负伟大时代，以奋发有为之担当投身强国伟业，一步一个脚印走好我们这一代的新时代长征路。\r\n\r\n\r\n\r\n中国石油大学（北京）\r\n\r\n克拉玛依校区\r\n\r\n118名新疆基层就业大学生\r\n\r\n2020年7月10日', '7月7日，习近平总书记给中国石油大学（北京）克拉玛依校区毕业生回信，肯定他们到边疆基层工作的选择，对广大高校毕业生提出殷切期望。\r\n\r\n\r\n\r\n收到总书记的回信后，中国石油大学（北京）克拉玛依校区118名即将到新疆基层就业的大学生，向全国高校毕业生们发出倡议。一起来读这封倡议书↓↓↓', '2021-01-02 10:45:01', 3, 1123, 76, 22, 1, '172219605201');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '优秀学生典型');
INSERT INTO `category` VALUES (2, '励志学院');
INSERT INTO `category` VALUES (3, '慈善志愿活动');
INSERT INTO `category` VALUES (4, '中心荣誉');
INSERT INTO `category` VALUES (5, '其他');
INSERT INTO `category` VALUES (6, '实践总结');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论人的姓名',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `created_time` datetime NULL DEFAULT NULL,
  `article_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fkey0`(`article_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, '172219605220', '钱聿豪', '为你们点赞', '2021-01-08 11:12:18', 1);
INSERT INTO `comment` VALUES (2, '172219605220', '钱聿豪', '为你们点赞', '2021-01-08 11:12:23', 2);
INSERT INTO `comment` VALUES (3, '172219605220', '钱聿豪', '为你们点赞', '2021-01-08 11:12:27', 3);

-- ----------------------------
-- Table structure for f_apply
-- ----------------------------
DROP TABLE IF EXISTS `f_apply`;
CREATE TABLE `f_apply`  (
  `fa_id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fid` int(11) NOT NULL,
  `fa_time` bigint(20) NOT NULL,
  `fa_flag` int(11) NOT NULL,
  `fa_reviewer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`fa_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of f_apply
-- ----------------------------
INSERT INTO `f_apply` VALUES (1, '172219605201', 1, 1591190693363, 0, '无');
INSERT INTO `f_apply` VALUES (2, '172219605222', 5, 1591229578664, 0, '无');
INSERT INTO `f_apply` VALUES (3, '172219605222', 2, 1591229590641, 0, '无');
INSERT INTO `f_apply` VALUES (4, '172219605218', 3, 1591229706101, 0, '无');
INSERT INTO `f_apply` VALUES (5, '172219605201', 5, 1591229774552, 0, '无');
INSERT INTO `f_apply` VALUES (6, '172219605102', 4, 1591229829864, 0, '无');
INSERT INTO `f_apply` VALUES (7, '172219605220', 4, 1591229907122, 0, '无');
INSERT INTO `f_apply` VALUES (8, '162219605124', 5, 1605441821421, 0, '无');
INSERT INTO `f_apply` VALUES (9, '162219605124', 4, 1606267468506, 0, '无');

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '文章标题',
  `url` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '文件的url',
  `rtime` datetime NULL DEFAULT NULL COMMENT '发布的时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES (1, '学费和国家助学贷款代偿申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-06-21 08:33:21');
INSERT INTO `file` VALUES (2, '基层单位在岗证明', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-26 08:33:21');
INSERT INTO `file` VALUES (3, '基层单位工作证明', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-27 12:35:24');
INSERT INTO `file` VALUES (4, '高校学生应征入伍学费补偿国家助学贷款代偿申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-25 12:35:30');
INSERT INTO `file` VALUES (5, '高校学生退役复学学费减免申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-18 12:35:40');
INSERT INTO `file` VALUES (6, '二次分配就业证明', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-04 12:35:44');
INSERT INTO `file` VALUES (7, '助学贷款提前还款申请书', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-15 12:35:47');
INSERT INTO `file` VALUES (8, '毕业生基层就业代偿账户信息表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-08 12:35:50');
INSERT INTO `file` VALUES (9, '生源地助学贷款毕业生信息档案表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-10-13 12:35:53');
INSERT INTO `file` VALUES (10, '暑假校内用工部门勤工助学申请表', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/75a2f2773d8e4b439eda6923548f2e4a.xlsx', '2020-11-22 12:35:58');

-- ----------------------------
-- Table structure for fund
-- ----------------------------
DROP TABLE IF EXISTS `fund`;
CREATE TABLE `fund`  (
  `f_id` int(11) NOT NULL AUTO_INCREMENT,
  `f_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `f_abs` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `f_amount` double NOT NULL,
  `f_time` bigint(20) NOT NULL,
  `f_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `is_top` int(11) NULL DEFAULT NULL COMMENT '是否置顶',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of fund
-- ----------------------------
INSERT INTO `fund` VALUES (1, '新生入学资助项目', '中西部生源的家庭经济困难新生可申请入学资助项目，解决入校报到的交通费和入学后短期生活费。就读本省院校的新生每人500元，就读省外院校的新生每人1000元。学生可向当地县级教育部门咨询办理。', 500, 1591228385793, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/10.jpg', 0);
INSERT INTO `fund` VALUES (2, '国家助学贷款', '家庭经济困难学生可申请办理国家助学贷款，解决学费与住宿费，每人每年最高不超过8000元，在校期间利息由国家承担，还款期限原则上按学制加13年确定，最长不超过20年。国家助学贷款包括生源地信用助学贷款与校园地国家助学贷款，家庭经济困难学生可向户籍所在县(市、区)的学生资助管理机构咨询办理生源地信用助学贷款，或向高校学生资助部门咨询办理校园地国家助学贷款。', 8000, 1591228413882, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/2.jpg', 1);
INSERT INTO `fund` VALUES (3, '国家助学金', '家庭经济困难学生入学后可申请国家助学金，解决在校学习期间的生活费，平均每人每年3000元。学生持《家庭经济困难学生认定申请表》于每年9月向高校提出申请，高校每学年评定一次。\r\n\r\n', 3000, 1591228440029, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/264d77fb2f214a179f2f0eb458404e6a.jpg', 1);
INSERT INTO `fund` VALUES (4, '国家奖学金', '特别优秀的学生，从二年级起可申请获得国家奖学金，每人每年8000元。颁发国家统一印制的荣誉证书，并记入学生的学籍档案。', 8000, 1591228469397, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/2ae725eed0924ba585d7203bf0015c36.jpg', 0);
INSERT INTO `fund` VALUES (5, '国家励志奖学金', '品学兼优的家庭经济困难学生，从二年级起可申请获得国家励志奖学金，每人每年5000元。高校将获奖情况记入学生的学籍档案。', 5000, 1591228499083, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/5.jpg', 0);

-- ----------------------------
-- Table structure for notice_table
-- ----------------------------
DROP TABLE IF EXISTS `notice_table`;
CREATE TABLE `notice_table`  (
  `n_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '消息编号',
  `n_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消息标题',
  `n_time` datetime NULL DEFAULT NULL COMMENT '产生时间',
  `n_href` text CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL COMMENT '跳转的页面',
  `n_isread` int(255) NULL DEFAULT NULL COMMENT '是否已读0未读，1已读(用户是否删除）',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of notice_table
-- ----------------------------
INSERT INTO `notice_table` VALUES (1, '2020年第二批基层就业学费补偿和国家助学贷款代偿申请材料报送的通知', '2021-01-06 11:22:37', 'http://web.dhu.edu.cn/dhuzizhu/c2/6b/c5287a180843/page.htm', 0);
INSERT INTO `notice_table` VALUES (2, '2020年助学贷款、奖助学金及荣誉称号工作进度', '2020-12-28 11:22:41', 'http://web.dhu.edu.cn/dhuzizhu/20/1f/c5287a204831/page.htm', 0);
INSERT INTO `notice_table` VALUES (3, '2020届本科毕业生校园地助学贷款信息确认及提前结清开始办理', '2021-01-14 11:22:45', 'https://mp.weixin.qq.com/s/bO-_79Q4QjYQ35rn9Ao2Qw', 1);
INSERT INTO `notice_table` VALUES (4, '关于开展2019-2020学年勤工助学荣誉称号评选工作的通知', '2021-01-12 11:22:49', 'http://web.dhu.edu.cn/dhuzizhu/10/eb/c5287a266475/page.htm', 0);
INSERT INTO `notice_table` VALUES (5, '2020年技能证书扶持通知', '2020-12-29 11:22:54', 'http://web.dhu.edu.cn/dhuzizhu/b1/b1/c5287a242097/page.htm', 0);
INSERT INTO `notice_table` VALUES (6, '生源地助学贷款回执“不见面”审核通道开启', '2021-01-11 11:22:58', 'https://mp.weixin.qq.com/s/Q5xXx2dc8VlGypwgWV6AbA', 0);
INSERT INTO `notice_table` VALUES (7, '国家奖学金申请即将截止，请尽快申请', '2021-01-20 11:23:03', 'https://mp.weixin.qq.com/s/jO8UrCFWmQL-tkPljK8fhg', 0);
INSERT INTO `notice_table` VALUES (8, '2020春季征兵开始了！', '2021-01-02 11:23:07', 'https://mp.weixin.qq.com/s/jO8UrCFWmQL-tkPljK8fhg', 0);

-- ----------------------------
-- Table structure for poor_stu
-- ----------------------------
DROP TABLE IF EXISTS `poor_stu`;
CREATE TABLE `poor_stu`  (
  `stu_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `s_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `s_sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `s_major` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `s_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `s_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮箱',
  `s_income` double(255, 0) NULL DEFAULT NULL COMMENT '家庭收入',
  `s_outcome` double(255, 0) NULL DEFAULT NULL COMMENT '月花费',
  `poor_level` int(255) NULL DEFAULT 0 COMMENT '-1为未认证；0为正在申请；1为一星；2为2星；3为3星',
  `score` int(255) NULL DEFAULT NULL COMMENT '积分：用于排行',
  `avatar_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像地址',
  `s_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '问卷中的是否回答',
  `s_other` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '问卷中的其他情况',
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of poor_stu
-- ----------------------------
INSERT INTO `poor_stu` VALUES ('162219605124', '王新硕', '男', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605102', '邵倩', '女', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605118', '芳芳', '女', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605201', '江芳', '女', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605218', '穆成浩', '男', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605219', '潘晴无雨', '男', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605220', '钱聿豪', '男', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605221', '宋子豪', '男', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219605222', '王庚辉', '男', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);
INSERT INTO `poor_stu` VALUES ('172219612201', '周童', '女', '', '', NULL, 0, NULL, -1, 100, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200727143350.jpg', NULL, NULL);

-- ----------------------------
-- Table structure for question_table
-- ----------------------------
DROP TABLE IF EXISTS `question_table`;
CREATE TABLE `question_table`  (
  `q_id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `time` datetime NULL DEFAULT NULL,
  `r_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `r_reviewer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `r_time` datetime NULL DEFAULT NULL,
  `tag_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`q_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of question_table
-- ----------------------------
INSERT INTO `question_table` VALUES (1, '172219605201', '国家助学贷款如何办理？', '哈哈', '2020-11-17 20:36:04', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (2, '172219605201', '奖助贷管理系统贷学金部分如何使用？', '具体怎么办呢', '2020-11-10 20:36:09', '1', '1', NULL, NULL);
INSERT INTO `question_table` VALUES (3, '172219605201', '我本科毕业后想考研究生，没有能力偿还贷款怎么办？', 'ff', '2020-11-03 20:39:11', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (4, '172219605201', '国家助学贷款违约会有哪些后果？', 'ff', '2020-11-10 20:39:48', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (5, '172219605201', '我要申请国家助学贷款，需要准备哪些材料？', 'hh', '2020-11-16 20:40:05', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (6, '162219605124', '我毕业后后想参军，请问国家对此有没有优惠政策？', '怎么样', '2020-11-17 20:42:34', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (7, '162219605124', '我申请了国家助学贷款，不知贷款如何发放？', '发', '2020-11-20 20:42:37', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (8, '162219605124', '我筹足了钱，想提前把国家助学贷款结清如何办理？', '2', '2020-11-05 20:42:42', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (9, '162219605124', '个人联系方式变化后如何通知银行？', '3', '2020-11-08 20:42:46', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (10, '162219605124', '我筹足了钱，想提前把国家助学贷款结清如何办理？', '4', '2020-11-03 20:42:50', NULL, NULL, NULL, NULL);
INSERT INTO `question_table` VALUES (11, '162219605124', '我在校期间获得国家助学贷款，想问一下如何偿还贷款？', '2', '2020-11-03 20:44:23', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '消息编号',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消息内容',
  `time` datetime NULL DEFAULT NULL COMMENT '产生时间',
  `cnt` int(255) NULL DEFAULT NULL COMMENT '奖励金额',
  `isread` int(255) NULL DEFAULT 0 COMMENT '是否已读0未读，1已读',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, '每日登录', '2021-01-07 21:11:52', 5, 0);
INSERT INTO `score` VALUES (2, '每日登录', '2021-01-06 21:13:40', 5, 0);
INSERT INTO `score` VALUES (3, '每日登录', '2021-01-19 21:14:33', 5, 1);
INSERT INTO `score` VALUES (4, '首次注册', '2021-01-01 21:15:40', 100, 0);
INSERT INTO `score` VALUES (5, '阅读文章', '2021-01-05 10:20:19', 2, 0);
INSERT INTO `score` VALUES (6, '报名活动', '2021-01-12 10:20:52', 10, 0);
INSERT INTO `score` VALUES (7, '下载文件', '2021-01-02 10:21:15', 5, 0);

-- ----------------------------
-- Table structure for star
-- ----------------------------
DROP TABLE IF EXISTS `star`;
CREATE TABLE `star`  (
  `star_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收藏id',
  `s_id` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '学生id',
  `ptr_id` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT 'id',
  `star_time` datetime NULL DEFAULT NULL COMMENT '收藏时间',
  `is_top` int(255) NULL DEFAULT NULL COMMENT '是否置顶',
  `star_type` int(255) NULL DEFAULT NULL COMMENT '星标类型（1文章、2文件、3问题）',
  PRIMARY KEY (`star_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of star
-- ----------------------------
INSERT INTO `star` VALUES (1, '172219605201', '1', '2021-01-05 10:23:12', 1, 1);
INSERT INTO `star` VALUES (2, '172219605201', '2', '2021-01-04 10:25:52', 0, 1);
INSERT INTO `star` VALUES (3, '172219605201', '1', '2021-01-12 10:26:30', 1, 2);
INSERT INTO `star` VALUES (4, '172219605201', '1', '2021-01-06 10:27:35', 0, 2);
INSERT INTO `star` VALUES (5, '172219605201', '3', '2021-01-11 10:27:40', 0, 3);
INSERT INTO `star` VALUES (6, '172219605201', '2', '2021-01-07 10:27:44', 1, 3);

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
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
  `s_isps` int(255) NOT NULL DEFAULT 0 COMMENT '0为未认证；1为正在申请；2为已经通过申请',
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('162219605124', '王新硕', '', '', '', '', '', '', 0, '', '', '', 1);
INSERT INTO `stu` VALUES ('172219605102', '邵倩', '汉', '', '', '', '', '', 0, '', '', '', 0);
INSERT INTO `stu` VALUES ('172219605118', '芳芳', '', '', '', '', '', '', 0, '', '', '', 0);
INSERT INTO `stu` VALUES ('172219605201', '江芳', '汉', '女', '2020-06-05', '', '', '', 0, '', '', '', 1);
INSERT INTO `stu` VALUES ('172219605218', '穆成浩', '汉', '男', '', '', '', '', 0, '', '', '', 0);
INSERT INTO `stu` VALUES ('172219605219', '潘晴无雨', '汉', '男', '', '', '', '', 0, '', '', '', 0);
INSERT INTO `stu` VALUES ('172219605220', '钱聿豪', '汉', '', '', '', '', '', 0, '', '', '', 1);
INSERT INTO `stu` VALUES ('172219605221', '宋子豪', '汉', '男', '2020-06-16', '软件工程', '', '', 0, '', '', '', 0);
INSERT INTO `stu` VALUES ('172219605222', '王庚辉', '汉', '男', '', '', '', '', 0, '', '', '', 0);
INSERT INTO `stu` VALUES ('172219612201', '周童', '', '', '', '', '', '', 0, '', '', '', 1);

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标签名字',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tag
-- ----------------------------
INSERT INTO `tag` VALUES (1, '慈善');
INSERT INTO `tag` VALUES (2, '政策');
INSERT INTO `tag` VALUES (3, '阳光成才');
INSERT INTO `tag` VALUES (4, '身边的榜样');
INSERT INTO `tag` VALUES (5, '喜报');
INSERT INTO `tag` VALUES (6, '困难补助');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_power` int(11) NOT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('162219605101', '江芳好', '123456', 0);
INSERT INTO `user` VALUES ('162219605111', '测试三', '123456', 0);
INSERT INTO `user` VALUES ('162219605122', '江哈', '123456', 0);
INSERT INTO `user` VALUES ('162219605123', '测试啊', '123456', 0);
INSERT INTO `user` VALUES ('162219605124', '王新硕', '123456', 0);
INSERT INTO `user` VALUES ('172219605102', '邵倩', '123456', 0);
INSERT INTO `user` VALUES ('172219605118', '芳芳', '123456', 1);
INSERT INTO `user` VALUES ('172219605201', '江芳', '123456', 0);
INSERT INTO `user` VALUES ('172219605218', '穆成浩', '123456', 1);
INSERT INTO `user` VALUES ('172219605219', '潘晴无雨', '123456', 1);
INSERT INTO `user` VALUES ('172219605220', '钱聿豪', '123456', 0);
INSERT INTO `user` VALUES ('172219605221', '宋子豪', '123456', 1);
INSERT INTO `user` VALUES ('172219605222', '王庚辉', '123456', 1);
INSERT INTO `user` VALUES ('172219612201', '周童', '123456', 1);
INSERT INTO `user` VALUES ('182219605124', '刘小强', '123456', 0);
INSERT INTO `user` VALUES ('182219605201', '江以歌', '123456', 0);
INSERT INTO `user` VALUES ('192219605111', '刚刚', '123456', 0);
INSERT INTO `user` VALUES ('192219605124', '巧乐兹', '123456', 0);
INSERT INTO `user` VALUES ('192219605201', '月半', '123456', 0);
INSERT INTO `user` VALUES ('202219605101', '测试', '123456', 0);
INSERT INTO `user` VALUES ('202219605124', '纪威', '123456', 0);

-- ----------------------------
-- Table structure for v_apply
-- ----------------------------
DROP TABLE IF EXISTS `v_apply`;
CREATE TABLE `v_apply`  (
  `va_id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vid` int(11) NOT NULL,
  `va_time` datetime NULL,
  `va_flag` int(11) NOT NULL,
  `va_reviewer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`va_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of v_apply
-- ----------------------------
INSERT INTO `v_apply` VALUES (1, '162219605124', 2, '2020-11-24 21:56:19', 0, '无');
INSERT INTO `v_apply` VALUES (2, '162219605124', 2, '2020-11-24 21:57:09', 0, '无');
INSERT INTO `v_apply` VALUES (3, '162219605124', 2, '2020-11-24 21:57:13', 0, '无');
INSERT INTO `v_apply` VALUES (4, '162219605124', 2, '2020-11-24 21:57:31', 0, '无');
INSERT INTO `v_apply` VALUES (5, '162219605124', 2, '2020-11-24 22:01:38', 0, '无');
INSERT INTO `v_apply` VALUES (6, '162219605124', 2, '2020-11-24 22:06:13', 0, '无');
INSERT INTO `v_apply` VALUES (7, '162219605124', 8, '2020-11-25 09:31:51', 0, '无');
INSERT INTO `v_apply` VALUES (8, '162219605124', 8, '2020-11-25 09:33:09', 0, '无');
INSERT INTO `v_apply` VALUES (9, '162219605124', 7, '2020-11-25 09:41:39', 0, '无');
INSERT INTO `v_apply` VALUES (10, '172219605201', 8, '2021-01-06 21:17:12', 0, '无');

-- ----------------------------
-- Table structure for vol_table
-- ----------------------------
DROP TABLE IF EXISTS `vol_table`;
CREATE TABLE `vol_table`  (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '项目名称',
  `abs` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '项目简介',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `img` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图片',
  `num` int(11) NULL DEFAULT NULL COMMENT '招募人数',
  `anum` int(11) NULL DEFAULT NULL COMMENT '已经报名人数',
  `stime` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '项目服务时间',
  `btime` datetime NULL DEFAULT NULL COMMENT '报名开始时间',
  `etime` datetime NULL DEFAULT NULL COMMENT '报名截至时间',
  `rtime` datetime NULL DEFAULT NULL COMMENT '发布时间',
  `is_top` int(11) NULL DEFAULT NULL COMMENT '是否置顶',
  PRIMARY KEY (`vid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of vol_table
-- ----------------------------
INSERT INTO `vol_table` VALUES (2, '“阳光侨界爱在港城”爱心义诊', '组织侨界医卫专家开展爱心义诊活动，为有需求的市民提供健康咨询、义诊、保健讲座等服务。', '杨舍镇横河社区新时代文明实践站', '\r\nhttps://fangjiang.oss-cn-shanghai.aliyuncs.com/yz.jpg', 16, 4, '2020年11月11日至2020年12月31日', '2020-11-16 00:00:00', '2020-11-28 00:00:00', '2020-11-16 18:57:59', NULL);
INSERT INTO `vol_table` VALUES (3, '“护水清源”水知识科普', '以“实境课堂”的模式，通过参观水源地保护区、防洪引排工程、江堤、新海坝水源地二级保护区滨江湿地公园湿地等点位，使参观者了解水源地保护、防洪安全等水法及环保知识，进一步提升公众保护水源地及防洪工程的意识。', '张家港长江治理工程管理处', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/cj.jpg', 10, 3, '2020年11月11日至2020年12月31日', '2020-11-11 00:00:00', '2020-11-18 00:00:00', '2020-11-11 18:58:06', NULL);
INSERT INTO `vol_table` VALUES (4, '志愿同心文艺汇演', '为进一步满足群众的精神文化需求，庆祝中华人民共和国成立71周年，大新镇大新社区新时代文明实践志愿服务队，拟于9月下旬，阳光家园南区广场举办“百姓群星大舞台追梦新时代”巡演暨大新社区“志愿同心 文明同行”党群文艺汇演。', '张家港市大新镇大新社区', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/OIP4.jpg', 8, 2, '2020年11月11日至2020年12月31日', '2020-11-12 00:00:00', '2020-11-20 00:00:00', '2020-11-12 18:58:39', NULL);
INSERT INTO `vol_table` VALUES (5, '“奇妙水世界”科普教育', '组织参观水资源科普馆，多角度开展水资源、水生态知识的宣传，特别是科普馆内设置了很多互动体验项目，深受未成年人的喜爱，让他们在玩中学，在学中乐，寓教于乐。', '张家港市南丰镇新德村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/szy.jpg', 7, 6, '2020年11月11日至2020年12月31日', '2020-11-13 00:00:00', '2020-11-28 00:00:00', '2020-11-13 18:58:42', NULL);
INSERT INTO `vol_table` VALUES (6, '青春奉献理论宣讲', '围绕“青春奉献 岗位建功”中心主题，大新镇新时代文明实践志愿服务支队，于8月下旬在镇文化中心举行理论宣传宣讲活动，志愿者将紧扣习近平新时代中国特色社会主义思想等理论体系，结合自身理解进行宣讲。', '张家港市大新镇新海坝村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/OIP2.jpg', 2, 1, '2020年11月11日至2020年12月31日', '2020-11-10 00:00:00', '2020-11-28 00:00:00', '2020-11-10 18:58:46', NULL);
INSERT INTO `vol_table` VALUES (7, '地图版图知识进社区', '开展“地图版图知识进社区”活动，宣讲主题为“规范使用地图，一点都不能错”。讲座以国家版图基本概念、中国版图空间构成、增强国家版图意识为课堂主要内容，从国家版图的历史演变过程、识别“问题地图”等多个切入点深入浅出地阐释了规范使用地图、维护国家版图尊严的重要性。', '张家港市凤凰镇新时代文明实践所', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/bt.jpg', 5, 1, '2020年11月11日至2020年12月31日', '2020-10-24 00:00:00', '2020-11-28 00:00:00', '2020-10-24 18:58:49', NULL);
INSERT INTO `vol_table` VALUES (8, '垃圾分类知识青年宣讲', '团市委、市青年志愿者协会开展垃圾分类知识青年宣讲！', '张家港市南丰镇振兴社区', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/ljfl.jpg', 10, 3, '2020年11月11日至2020年12月31日', '2020-11-14 00:00:00', '2020-12-28 00:00:00', '2020-11-14 18:58:53', NULL);
INSERT INTO `vol_table` VALUES (9, '“关爱老年人”免费测量血糖血压活动  ', '冬季是心脑血管疾病的多发季节，为了提高社区老年人的健康意识，做到有病早发现，早治疗，用我们实际行动，提升老年人的幸福感，关爱老年人的身体健康水平，为此一家人郑重向您提出邀请，加入我们，一起温暖爱的世界。', '张家港市南丰镇海坝村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/gg.jpg', 3, 4, '2020年11月11日至2020年12月31日', '2020-11-04 00:00:00', '2020-12-28 00:00:00', '2020-11-04 18:58:55', NULL);
INSERT INTO `vol_table` VALUES (10, '走访退役军人老人', '“关爱老年人”免费测量血糖血压活动  ', '张家港市南丰镇东风村', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/x.jpg', 5, 2, '2020年11月11日至2020年12月31日', '2020-11-21 00:00:00', '2021-02-12 00:00:00', '2020-11-21 18:58:58', NULL);
INSERT INTO `vol_table` VALUES (11, '烈士陵园绿化环保志愿服务', '每周一到周四开馆时协助晚间值班老师完成晚间开馆时的工作任务； 协助图书馆微信公众号的内容整理、排版、编辑。', '张家港市杨舍镇钱塘社区', 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/OIP6.jpg', 8, 6, '2020年11月11日至2020年12月31日', '2020-11-02 00:00:00', '2020-12-28 00:00:00', '2020-11-02 18:59:01', NULL);

-- ----------------------------
-- Table structure for w_apply
-- ----------------------------
DROP TABLE IF EXISTS `w_apply`;
CREATE TABLE `w_apply`  (
  `wa_id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fid` int(11) NOT NULL,
  `wa_time` bigint(20) NOT NULL,
  `wa_flag` int(11) NOT NULL,
  `wa_reviewer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`wa_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of w_apply
-- ----------------------------
INSERT INTO `w_apply` VALUES (1, '172219605201', 1, 1591190679936, 0, '无');
INSERT INTO `w_apply` VALUES (2, '172219605222', 6, 1591229607442, 0, '无');
INSERT INTO `w_apply` VALUES (3, '172219605222', 3, 1591229619044, 0, '无');
INSERT INTO `w_apply` VALUES (4, '172219605218', 2, 1591229683721, 0, '无');
INSERT INTO `w_apply` VALUES (5, '172219605218', 4, 1591229693064, 0, '无');
INSERT INTO `w_apply` VALUES (6, '172219605201', 6, 1591229800804, 0, '无');
INSERT INTO `w_apply` VALUES (7, '172219605102', 2, 1591229836270, 0, '无');
INSERT INTO `w_apply` VALUES (8, '172219605220', 2, 1591229879884, 0, '无');
INSERT INTO `w_apply` VALUES (9, '172219605220', 4, 1591229902382, 0, '无');
INSERT INTO `w_apply` VALUES (10, '162219605124', 6, 1605441838613, 0, '无');
INSERT INTO `w_apply` VALUES (11, '162219605124', 3, 1606267145783, 0, '无');
INSERT INTO `w_apply` VALUES (12, '162219605124', 5, 1606267365743, 0, '无');

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work`  (
  `w_id` int(11) NOT NULL AUTO_INCREMENT,
  `w_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `w_abs` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `w_time` bigint(20) NOT NULL,
  `w_position` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `w_money` double NOT NULL,
  `w_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `is_top` int(11) NULL DEFAULT NULL COMMENT '是否置顶',
  PRIMARY KEY (`w_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of work
-- ----------------------------
INSERT INTO `work` VALUES (2, '图书馆管理员', '整理图书，管理图书借阅，做到有序有证借阅，维护图书馆秩序', 1591228918851, '图书馆', 8, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/library.jpg', NULL);
INSERT INTO `work` VALUES (3, '食堂打饭', '为学生打饭', 1591228991217, '食堂', 12, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/bg.jpg', NULL);
INSERT INTO `work` VALUES (4, '实验室管理人员', '实验室管理仪器，整理仪器，打扫实验室', 1591229098411, '实验室', 15, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/lab.jpeg', NULL);
INSERT INTO `work` VALUES (5, '超市收银员', '在大学城超市收银', 1591229211662, '大学城超市', 8, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/cashier.jpeg', NULL);
INSERT INTO `work` VALUES (6, '数码城维修学徒', '帮助数码城维修师傅做维修工作', 1591229318863, '数码城', 16, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/fix.jpg', NULL);
INSERT INTO `work` VALUES (8, '学工助理', '资助管理中心，医保过程的问题，奖助贷，奖学金活动，国家奖学金，国家励志奖学金，特殊贡献奖，叶圣陶奖学金，生源地贷款，学费补偿。', 1609767139785, '行政楼108', 25, 'https://fangjiang.oss-cn-shanghai.aliyuncs.com/3d3bfbeb204848efb70ab23a5b14729b.jpg', NULL);

SET FOREIGN_KEY_CHECKS = 1;
