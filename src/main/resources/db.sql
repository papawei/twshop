use twshop;
CREATE TABLE `browsinghistory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `sku_id` int(11) NOT NULL COMMENT 'skuid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `num` int(11) NOT NULL DEFAULT '0',
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  `shop_id` int(11) NOT NULL COMMENT '店铺',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='浏览记录';

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL COMMENT '分类id',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `parent_id` int(11) NOT NULL DEFAULT '0' COMMENT '父级id',
  `path` varchar(200) NOT NULL COMMENT '路径',
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `price_range` varchar(200) NOT NULL DEFAULT '' COMMENT '价格范围，用“|”分隔开',
  `layer` tinyint(4) NOT NULL DEFAULT '0' COMMENT '层级',
  `haschild` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否有子级',
  `shop_id` int(11) NOT NULL COMMENT '店铺',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态:0 正常 ;1 禁用',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分类表';

CREATE TABLE `product` (
  `id` int(11) NOT NULL COMMENT '商品',
  `productname` varchar(100) NOT NULL COMMENT '商品名称',
  `description` varchar(500) NOT NULL DEFAULT '' COMMENT '商品描述',
  `categoryid` smallint(6) NOT NULL DEFAULT '0' COMMENT '商品类目',
  `psn` varchar(50) NOT NULL COMMENT '商品编码',
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '默认状态为0，0：正常；1：已下架；2:已删除',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `shop_id` int(11) NOT NULL COMMENT '店铺',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='										';

CREATE TABLE `productsku` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'skuid',
  `sku1` varchar(100) NOT NULL DEFAULT '',
  `sku2` varchar(100) NOT NULL DEFAULT '',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '默认状态为0，0：正常；1：已下架；2:已删除',
  `stockcount` int(11) NOT NULL DEFAULT '0' COMMENT '库存数量',
  `salecount` int(11) NOT NULL DEFAULT '0' COMMENT '销售数量',
  `costprice` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '成本价',
  `marketprice` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '市场价',
  `reviewcount` varchar(45) NOT NULL DEFAULT '0' COMMENT '评价数量',
  `visitcount` int(11) NOT NULL DEFAULT '0' COMMENT '访问数量',
  `showimg` varchar(100) NOT NULL DEFAULT '' COMMENT '显示图片主图',
  `promotionprice` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '促销价',
  `isshowprice` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否显示价格',
  `isbest` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否为精品',
  `ishot` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否为热销',
  `isnew` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否为新品',
  `ispromotion` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否促销',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `skusn` varchar(45) NOT NULL DEFAULT '' COMMENT 'sku编码',
  `product_id` int(11) NOT NULL,
  `shop_id` int(11) NOT NULL COMMENT '店铺',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='sku';

CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `desc` varchar(500) NOT NULL DEFAULT '' COMMENT '描述',
  `guid` varchar(45) NOT NULL COMMENT '店铺唯一标识',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态：0 正常；1禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='店铺';

CREATE TABLE `shoppingcart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `sku_id` int(11) NOT NULL COMMENT 'skuid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `num` int(11) NOT NULL DEFAULT '0' COMMENT ' 数量',
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  `shop_id` int(11) DEFAULT NULL COMMENT '店铺',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车';

CREATE TABLE `skucollection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `sku_id` int(11) NOT NULL COMMENT 'skuid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  `shop_id` int(11) NOT NULL COMMENT '店铺',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='sku收藏';

CREATE TABLE `skuimg` (
  `id` int(11) NOT NULL,
  `sku_id` int(11) NOT NULL,
  `src` varchar(200) NOT NULL DEFAULT '',
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `logo` varchar(255) NOT NULL DEFAULT '' COMMENT 'logo',
  `keywords` varchar(255) DEFAULT '' COMMENT 'keywords',
  `desc` varchar(255) NOT NULL DEFAULT '' COMMENT '描述',
  `url` varchar(255) NOT NULL DEFAULT '' COMMENT '链接',
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '默认状态为0，0：正常；1：禁用',
  `shop_id` int(11) NOT NULL COMMENT '店铺',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供应商';

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `mobilephone` int(11) NOT NULL DEFAULT '0' COMMENT '手机号',
  `wechatnumber` varchar(45) NOT NULL DEFAULT '' COMMENT '微信号',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '默认状态为0，0：正常；1：禁用',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `desc` varchar(500) NOT NULL DEFAULT '' COMMENT '描述',
  `address` varchar(100) NOT NULL DEFAULT '' COMMENT '地址',
  `guid` varchar(45) NOT NULL DEFAULT '' COMMENT '各个站点guid',
  `path` varchar(255) NOT NULL DEFAULT '' COMMENT '路径',
  `layer` tinyint(4) NOT NULL DEFAULT '0' COMMENT '层次',
  `parent_id` int(11) NOT NULL DEFAULT '0' COMMENT '父级id',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '类型：0 普通用户  ；1 官方；2代理',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `userlog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT 'userid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `ip` varchar(45) NOT NULL DEFAULT '' COMMENT '登入ip',
  `location` varchar(45) NOT NULL DEFAULT '' COMMENT '登入地点',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '登入类型：0 公众号；1 小程序；2 手机app',
  `shop_id` int(11) NOT NULL COMMENT '店铺',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录日志';
