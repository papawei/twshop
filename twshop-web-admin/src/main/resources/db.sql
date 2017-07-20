use twshop;
CREATE TABLE `browsinghistory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '�û�id',
  `sku_id` int(11) NOT NULL COMMENT 'skuid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '���ʱ��',
  `num` int(11) NOT NULL DEFAULT '0',
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  `shop_id` int(11) NOT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�����¼';

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL COMMENT '����id',
  `name` varchar(200) NOT NULL COMMENT '����',
  `parent_id` int(11) NOT NULL DEFAULT '0' COMMENT '����id',
  `path` varchar(200) NOT NULL COMMENT '·��',
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '����',
  `price_range` varchar(200) NOT NULL DEFAULT '' COMMENT '�۸�Χ���á�|���ָ���',
  `layer` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�㼶',
  `haschild` bit(1) NOT NULL DEFAULT b'0' COMMENT '�Ƿ����Ӽ�',
  `shop_id` int(11) NOT NULL COMMENT '����',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '״̬:0 ���� ;1 ����',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�����';

CREATE TABLE `product` (
  `id` int(11) NOT NULL COMMENT '��Ʒ',
  `productname` varchar(100) NOT NULL COMMENT '��Ʒ����',
  `description` varchar(500) NOT NULL DEFAULT '' COMMENT '��Ʒ����',
  `categoryid` smallint(6) NOT NULL DEFAULT '0' COMMENT '��Ʒ��Ŀ',
  `psn` varchar(50) NOT NULL COMMENT '��Ʒ����',
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '����',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Ĭ��״̬Ϊ0��0��������1�����¼ܣ�2:��ɾ��',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
  `shop_id` int(11) NOT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='										';

CREATE TABLE `productsku` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'skuid',
  `sku1` varchar(100) NOT NULL DEFAULT '',
  `sku2` varchar(100) NOT NULL DEFAULT '',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Ĭ��״̬Ϊ0��0��������1�����¼ܣ�2:��ɾ��',
  `stockcount` int(11) NOT NULL DEFAULT '0' COMMENT '�������',
  `salecount` int(11) NOT NULL DEFAULT '0' COMMENT '��������',
  `costprice` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '�ɱ���',
  `marketprice` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '�г���',
  `reviewcount` varchar(45) NOT NULL DEFAULT '0' COMMENT '��������',
  `visitcount` int(11) NOT NULL DEFAULT '0' COMMENT '��������',
  `showimg` varchar(100) NOT NULL DEFAULT '' COMMENT '��ʾͼƬ��ͼ',
  `promotionprice` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '������',
  `isshowprice` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�Ƿ���ʾ�۸�',
  `isbest` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�Ƿ�Ϊ��Ʒ',
  `ishot` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�Ƿ�Ϊ����',
  `isnew` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�Ƿ�Ϊ��Ʒ',
  `ispromotion` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�Ƿ����',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '����',
  `skusn` varchar(45) NOT NULL DEFAULT '' COMMENT 'sku����',
  `product_id` int(11) NOT NULL,
  `shop_id` int(11) NOT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='sku';

CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(100) NOT NULL COMMENT '����',
  `desc` varchar(500) NOT NULL DEFAULT '' COMMENT '����',
  `guid` varchar(45) NOT NULL COMMENT '����Ψһ��ʶ',
  `user_id` int(11) NOT NULL COMMENT '�û�id',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '״̬��0 ������1����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����';

CREATE TABLE `shoppingcart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '�û�id',
  `sku_id` int(11) NOT NULL COMMENT 'skuid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '���ʱ��',
  `num` int(11) NOT NULL DEFAULT '0' COMMENT ' ����',
  `updatetime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  `shop_id` int(11) DEFAULT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ﳵ';

CREATE TABLE `skucollection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '�û�id',
  `sku_id` int(11) NOT NULL COMMENT 'skuid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '���ʱ��',
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  `shop_id` int(11) NOT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='sku�ղ�';

CREATE TABLE `skuimg` (
  `id` int(11) NOT NULL,
  `sku_id` int(11) NOT NULL,
  `src` varchar(200) NOT NULL DEFAULT '',
  `product_id` int(11) NOT NULL COMMENT 'product_id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '����',
  `logo` varchar(255) NOT NULL DEFAULT '' COMMENT 'logo',
  `keywords` varchar(255) DEFAULT '' COMMENT 'keywords',
  `desc` varchar(255) NOT NULL DEFAULT '' COMMENT '����',
  `url` varchar(255) NOT NULL DEFAULT '' COMMENT '����',
  `displayorder` int(11) NOT NULL DEFAULT '0' COMMENT '����',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Ĭ��״̬Ϊ0��0��������1������',
  `shop_id` int(11) NOT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ӧ��';

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `mobilephone` int(11) NOT NULL DEFAULT '0' COMMENT '�ֻ���',
  `wechatnumber` varchar(45) NOT NULL DEFAULT '' COMMENT '΢�ź�',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Ĭ��״̬Ϊ0��0��������1������',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '���ʱ��',
  `desc` varchar(500) NOT NULL DEFAULT '' COMMENT '����',
  `address` varchar(100) NOT NULL DEFAULT '' COMMENT '��ַ',
  `guid` varchar(45) NOT NULL DEFAULT '' COMMENT '����վ��guid',
  `path` varchar(255) NOT NULL DEFAULT '' COMMENT '·��',
  `layer` tinyint(4) NOT NULL DEFAULT '0' COMMENT '���',
  `parent_id` int(11) NOT NULL DEFAULT '0' COMMENT '����id',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '���ͣ�0 ��ͨ�û�  ��1 �ٷ���2����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `userlog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT 'userid',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '���ʱ��',
  `ip` varchar(45) NOT NULL DEFAULT '' COMMENT '����ip',
  `location` varchar(45) NOT NULL DEFAULT '' COMMENT '����ص�',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '�������ͣ�0 ���ںţ�1 С����2 �ֻ�app',
  `shop_id` int(11) NOT NULL COMMENT '����',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��¼��־';
