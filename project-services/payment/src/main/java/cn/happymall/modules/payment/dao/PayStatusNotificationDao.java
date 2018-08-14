package cn.happymall.modules.payment.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.happymall.modules.payment.dto.PayStatusNotificationQueryBean;
import cn.happymall.modules.payment.entity.PayStatusNotificationEntity;
import cn.happymall.modules.sys.dao.BaseDao;

import java.util.List;

/**
 * 支付状态推送日志
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
@Mapper
public interface PayStatusNotificationDao extends BaseDao<PayStatusNotificationEntity> {
    List<PayStatusNotificationEntity> queryListByDto(PayStatusNotificationQueryBean payStatusNotificationQueryBean);

    int queryTotalByDto(PayStatusNotificationQueryBean payStatusNotificationQueryBean);
}
